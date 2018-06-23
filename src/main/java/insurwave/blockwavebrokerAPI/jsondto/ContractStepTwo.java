package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractStepTwo {
	@JsonProperty("Contract_Section_UUID")
	public String contract_Section_UUID;
	@JsonProperty("Contract_UUID")
	public String contract_UUID;
	@JsonProperty("Contract_Section_Name")
	public String contract_Section_Name;
	@JsonProperty("Contract_Section_Reference")
	public String contract_Section_Reference;
	@JsonProperty("Legal_Entity_Code")
	public String legal_Entity_Code;
	@JsonProperty("Section_Premium")
	public long section_Premium;
	@JsonProperty("Jurisdiction_UUID")
	public String jurisdiction_UUID;
	@JsonProperty("Loss_Payee_Legal_Entity_Code")
	public String loss_Payee_Legal_Entity_Code;
	@JsonProperty("Settlement_Method_UUID")
	public String settlement_Method_UUID;
	@JsonProperty("Status")
	public String status;
	@JsonProperty("Version_Number")
	public long version_Number;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;
	@JsonProperty("Contract_Subsection_Basis_Code")
	public String contract_Subsection_Basis_Code;
	@JsonProperty("ContractSubsections")
	public ContractSubsection contractSubsections[];
	@JsonProperty("Vessels")
	public Vessel vessels[];

	@JsonProperty("Updated_By")
	public String updated_By;
	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;

	@JsonCreator
	public ContractStepTwo() {
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
	public long getSection_Premium() {
		return section_Premium;
	}

	/**
	 * @param section_Premium
	 *            the section_Premium to set
	 */
	public void setSection_Premium(long section_Premium) {
		this.section_Premium = section_Premium;
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
	 * @return the settlement_Method_UUID
	 */
	public String getSettlement_Method_UUID() {
		return settlement_Method_UUID;
	}

	/**
	 * @param settlement_Method_UUID
	 *            the settlement_Method_UUID to set
	 */
	public void setSettlement_Method_UUID(String settlement_Method_UUID) {
		this.settlement_Method_UUID = settlement_Method_UUID;
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
	 * @return the contract_Subsection_Basis_Code
	 */
	public String getContract_Subsection_Basis_Code() {
		return contract_Subsection_Basis_Code;
	}

	/**
	 * @param contract_Subsection_Basis_Code
	 *            the contract_Subsection_Basis_Code to set
	 */
	public void setContract_Subsection_Basis_Code(String contract_Subsection_Basis_Code) {
		this.contract_Subsection_Basis_Code = contract_Subsection_Basis_Code;
	}

	/**
	 * @return the contractSubsections
	 */
	public ContractSubsection[] getContractSubsections() {
		return contractSubsections;
	}

	/**
	 * @param contractSubsections
	 *            the contractSubsections to set
	 */
	public void setContractSubsections(ContractSubsection[] contractSubsections) {
		this.contractSubsections = contractSubsections;
	}

	/**
	 * @return the vessels
	 */
	public Vessel[] getVessels() {
		return vessels;
	}

	/**
	 * @param vessels
	 *            the vessels to set
	 */
	public void setVessels(Vessel[] vessels) {
		this.vessels = vessels;
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

}
