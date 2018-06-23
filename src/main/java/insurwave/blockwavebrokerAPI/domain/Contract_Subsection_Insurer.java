package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Contract_Subsection_Insurer database table.
 * 
 */
@Entity
@Table(name = "Contract_Subsection_Insurer")
@NamedQuery(name = "Contract_Subsection_Insurer.findAll", query = "SELECT c FROM Contract_Subsection_Insurer c")
public class Contract_Subsection_Insurer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_Subsection_Insurer_UUID", unique = true, nullable = false, length = 1)
	private String contract_Subsection_Insurer_UUID;

	@Column(name = "Always_Require_Notification_Flag")
	private boolean always_Require_Notification_Flag;

	@Column(name = "Claim_Participant_Function_UUID")
	private String claim_Participant_Function_UUID;

	@Column(name = "Contract_Subsection_UUID", length = 1)
	private String contract_Subsection_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Declaration_Participant_Function_UUID")
	private String declaration_Participant_Function_UUID;

	@Column(name = "Endorsement_Agreement_Type_UUID")
	private String endorsement_Agreement_Type_UUID;

	@Column(name = "Endorsement_Notification_Due_Days")
	private int endorsement_Notification_Due_Days;

	@Column(name = "Endorsement_Notification_Follower_Flag")
	private boolean endorsement_Notification_Follower_Flag;

	@Column(name = "Endorsement_Participant_Function_UUID")
	private String endorsement_Participant_Function_UUID;

	@Column(name = "Line_Percentage", precision = 18, scale = 8)
	private BigDecimal line_Percentage;

	@Column(name = "Line_Percentage_Basis_UUID")
	private String line_Percentage_Basis_UUID;

	@Column(name = "Line_Premium_Amount", precision = 18, scale = 2)
	private BigDecimal line_Premium_Amount;

	@Column(name = "Line_Transaction_Function_UUID")
	private String line_Transaction_Function_UUID;

	@Column(name = "New_Business_Indicator")
	private boolean new_Business_Indicator;

	@Column(name = "Participant_Function_UUID")
	private String participant_Function_UUID;

	@Column(name = "Participant_Identity_Reference", length = 1)
	private String participant_Identity_Reference;

	@Column(name = "Participant_Legal_Entity_Code", length = 1)
	private String participant_Legal_Entity_Code;

	@Column(name = "Participant_Sequence_Number")
	private String participant_Sequence_Number;

	@Column(name = "Settlement_Channel_UUID")
	private String settlement_Channel_UUID;

	@Column(name = "Status", length = 255)
	private String status;

	@Column(name = "Subaccount_Reference")
	private String subaccount_Reference;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	public Contract_Subsection_Insurer() {
	}

	public String getContract_Subsection_Insurer_UUID() {
		return this.contract_Subsection_Insurer_UUID;
	}

	public void setContract_Subsection_Insurer_UUID(String contract_Subsection_Insurer_UUID) {
		this.contract_Subsection_Insurer_UUID = contract_Subsection_Insurer_UUID;
	}

	public boolean getAlways_Require_Notification_Flag() {
		return this.always_Require_Notification_Flag;
	}

	public void setAlways_Require_Notification_Flag(boolean always_Require_Notification_Flag) {
		this.always_Require_Notification_Flag = always_Require_Notification_Flag;
	}

	public String getClaim_Participant_Function_UUID() {
		return this.claim_Participant_Function_UUID;
	}

	public void setClaim_Participant_Function_UUID(String claim_Participant_Function_UUID) {
		this.claim_Participant_Function_UUID = claim_Participant_Function_UUID;
	}

	public String getContract_Subsection_UUID() {
		return this.contract_Subsection_UUID;
	}

	public void setContract_Subsection_UUID(String contract_Subsection_UUID) {
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	public String getCreated_By() {
		return this.created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	public Timestamp getCreated_Datetime() {
		return this.created_Datetime;
	}

	public void setCreated_Datetime(Timestamp created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	public String getDeclaration_Participant_Function_UUID() {
		return this.declaration_Participant_Function_UUID;
	}

	public void setDeclaration_Participant_Function_UUID(String declaration_Participant_Function_UUID) {
		this.declaration_Participant_Function_UUID = declaration_Participant_Function_UUID;
	}

	public String getEndorsement_Agreement_Type_UUID() {
		return this.endorsement_Agreement_Type_UUID;
	}

	public void setEndorsement_Agreement_Type_UUID(String endorsement_Agreement_Type_UUID) {
		this.endorsement_Agreement_Type_UUID = endorsement_Agreement_Type_UUID;
	}

	public int getEndorsement_Notification_Due_Days() {
		return this.endorsement_Notification_Due_Days;
	}

	public void setEndorsement_Notification_Due_Days(int endorsement_Notification_Due_Days) {
		this.endorsement_Notification_Due_Days = endorsement_Notification_Due_Days;
	}

	public boolean getEndorsement_Notification_Follower_Flag() {
		return this.endorsement_Notification_Follower_Flag;
	}

	public void setEndorsement_Notification_Follower_Flag(boolean endorsement_Notification_Follower_Flag) {
		this.endorsement_Notification_Follower_Flag = endorsement_Notification_Follower_Flag;
	}

	public String getEndorsement_Participant_Function_UUID() {
		return this.endorsement_Participant_Function_UUID;
	}

	public void setEndorsement_Participant_Function_UUID(String endorsement_Participant_Function_UUID) {
		this.endorsement_Participant_Function_UUID = endorsement_Participant_Function_UUID;
	}

	public BigDecimal getLine_Percentage() {
		return this.line_Percentage;
	}

	public void setLine_Percentage(BigDecimal line_Percentage) {
		this.line_Percentage = line_Percentage;
	}

	public String getLine_Percentage_Basis_UUID() {
		return this.line_Percentage_Basis_UUID;
	}

	public void setLine_Percentage_Basis_UUID(String line_Percentage_Basis_UUID) {
		this.line_Percentage_Basis_UUID = line_Percentage_Basis_UUID;
	}

	public BigDecimal getLine_Premium_Amount() {
		return this.line_Premium_Amount;
	}

	public void setLine_Premium_Amount(BigDecimal line_Premium_Amount) {
		this.line_Premium_Amount = line_Premium_Amount;
	}

	public String getLine_Transaction_Function_UUID() {
		return this.line_Transaction_Function_UUID;
	}

	public void setLine_Transaction_Function_UUID(String line_Transaction_Function_UUID) {
		this.line_Transaction_Function_UUID = line_Transaction_Function_UUID;
	}

	public boolean getNew_Business_Indicator() {
		return this.new_Business_Indicator;
	}

	public void setNew_Business_Indicator(boolean new_Business_Indicator) {
		this.new_Business_Indicator = new_Business_Indicator;
	}

	public String getParticipant_Function_UUID() {
		return this.participant_Function_UUID;
	}

	public void setParticipant_Function_UUID(String participant_Function_UUID) {
		this.participant_Function_UUID = participant_Function_UUID;
	}

	public String getParticipant_Identity_Reference() {
		return this.participant_Identity_Reference;
	}

	public void setParticipant_Identity_Reference(String participant_Identity_Reference) {
		this.participant_Identity_Reference = participant_Identity_Reference;
	}

	public String getParticipant_Legal_Entity_Code() {
		return this.participant_Legal_Entity_Code;
	}

	public void setParticipant_Legal_Entity_Code(String participant_Legal_Entity_Code) {
		this.participant_Legal_Entity_Code = participant_Legal_Entity_Code;
	}

	public String getParticipant_Sequence_Number() {
		return this.participant_Sequence_Number;
	}

	public void setParticipant_Sequence_Number(String participant_Sequence_Number) {
		this.participant_Sequence_Number = participant_Sequence_Number;
	}

	public String getSettlement_Channel_UUID() {
		return this.settlement_Channel_UUID;
	}

	public void setSettlement_Channel_UUID(String settlement_Channel_UUID) {
		this.settlement_Channel_UUID = settlement_Channel_UUID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubaccount_Reference() {
		return this.subaccount_Reference;
	}

	public void setSubaccount_Reference(String subaccount_Reference) {
		this.subaccount_Reference = subaccount_Reference;
	}

	public String getUpdated_By() {
		return this.updated_By;
	}

	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	public Timestamp getUpdated_Datetime() {
		return this.updated_Datetime;
	}

	public void setUpdated_Datetime(Timestamp updated_Datetime) {
		this.updated_Datetime = updated_Datetime;
	}

	public Integer getVersion_Number() {
		return this.version_Number;
	}

	public void setVersion_Number(Integer version_Number) {
		this.version_Number = version_Number;
	}

}