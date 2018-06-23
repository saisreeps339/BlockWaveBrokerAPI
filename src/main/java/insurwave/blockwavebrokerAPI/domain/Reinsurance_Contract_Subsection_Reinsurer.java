package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Reinsurance_Contract_Subsection_Reinsurer
 * database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Contract_Subsection_Reinsurer")
@NamedQuery(name = "Reinsurance_Contract_Subsection_Reinsurer.findAll", query = "SELECT r FROM Reinsurance_Contract_Subsection_Reinsurer r")
public class Reinsurance_Contract_Subsection_Reinsurer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Contract_Subsection_ReInsurer_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Contract_Subsection_ReInsurer_UUID;

	@Column(name = "Always_Require_Notification_Flag")
	private boolean always_Require_Notification_Flag;

	@Column(name = "Claim_Participant_Function_UUID", length = 1)
	private String claim_Participant_Function_UUID;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Declaration_Participant_Function_UUID", length = 1)
	private String declaration_Participant_Function_UUID;

	@Column(name = "Endorsement_Agreement_Type_UUID", length = 1)
	private String endorsement_Agreement_Type_UUID;

	@Column(name = "Endorsement_Notification_Due_Days")
	private int endorsement_Notification_Due_Days;

	@Column(name = "Endorsement_Notification_Follower_Flag")
	private boolean endorsement_Notification_Follower_Flag;

	@Column(name = "Endorsement_Participant_Function_UUID", length = 1)
	private String endorsement_Participant_Function_UUID;

	@Column(name = "Layer_Lower_Limit", precision = 18, scale = 5)
	private BigDecimal layer_Lower_Limit;

	@Column(name = "Layer_Upper_Limit", precision = 18, scale = 5)
	private BigDecimal layer_Upper_Limit;

	@Column(name = "Line_Percentage", precision = 18, scale = 2)
	private BigDecimal line_Percentage;

	@Column(name = "Line_Percentage_Basis_UUID", length = 1)
	private String line_Percentage_Basis_UUID;

	@Column(name = "Line_Premium_Amount", precision = 18, scale = 5)
	private BigDecimal line_Premium_Amount;

	@Column(name = "Line_Transaction_Function_UUID", length = 1)
	private String line_Transaction_Function_UUID;

	@Column(name = "New_Business_Flag")
	private boolean new_Business_Flag;

	@Column(name = "Participant_Function_UUID", length = 1)
	private String participant_Function_UUID;

	@Column(name = "Participant_Identity_Reference")
	private String participant_Identity_Reference;

	@Column(name = "Participant_Legal_Entity_Code")
	private String participant_Legal_Entity_Code;

	@Column(name = "Participant_Sequence_Number")
	private int participant_Sequence_Number;

	@Column(name = "Settlement_Channel_UUID", length = 1)
	private String settlement_Channel_UUID;

	@Column(name = "Status")
	private String status;

	@Column(name = "Subaccount_Reference")
	private String subaccount_Reference;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Reinsurance_Contract_Subsection
	@ManyToOne
	@JoinColumn(name = "Reinsurance_Contract_Subsection_UUID", nullable = false)
	private Reinsurance_Contract_Subsection reinsuranceContractSubsection;

	public Reinsurance_Contract_Subsection_Reinsurer() {
	}

	public String getReinsurance_Contract_Subsection_ReInsurer_UUID() {
		return this.reinsurance_Contract_Subsection_ReInsurer_UUID;
	}

	public void setReinsurance_Contract_Subsection_ReInsurer_UUID(
			String reinsurance_Contract_Subsection_ReInsurer_UUID) {
		this.reinsurance_Contract_Subsection_ReInsurer_UUID = reinsurance_Contract_Subsection_ReInsurer_UUID;
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

	public BigDecimal getLayer_Lower_Limit() {
		return this.layer_Lower_Limit;
	}

	public void setLayer_Lower_Limit(BigDecimal layer_Lower_Limit) {
		this.layer_Lower_Limit = layer_Lower_Limit;
	}

	public BigDecimal getLayer_Upper_Limit() {
		return this.layer_Upper_Limit;
	}

	public void setLayer_Upper_Limit(BigDecimal layer_Upper_Limit) {
		this.layer_Upper_Limit = layer_Upper_Limit;
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

	public boolean getNew_Business_Flag() {
		return this.new_Business_Flag;
	}

	public void setNew_Business_Flag(boolean new_Business_Flag) {
		this.new_Business_Flag = new_Business_Flag;
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

	public int getParticipant_Sequence_Number() {
		return this.participant_Sequence_Number;
	}

	public void setParticipant_Sequence_Number(int participant_Sequence_Number) {
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

	public Reinsurance_Contract_Subsection getReinsuranceContractSubsection() {
		return this.reinsuranceContractSubsection;
	}

	public void setReinsuranceContractSubsection(Reinsurance_Contract_Subsection reinsuranceContractSubsection) {
		this.reinsuranceContractSubsection = reinsuranceContractSubsection;
	}

}