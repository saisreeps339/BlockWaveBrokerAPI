package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareAllocation {
	@JsonProperty("Contract_Subsection_Insurer_UUID")
	public String contract_Subsection_Insurer_UUID;
	@JsonProperty("Participant_Identity_Reference")
	public String participant_Identity_Reference;
	@JsonProperty("Contract_Subsection_UUID")
	public String contract_Subsection_UUID;
	@JsonProperty("Participant_Sequence_Number")
	public String participant_Sequence_Number;
	@JsonProperty("New_Business_Indicator")
	public boolean new_Business_Indicator;
	@JsonProperty("Line_Percentage")
	public long line_Percentage;
	@JsonProperty("Line_Premium_Amount")
	public long line_Premium_Amount;
	@JsonProperty("Declaration_Participant_Function_UUID")
	public String declaration_Participant_Function_UUID;
	@JsonProperty("Endorsement_Participant_Function_UUID")
	public String endorsement_Participant_Function_UUID;
	@JsonProperty("Claim_Participant_Function_UUID")
	public String claim_Participant_Function_UUID;
	@JsonProperty("Endorsement_Agreement_Type_UUID")
	public String endorsement_Agreement_Type_UUID;
	@JsonProperty("Endorsement_Notification_Follower_Flag")
	public boolean endorsement_Notification_Follower_Flag;
	@JsonProperty("Endorsement_Notification_Due_Days")
	public long endorsement_Notification_Due_Days;
	@JsonProperty("Always_Require_Notification_Flag")
	public boolean always_Require_Notification_Flag;
	@JsonProperty("Subaccount_Reference")
	public String subaccount_Reference;
	@JsonProperty("Settlement_Channel_UUID")
	public String settlement_Channel_UUID;
	@JsonProperty("Line_Transaction_Function_UUID")
	public String line_Transaction_Function_UUID;
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
	@JsonProperty("Participant_Legal_Entity_Code")
	public String participant_Legal_Entity_Code;
	@JsonProperty("Participant_Function_UUID")
	public String participant_Function_UUID;
	@JsonProperty("Insurer_Name")
	public String insurer_Name;

	@JsonProperty("Line_Percentage_Basis_UUID")
	public String line_Percentage_Basis_UUID;

	@JsonProperty("IsLocal")
	public String isLocal;

	@JsonProperty("Original_Premium")
	public String original_Premium;

	@JsonCreator
	public ShareAllocation() {
	}

	/**
	 * @return the contract_Subsection_Insurer_UUID
	 */
	public String getContract_Subsection_Insurer_UUID() {
		return contract_Subsection_Insurer_UUID;
	}

	/**
	 * @param contract_Subsection_Insurer_UUID
	 *            the contract_Subsection_Insurer_UUID to set
	 */
	public void setContract_Subsection_Insurer_UUID(String contract_Subsection_Insurer_UUID) {
		this.contract_Subsection_Insurer_UUID = contract_Subsection_Insurer_UUID;
	}

	/**
	 * @return the participant_Identity_Reference
	 */
	public String getParticipant_Identity_Reference() {
		return participant_Identity_Reference;
	}

	/**
	 * @param participant_Identity_Reference
	 *            the participant_Identity_Reference to set
	 */
	public void setParticipant_Identity_Reference(String participant_Identity_Reference) {
		this.participant_Identity_Reference = participant_Identity_Reference;
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
	 * @return the participant_Sequence_Number
	 */
	public String getParticipant_Sequence_Number() {
		return participant_Sequence_Number;
	}

	/**
	 * @param participant_Sequence_Number
	 *            the participant_Sequence_Number to set
	 */
	public void setParticipant_Sequence_Number(String participant_Sequence_Number) {
		this.participant_Sequence_Number = participant_Sequence_Number;
	}

	/**
	 * @return the new_Business_Indicator
	 */
	public boolean isNew_Business_Indicator() {
		return new_Business_Indicator;
	}

	/**
	 * @param new_Business_Indicator
	 *            the new_Business_Indicator to set
	 */
	public void setNew_Business_Indicator(boolean new_Business_Indicator) {
		this.new_Business_Indicator = new_Business_Indicator;
	}

	/**
	 * @return the line_Percentage
	 */
	public long getLine_Percentage() {
		return line_Percentage;
	}

	/**
	 * @param line_Percentage
	 *            the line_Percentage to set
	 */
	public void setLine_Percentage(long line_Percentage) {
		this.line_Percentage = line_Percentage;
	}

	/**
	 * @return the line_Premium_Amount
	 */
	public long getLine_Premium_Amount() {
		return line_Premium_Amount;
	}

	/**
	 * @param line_Premium_Amount
	 *            the line_Premium_Amount to set
	 */
	public void setLine_Premium_Amount(long line_Premium_Amount) {
		this.line_Premium_Amount = line_Premium_Amount;
	}

	/**
	 * @return the declaration_Participant_Function_UUID
	 */
	public String getDeclaration_Participant_Function_UUID() {
		return declaration_Participant_Function_UUID;
	}

	/**
	 * @param declaration_Participant_Function_UUID
	 *            the declaration_Participant_Function_UUID to set
	 */
	public void setDeclaration_Participant_Function_UUID(String declaration_Participant_Function_UUID) {
		this.declaration_Participant_Function_UUID = declaration_Participant_Function_UUID;
	}

	/**
	 * @return the endorsement_Participant_Function_UUID
	 */
	public String getEndorsement_Participant_Function_UUID() {
		return endorsement_Participant_Function_UUID;
	}

	/**
	 * @param endorsement_Participant_Function_UUID
	 *            the endorsement_Participant_Function_UUID to set
	 */
	public void setEndorsement_Participant_Function_UUID(String endorsement_Participant_Function_UUID) {
		this.endorsement_Participant_Function_UUID = endorsement_Participant_Function_UUID;
	}

	/**
	 * @return the claim_Participant_Function_UUID
	 */
	public String getClaim_Participant_Function_UUID() {
		return claim_Participant_Function_UUID;
	}

	/**
	 * @param claim_Participant_Function_UUID
	 *            the claim_Participant_Function_UUID to set
	 */
	public void setClaim_Participant_Function_UUID(String claim_Participant_Function_UUID) {
		this.claim_Participant_Function_UUID = claim_Participant_Function_UUID;
	}

	/**
	 * @return the endorsement_Agreement_Type_UUID
	 */
	public String getEndorsement_Agreement_Type_UUID() {
		return endorsement_Agreement_Type_UUID;
	}

	/**
	 * @param endorsement_Agreement_Type_UUID
	 *            the endorsement_Agreement_Type_UUID to set
	 */
	public void setEndorsement_Agreement_Type_UUID(String endorsement_Agreement_Type_UUID) {
		this.endorsement_Agreement_Type_UUID = endorsement_Agreement_Type_UUID;
	}

	/**
	 * @return the endorsement_Notification_Follower_Flag
	 */
	public boolean isEndorsement_Notification_Follower_Flag() {
		return endorsement_Notification_Follower_Flag;
	}

	/**
	 * @param endorsement_Notification_Follower_Flag
	 *            the endorsement_Notification_Follower_Flag to set
	 */
	public void setEndorsement_Notification_Follower_Flag(boolean endorsement_Notification_Follower_Flag) {
		this.endorsement_Notification_Follower_Flag = endorsement_Notification_Follower_Flag;
	}

	/**
	 * @return the endorsement_Notification_Due_Days
	 */
	public long getEndorsement_Notification_Due_Days() {
		return endorsement_Notification_Due_Days;
	}

	/**
	 * @param endorsement_Notification_Due_Days
	 *            the endorsement_Notification_Due_Days to set
	 */
	public void setEndorsement_Notification_Due_Days(long endorsement_Notification_Due_Days) {
		this.endorsement_Notification_Due_Days = endorsement_Notification_Due_Days;
	}

	/**
	 * @return the always_Require_Notification_Flag
	 */
	public boolean isAlways_Require_Notification_Flag() {
		return always_Require_Notification_Flag;
	}

	/**
	 * @param always_Require_Notification_Flag
	 *            the always_Require_Notification_Flag to set
	 */
	public void setAlways_Require_Notification_Flag(boolean always_Require_Notification_Flag) {
		this.always_Require_Notification_Flag = always_Require_Notification_Flag;
	}

	/**
	 * @return the subaccount_Reference
	 */
	public String getSubaccount_Reference() {
		return subaccount_Reference;
	}

	/**
	 * @param subaccount_Reference
	 *            the subaccount_Reference to set
	 */
	public void setSubaccount_Reference(String subaccount_Reference) {
		this.subaccount_Reference = subaccount_Reference;
	}

	/**
	 * @return the settlement_Channel_UUID
	 */
	public String getSettlement_Channel_UUID() {
		return settlement_Channel_UUID;
	}

	/**
	 * @param settlement_Channel_UUID
	 *            the settlement_Channel_UUID to set
	 */
	public void setSettlement_Channel_UUID(String settlement_Channel_UUID) {
		this.settlement_Channel_UUID = settlement_Channel_UUID;
	}

	/**
	 * @return the line_Transaction_Function_UUID
	 */
	public String getLine_Transaction_Function_UUID() {
		return line_Transaction_Function_UUID;
	}

	/**
	 * @param line_Transaction_Function_UUID
	 *            the line_Transaction_Function_UUID to set
	 */
	public void setLine_Transaction_Function_UUID(String line_Transaction_Function_UUID) {
		this.line_Transaction_Function_UUID = line_Transaction_Function_UUID;
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
	 * @return the participant_Legal_Entity_Code
	 */
	public String getParticipant_Legal_Entity_Code() {
		return participant_Legal_Entity_Code;
	}

	/**
	 * @param participant_Legal_Entity_Code
	 *            the participant_Legal_Entity_Code to set
	 */
	public void setParticipant_Legal_Entity_Code(String participant_Legal_Entity_Code) {
		this.participant_Legal_Entity_Code = participant_Legal_Entity_Code;
	}

	/**
	 * @return the participant_Function_UUID
	 */
	public String getParticipant_Function_UUID() {
		return participant_Function_UUID;
	}

	/**
	 * @param participant_Function_UUID
	 *            the participant_Function_UUID to set
	 */
	public void setParticipant_Function_UUID(String participant_Function_UUID) {
		this.participant_Function_UUID = participant_Function_UUID;
	}

	/**
	 * @return the insurer_Name
	 */
	public String getInsurer_Name() {
		return insurer_Name;
	}

	/**
	 * @param insurer_Name
	 *            the insurer_Name to set
	 */
	public void setInsurer_Name(String insurer_Name) {
		this.insurer_Name = insurer_Name;
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

	/**
	 * @return the original_Premium
	 */
	public String getOriginal_Premium() {
		return original_Premium;
	}

	/**
	 * @param original_Premium
	 *            the original_Premium to set
	 */
	public void setOriginal_Premium(String original_Premium) {
		this.original_Premium = original_Premium;
	}

}