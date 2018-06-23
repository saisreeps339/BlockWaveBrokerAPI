package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProgramDataDetail {

	// added to map to entity; this is not a JSON property
	public String contract_UUID;

	// added to map to entity; this is not a JSON property
	public String jurisdiction_UUID;

	@JsonProperty("Contract_Section_Name")
	public String contract_Section_Name;

	@JsonProperty("Contract_Section_Reference")
	public String contract_Section_Reference;

	@JsonProperty("Legal_Entity_Reference")
	public String legal_Entity_Code;

	@JsonProperty("Section_Premium")
	public String section_Premium;

	@JsonProperty("Settlement_Method_Code")
	public String settlement_Method_UUID;

	@JsonProperty("Loss_Payee_Legal_Entity_Reference")
	public String loss_Payee_Legal_Entity_Code;

	@JsonProperty("Created_By")
	public String created_By;

	@JsonProperty("Created_Datetime")
	public String created_Datetime;

	@JsonProperty("Updated_By")
	public String updated_By;

	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;

	@JsonCreator
	public ProgramDataDetail() {
	}

	/**
	 * @return the contract_Section_Name
	 */
	public String getContract_Section_Name() {
		return contract_Section_Name;
	}

	/**
	 * @param contract_Section_Name
	 *            the contract_Section_Name to set
	 */
	public void setContract_Section_Name(String contract_Section_Name) {
		this.contract_Section_Name = contract_Section_Name;
	}

	/**
	 * @return the contract_Section_Reference
	 */
	public String getContract_Section_Reference() {
		return contract_Section_Reference;
	}

	/**
	 * @param contract_Section_Reference
	 *            the contract_Section_Reference to set
	 */
	public void setContract_Section_Reference(String contract_Section_Reference) {
		this.contract_Section_Reference = contract_Section_Reference;
	}

	/**
	 * @return the legal_Entity_Code
	 */
	public String getLegal_Entity_Code() {
		return legal_Entity_Code;
	}

	/**
	 * @param legal_Entity_Code
	 *            the legal_Entity_Code to set
	 */
	public void setLegal_Entity_Code(String legal_Entity_Code) {
		this.legal_Entity_Code = legal_Entity_Code;
	}

	/**
	 * @return the section_Premium
	 */
	public String getSection_Premium() {
		return section_Premium;
	}

	/**
	 * @param section_Premium
	 *            the section_Premium to set
	 */
	public void setSection_Premium(String section_Premium) {
		this.section_Premium = section_Premium;
	}

	/**
	 * @return the settlement_Method_Code
	 */
	public String getSettlement_Method_UUID() {
		return settlement_Method_UUID;
	}

	/**
	 * @param settlement_Method_Code
	 *            the settlement_Method_Code to set
	 */
	public void setSettlement_Method_UUID(String settlement_Method_Code) {
		this.settlement_Method_UUID = settlement_Method_Code;
	}

	/**
	 * @return the loss_Payee_Legal_Entity_Code
	 */
	public String getLoss_Payee_Legal_Entity_Code() {
		return loss_Payee_Legal_Entity_Code;
	}

	/**
	 * @param loss_Payee_Legal_Entity_Code
	 *            the loss_Payee_Legal_Entity_Code to set
	 */
	public void setLoss_Payee_Legal_Entity_Code(String loss_Payee_Legal_Entity_Code) {
		this.loss_Payee_Legal_Entity_Code = loss_Payee_Legal_Entity_Code;
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
	 * @return the contract_UUID
	 */
	public String getContract_UUID() {
		return contract_UUID;
	}

	/**
	 * @param contract_UUID
	 *            the contract_UUID to set
	 */
	public void setContract_UUID(String contract_UUID) {
		this.contract_UUID = contract_UUID;
	}

	/**
	 * @return the jurisdiction_UUID
	 */
	public String getJurisdiction_UUID() {
		return jurisdiction_UUID;
	}

	/**
	 * @param jurisdiction_UUID
	 *            the jurisdiction_UUID to set
	 */
	public void setJurisdiction_UUID(String jurisdiction_UUID) {
		this.jurisdiction_UUID = jurisdiction_UUID;
	}

}