package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the Reinsurance_Contract database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Contract")
@NamedQuery(name = "Reinsurance_Contract.findAll", query = "SELECT r FROM Reinsurance_Contract r")
public class Reinsurance_Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Contract_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Contract_UUID;

	@Column(name = "Accounting_Basis_UUID", nullable = false)
	private String accounting_Basis_UUID;

	@Column(name = "Advisor_Legal_entity_Code", nullable = false)
	private String advisor_Legal_entity_Code;

	@Column(name = "Attachment_Point", precision = 18, scale = 5)
	private BigDecimal attachment_Point;

	@Column(name = "Business_channel_UUID", nullable = false)
	private String business_channel_UUID;

	@Column(name = "Buyer_Brokerage_Amount", precision = 18, scale = 5)
	private BigDecimal buyer_Brokerage_Amount;

	@Column(name = "Buyer_Brokerage_Basis_UUID", length = 1)
	private String buyer_Brokerage_Basis_UUID;

	@Column(name = "Buyer_Brokerage_Percentage", precision = 18, scale = 2)
	private BigDecimal buyer_Brokerage_Percentage;

	@Column(name = "Cancellation_Notice_Periods")
	private int cancellation_Notice_Periods;

	@Column(name = "Contract_Currency_UUID", nullable = false)
	private String contract_Currency_UUID;

	@Column(name = "Contract_Period_Scope_UUID", nullable = false)
	private String contract_Period_Scope_UUID;

	@Column(name = "Contract_Term")
	private int contract_Term;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "End_line_UUID", length = 1)
	private String end_line_UUID;

	@Column(name = "Expiry_Date")
	private Timestamp expiry_Date;

	@Column(name = "Gross_retention", precision = 18, scale = 5)
	private BigDecimal gross_retention;

	@Column(name = "Inception_Date")
	private Timestamp inception_Date;

	@Column(name = "Layer_Limit")
	private int layer_Limit;

	@Column(name = "Notice_Period_Type_UUID", length = 1)
	private String notice_Period_Type_UUID;

	@Column(name = "Percentage_Share_Ceded", precision = 18, scale = 5)
	private BigDecimal percentage_Share_Ceded;

	@Column(name = "Percentage_Share_Retained", precision = 18, scale = 5)
	private BigDecimal percentage_Share_Retained;

	@Column(name = "Reinsurance_Contract_Name", nullable = false)
	private String reinsurance_Contract_Name;

	@Column(name = "Reinsurance_Contract_Reference")
	private String reinsurance_Contract_Reference;

	@Column(name = "Reinsurance_Contract_Type_UUID", nullable = false)
	private String reinsurance_Contract_Type_UUID;

	@Column(name = "Reinsurance_Program_Subscription_UUID", length = 1)
	private String reinsurance_Program_Subscription_UUID;

	@Column(name = "Start_Line_UUID", precision = 18, scale = 5)
	private BigDecimal start_Line_UUID;

	@Column(name = "Status", nullable = false)
	private String status;

	@Column(name = "Total_Premium_Due", precision = 18, scale = 5)
	private BigDecimal total_Premium_Due;

	@Column(name = "Unique_Market_Reference", nullable = false)
	private String unique_Market_Reference;

	@Column(name = "Updated_By", nullable = false)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Valuation_Basis_UUID", nullable = false)
	private String valuation_Basis_UUID;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Reinsurance_Contract_Section
	@OneToMany(mappedBy = "reinsuranceContract")
	private List<Reinsurance_Contract_Section> reinsuranceContractSections;

	// bi-directional many-to-one association to Reinsurance_Referenced_DI_Contract
	@OneToMany(mappedBy = "reinsuranceContract")
	private List<Reinsurance_Referenced_DI_Contract> reinsuranceReferencedDiContracts;

	public Reinsurance_Contract() {
	}

	public String getReinsurance_Contract_UUID() {
		return this.reinsurance_Contract_UUID;
	}

	public void setReinsurance_Contract_UUID(String reinsurance_Contract_UUID) {
		this.reinsurance_Contract_UUID = reinsurance_Contract_UUID;
	}

	public String getAccounting_Basis_UUID() {
		return this.accounting_Basis_UUID;
	}

	public void setAccounting_Basis_UUID(String accounting_Basis_UUID) {
		this.accounting_Basis_UUID = accounting_Basis_UUID;
	}

	public String getAdvisor_Legal_entity_Code() {
		return this.advisor_Legal_entity_Code;
	}

	public void setAdvisor_Legal_entity_Code(String advisor_Legal_entity_Code) {
		this.advisor_Legal_entity_Code = advisor_Legal_entity_Code;
	}

	public BigDecimal getAttachment_Point() {
		return this.attachment_Point;
	}

	public void setAttachment_Point(BigDecimal attachment_Point) {
		this.attachment_Point = attachment_Point;
	}

	public String getBusiness_channel_UUID() {
		return this.business_channel_UUID;
	}

	public void setBusiness_channel_UUID(String business_channel_UUID) {
		this.business_channel_UUID = business_channel_UUID;
	}

	public BigDecimal getBuyer_Brokerage_Amount() {
		return this.buyer_Brokerage_Amount;
	}

	public void setBuyer_Brokerage_Amount(BigDecimal buyer_Brokerage_Amount) {
		this.buyer_Brokerage_Amount = buyer_Brokerage_Amount;
	}

	public String getBuyer_Brokerage_Basis_UUID() {
		return this.buyer_Brokerage_Basis_UUID;
	}

	public void setBuyer_Brokerage_Basis_UUID(String buyer_Brokerage_Basis_UUID) {
		this.buyer_Brokerage_Basis_UUID = buyer_Brokerage_Basis_UUID;
	}

	public BigDecimal getBuyer_Brokerage_Percentage() {
		return this.buyer_Brokerage_Percentage;
	}

	public void setBuyer_Brokerage_Percentage(BigDecimal buyer_Brokerage_Percentage) {
		this.buyer_Brokerage_Percentage = buyer_Brokerage_Percentage;
	}

	public int getCancellation_Notice_Periods() {
		return this.cancellation_Notice_Periods;
	}

	public void setCancellation_Notice_Periods(int cancellation_Notice_Periods) {
		this.cancellation_Notice_Periods = cancellation_Notice_Periods;
	}

	public String getContract_Currency_UUID() {
		return this.contract_Currency_UUID;
	}

	public void setContract_Currency_UUID(String contract_Currency_UUID) {
		this.contract_Currency_UUID = contract_Currency_UUID;
	}

	public String getContract_Period_Scope_UUID() {
		return this.contract_Period_Scope_UUID;
	}

	public void setContract_Period_Scope_UUID(String contract_Period_Scope_UUID) {
		this.contract_Period_Scope_UUID = contract_Period_Scope_UUID;
	}

	public int getContract_Term() {
		return this.contract_Term;
	}

	public void setContract_Term(int contract_Term) {
		this.contract_Term = contract_Term;
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

	public String getEnd_line_UUID() {
		return this.end_line_UUID;
	}

	public void setEnd_line_UUID(String end_line_UUID) {
		this.end_line_UUID = end_line_UUID;
	}

	public Timestamp getExpiry_Date() {
		return this.expiry_Date;
	}

	public void setExpiry_Date(Timestamp expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public BigDecimal getGross_retention() {
		return this.gross_retention;
	}

	public void setGross_retention(BigDecimal gross_retention) {
		this.gross_retention = gross_retention;
	}

	public Timestamp getInception_Date() {
		return this.inception_Date;
	}

	public void setInception_Date(Timestamp inception_Date) {
		this.inception_Date = inception_Date;
	}

	public int getLayer_Limit() {
		return this.layer_Limit;
	}

	public void setLayer_Limit(int layer_Limit) {
		this.layer_Limit = layer_Limit;
	}

	public String getNotice_Period_Type_UUID() {
		return this.notice_Period_Type_UUID;
	}

	public void setNotice_Period_Type_UUID(String notice_Period_Type_UUID) {
		this.notice_Period_Type_UUID = notice_Period_Type_UUID;
	}

	public BigDecimal getPercentage_Share_Ceded() {
		return this.percentage_Share_Ceded;
	}

	public void setPercentage_Share_Ceded(BigDecimal percentage_Share_Ceded) {
		this.percentage_Share_Ceded = percentage_Share_Ceded;
	}

	public BigDecimal getPercentage_Share_Retained() {
		return this.percentage_Share_Retained;
	}

	public void setPercentage_Share_Retained(BigDecimal percentage_Share_Retained) {
		this.percentage_Share_Retained = percentage_Share_Retained;
	}

	public String getReinsurance_Contract_Name() {
		return this.reinsurance_Contract_Name;
	}

	public void setReinsurance_Contract_Name(String reinsurance_Contract_Name) {
		this.reinsurance_Contract_Name = reinsurance_Contract_Name;
	}

	public String getReinsurance_Contract_Reference() {
		return this.reinsurance_Contract_Reference;
	}

	public void setReinsurance_Contract_Reference(String reinsurance_Contract_Reference) {
		this.reinsurance_Contract_Reference = reinsurance_Contract_Reference;
	}

	public String getReinsurance_Contract_Type_UUID() {
		return this.reinsurance_Contract_Type_UUID;
	}

	public void setReinsurance_Contract_Type_UUID(String reinsurance_Contract_Type_UUID) {
		this.reinsurance_Contract_Type_UUID = reinsurance_Contract_Type_UUID;
	}

	public String getReinsurance_Program_Subscription_UUID() {
		return this.reinsurance_Program_Subscription_UUID;
	}

	public void setReinsurance_Program_Subscription_UUID(String reinsurance_Program_Subscription_UUID) {
		this.reinsurance_Program_Subscription_UUID = reinsurance_Program_Subscription_UUID;
	}

	public BigDecimal getStart_Line_UUID() {
		return this.start_Line_UUID;
	}

	public void setStart_Line_UUID(BigDecimal start_Line_UUID) {
		this.start_Line_UUID = start_Line_UUID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal_Premium_Due() {
		return this.total_Premium_Due;
	}

	public void setTotal_Premium_Due(BigDecimal total_Premium_Due) {
		this.total_Premium_Due = total_Premium_Due;
	}

	public String getUnique_Market_Reference() {
		return this.unique_Market_Reference;
	}

	public void setUnique_Market_Reference(String unique_Market_Reference) {
		this.unique_Market_Reference = unique_Market_Reference;
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

	public String getValuation_Basis_UUID() {
		return this.valuation_Basis_UUID;
	}

	public void setValuation_Basis_UUID(String valuation_Basis_UUID) {
		this.valuation_Basis_UUID = valuation_Basis_UUID;
	}

	public Integer getVersion_Number() {
		return this.version_Number;
	}

	public void setVersion_Number(Integer version_Number) {
		this.version_Number = version_Number;
	}

	public List<Reinsurance_Contract_Section> getReinsuranceContractSections() {
		return this.reinsuranceContractSections;
	}

	public void setReinsuranceContractSections(List<Reinsurance_Contract_Section> reinsuranceContractSections) {
		this.reinsuranceContractSections = reinsuranceContractSections;
	}

	public Reinsurance_Contract_Section addReinsuranceContractSection(
			Reinsurance_Contract_Section reinsuranceContractSection) {
		getReinsuranceContractSections().add(reinsuranceContractSection);
		reinsuranceContractSection.setReinsuranceContract(this);

		return reinsuranceContractSection;
	}

	public Reinsurance_Contract_Section removeReinsuranceContractSection(
			Reinsurance_Contract_Section reinsuranceContractSection) {
		getReinsuranceContractSections().remove(reinsuranceContractSection);
		reinsuranceContractSection.setReinsuranceContract(null);

		return reinsuranceContractSection;
	}

	public List<Reinsurance_Referenced_DI_Contract> getReinsuranceReferencedDiContracts() {
		return this.reinsuranceReferencedDiContracts;
	}

	public void setReinsuranceReferencedDiContracts(
			List<Reinsurance_Referenced_DI_Contract> reinsuranceReferencedDiContracts) {
		this.reinsuranceReferencedDiContracts = reinsuranceReferencedDiContracts;
	}

	public Reinsurance_Referenced_DI_Contract addReinsuranceReferencedDiContract(
			Reinsurance_Referenced_DI_Contract reinsuranceReferencedDiContract) {
		getReinsuranceReferencedDiContracts().add(reinsuranceReferencedDiContract);
		reinsuranceReferencedDiContract.setReinsuranceContract(this);

		return reinsuranceReferencedDiContract;
	}

	public Reinsurance_Referenced_DI_Contract removeReinsuranceReferencedDiContract(
			Reinsurance_Referenced_DI_Contract reinsuranceReferencedDiContract) {
		getReinsuranceReferencedDiContracts().remove(reinsuranceReferencedDiContract);
		reinsuranceReferencedDiContract.setReinsuranceContract(null);

		return reinsuranceReferencedDiContract;
	}

}