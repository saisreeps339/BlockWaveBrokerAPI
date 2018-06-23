package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractSubsection {
	@JsonProperty("Contract_Subsection_UUID")
	public String contract_Subsection_UUID;
	@JsonProperty("Contract_Section_UUID")
	public String contract_Section_UUID;
	@JsonProperty("Cover_Type_Reference")
	public String cover_Type_Reference;
	@JsonProperty("Contract_Subsection_Name")
	public String contract_Subsection_Name;
	@JsonProperty("Contract_Subsection_Reference")
	public String contract_Subsection_Reference;
	@JsonProperty("Coverage_Basis_UUID")
	public String coverage_Basis_UUID;
	@JsonProperty("Maximum_Insurable_Value")
	public long maximum_Insurable_Value;
	@JsonProperty("Deductible")
	public long deductible;
	@JsonProperty("Agreed_Value")
	public long agreed_Value;
	@JsonProperty("Sum_Insured_Percentage")
	public String sum_Insured_Percentage;
	@JsonProperty("Agreed_Value_Date")
	public String agreed_Value_Date;
	@JsonProperty("Sum_Insured")
	public long sum_Insured;
	@JsonProperty("Line_Percentage_Basis_UUID")
	public String line_Percentage_Basis_UUID;
	@JsonProperty("Status")
	public String status;
	@JsonProperty("Version_Number")
	public long version_Number;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;
	@JsonProperty("Updated_By")
	public String updated_By;
	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;
	@JsonProperty("Subsection_Premium_Amount")
	public long subsection_Premium_Amount;
	@JsonProperty("Contract_Changes_Agreement_Basis_UUID")
	public String contract_Changes_Agreement_Basis_UUID;
	@JsonProperty("Order_Percentage")
	public long order_Percentage;
	@JsonProperty("ShareAllocations")
	public ShareAllocation shareAllocations[];
	@JsonProperty("CalculationPremium")
	public CalculationPremium calculationPremium[];
	@JsonProperty("remainingAssetCount")
	public long remainingAssetCount;
	@JsonProperty("totalPremiumCalculationAssetCount")
	public long totalPremiumCalculationAssetCount;
	@JsonProperty("Subsection_Premium_Amount_After_Deductions_And_Tax")
	public long subsection_Premium_Amount_After_Deductions_And_Tax;

	@JsonProperty("Agreed_Value_Percentage")
	public long agreed_Value_Percentage;

	@JsonProperty("Contract_Subsection_Basis_UUID")
	public String contract_Subsection_Basis_UUID;

	@JsonProperty("selectedSectionAssets")
	public Asset selectedSectionAssets[];

	@JsonCreator
	public ContractSubsection() {

	}

	/**
	 * @return the contract_Subsection_UUID
	 */
	public String getContract_Subsection_UUID() {
		return contract_Subsection_UUID;
	}

	/**
	 * @param contract_Subsection_UUID
	 *            the contract_Subsection_UUID to set
	 */
	public void setContract_Subsection_UUID(String contract_Subsection_UUID) {
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	/**
	 * @return the contract_Section_UUID
	 */
	public String getContract_Section_UUID() {
		return contract_Section_UUID;
	}

	/**
	 * @param contract_Section_UUID
	 *            the contract_Section_UUID to set
	 */
	public void setContract_Section_UUID(String contract_Section_UUID) {
		this.contract_Section_UUID = contract_Section_UUID;
	}

	/**
	 * @return the cover_Type_Reference
	 */
	public String getCover_Type_Reference() {
		return cover_Type_Reference;
	}

	/**
	 * @param cover_Type_Reference
	 *            the cover_Type_Reference to set
	 */
	public void setCover_Type_Reference(String cover_Type_Reference) {
		this.cover_Type_Reference = cover_Type_Reference;
	}

	/**
	 * @return the contract_Subsection_Name
	 */
	public String getContract_Subsection_Name() {
		return contract_Subsection_Name;
	}

	/**
	 * @param contract_Subsection_Name
	 *            the contract_Subsection_Name to set
	 */
	public void setContract_Subsection_Name(String contract_Subsection_Name) {
		this.contract_Subsection_Name = contract_Subsection_Name;
	}

	/**
	 * @return the contract_Subsection_Reference
	 */
	public String getContract_Subsection_Reference() {
		return contract_Subsection_Reference;
	}

	/**
	 * @param contract_Subsection_Reference
	 *            the contract_Subsection_Reference to set
	 */
	public void setContract_Subsection_Reference(String contract_Subsection_Reference) {
		this.contract_Subsection_Reference = contract_Subsection_Reference;
	}

	/**
	 * @return the coverage_Basis_UUID
	 */
	public String getCoverage_Basis_UUID() {
		return coverage_Basis_UUID;
	}

	/**
	 * @param coverage_Basis_UUID
	 *            the coverage_Basis_UUID to set
	 */
	public void setCoverage_Basis_UUID(String coverage_Basis_UUID) {
		this.coverage_Basis_UUID = coverage_Basis_UUID;
	}

	/**
	 * @return the maximum_Insurable_Value
	 */
	public long getMaximum_Insurable_Value() {
		return maximum_Insurable_Value;
	}

	/**
	 * @param maximum_Insurable_Value
	 *            the maximum_Insurable_Value to set
	 */
	public void setMaximum_Insurable_Value(long maximum_Insurable_Value) {
		this.maximum_Insurable_Value = maximum_Insurable_Value;
	}

	/**
	 * @return the deductible
	 */
	public long getDeductible() {
		return deductible;
	}

	/**
	 * @param deductible
	 *            the deductible to set
	 */
	public void setDeductible(long deductible) {
		this.deductible = deductible;
	}

	/**
	 * @return the agreed_Value
	 */
	public long getAgreed_Value() {
		return agreed_Value;
	}

	/**
	 * @param agreed_Value
	 *            the agreed_Value to set
	 */
	public void setAgreed_Value(long agreed_Value) {
		this.agreed_Value = agreed_Value;
	}

	/**
	 * @return the sum_Insured_Percentage
	 */
	public String getSum_Insured_Percentage() {
		return sum_Insured_Percentage;
	}

	/**
	 * @param sum_Insured_Percentage
	 *            the sum_Insured_Percentage to set
	 */
	public void setSum_Insured_Percentage(String sum_Insured_Percentage) {
		this.sum_Insured_Percentage = sum_Insured_Percentage;
	}

	/**
	 * @return the agreed_Value_Date
	 */
	public String getAgreed_Value_Date() {
		return agreed_Value_Date;
	}

	/**
	 * @param agreed_Value_Date
	 *            the agreed_Value_Date to set
	 */
	public void setAgreed_Value_Date(String agreed_Value_Date) {
		this.agreed_Value_Date = agreed_Value_Date;
	}

	/**
	 * @return the sum_Insured
	 */
	public long getSum_Insured() {
		return sum_Insured;
	}

	/**
	 * @param sum_Insured
	 *            the sum_Insured to set
	 */
	public void setSum_Insured(long sum_Insured) {
		this.sum_Insured = sum_Insured;
	}

	/**
	 * @return the line_Percentage_Basis_UUID
	 */
	public String getLine_Percentage_Basis_UUID() {
		return line_Percentage_Basis_UUID;
	}

	/**
	 * @param line_Percentage_Basis_UUID
	 *            the line_Percentage_Basis_UUID to set
	 */
	public void setLine_Percentage_Basis_UUID(String line_Percentage_Basis_UUID) {
		this.line_Percentage_Basis_UUID = line_Percentage_Basis_UUID;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the version_Number
	 */
	public long getVersion_Number() {
		return version_Number;
	}

	/**
	 * @param version_Number
	 *            the version_Number to set
	 */
	public void setVersion_Number(long version_Number) {
		this.version_Number = version_Number;
	}

	/**
	 * @return the created_By
	 */
	public String getCreated_By() {
		return created_By;
	}

	/**
	 * @param created_By
	 *            the created_By to set
	 */
	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	/**
	 * @return the created_Datetime
	 */
	public String getCreated_Datetime() {
		return created_Datetime;
	}

	/**
	 * @param created_Datetime
	 *            the created_Datetime to set
	 */
	public void setCreated_Datetime(String created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return updated_By;
	}

	/**
	 * @param updated_By
	 *            the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	/**
	 * @return the updated_Datetime
	 */
	public String getUpdated_Datetime() {
		return updated_Datetime;
	}

	/**
	 * @param updated_Datetime
	 *            the updated_Datetime to set
	 */
	public void setUpdated_Datetime(String updated_Datetime) {
		this.updated_Datetime = updated_Datetime;
	}

	/**
	 * @return the subsection_Premium_Amount
	 */
	public long getSubsection_Premium_Amount() {
		return subsection_Premium_Amount;
	}

	/**
	 * @param subsection_Premium_Amount
	 *            the subsection_Premium_Amount to set
	 */
	public void setSubsection_Premium_Amount(long subsection_Premium_Amount) {
		this.subsection_Premium_Amount = subsection_Premium_Amount;
	}

	/**
	 * @return the contract_Changes_Agreement_Basis_UUID
	 */
	public String getContract_Changes_Agreement_Basis_UUID() {
		return contract_Changes_Agreement_Basis_UUID;
	}

	/**
	 * @param contract_Changes_Agreement_Basis_UUID
	 *            the contract_Changes_Agreement_Basis_UUID to set
	 */
	public void setContract_Changes_Agreement_Basis_UUID(String contract_Changes_Agreement_Basis_UUID) {
		this.contract_Changes_Agreement_Basis_UUID = contract_Changes_Agreement_Basis_UUID;
	}

	/**
	 * @return the order_Percentage
	 */
	public long getOrder_Percentage() {
		return order_Percentage;
	}

	/**
	 * @param order_Percentage
	 *            the order_Percentage to set
	 */
	public void setOrder_Percentage(long order_Percentage) {
		this.order_Percentage = order_Percentage;
	}

	/**
	 * @return the shareAllocations
	 */
	public ShareAllocation[] getShareAllocations() {
		return shareAllocations;
	}

	/**
	 * @param shareAllocations
	 *            the shareAllocations to set
	 */
	public void setShareAllocations(ShareAllocation[] shareAllocations) {
		this.shareAllocations = shareAllocations;
	}

	/**
	 * @return the calculationPremium
	 */
	public CalculationPremium[] getCalculationPremium() {
		return calculationPremium;
	}

	/**
	 * @param calculationPremium
	 *            the calculationPremium to set
	 */
	public void setCalculationPremium(CalculationPremium[] calculationPremium) {
		this.calculationPremium = calculationPremium;
	}

	/**
	 * @return the remainingAssetCount
	 */
	public long getRemainingAssetCount() {
		return remainingAssetCount;
	}

	/**
	 * @param remainingAssetCount
	 *            the remainingAssetCount to set
	 */
	public void setRemainingAssetCount(long remainingAssetCount) {
		this.remainingAssetCount = remainingAssetCount;
	}

	/**
	 * @return the totalPremiumCalculationAssetCount
	 */
	public long getTotalPremiumCalculationAssetCount() {
		return totalPremiumCalculationAssetCount;
	}

	/**
	 * @param totalPremiumCalculationAssetCount
	 *            the totalPremiumCalculationAssetCount to set
	 */
	public void setTotalPremiumCalculationAssetCount(long totalPremiumCalculationAssetCount) {
		this.totalPremiumCalculationAssetCount = totalPremiumCalculationAssetCount;
	}

	/**
	 * @return the subsection_Premium_Amount_After_Deductions_And_Tax
	 */
	public long getSubsection_Premium_Amount_After_Deductions_And_Tax() {
		return subsection_Premium_Amount_After_Deductions_And_Tax;
	}

	/**
	 * @param subsection_Premium_Amount_After_Deductions_And_Tax
	 *            the subsection_Premium_Amount_After_Deductions_And_Tax to set
	 */
	public void setSubsection_Premium_Amount_After_Deductions_And_Tax(
			long subsection_Premium_Amount_After_Deductions_And_Tax) {
		this.subsection_Premium_Amount_After_Deductions_And_Tax = subsection_Premium_Amount_After_Deductions_And_Tax;
	}

	/**
	 * @return the agreed_Value_Percentage
	 */
	public long getAgreed_Value_Percentage() {
		return agreed_Value_Percentage;
	}

	/**
	 * @param agreed_Value_Percentage
	 *            the agreed_Value_Percentage to set
	 */
	public void setAgreed_Value_Percentage(long agreed_Value_Percentage) {
		this.agreed_Value_Percentage = agreed_Value_Percentage;
	}

	/**
	 * @return the contract_Subsection_Basis_UUID
	 */
	public String getContract_Subsection_Basis_UUID() {
		return contract_Subsection_Basis_UUID;
	}

	/**
	 * @param contract_Subsection_Basis_UUID
	 *            the contract_Subsection_Basis_UUID to set
	 */
	public void setContract_Subsection_Basis_UUID(String contract_Subsection_Basis_UUID) {
		this.contract_Subsection_Basis_UUID = contract_Subsection_Basis_UUID;
	}

}
