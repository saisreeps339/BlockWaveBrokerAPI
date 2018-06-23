package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumDeductible {

	@JsonProperty("Subsection_Premium_Reference")
	public String subsection_Premium_Reference;

	@JsonProperty("Subsection_Premium_Deductible_Reference")
	public String subsection_Premium_Deductible_Reference;

	@JsonProperty("Deductible_Position")
	public String deductible_Position;

	@JsonProperty("Deductible_Name")
	public String deductible_Name;

	@JsonProperty("Deductible_Type_Code")
	public String deductible_Type_Code;

	@JsonProperty("Deductible_Basis_Code")
	public String deductible_Basis_Code;

	@JsonProperty("Deductible_Basis_Description")
	public String deductible_Basis_Description;

	@JsonProperty("Deductible_Amount")
	public String deductible_Amount;

	@JsonProperty("IsLocal")
	public String isLocal;

	@JsonCreator
	public SubsectionPremiumDeductible() {
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
	 * @return the subsection_Premium_Deductible_Reference
	 */
	public String getSubsection_Premium_Deductible_Reference() {
		return subsection_Premium_Deductible_Reference;
	}

	/**
	 * @param subsection_Premium_Deductible_Reference
	 *            the subsection_Premium_Deductible_Reference to set
	 */
	public void setSubsection_Premium_Deductible_Reference(String subsection_Premium_Deductible_Reference) {
		this.subsection_Premium_Deductible_Reference = subsection_Premium_Deductible_Reference;
	}

	/**
	 * @return the deductible_Position
	 */
	public String getDeductible_Position() {
		return deductible_Position;
	}

	/**
	 * @param deductible_Position
	 *            the deductible_Position to set
	 */
	public void setDeductible_Position(String deductible_Position) {
		this.deductible_Position = deductible_Position;
	}

	/**
	 * @return the deductible_Name
	 */
	public String getDeductible_Name() {
		return deductible_Name;
	}

	/**
	 * @param deductible_Name
	 *            the deductible_Name to set
	 */
	public void setDeductible_Name(String deductible_Name) {
		this.deductible_Name = deductible_Name;
	}

	/**
	 * @return the deductible_Type_Code
	 */
	public String getDeductible_Type_Code() {
		return deductible_Type_Code;
	}

	/**
	 * @param deductible_Type_Code
	 *            the deductible_Type_Code to set
	 */
	public void setDeductible_Type_Code(String deductible_Type_Code) {
		this.deductible_Type_Code = deductible_Type_Code;
	}

	/**
	 * @return the deductible_Basis_Code
	 */
	public String getDeductible_Basis_Code() {
		return deductible_Basis_Code;
	}

	/**
	 * @param deductible_Basis_Code
	 *            the deductible_Basis_Code to set
	 */
	public void setDeductible_Basis_Code(String deductible_Basis_Code) {
		this.deductible_Basis_Code = deductible_Basis_Code;
	}

	/**
	 * @return the deductible_Basis_Description
	 */
	public String getDeductible_Basis_Description() {
		return deductible_Basis_Description;
	}

	/**
	 * @param deductible_Basis_Description
	 *            the deductible_Basis_Description to set
	 */
	public void setDeductible_Basis_Description(String deductible_Basis_Description) {
		this.deductible_Basis_Description = deductible_Basis_Description;
	}

	/**
	 * @return the deductible_Amount
	 */
	public String getDeductible_Amount() {
		return deductible_Amount;
	}

	/**
	 * @param deductible_Amount
	 *            the deductible_Amount to set
	 */
	public void setDeductible_Amount(String deductible_Amount) {
		this.deductible_Amount = deductible_Amount;
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