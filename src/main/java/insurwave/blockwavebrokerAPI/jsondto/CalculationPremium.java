package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculationPremium {
	@JsonProperty("Contract_Subsection_Premium_Reference")
	public String contract_Subsection_Premium_Reference;
	@JsonProperty("Contract_Subsection_UUID")
	public String contract_Subsection_UUID;
	@JsonProperty("Premium_Position")
	public long premium_Position;
	@JsonProperty("Premium_Name")
	public String premium_Name;
	@JsonProperty("Premium_Calculation_Type_Code")
	public String premium_Calculation_Type_Code;
	@JsonProperty("Premium_Calculation_Basis_Code")
	public String premium_Calculation_Basis_Code;
	@JsonProperty("Premium_Rate")
	public long premium_Rate;
	@JsonProperty("Fleet_Type_Code")
	public String fleet_Type_Code;
	@JsonProperty("Flag")
	public String flag;
	@JsonProperty("Premium_Calculation_Asset_Basis_Code")
	public String premium_Calculation_Asset_Basis_Code;
	@JsonProperty("Premium_Amount")
	public long premium_Amount;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;
	@JsonProperty("Updated_By")
	public String updated_By;
	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;
	@JsonProperty("Asset_Reference")
	public String asset_Reference;
	@JsonProperty("Asset_Scope_Code")
	public String asset_Scope_Code;

	@JsonProperty("Subsection_Premium_Deductible")
	public SubsectionPremiumDeductible subsection_Premium_Deductible[];

	@JsonProperty("Subsection_Premium_Amount_Deduction")
	public SubsectionPremiumAmountDeduction subsection_Premium_Amount_Deduction[];

	@JsonProperty("Subsection_Premium_Amount_Tax")
	public SubsectionPremiumAmountTax subsection_Premium_Amount_Tax[];

	@JsonProperty("Count")
	public String count;

	@JsonProperty("IsLocal")
	public String isLocal;

	@JsonProperty("SellerPremium")
	public String sellerPremium;

	@JsonProperty("BuyerPremium")
	public String buyerPremium;

	@JsonProperty("ByerPremium")
	public String byerPremium;

	@JsonCreator
	public CalculationPremium() {

	}

	/**
	 * @return the byerPremium
	 */
	public String getByerPremium() {
		return byerPremium;
	}

	/**
	 * @param byerPremium
	 *            the byerPremium to set
	 */
	public void setByerPremium(String byerPremium) {
		this.byerPremium = byerPremium;
	}

	/**
	 * @return the contract_Subsection_Premium_Reference
	 */
	public String getContract_Subsection_Premium_Reference() {
		return contract_Subsection_Premium_Reference;
	}

	/**
	 * @param contract_Subsection_Premium_Reference
	 *            the contract_Subsection_Premium_Reference to set
	 */
	public void setContract_Subsection_Premium_Reference(String contract_Subsection_Premium_Reference) {
		this.contract_Subsection_Premium_Reference = contract_Subsection_Premium_Reference;
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
	 * @return the premium_Position
	 */
	public long getPremium_Position() {
		return premium_Position;
	}

	/**
	 * @param premium_Position
	 *            the premium_Position to set
	 */
	public void setPremium_Position(long premium_Position) {
		this.premium_Position = premium_Position;
	}

	/**
	 * @return the premium_Name
	 */
	public String getPremium_Name() {
		return premium_Name;
	}

	/**
	 * @param premium_Name
	 *            the premium_Name to set
	 */
	public void setPremium_Name(String premium_Name) {
		this.premium_Name = premium_Name;
	}

	/**
	 * @return the premium_Calculation_Type_Code
	 */
	public String getPremium_Calculation_Type_Code() {
		return premium_Calculation_Type_Code;
	}

	/**
	 * @param premium_Calculation_Type_Code
	 *            the premium_Calculation_Type_Code to set
	 */
	public void setPremium_Calculation_Type_Code(String premium_Calculation_Type_Code) {
		this.premium_Calculation_Type_Code = premium_Calculation_Type_Code;
	}

	/**
	 * @return the premium_Calculation_Basis_Code
	 */
	public String getPremium_Calculation_Basis_Code() {
		return premium_Calculation_Basis_Code;
	}

	/**
	 * @param premium_Calculation_Basis_Code
	 *            the premium_Calculation_Basis_Code to set
	 */
	public void setPremium_Calculation_Basis_Code(String premium_Calculation_Basis_Code) {
		this.premium_Calculation_Basis_Code = premium_Calculation_Basis_Code;
	}

	/**
	 * @return the premium_Rate
	 */
	public long getPremium_Rate() {
		return premium_Rate;
	}

	/**
	 * @param premium_Rate
	 *            the premium_Rate to set
	 */
	public void setPremium_Rate(long premium_Rate) {
		this.premium_Rate = premium_Rate;
	}

	/**
	 * @return the fleet_Type_Code
	 */
	public String getFleet_Type_Code() {
		return fleet_Type_Code;
	}

	/**
	 * @param fleet_Type_Code
	 *            the fleet_Type_Code to set
	 */
	public void setFleet_Type_Code(String fleet_Type_Code) {
		this.fleet_Type_Code = fleet_Type_Code;
	}

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag
	 *            the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * @return the premium_Calculation_Asset_Basis_Code
	 */
	public String getPremium_Calculation_Asset_Basis_Code() {
		return premium_Calculation_Asset_Basis_Code;
	}

	/**
	 * @param premium_Calculation_Asset_Basis_Code
	 *            the premium_Calculation_Asset_Basis_Code to set
	 */
	public void setPremium_Calculation_Asset_Basis_Code(String premium_Calculation_Asset_Basis_Code) {
		this.premium_Calculation_Asset_Basis_Code = premium_Calculation_Asset_Basis_Code;
	}

	/**
	 * @return the premium_Amount
	 */
	public long getPremium_Amount() {
		return premium_Amount;
	}

	/**
	 * @param premium_Amount
	 *            the premium_Amount to set
	 */
	public void setPremium_Amount(long premium_Amount) {
		this.premium_Amount = premium_Amount;
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
	 * @return the asset_Reference
	 */
	public String getAsset_Reference() {
		return asset_Reference;
	}

	/**
	 * @param asset_Reference
	 *            the asset_Reference to set
	 */
	public void setAsset_Reference(String asset_Reference) {
		this.asset_Reference = asset_Reference;
	}

	/**
	 * @return the asset_Scope_Code
	 */
	public String getAsset_Scope_Code() {
		return asset_Scope_Code;
	}

	/**
	 * @param asset_Scope_Code
	 *            the asset_Scope_Code to set
	 */
	public void setAsset_Scope_Code(String asset_Scope_Code) {
		this.asset_Scope_Code = asset_Scope_Code;
	}

	/**
	 * @return the subsection_Premium_Deductible
	 */
	public SubsectionPremiumDeductible[] getSubsection_Premium_Deductible() {
		return subsection_Premium_Deductible;
	}

	/**
	 * @return the sellerPremium
	 */
	public String getSellerPremium() {
		return sellerPremium;
	}

	/**
	 * @param sellerPremium
	 *            the sellerPremium to set
	 */
	public void setSellerPremium(String sellerPremium) {
		this.sellerPremium = sellerPremium;
	}

	/**
	 * @return the buyerPremium
	 */
	public String getBuyerPremium() {
		return buyerPremium;
	}

	/**
	 * @param buyerPremium
	 *            the buyerPremium to set
	 */
	public void setBuyerPremium(String buyerPremium) {
		this.buyerPremium = buyerPremium;
	}

	/**
	 * @return the subsection_Premium_Amount_Deduction
	 */
	public SubsectionPremiumAmountDeduction[] getSubsection_Premium_Amount_Deduction() {
		return subsection_Premium_Amount_Deduction;
	}

	/**
	 * @param subsection_Premium_Amount_Deduction
	 *            the subsection_Premium_Amount_Deduction to set
	 */
	public void setSubsection_Premium_Amount_Deduction(
			SubsectionPremiumAmountDeduction[] subsection_Premium_Amount_Deduction) {
		this.subsection_Premium_Amount_Deduction = subsection_Premium_Amount_Deduction;
	}

	/**
	 * @return the subsection_Premium_Amount_Tax
	 */
	public SubsectionPremiumAmountTax[] getSubsection_Premium_Amount_Tax() {
		return subsection_Premium_Amount_Tax;
	}

	/**
	 * @param subsection_Premium_Amount_Tax
	 *            the subsection_Premium_Amount_Tax to set
	 */
	public void setSubsection_Premium_Amount_Tax(SubsectionPremiumAmountTax[] subsection_Premium_Amount_Tax) {
		this.subsection_Premium_Amount_Tax = subsection_Premium_Amount_Tax;
	}

	/**
	 * @param subsection_Premium_Deductible
	 *            the subsection_Premium_Deductible to set
	 */
	public void setSubsection_Premium_Deductible(SubsectionPremiumDeductible[] subsection_Premium_Deductible) {
		this.subsection_Premium_Deductible = subsection_Premium_Deductible;
	}

	/**
	 * @return the count
	 */
	public String getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(String count) {
		this.count = count;
	}

	/**
	 * @return the isLocal
	 */
	public String getIsLocal() {
		return isLocal;
	}

	/**
	 * @param isLocal
	 *            the isLocal to set
	 */
	public void setIsLocal(String isLocal) {
		this.isLocal = isLocal;
	}

}