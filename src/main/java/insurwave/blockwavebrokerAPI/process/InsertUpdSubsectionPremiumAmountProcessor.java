package insurwave.blockwavebrokerAPI.process;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.dao.DeductionsCTEDao;
import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.dao.TaxCTEDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Premium;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;
import insurwave.blockwavebrokerAPI.service.AllPremiumReferenceService;
import insurwave.blockwavebrokerAPI.service.MasterAmountTypeService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumAmountService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductionService;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumTaxService;


@Component
public class InsertUpdSubsectionPremiumAmountProcessor {

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
	
	private List<String> allPremiumReferencesPerContractSection;

	public List<String> retrieveAndDeleteAllPremiumReferences(Contract_Section contractSection) {
		allPremiumReferencesPerContractSection = allPremiumReferenceService.allPremiumReferences(contractSection.getContract_Section_UUID());
		if(!(allPremiumReferencesPerContractSection==null || allPremiumReferencesPerContractSection.isEmpty())) {
			// delete if susectionPremiumRegrenses are already in Subsection_Premium_Amount
			allPremiumReferenceService.deletePremiumRef(allPremiumReferencesPerContractSection);
		}
		return allPremiumReferencesPerContractSection;
	}

	public void insertGrossPremiumLine(Contract_Subsection_Premium contractSubsectionPremium,String premiumAmountTypeCode) {
		
		List<ContractSubsectionPremiumDao> contractSubPremObject = allPremiumReferenceService.getContractSubsectionPrem(allPremiumReferencesPerContractSection);
		ContractSubsectionPremiumDao newContractSubsectionPremiumDao = new ContractSubsectionPremiumDao(contractSubsectionPremium.getContract_Subsection_Premium_Reference(), contractSubsectionPremium.getPremium_Amount());
		//add the newly created contract subsection premium details
		contractSubPremObject.add(newContractSubsectionPremiumDao);
		
		//insert values into Subsection_Premium_Amount
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		for (ContractSubsectionPremiumDao obj : contractSubPremObject) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setPremium_Amount(obj.getPremiumAmount());
			subsection_Premium_Amount.setSubsection_Premium_Reference(obj.getContract_Subsection_Premium_Reference());
			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("");
			subsection_Premium_Amount.setPremium_Amount_Type_Code(premiumAmountTypeCode);

			subsectionPremiumAmountList.add(subsection_Premium_Amount);
		}

		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}
	
	//get all Subsection_Premium_Amount records
	private List<Subsection_Premium_Amount> getAllSubsectionPremiumAmountDetails() {	
		return subsectionPremiumAmountService.findAll();
	}

	//insert various deduction into Subsection_Premium_Amount table
	public void insertIntoSubsectionPremiumAmountForDeductions(String deductionPremiumAmountTypeCode,String premiumAmountTypeCode) {
		
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();
		
		List<DeductionsCTEDao> deductions_CTE = deductionsService.getDeductionDetails(deductionPremiumAmountTypeCode, allPremiumReferencesPerContractSection);
		
		for (DeductionsCTEDao deductionsCTEReference : deductions_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setSubsection_Premium_Reference(deductionsCTEReference.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code(premiumAmountTypeCode);			
			
			List<MasterAmountTypesDao> masterAmountTypeForDeductions =  masterAmountTypeService.getMasterAmountFor(premiumAmountTypeCode);
			BigDecimal amount = masterAmountTypeService.getAmountValue(
					deductionsCTEReference.getSubsection_Premium_Reference(), getAllSubsectionPremiumAmountDetails(),
					masterAmountTypeForDeductions);
			
			subsection_Premium_Amount.setPremium_Amount(amount.subtract(deductionsCTEReference.getDeduction_Amount()));
			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code(deductionPremiumAmountTypeCode);
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
		}
		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}

	//insert various taxes into Subsection_Premium_Amount table
	public void insertIntoSubsectionPremiumAmountForTaxes(String taxPremiumAmountTypeCode,String premiumAmountTypeCode) {

		List<Subsection_Premium_Amount> subsectionPremiumAmountList = new ArrayList<Subsection_Premium_Amount>();		
		List<TaxCTEDao> basetax_CTE = taxService.getTaxDetails(taxPremiumAmountTypeCode, allPremiumReferencesPerContractSection);
		
		for (TaxCTEDao basetaxCTEReference : basetax_CTE) {
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setSubsection_Premium_Reference(basetaxCTEReference.getSubsection_Premium_Reference());
			subsection_Premium_Amount.setPremium_Amount_Type_Code(premiumAmountTypeCode);
			
			List<MasterAmountTypesDao>  masterAmountTypeForTax = masterAmountTypeService.getMasterAmountFor(premiumAmountTypeCode);
			BigDecimal amount = masterAmountTypeService.getAmountValue(
					basetaxCTEReference.getSubsection_Premium_Reference(), getAllSubsectionPremiumAmountDetails(),
					masterAmountTypeForTax);
			subsection_Premium_Amount.setPremium_Amount(amount.add(basetaxCTEReference.getTax_Amount()));
			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code(taxPremiumAmountTypeCode);
			subsectionPremiumAmountList.add(subsection_Premium_Amount);
		}

		subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsectionPremiumAmountList);
	}	
	
	//insert line net premium values for Buyer or Seller into Subsection_Premium_Amount table
	public void insertIntoSubsectionPremiumAmountForBuyerOrSellerPremiumAllDetails(String premiumAmountTypeCode) {
		
			allPremiumReferencesPerContractSection.forEach(contractSubsectionPremiumReference ->{
			Subsection_Premium_Amount subsection_Premium_Amount = new Subsection_Premium_Amount();
			subsection_Premium_Amount.setSubsection_Premium_Reference(contractSubsectionPremiumReference);
			subsection_Premium_Amount.setPremium_Amount_Type_Code(premiumAmountTypeCode);
			
			List<MasterAmountTypesDao> masterAmountForBuyerPremiumAllDetails=masterAmountTypeService.getMasterAmountFor(premiumAmountTypeCode);
			BigDecimal amount = masterAmountTypeService.getAmountValue(
					contractSubsectionPremiumReference,
					getAllSubsectionPremiumAmountDetails(), masterAmountForBuyerPremiumAllDetails);
			subsection_Premium_Amount.setPremium_Amount(amount);
			subsection_Premium_Amount.setUI_Premium_Amount_Type_Code("");
			subsectionPremiumAmountService.saveSubsectionPremiumAmount(subsection_Premium_Amount);
		});
	}

	//Update seller premium if there is any Tax on bByer premium for Seller
	public void UpdateSellerPremium(String taxPremiumAmountTypeCode,String premiumAmountTypeCode) {
		List<Subsection_Premium_Amount> subsectionPremiumAmountList = getAllSubsectionPremiumAmountDetails();
		List<TaxCTEDao> basetax_CTE = taxService.getTaxDetails(taxPremiumAmountTypeCode, allPremiumReferencesPerContractSection);
		for (Subsection_Premium_Amount subsectionPremiumAmount : subsectionPremiumAmountList) {
			for (TaxCTEDao taxcteObj : basetax_CTE) {
				if (subsectionPremiumAmount.getSubsection_Premium_Reference()
						.equals(taxcteObj.getSubsection_Premium_Reference())
						&& subsectionPremiumAmount.getPremium_Amount_Type_Code()
								.equals(premiumAmountTypeCode)) {
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
