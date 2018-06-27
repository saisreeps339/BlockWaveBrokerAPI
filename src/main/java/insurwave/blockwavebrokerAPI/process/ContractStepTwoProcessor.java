package insurwave.blockwavebrokerAPI.process;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.converter.ContractSectionAssetJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ContractSectionStep2JsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ContractSubsectionInsurerJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ContractSubsectionJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ContractSubsectionPremiumJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ParticipantPublicRoleJsonToEntityConvertor;
import insurwave.blockwavebrokerAPI.converter.SubsectionPremiumDeductibleJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.SubsectionPremiumDeductionJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.SubsectionPremiumTaxJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao;
import insurwave.blockwavebrokerAPI.dao.TotalSectionPremiumDao;
import insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.domain.Contract_Section_Asset;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Insurer;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Premium;
import insurwave.blockwavebrokerAPI.domain.Subsection_Participant_Public_Role;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deductible;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deduction;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;
import insurwave.blockwavebrokerAPI.jsondto.CalculationPremium;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepTwo;
import insurwave.blockwavebrokerAPI.jsondto.ContractSubsection;
import insurwave.blockwavebrokerAPI.jsondto.ShareAllocation;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumAmountDeduction;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumAmountTax;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumDeductible;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumDeduction;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumTax;
import insurwave.blockwavebrokerAPI.jsondto.Vessel;
import insurwave.blockwavebrokerAPI.service.ContractSectionAssetService;
import insurwave.blockwavebrokerAPI.service.ContractSectionService;
import insurwave.blockwavebrokerAPI.service.ContractService;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionInsurerService;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionPremiumService;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionService;
import insurwave.blockwavebrokerAPI.service.ParticipantPublicRoleService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductibleService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductionService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumTaxService;
import insurwave.blockwavebrokerAPI.util.SplunkCimLogEventUtil;

/**
 * Processor class that handles the business functionality of Contract Step Two.
 * 
 * @author saisree, sachin.kotagiri, vineet.kumar.sharma
 *
 */
@Component
public class ContractStepTwoProcessor {
	private static Logger _logger = LoggerFactory.getLogger(BrokerAPIConstants.BLOCKWAVE_BROKERAPI_SPLUNK_LOGGER);

	@Autowired
	private SplunkCimLogEventUtil splunkCimLogEventUtil;

	@Autowired
	private ContractSectionStep2JsonToEntityConverter step2JsonToEntityConverter;

	@Autowired
	private ContractSectionAssetJsonToEntityConverter contractSectionAssetJsonToEntityConverter;

	@Autowired
	private ContractSubsectionJsonToEntityConverter contractSubsectionJsonToEntityConverter;

	@Autowired
	private ContractSubsectionInsurerJsonToEntityConverter contractSubsectionInsurerJsonToEntityConverter;

	@Autowired
	private ParticipantPublicRoleJsonToEntityConvertor participantPublicRoleJsonToEntityConvertor;

	@Autowired
	private ContractSubsectionPremiumJsonToEntityConverter contractSubsectionPremiumJsonToEntityConverter;

	@Autowired
	private SubsectionPremiumDeductibleJsonToEntityConverter subsectionPremiumDeductibleJsonToEntityConverter;

	@Autowired
	private SubsectionPremiumDeductionJsonToEntityConverter subsectionPremiumDeductionJsonToEntityConverter;

	@Autowired
	private SubsectionPremiumTaxJsonToEntityConverter subsectionPremiumTaxJsonToEntityConverter;

	@Autowired
	private ContractService contractService;

	@Autowired
	private ContractSectionService contractSectionService;

	@Autowired
	private ContractSectionAssetService contractSectionAssetService;

	@Autowired
	private ContractSubsectionService contractSubsectionService;

	@Autowired
	private ContractSubsectionInsurerService contractSubsectionInsurerService;

	@Autowired
	private ParticipantPublicRoleService participantPublicRoleService;

	@Autowired
	private ContractSubsectionPremiumService contractSubsectionPremiumService;

	@Autowired
	private SubsectionPremiumDeductionService subsectionPremiumDeductionService;

	@Autowired
	private SubsectionPremiumDeductibleService subsectionPremiumDeductibleService;

	@Autowired
	private SubsectionPremiumTaxService subsectionPremiumTaxService;

	@Autowired
	private InsertUpdSubsectionPremiumAmountProcessor insertUpdSubsectionPremiumAmountProcessor;

	/**
	 * Processes Step Two contract data.
	 * 
	 * @param contractSections
	 * @return
	 */
	@Transactional
	public List<Contract_Section> process(ContractStepTwo[] contractSections) {
		List<Contract_Section> contract_Sections = new ArrayList<Contract_Section>();
		for (ContractStepTwo contractSection : contractSections) {
			Contract_Section contract_Section = saveContractSection(contractSection);
			insertUpdSubsectionPremiumAmountProcessor.retrieveAndDeleteAllPremiumReferences(contract_Section);
			// persist the associated Contract_Section_Asset records
			saveContractSectionAssets(contract_Section, contractSection.vessels);
			// persist the associated Contract_Subsection records
			saveContractSubsections(contract_Section, contractSection.contractSubsections);

			String contract_Section_UUID = contract_Section.getContract_Section_UUID();
			// update premiums for the given contract_Section_UUID
			updatePremiumAmountToSubsection(contract_Section_UUID);
			updatePremiumAmountToSection(contract_Section_UUID);
			updatePremiumAmountToContract(contract_Section_UUID);
			// add contract_Section to list to be returned
			contract_Sections.add(contract_Section);
		}				
		return contract_Sections;
	}

	/**
	 * Saves Contract_Section details.
	 * 
	 * @param contractSection
	 * @return
	 */
	private Contract_Section saveContractSection(ContractStepTwo contractSection) {
		String contract_Section_UUID = contractSection.getContract_Section_UUID();
		_logger.debug(splunkCimLogEventUtil.createEvent("JSON contract_Section_UUID received", "contract_Section_UUID",
				"contract_Section_UUIDs", contract_Section_UUID).toString());

		Contract_Section contract_Section = step2JsonToEntityConverter.convert(contractSection);
		contract_Section = contractSectionService.saveContract_Section(contract_Section);
		_logger.info(splunkCimLogEventUtil.createEvent("Contract_Section persisted", "contract_Section_UUID",
				"contract_Section_UUID", contract_Section_UUID).toString());

		return contract_Section;
	}

	/**
	 * Saves Contract_Section_Asset details
	 * 
	 * @param contract_Section
	 * @param vessels
	 * @return
	 */
	private List<Contract_Section_Asset> saveContractSectionAssets(Contract_Section contract_Section,
			Vessel[] vessels) {
		List<Contract_Section_Asset> contractSectionAssets = new ArrayList<Contract_Section_Asset>();
		String contract_Section_UUID = contract_Section.getContract_Section_UUID();

		contractSectionAssetService.deleteByContractSection_UUID(contract_Section_UUID);
		_logger.info("Deleted Contract_Section_Asset records by Contract_Section_UUID: {}", contract_Section_UUID);
		if (vessels != null && vessels.length > 0) {
			for (Vessel vessel : vessels) {
				Contract_Section_Asset contractSectionAsset = contractSectionAssetJsonToEntityConverter.convert(vessel);
				// set the foreign key
				contractSectionAsset.setContractSection(contract_Section);
				// add to list to be persisted
				contractSectionAssets.add(contractSectionAsset);
			}
			// persist the list of contract_section assets
			contractSectionAssets = contractSectionAssetService.saveContract_Section_Assets(contractSectionAssets);
			_logger.info("Saved Contract_Section_Asset records for Contract_Section_UUID:{}", contract_Section_UUID);
		}
		return contractSectionAssets;
	}

	/**
	 * Saves Contract_Subsection details.
	 * 
	 * @param contract_Section
	 * @param contractSubsections
	 * @return
	 */
	private List<Contract_Subsection> saveContractSubsections(Contract_Section contract_Section,
			ContractSubsection[] contractSubsections) {
		List<Contract_Subsection> contract_Subsections = new ArrayList<Contract_Subsection>();
		if (contractSubsections != null && contractSubsections.length > 0) {
			for (ContractSubsection contractSubsection : contractSubsections) {
				// set it explicitly in contractSubsection JSON, if missing
				if (contractSubsection.contract_Section_UUID == null
						|| contractSubsection.contract_Section_UUID.isEmpty()) {
					contractSubsection.contract_Section_UUID = contract_Section.getContract_Section_UUID();
				}
				Contract_Subsection contract_Subsection = contractSubsectionJsonToEntityConverter
						.convert(contractSubsection);
				contract_Subsection = contractSubsectionService.saveContract_Subsection(contract_Subsection);
				_logger.info("Saved Contract_Subsection record with PK:{}",
						contract_Subsection.getContract_Subsection_UUID());
				// persist associated Contract_Subsection_Insurer records
				saveContractSubsectionInsurer(contractSubsection.shareAllocations);
				// persist associated Contract_subsection_Premium records
				saveContractSubsectionPremium(contractSubsection.calculationPremium);
				
				// add to list to be returned
				contract_Subsections.add(contract_Subsection);
			}
		}
		return contract_Subsections;
	}

	/**
	 * Saves Contract_Subsection_Premium details.
	 * 
	 * @param calculationPremiums
	 * @return
	 */
	private List<Contract_Subsection_Premium> saveContractSubsectionPremium(CalculationPremium[] calculationPremiums) {
		List<Contract_Subsection_Premium> contract_Subsection_Premiums = new ArrayList<Contract_Subsection_Premium>();
		if (calculationPremiums != null && calculationPremiums.length > 0) {
			for (CalculationPremium calculationPremium : calculationPremiums) {
				Contract_Subsection_Premium contract_Subsection_Premium = contractSubsectionPremiumJsonToEntityConverter
						.convert(calculationPremium);
				contract_Subsection_Premium = contractSubsectionPremiumService
						.saveContract_Subsection_Premium(contract_Subsection_Premium);				
				_logger.info("Saved Contract_Subsection_Premium record with PK:{}",
						contract_Subsection_Premium.getContract_Subsection_Premium_Reference());
				//delete and insert values Subsection_Premium_Amount
				insertUpdSubsectionPremiumAmountProcessor.insertGrossPremiumLine(contract_Subsection_Premium,BrokerAPIConstants.GROSS_PREMIUM);	
				
				// persist associated Subsection_Premium_Deductible records
				saveSubsectionPremiumDeductibles(calculationPremium.subsection_Premium_Deductible);
				// persist associated Subsection_Premium_Deduction records
				saveSubsectionPremiumDeductions(calculationPremium.subsection_Premium_Amount_Deduction);
				
				// persist associated Subsection_Premium_Tax records
				saveSubsectionPremiumTaxes(calculationPremium.subsection_Premium_Amount_Tax);
				
				//deduction on Gross premium - NET_PREMIUM_AFTER_DEDUCTIONS
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForDeductions(BrokerAPIConstants.GROSS_PREMIUM, BrokerAPIConstants.NET_PREMIUM_AFTER_DEDUCTIONS);
				//Tax after NET_PREMIUM_AFTER_DEDUCTIONS
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForTaxes(BrokerAPIConstants.NET_PREMIUM_AFTER_DEDUCTIONS, BrokerAPIConstants.NET_PREMIUM_AFTER_BASE_TAX);
				//Deductions after NET_PREMIUM_AFTER_BASE_TAX
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForDeductions(BrokerAPIConstants.NET_PREMIUM_AFTER_BASE_TAX, BrokerAPIConstants.NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS);
				//Tax after NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForTaxes(BrokerAPIConstants.NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS, BrokerAPIConstants.NET_PREMIUM_AFTER_COMPOUND_TAX);
				//Deduction after Compound tax and arrive NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForDeductions(BrokerAPIConstants.NET_PREMIUM_AFTER_COMPOUND_TAX, BrokerAPIConstants.NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX);
				//insert buyer premium and seller for all tax
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForBuyerOrSellerPremiumAllDetails(BrokerAPIConstants.LINE_NET_PREMIUM_FOR_BUYER);
				insertUpdSubsectionPremiumAmountProcessor.insertIntoSubsectionPremiumAmountForBuyerOrSellerPremiumAllDetails(BrokerAPIConstants.LINE_NET_PREMIUM_FOR_SELLERS);
				//Update seller premium if there is any tax on buyer premium for seller
				insertUpdSubsectionPremiumAmountProcessor.UpdateSellerPremium(BrokerAPIConstants.LINE_NET_PREMIUM_FOR_BUYER,BrokerAPIConstants.LINE_NET_PREMIUM_FOR_SELLERS);					
				
				// add to list to be returned
				contract_Subsection_Premiums.add(contract_Subsection_Premium);
				
			}
			
		}		
		
		return contract_Subsection_Premiums;
	}

	/**
	 * Saves Subsection_Premium_Deductible details.
	 * 
	 * @param subsectionPremiumDeductibles
	 * @return
	 */
	private List<Subsection_Premium_Deductible> saveSubsectionPremiumDeductibles(
			SubsectionPremiumDeductible[] subsectionPremiumDeductibles) {
		List<Subsection_Premium_Deductible> subsection_Premium_Deductibles = new ArrayList<Subsection_Premium_Deductible>();
		if (subsectionPremiumDeductibles != null && subsectionPremiumDeductibles.length > 0) {
			for (SubsectionPremiumDeductible subsectionPremiumDeductible : subsectionPremiumDeductibles) {

				Subsection_Premium_Deductible subsection_Premium_Deductible = subsectionPremiumDeductibleJsonToEntityConverter
						.convert(subsectionPremiumDeductible);
				subsection_Premium_Deductible = subsectionPremiumDeductibleService
						.saveSubsection_Premium_Deductible(subsection_Premium_Deductible);
				_logger.info("Saved Subsection_Premium_Deductible record with PK:{}",
						subsection_Premium_Deductible.getSubsection_Premium_Deductible_Reference());
				// add to list
				subsection_Premium_Deductibles.add(subsection_Premium_Deductible);
			}
		}
		return subsection_Premium_Deductibles;
	}

	/**
	 * Saves Subsection_Premium_Tax details.
	 * 
	 * @param subsectionPremiumAmountTaxes
	 * @return
	 */
	private List<Subsection_Premium_Tax> saveSubsectionPremiumTaxes(
			SubsectionPremiumAmountTax[] subsectionPremiumAmountTaxes) {
		List<Subsection_Premium_Tax> subsection_Premium_Taxes = new ArrayList<Subsection_Premium_Tax>();
		if (subsectionPremiumAmountTaxes != null && subsectionPremiumAmountTaxes.length > 0) {
			for (SubsectionPremiumAmountTax subsectionPremiumAmountTax : subsectionPremiumAmountTaxes) {
				SubsectionPremiumTax[] subsectionPremiumTaxes = subsectionPremiumAmountTax.subsection_Premium_Tax;
				for (SubsectionPremiumTax subsectionPremiumTax : subsectionPremiumTaxes) {
					Subsection_Premium_Tax subsection_Premium_Tax = subsectionPremiumTaxJsonToEntityConverter
							.convert(subsectionPremiumTax);
					subsection_Premium_Tax = subsectionPremiumTaxService
							.saveSubsection_Premium_Tax(subsection_Premium_Tax);
					_logger.info("Saved Subsection_Premium_Tax record with PK:{}",
							subsection_Premium_Tax.getSubsection_Premium_Tax_Reference());
					// add to list
					subsection_Premium_Taxes.add(subsection_Premium_Tax);
				}
			}
		}
		return subsection_Premium_Taxes;
	}

	/**
	 * Saves Subsection_Premium_Deduction details.
	 * 
	 * @param subsectionPremiumAmountDeductions
	 * @return
	 */
	private List<Subsection_Premium_Deduction> saveSubsectionPremiumDeductions(
			SubsectionPremiumAmountDeduction[] subsectionPremiumAmountDeductions) {
		List<Subsection_Premium_Deduction> subsection_Premium_Deductions = new ArrayList<Subsection_Premium_Deduction>();
		if (subsectionPremiumAmountDeductions != null && subsectionPremiumAmountDeductions.length > 0) {
			for (SubsectionPremiumAmountDeduction subsectionPremiumAmountDeduction : subsectionPremiumAmountDeductions) {
				SubsectionPremiumDeduction[] subsectionPremiumDeductions = subsectionPremiumAmountDeduction.subsection_Premium_Deduction;
				for (SubsectionPremiumDeduction subsectionPremiumDeduction : subsectionPremiumDeductions) {

					Subsection_Premium_Deduction subsection_Premium_Deduction = subsectionPremiumDeductionJsonToEntityConverter
							.convert(subsectionPremiumDeduction);
					subsection_Premium_Deduction = subsectionPremiumDeductionService
							.saveSubsection_Premium_Deduction(subsection_Premium_Deduction);
					_logger.info("Saved Subsection_Premium_Deduction record with PK:{}",
							subsection_Premium_Deduction.getSubsection_Premium_Deduction_Reference());
					// add to list
					subsection_Premium_Deductions.add(subsection_Premium_Deduction);
				}
			}
		}
		return subsection_Premium_Deductions;
	}

	/**
	 * Saves Contract_Subsection_Insurer details.
	 * 
	 * @param shareAllocations
	 * @return
	 */
	private List<Contract_Subsection_Insurer> saveContractSubsectionInsurer(ShareAllocation[] shareAllocations) {
		List<Contract_Subsection_Insurer> contractSubsectionInsurers = new ArrayList<Contract_Subsection_Insurer>();
		if (shareAllocations != null && shareAllocations.length > 0) {
			for (ShareAllocation shareAllocation : shareAllocations) {
				Contract_Subsection_Insurer contractSubsectionInsurer = contractSubsectionInsurerJsonToEntityConverter
						.convert(shareAllocation);
				if (contractSubsectionInsurer != null) {
					contractSubsectionInsurer = contractSubsectionInsurerService
							.saveContract_Subsection_Insurer(contractSubsectionInsurer);
					_logger.info("Saved Contract_Subsection_Insurer record with PK:{}",
							contractSubsectionInsurer.getContract_Subsection_Insurer_UUID());
					// add to list
					contractSubsectionInsurers.add(contractSubsectionInsurer);
					saveSubsectionParticipantPublicRole(shareAllocation);
				}
			}
		}
		return contractSubsectionInsurers;
	}

	/**
	 * Saves Subsection_Participant_Public_Role details.
	 * 
	 * @param shareAllocation
	 * @return
	 */
	private Subsection_Participant_Public_Role saveSubsectionParticipantPublicRole(ShareAllocation shareAllocation) {
		/*
		 * If mandatory participant_Legal_Entity_Code is missing/empty, then cannot
		 * proceed with Subsection_Participant_Public_Role entity creation.
		 */
		String participant_Legal_Entity_Code = shareAllocation.getParticipant_Legal_Entity_Code();
		if (participant_Legal_Entity_Code == null || participant_Legal_Entity_Code.trim().isEmpty()) {
			_logger.warn(
					"Participant Legal Entity code missing. Cannot create Subsection_Participant_Public_Role record");
			return null;
		}
		Subsection_Participant_Public_Role existingSubsection_Participant_Public_Role = participantPublicRoleService
				.getBySubsectionReference(shareAllocation.contract_Subsection_UUID);

		// delete Subsection_Participant_Public_Role record if it already exist
		if (existingSubsection_Participant_Public_Role != null) {
			participantPublicRoleService.deleteBySubsectionReference(shareAllocation.contract_Subsection_UUID);
			_logger.info(
					"Deleted Subsection_Participant_Public_Role records associated  with Contract_Subsection_UUID:{}",
					shareAllocation.contract_Subsection_UUID);

		}
		Subsection_Participant_Public_Role subsection_Participant_Public_Role = participantPublicRoleJsonToEntityConvertor
				.convert(shareAllocation);
		// Save record -not null if LEADER/CO-LEADER
		if (subsection_Participant_Public_Role != null) {
			_logger.info("Participant_Legal_Entity_Reference = {}",
					subsection_Participant_Public_Role.getParticipant_Legal_Entity_Reference());
			subsection_Participant_Public_Role = participantPublicRoleService
					.saveSubsection_Participant(subsection_Participant_Public_Role);
			_logger.info("Saved Subsection_Participant_Public_Role record with PK:{}",
					subsection_Participant_Public_Role.getSubsection_Participant_Public_Role_Reference());
		}
		return subsection_Participant_Public_Role;
	}

	/**
	 * Updates Contract Subsection Premium Amount.
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	private List<TotalSubsectionPremiumDao> updatePremiumAmountToSubsection(String contract_Section_UUID) {
		List<TotalSubsectionPremiumDao> totalSubsectionPremiumList = contractSubsectionService
				.getTotalContractSubsectionPremiumByContractSectionUUID(contract_Section_UUID);
		contractSubsectionService.setSubsectionPremiumAmounts(totalSubsectionPremiumList);
		_logger.info("Saved Contract_Subsection Premium Amounts.");
		return totalSubsectionPremiumList;
	}

	/**
	 * Updates Contract Section Premium Amount
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	private List<TotalSectionPremiumDao> updatePremiumAmountToSection(String contract_Section_UUID) {

		List<TotalSectionPremiumDao> totalSectionPremiumList = contractSectionService
				.getTotalContractSectionPremiumByContractSectionUUID(contract_Section_UUID);
		contractSectionService.setSectionPremiumAmounts(totalSectionPremiumList);
		_logger.info("Saved Contract_Section Premium Amounts.");
		return totalSectionPremiumList;
	}

	/**
	 * Updates Contract Premium amount.
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	private List<TotalContractPremiumDao> updatePremiumAmountToContract(String contract_Section_UUID) {
		List<TotalContractPremiumDao> totalContractPremiumList = contractService
				.getTotalContractPremiumByContractSectionUUID(contract_Section_UUID);
		contractService.setContractPremiumAmounts(totalContractPremiumList);
		_logger.info("Saved Contract Premium Amounts.");
		return totalContractPremiumList;
	}

}
