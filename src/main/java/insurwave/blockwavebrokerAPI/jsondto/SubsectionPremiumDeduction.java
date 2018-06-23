package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumDeduction {

	@JsonProperty("Subsection_Premium_Reference")
	public String subsection_Premium_Reference;

	@JsonProperty("Subsection_Premium_Deduction_Reference")
	public String subsection_Premium_Deduction_Reference;

	@JsonProperty("Deduction_Position")
	public String deduction_Position;

	@JsonProperty("Deduction_Name")
	public String deduction_Name;

	@JsonProperty("Deduction_Type_Code")
	public String deduction_Type_Code;

	@JsonProperty("Deduction_Premium_Amount_Type_Code")
	public String deduction_Premium_Amount_Type_Code;

	@JsonProperty("Deduction_Calculation_Type_Code")
	public String deduction_Calculation_Type_Code;

	@JsonProperty("Deduction_Rate")
	public String deduction_Rate;

	@JsonProperty("Deduction_Amount")
	public String deduction_Amount;

	@JsonProperty("IsLocal")
	public String isLocal;

	@JsonCreator
	public SubsectionPremiumDeduction() {
	}

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
	 * @return the subsection_Premium_Deduction_Reference
	 */
	public String getSubsection_Premium_Deduction_Reference() {
		return subsection_Premium_Deduction_Reference;
	}

	/**
	 * @param subsection_Premium_Deduction_Reference
	 *            the subsection_Premium_Deduction_Reference to set
	 */
	public void setSubsection_Premium_Deduction_Reference(String subsection_Premium_Deduction_Reference) {
		this.subsection_Premium_Deduction_Reference = subsection_Premium_Deduction_Reference;
	}

	/**
	 * @return the deduction_Position
	 */
	public String getDeduction_Position() {
		return deduction_Position;
	}

	/**
	 * @param deduction_Position
	 *            the deduction_Position to set
	 */
	public void setDeduction_Position(String deduction_Position) {
		this.deduction_Position = deduction_Position;
	}

	/**
	 * @return the deduction_Name
	 */
	public String getDeduction_Name() {
		return deduction_Name;
	}

	/**
	 * @param deduction_Name
	 *            the deduction_Name to set
	 */
	public void setDeduction_Name(String deduction_Name) {
		this.deduction_Name = deduction_Name;
	}

	/**
	 * @return the deduction_Type_Code
	 */
	public String getDeduction_Type_Code() {
		return deduction_Type_Code;
	}

	/**
	 * @param deduction_Type_Code
	 *            the deduction_Type_Code to set
	 */
	public void setDeduction_Type_Code(String deduction_Type_Code) {
		this.deduction_Type_Code = deduction_Type_Code;
	}

	/**
	 * @return the deduction_Premium_Amount_Type_Code
	 */
	public String getDeduction_Premium_Amount_Type_Code() {
		return deduction_Premium_Amount_Type_Code;
	}

	/**
	 * @param deduction_Premium_Amount_Type_Code
	 *            the deduction_Premium_Amount_Type_Code to set
	 */
	public void setDeduction_Premium_Amount_Type_Code(String deduction_Premium_Amount_Type_Code) {
		this.deduction_Premium_Amount_Type_Code = deduction_Premium_Amount_Type_Code;
	}

	/**
	 * @return the deduction_Calculation_Type_Code
	 */
	public String getDeduction_Calculation_Type_Code() {
		return deduction_Calculation_Type_Code;
	}

	/**
	 * @param deduction_Calculation_Type_Code
	 *            the deduction_Calculation_Type_Code to set
	 */
	public void setDeduction_Calculation_Type_Code(String deduction_Calculation_Type_Code) {
		this.deduction_Calculation_Type_Code = deduction_Calculation_Type_Code;
	}

	/**
	 * @return the deduction_Rate
	 */
	public String getDeduction_Rate() {
		return deduction_Rate;
	}

	/**
	 * @param deduction_Rate
	 *            the deduction_Rate to set
	 */
	public void setDeduction_Rate(String deduction_Rate) {
		this.deduction_Rate = deduction_Rate;
	}

	/**
	 * @return the deduction_Amount
	 */
	public String getDeduction_Amount() {
		return deduction_Amount;
	}

	/**
	 * @param deduction_Amount
	 *            the deduction_Amount to set
	 */
	public void setDeduction_Amount(String deduction_Amount) {
		this.deduction_Amount = deduction_Amount;
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
