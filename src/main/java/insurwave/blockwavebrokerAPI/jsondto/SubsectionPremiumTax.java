package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumTax {
	/*
	 * --"Subsection_Premium_Reference": "05e40e71-c394-072f-05a5-56b0334b2e34",
	 * --"Subsection_Premium_Tax_Reference": null, --"Tax_Position": 1,
	 * --"Tax_Name": "Tax1", --"Tax_Level_Code": "BASE", --"Tax_Type_Code":
	 * "INCOME_TAX", --"Tax_Authority_Jurisdiction_Code": "AUSTRALIA",
	 * --"Tax_Premium_Amount_Type_Code": "NET_PREMIUM_AFTER_DEDUCTIONS",
	 * --"Tax_Calculation_Type_Code": "PERCENTAGE", --"Tax_Rate": 10,
	 * --"Tax_Amount": 90, "Tax_Payer_Role_Code": "INSURER", "IsLocal": true
	 */

	@JsonProperty("Subsection_Premium_Reference")
	public String subsection_Premium_Reference;

	@JsonProperty("Subsection_Premium_Tax_Reference")
	public String subsection_Premium_Tax_Reference;

	@JsonProperty("Tax_Position")
	public String tax_Position;

	@JsonProperty("Tax_Name")
	public String tax_Name;

	@JsonProperty("Tax_Level_Code")
	public String tax_Level_Code;

	@JsonProperty("Tax_Type_Code")
	public String tax_Type_Code;

	@JsonProperty("Tax_Authority_Jurisdiction_Code")
	public String tax_Authority_Jurisdiction_Code;

	@JsonProperty("Tax_Premium_Amount_Type_Code")
	public String tax_Premium_Amount_Type_Code;

	@JsonProperty("Tax_Calculation_Type_Code")
	public String tax_Calculation_Type_Code;

	@JsonProperty("Tax_Rate")
	public String tax_Rate;

	@JsonProperty("Tax_Amount")
	public String tax_Amount;

	@JsonProperty("Tax_Payer_Role_Code")
	public String tax_Payer_Role_Code;

	@JsonProperty("IsLocal")
	public String isLocal;

	/**
	 * @return the subsection_Premium_Reference
	 */
	public String getSubsection_Premium_Reference() {
		return subsection_Premium_Reference;
	}

	/**
	 * @param subsection_Premium_Reference
	 *            the subsection_Premium_Reference to set
	 */
	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

	/**
	 * @return the subsection_Premium_Tax_Reference
	 */
	public String getSubsection_Premium_Tax_Reference() {
		return subsection_Premium_Tax_Reference;
	}

	/**
	 * @param subsection_Premium_Tax_Reference
	 *            the subsection_Premium_Tax_Reference to set
	 */
	public void setSubsection_Premium_Tax_Reference(String subsection_Premium_Tax_Reference) {
		this.subsection_Premium_Tax_Reference = subsection_Premium_Tax_Reference;
	}

	/**
	 * @return the tax_Position
	 */
	public String getTax_Position() {
		return tax_Position;
	}

	/**
	 * @param tax_Position
	 *            the tax_Position to set
	 */
	public void setTax_Position(String tax_Position) {
		this.tax_Position = tax_Position;
	}

	/**
	 * @return the tax_Name
	 */
	public String getTax_Name() {
		return tax_Name;
	}

	/**
	 * @param tax_Name
	 *            the tax_Name to set
	 */
	public void setTax_Name(String tax_Name) {
		this.tax_Name = tax_Name;
	}

	/**
	 * @return the tax_Level_Code
	 */
	public String getTax_Level_Code() {
		return tax_Level_Code;
	}

	/**
	 * @param tax_Level_Code
	 *            the tax_Level_Code to set
	 */
	public void setTax_Level_Code(String tax_Level_Code) {
		this.tax_Level_Code = tax_Level_Code;
	}

	/**
	 * @return the tax_Type_Code
	 */
	public String getTax_Type_Code() {
		return tax_Type_Code;
	}

	/**
	 * @param tax_Type_Code
	 *            the tax_Type_Code to set
	 */
	public void setTax_Type_Code(String tax_Type_Code) {
		this.tax_Type_Code = tax_Type_Code;
	}

	/**
	 * @return the tax_Authority_Jurisdiction_Code
	 */
	public String getTax_Authority_Jurisdiction_Code() {
		return tax_Authority_Jurisdiction_Code;
	}

	/**
	 * @param tax_Authority_Jurisdiction_Code
	 *            the tax_Authority_Jurisdiction_Code to set
	 */
	public void setTax_Authority_Jurisdiction_Code(String tax_Authority_Jurisdiction_Code) {
		this.tax_Authority_Jurisdiction_Code = tax_Authority_Jurisdiction_Code;
	}

	/**
	 * @return the tax_Premium_Amount_Type_Code
	 */
	public String getTax_Premium_Amount_Type_Code() {
		return tax_Premium_Amount_Type_Code;
	}

	/**
	 * @param tax_Premium_Amount_Type_Code
	 *            the tax_Premium_Amount_Type_Code to set
	 */
	public void setTax_Premium_Amount_Type_Code(String tax_Premium_Amount_Type_Code) {
		this.tax_Premium_Amount_Type_Code = tax_Premium_Amount_Type_Code;
	}

	/**
	 * @return the tax_Calculation_Type_Code
	 */
	public String getTax_Calculation_Type_Code() {
		return tax_Calculation_Type_Code;
	}

	/**
	 * @param tax_Calculation_Type_Code
	 *            the tax_Calculation_Type_Code to set
	 */
	public void setTax_Calculation_Type_Code(String tax_Calculation_Type_Code) {
		this.tax_Calculation_Type_Code = tax_Calculation_Type_Code;
	}

	/**
	 * @return the tax_Rate
	 */
	public String getTax_Rate() {
		return tax_Rate;
	}

	/**
	 * @param tax_Rate
	 *            the tax_Rate to set
	 */
	public void setTax_Rate(String tax_Rate) {
		this.tax_Rate = tax_Rate;
	}

	/**
	 * @return the tax_Amount
	 */
	public String getTax_Amount() {
		return tax_Amount;
	}

	/**
	 * @param tax_Amount
	 *            the tax_Amount to set
	 */
	public void setTax_Amount(String tax_Amount) {
		this.tax_Amount = tax_Amount;
	}

	/**
	 * @return the tax_Payer_Role_Code
	 */
	public String getTax_Payer_Role_Code() {
		return tax_Payer_Role_Code;
	}

	/**
	 * @param tax_Payer_Role_Code
	 *            the tax_Payer_Role_Code to set
	 */
	public void setTax_Payer_Role_Code(String tax_Payer_Role_Code) {
		this.tax_Payer_Role_Code = tax_Payer_Role_Code;
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
