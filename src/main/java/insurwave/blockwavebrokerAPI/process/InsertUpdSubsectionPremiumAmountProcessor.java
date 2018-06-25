package insurwave.blockwavebrokerAPI.process;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao;
import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.dao.DeductionsCTEDao;
import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.dao.TaxCTEDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;
import insurwave.blockwavebrokerAPI.service.AllPremiumReferenceService;
import insurwave.blockwavebrokerAPI.service.MasterAmountTypeService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumAmountService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductionService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumTaxService;


@Component
public class InsertUpdSubsectionPremiumAmountProcessor {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private String contract_Subsection_Premium_Reference;

	@Autowired
	private AllPremiumReferenceService allPremiumReferenceService;

	@Autowired
	private SubsectionPremiumAmountService subsectionPremiumAmountService;

	@Autowired
	private MasterAmountTypeService masterAmountTypeService;

	@Autowired
	private SubsectionPremiumDeductionService deductionsService;

	@Autowired
	private SubsectionPremiumTaxService taxService;
	
	private List<AllPremiumReferenceDao> allPremiumReferences;


	public void process(List<Contract_Section> contract_Sections) {
		List<String> contract_Section_UUIDs = new ArrayList<String>();
		
		contract_Sections.forEach(contract_Section -> contract_Section_UUIDs.add(contract_Section.getContract_Section_UUID()));
		allPremiumReferences = allPremiumReferenceService.allPremiumReferences(contract_Section_UUIDs);
		//TODOorder to be implemented by sachin
		
		
	}
	
	

	/***
	 * Part-1=>Insert Gross premium line(Mandatory)
	 */

	
	private void InsertGrossPremiumLine() {
		// delete if susectionPremiumRegrenses are alredy in Subsection_Premium_Amount
		allPremiumReferenceService.deletePremiumRef(allPremiumReferences);
		log.info("Delete Successfull");

		List<ContractSubsectionPremiumDao> contractSubPremObject = allPremiumReferenceService
				.getContractSubsectionPrem(allPremiumReferences);
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		for (ContractSubsectionPremiumDao obj : contractSubPremObject) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setPremium_Amount(obj.getPremiumAmount());
			subsection_Premium_Amount.setSubsection_Premium_Reference(obj.getContract_Subsection_Premium_Reference());
			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("");
			subsection_Premium_Amount.setPremium_Amount_Type_Code("GROSS_PREMIUM");

			subsectionPremiumAmountList.add(subsection_Premium_Amount);
		}

		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	
	private List<String> getAllPremiumReferencesValues() {
		List<String> premiumReference = new ArrayList<>();
		List<AllPremiumReferenceDao> allPremiumReference = allPremiumReferences;
		for (AllPremiumReferenceDao allPremiumReferenceDao : allPremiumReference) {
			contract_Subsection_Premium_Reference = allPremiumReferenceDao.getContract_Subsection_Premium_Reference();
			premiumReference.add(contract_Subsection_Premium_Reference);
		}
		log.info(" -----Step 2 allPremiumReferences values -----------");
		return premiumReference;
	}

	private List<Subsection_Premium_Amount> getAllSubsectionPremiumAmountDetails() {
		log.info(" -----Step 3 Get All Values from Subsection Premium Amount table -----------");
		return subsectionPremiumAmountService.findAll();
	}

	/***
	 * Part-2=>--deduction on Gross premium - NET_PREMIUM_AFTER_DEDUCTIONS
	 */

	private List<DeductionsCTEDao> getDeductionsonGrossPremium() {
		log.info(" -----Step 1 get d_CTE Details -----------");
		return deductionsService.getDeductionDetails("GROSS_PREMIUM", getAllPremiumReferencesValues());
	}

	private List<MasterAmountTypesDao> getMasterAmountTypeForDeductionsonGrossPremium() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with NET_PREMIUM_AFTER_BASE_TAX  -----------");
		return masterAmountTypeService.getMasterAmountFor("NET_PREMIUM_AFTER_DEDUCTIONS");
	}

	
	public void insertIntoSubsectionPremiumAmountForDeductionsonGrossPremium() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<DeductionsCTEDao> deductions_CTE = getDeductionsonGrossPremium();
		for (DeductionsCTEDao deductionsCTEReference : deductions_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount
					.setSubsection_Premium_Reference(deductionsCTEReference.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("NET_PREMIUM_AFTER_DEDUCTIONS");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					deductionsCTEReference.getSubsection_Premium_Reference(), getAllSubsectionPremiumAmountDetails(),
					getMasterAmountTypeForDeductionsonGrossPremium());

			log.info("Subsection_Premium_Reference Value ");
			log.info(deductionsCTEReference.getSubsection_Premium_Reference());

			log.info("-----------Amount value from getAmountValueForTaxafterNetPremiumAfterDeductions()-------------");
			log.info(amount.toString());

			log.info("-----------Total Amount value from TaxCTEDaoo-------------");
			log.info(deductionsCTEReference.getDeduction_Amount().toString());

			subsection_Premium_Amount.setPremium_Amount(amount.subtract(deductionsCTEReference.getDeduction_Amount()));

			log.info("-----------Return Amount After adding to total amount-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("GROSS_PREMIUM");

			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");

			subsectionPremiumAmountList.add(subsection_Premium_Amount);

		}

		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);

	}

	/***
	 * Part-3=>---- Tax after NET_PREMIUM_AFTER_DEDUCTIONS
	 */

	private List<TaxCTEDao> getTaxAfterNetPremiumAfterDeductionsDetails() {
		log.info(" -----Step 1 get basetax_CTE Details -----------");
		return taxService.getTaxDetails("NET_PREMIUM_AFTER_DEDUCTIONS", getAllPremiumReferencesValues());
	}

	private List<MasterAmountTypesDao> getMasterAmountTypeForTaxafterNetPremiumAfterDeductions() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with NET_PREMIUM_AFTER_BASE_TAX  -----------");
		return masterAmountTypeService.getMasterAmountFor("NET_PREMIUM_AFTER_BASE_TAX");
	}

	
	public void insertIntoSubsectionPremiumAmountForTaxAfterNetPremiumAfterDeductions() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<TaxCTEDao> basetax_CTE = getTaxAfterNetPremiumAfterDeductionsDetails();
		for (TaxCTEDao basetaxCTEReference : basetax_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount
					.setSubsection_Premium_Reference(basetaxCTEReference.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("NET_PREMIUM_AFTER_BASE_TAX");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					basetaxCTEReference.getSubsection_Premium_Reference(), getAllSubsectionPremiumAmountDetails(),
					getMasterAmountTypeForTaxafterNetPremiumAfterDeductions());

			log.info("Subsection_Premium_Reference Value ");
			log.info(basetaxCTEReference.getSubsection_Premium_Reference());

			log.info("-----------Amount value from getAmountValueForTaxafterNetPremiumAfterDeductions()-------------");
			log.info(amount.toString());

			log.info("-----------Total Amount value from TaxCTEDao-------------");
			log.info(basetaxCTEReference.getTax_Amount().toString());

			subsection_Premium_Amount.setPremium_Amount(amount.add(basetaxCTEReference.getTax_Amount()));

			log.info("-----------Return Amount After adding to total amount-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("NET_PREMIUM_AFTER_DEDUCTIONS");

			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);

		}

		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	/***
	 * Part-4=>---- Deductions after NET_PREMIUM_AFTER_BASE_TAX
	 */

	private List<DeductionsCTEDao> getDeductionsAfterNetPremiumAfterBaseTax() {
		log.info(" -----Step 1 get dfbt_cte Details -----------");
		return deductionsService.getDeductionDetails("NET_PREMIUM_AFTER_BASE_TAX",
				getAllPremiumReferencesValues());
	}

	private List<MasterAmountTypesDao> getMasterAmountForDeductionsAfterNetPremiumAfterBaseTax() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS  -----------");
		return masterAmountTypeService.getMasterAmountFor("NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS");
	}

	
	public void insertIntoSubsectionPremiumAmountDeductionAfterNetPremiumDeductions() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<DeductionsCTEDao> deductionsAfterBaseTax_CTE = getDeductionsAfterNetPremiumAfterBaseTax();
		for (DeductionsCTEDao deductionsAfterBaseTaxCTEReference : deductionsAfterBaseTax_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setSubsection_Premium_Reference(
					deductionsAfterBaseTaxCTEReference.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					deductionsAfterBaseTaxCTEReference.getSubsection_Premium_Reference(),
					getAllSubsectionPremiumAmountDetails(),
					getMasterAmountForDeductionsAfterNetPremiumAfterBaseTax());

			log.info("Subsection_Premium_Reference Value");
			log.info(deductionsAfterBaseTaxCTEReference.getSubsection_Premium_Reference());

			log.info(
					"-----------Amount value from getPremiumAmountForDeductionsAfterNetPremiumAfterBaseTax()-------------");
			log.info(amount.toString());

			log.info("-----------Total Amount value from DeductionsCTEDao-------------");
			log.info(deductionsAfterBaseTaxCTEReference.getDeduction_Amount().toString());

			subsection_Premium_Amount
					.setPremium_Amount(amount.subtract(deductionsAfterBaseTaxCTEReference.getDeduction_Amount()));

			log.info("-----------Return Amount After Subtracted from Total Amount-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("NET_PREMIUM_AFTER_BASE_TAX");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);

			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	/***
	 * Part-5=>---- --Tax after NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS
	 */

	private List<TaxCTEDao> getTaxAfterNetPremiumAfterBaseTaxDeductionsDetails() {
		log.info(" -----Step 1 get cptax_CTE Details -----------");
		return taxService.getTaxDetails("NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS",
				getAllPremiumReferencesValues());
	}

	private List<MasterAmountTypesDao> getMasterAmountForTaxAfterNetPremiumAfterBaseTaxDeductions() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with NET_PREMIUM_AFTER_COMPOUND_TAX  -----------");
		return masterAmountTypeService.getMasterAmountFor("NET_PREMIUM_AFTER_COMPOUND_TAX");
	}

	
	public void insertIntoSubsectionPremiumAmountTaxAfterNetPremiumAfterBaseTaxDeductions() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<TaxCTEDao> taxAfterNetPremiumAfterBaseTaxDeductions_CTE = getTaxAfterNetPremiumAfterBaseTaxDeductionsDetails();
		for (TaxCTEDao taxAfterNetPremiumAfterBaseTaxDeductions : taxAfterNetPremiumAfterBaseTaxDeductions_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setSubsection_Premium_Reference(
					taxAfterNetPremiumAfterBaseTaxDeductions.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("NET_PREMIUM_AFTER_COMPOUND_TAX");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					taxAfterNetPremiumAfterBaseTaxDeductions.getSubsection_Premium_Reference(),
					getAllSubsectionPremiumAmountDetails(),
					getMasterAmountForTaxAfterNetPremiumAfterBaseTaxDeductions());

			log.info("Subsection_Premium_Reference Value");
			log.info(taxAfterNetPremiumAfterBaseTaxDeductions.getSubsection_Premium_Reference());

			log.info(
					"-----------Amount value from getPremiumAmountForTaxAfterNetPremiumAfterBaseTaxDeductions()-------------");
			log.info(amount.toString());

			log.info("-----------Total Amount value from TaxCTEDao-------------");
			log.info(taxAfterNetPremiumAfterBaseTaxDeductions.getTax_Amount().toString());

			subsection_Premium_Amount
					.setPremium_Amount(amount.add(taxAfterNetPremiumAfterBaseTaxDeductions.getTax_Amount()));

			log.info("-----------Return Amount value after adding to  Total Amount-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("NET_PREMIUM_AFTER_BASE_TAX_DEDUCTIONS");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	/***
	 * Part-6=>---- --Deduction after Compund tax and arrive
	 * NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX
	 */

	private List<DeductionsCTEDao> getDeductionAfterCompundTaxAndArriveNetPremiumAfterDeductionsAndTaxDetails() {
		log.info(" -----Step 1 get dfcpt_cte Details -----------");
		return deductionsService.getDeductionDetails("NET_PREMIUM_AFTER_COMPOUND_TAX",
				getAllPremiumReferencesValues());
	}

	private List<MasterAmountTypesDao> getMasterAmountForTaxAfterNetPremiumAfterDeductionsAndTaxDetails() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX  -----------");
		return masterAmountTypeService.getMasterAmountFor("NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX");
	}

	
	public void insertIntoSubsectionPremiumAmountTaxTaxAfterNetPremiumAfterDeductionsAndTaxDetails() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<DeductionsCTEDao> deductionsAfterBaseTax_CTE = getDeductionAfterCompundTaxAndArriveNetPremiumAfterDeductionsAndTaxDetails();
		for (DeductionsCTEDao deductionsAfterBaseTax : deductionsAfterBaseTax_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount
					.setSubsection_Premium_Reference(deductionsAfterBaseTax.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("NET_PREMIUM_AFTER_DEDUCTIONS_AND_TAX");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					deductionsAfterBaseTax.getSubsection_Premium_Reference(), getAllSubsectionPremiumAmountDetails(),
					getMasterAmountForTaxAfterNetPremiumAfterDeductionsAndTaxDetails());

			log.info("Subsection_Premium_Reference Value");
			log.info(deductionsAfterBaseTax.getSubsection_Premium_Reference());

			log.info(
					"-----------Amount value from getPremiumAmountForDeductionAfterCompundTaxAndArriveNetPremiumAfterDeductionsAndTaxDetails()-------------");
			log.info(amount.toString());

			log.info("-----------Total Amount value from DeductionsCTEDao-------------");
			log.info(deductionsAfterBaseTax.getDeduction_Amount().toString());

			subsection_Premium_Amount.setPremium_Amount(amount.subtract(deductionsAfterBaseTax.getDeduction_Amount()));

			log.info("-----------Return Amount value after Subtracted from  Total Amount-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("NET_PREMIUM_AFTER_COMPOUND_TAX");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	/***
	 * Part-7=>---- -- insert buyer premium and seller for all (Mandatory)
	 */

	private List<MasterAmountTypesDao> getMasterAmountForBuyerPremiumAllDetails() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with LINE_NET_PREMIUM_FOR_BUYER  -----------");
		return masterAmountTypeService.getMasterAmountFor("LINE_NET_PREMIUM_FOR_BUYER");
	}

	
	public void insertIntoSubsectionPremiumAmountForBuyerPremiumAllDetails() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<AllPremiumReferenceDao> allPremiumReferenceDao = allPremiumReferences;
		for (AllPremiumReferenceDao allPremiumReference : allPremiumReferenceDao) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount
					.setSubsection_Premium_Reference(allPremiumReference.getContract_Subsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("LINE_NET_PREMIUM_FOR_BUYER");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					allPremiumReference.getContract_Subsection_Premium_Reference(),
					getAllSubsectionPremiumAmountDetails(), getMasterAmountForBuyerPremiumAllDetails());

			log.info("Contract_Subsection_Premium_Reference Value");
			log.info(allPremiumReference.getContract_Subsection_Premium_Reference());

			subsection_Premium_Amount.setPremium_Amount(amount);

			log.info("-----------Return Amount value-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	private List<MasterAmountTypesDao> getMasterAmountForSellerPremiumAllDetails() {
		log.info(
				" -----Step 4 get MasterAmountTypesDao from function GetPremiumAmountForAmountType with LINE_NET_PREMIUM_FOR_SELLERS  -----------");
		return masterAmountTypeService.getMasterAmountFor("LINE_NET_PREMIUM_FOR_SELLERS");
	}

	
	public void insertIntoSubsectionPremiumAmountForSellerPremiumAllDetails() {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		List<AllPremiumReferenceDao> allPremiumReferenceDao = allPremiumReferences;
		for (AllPremiumReferenceDao allPremiumReference : allPremiumReferenceDao) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount
					.setSubsection_Premium_Reference(allPremiumReference.getContract_Subsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code("LINE_NET_PREMIUM_FOR_SELLERS");

			BigDecimal amount = masterAmountTypeService.getAmountValue(
					allPremiumReference.getContract_Subsection_Premium_Reference(),
					getAllSubsectionPremiumAmountDetails(), getMasterAmountForSellerPremiumAllDetails());

			log.info("Contract_Subsection_Premium_Reference Value");
			log.info(allPremiumReference.getContract_Subsection_Premium_Reference());

			subsection_Premium_Amount.setPremium_Amount(amount);
			log.info("-----------Return Amount value-------------");
			log.info(subsection_Premium_Amount.getPremium_Amount().toString());

			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("");
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
			log.info(" -----Step 8 Save values into Subsection_Premium_Amount Table -----------");
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	
	public List<TaxCTEDao> getNetSellerCTEDetails() {
		log.info(" -----Step 1 get netseller_CTE Details -----------");
		return taxService.getTaxDetails("LINE_NET_PREMIUM_FOR_BUYER", getAllPremiumReferencesValues());
	}

	
	public void UpdateSellerPremium() {

		log.info(" -----Step 1 get netseller_CTE Details -----------");
		
		List<TaxCTEDao> taxDaoRef = getNetSellerCTEDetails();
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = getAllSubsectionPremiumAmountDetails();

		for (Subsection_Premium_Amount subsectionPremiumAmount : subsectionPremiumAmountList) {
			for (TaxCTEDao taxcteObj : taxDaoRef) {
				if (subsectionPremiumAmount.getSubsection_Premium_Reference()
						.equals(taxcteObj.getSubsection_Premium_Reference())
						&& subsectionPremiumAmount.getPremium_Amount_Type_Code()
								.equals("LINE_NET_PREMIUM_FOR_SELLERS")) {
					Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
					subsection_Premium_Amount.setPremium_Amount(
							subsectionPremiumAmount.getPremium_Amount().add(taxcteObj.getTax_Amount()));
					subsection_Premium_Amount
							.setUI_Premium_Amount_Type_Code(taxcteObj.getTax_Premium_Amount_Type_Code());
					subsection_Premium_Amount
							.setSubsection_Premium_Reference(subsectionPremiumAmount.getSubsection_Premium_Reference());
					subsectionPremiumAmountService.update(subsection_Premium_Amount);
				}

			}
		}

	}

}
