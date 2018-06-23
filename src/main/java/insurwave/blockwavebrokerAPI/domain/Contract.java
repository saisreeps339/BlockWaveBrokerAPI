package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Contract database table.
 * 
 */
@Entity
@Table(name = "Contract")
@NamedQuery(name = "Contract.findAll", query = "SELECT c FROM Contract c")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_UUID", unique = true, nullable = false, length = 1)
	private String contract_UUID;

	@Column(name = "Accounting_Basis_UUID", nullable = false)
	private String accounting_Basis_UUID;

	@Column(name = "Advisor_Identity_Reference")
	private String advisor_Identity_Reference;

	@Column(name = "Advisor_Legal_Entity_Code", length = 1)
	private String advisor_Legal_Entity_Code;

	@Column(name = "Busines_Channel_UUID", nullable = false)
	private String busines_Channel_UUID;

	@Column(name = "Buyer_Brokerage_Amount", precision = 18, scale = 2)
	private BigDecimal buyer_Brokerage_Amount;

	@Column(name = "Buyer_Brokerage_Basis_UUID")
	private String buyer_Brokerage_Basis_UUID;

	@Column(name = "Buyer_Brokerage_Percentage", precision = 18, scale = 8)
	private BigDecimal buyer_Brokerage_Percentage;

	@Column(name = "Buyer_Identity_Reference")
	private String buyer_Identity_Reference;

	@Column(name = "Buyer_Legal_Entity_Reference")
	private String buyer_Legal_Entity_Reference;

	@Column(name = "Cancellation_Notice_Periods")
	private Integer cancellation_Notice_Periods;

	@Column(name = "Contract_Currency_UUID", nullable = false)
	private String contract_Currency_UUID;

	@Column(name = "Contract_Name", nullable = false)
	private String contract_Name;

	@Column(name = "Contract_Period_Scope_UUID", nullable = false)
	private String contract_Period_Scope_UUID;

	@Column(name = "Contract_Reference", nullable = false)
	private String contract_Reference;

	@Column(name = "Contract_Term")
	private Integer contract_Term;

	@Column(name = "Contract_Type_UUID", nullable = false)
	private String contract_Type_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Expiry_Date")
	private Timestamp expiry_Date;

	@Column(name = "Inception_Date")
	private Timestamp inception_Date;

	@Column(name = "Notice_Period_Type_UUID")
	private String notice_Period_Type_UUID;

	@Column(name = "Program_Subscription_UUID", length = 1)
	private String program_Subscription_UUID;

	@Column(name = "Section_Breakdown_UUID", nullable = false)
	private String section_Breakdown_UUID;

	@Column(name = "Status", nullable = false, length = 255)
	private String status;

	@Column(name = "Total_Deductions", precision = 18, scale = 2)
	private BigDecimal total_Deductions;

	@Column(name = "Total_Premium_Due", precision = 18, scale = 2)
	private BigDecimal total_Premium_Due;

	@Column(name = "Total_Settlement_Amount_Due", precision = 18, scale = 2)
	private BigDecimal total_Settlement_Amount_Due;

	@Column(name = "Unique_Market_Reference", nullable = false)
	private String unique_Market_Reference;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Valuation_Basis_UUID", nullable = false)
	private String valuation_Basis_UUID;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Contract_Financials_Breakdown
	@OneToMany(mappedBy = "contract")
	private List<Contract_Financials_Breakdown> contractFinancialsBreakdowns;

	// bi-directional many-to-one association to Contract_Payment_Schedule
	@OneToMany(mappedBy = "contract")
	private List<Contract_Payment_Schedule> contractPaymentSchedules;

	public Contract() {
	}

	public String getContract_UUID() {
		return this.contract_UUID;
	}

	public void setContract_UUID(String contract_UUID) {
		this.contract_UUID = contract_UUID;
	}

	public String getAccounting_Basis_UUID() {
		return this.accounting_Basis_UUID;
	}

	public void setAccounting_Basis_UUID(String accounting_Basis_UUID) {
		this.accounting_Basis_UUID = accounting_Basis_UUID;
	}

	public String getAdvisor_Identity_Reference() {
		return this.advisor_Identity_Reference;
	}

	public void setAdvisor_Identity_Reference(String advisor_Identity_Reference) {
		this.advisor_Identity_Reference = advisor_Identity_Reference;
	}

	public String getAdvisor_Legal_Entity_Code() {
		return this.advisor_Legal_Entity_Code;
	}

	public void setAdvisor_Legal_Entity_Code(String advisor_Legal_Entity_Code) {
		this.advisor_Legal_Entity_Code = advisor_Legal_Entity_Code;
	}

	public String getBusines_Channel_UUID() {
		return this.busines_Channel_UUID;
	}

	public void setBusines_Channel_UUID(String busines_Channel_UUID) {
		this.busines_Channel_UUID = busines_Channel_UUID;
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

	public String getBuyer_Identity_Reference() {
		return this.buyer_Identity_Reference;
	}

	public void setBuyer_Identity_Reference(String buyer_Identity_Reference) {
		this.buyer_Identity_Reference = buyer_Identity_Reference;
	}

	public String getBuyer_Legal_Entity_Reference() {
		return this.buyer_Legal_Entity_Reference;
	}

	public void setBuyer_Legal_Entity_Reference(String buyer_Legal_Entity_Reference) {
		this.buyer_Legal_Entity_Reference = buyer_Legal_Entity_Reference;
	}

	public Integer getCancellation_Notice_Periods() {
		return this.cancellation_Notice_Periods;
	}

	public void setCancellation_Notice_Periods(Integer cancellation_Notice_Periods) {
		this.cancellation_Notice_Periods = cancellation_Notice_Periods;
	}

	public String getContract_Currency_UUID() {
		return this.contract_Currency_UUID;
	}

	public void setContract_Currency_UUID(String contract_Currency_UUID) {
		this.contract_Currency_UUID = contract_Currency_UUID;
	}

	public String getContract_Name() {
		return this.contract_Name;
	}

	public void setContract_Name(String contract_Name) {
		this.contract_Name = contract_Name;
	}

	public String getContract_Period_Scope_UUID() {
		return this.contract_Period_Scope_UUID;
	}

	public void setContract_Period_Scope_UUID(String contract_Period_Scope_UUID) {
		this.contract_Period_Scope_UUID = contract_Period_Scope_UUID;
	}

	public String getContract_Reference() {
		return this.contract_Reference;
	}

	public void setContract_Reference(String contract_Reference) {
		this.contract_Reference = contract_Reference;
	}

	public Integer getContract_Term() {
		return this.contract_Term;
	}

	public void setContract_Term(Integer contract_Term) {
		this.contract_Term = contract_Term;
	}

	public String getContract_Type_UUID() {
		return this.contract_Type_UUID;
	}

	public void setContract_Type_UUID(String contract_Type_UUID) {
		this.contract_Type_UUID = contract_Type_UUID;
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

	public Timestamp getExpiry_Date() {
		return this.expiry_Date;
	}

	public void setExpiry_Date(Timestamp expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public Timestamp getInception_Date() {
		return this.inception_Date;
	}

	public void setInception_Date(Timestamp inception_Date) {
		this.inception_Date = inception_Date;
	}

	public String getNotice_Period_Type_UUID() {
		return this.notice_Period_Type_UUID;
	}

	public void setNotice_Period_Type_UUID(String notice_Period_Type_UUID) {
		this.notice_Period_Type_UUID = notice_Period_Type_UUID;
	}

	public String getProgram_Subscription_UUID() {
		return this.program_Subscription_UUID;
	}

	public void setProgram_Subscription_UUID(String program_Subscription_UUID) {
		this.program_Subscription_UUID = program_Subscription_UUID;
	}

	public String getSection_Breakdown_UUID() {
		return this.section_Breakdown_UUID;
	}

	public void setSection_Breakdown_UUID(String section_Breakdown_UUID) {
		this.section_Breakdown_UUID = section_Breakdown_UUID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal_Deductions() {
		return this.total_Deductions;
	}

	public void setTotal_Deductions(BigDecimal total_Deductions) {
		this.total_Deductions = total_Deductions;
	}

	public BigDecimal getTotal_Premium_Due() {
		return this.total_Premium_Due;
	}

	public void setTotal_Premium_Due(BigDecimal total_Premium_Due) {
		this.total_Premium_Due = total_Premium_Due;
	}

	public BigDecimal getTotal_Settlement_Amount_Due() {
		return this.total_Settlement_Amount_Due;
	}

	public void setTotal_Settlement_Amount_Due(BigDecimal total_Settlement_Amount_Due) {
		this.total_Settlement_Amount_Due = total_Settlement_Amount_Due;
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

	public List<Contract_Financials_Breakdown> getContractFinancialsBreakdowns() {
		return this.contractFinancialsBreakdowns;
	}

	public void setContractFinancialsBreakdowns(List<Contract_Financials_Breakdown> contractFinancialsBreakdowns) {
		this.contractFinancialsBreakdowns = contractFinancialsBreakdowns;
	}

	public Contract_Financials_Breakdown addContractFinancialsBreakdown(
			Contract_Financials_Breakdown contractFinancialsBreakdown) {
		getContractFinancialsBreakdowns().add(contractFinancialsBreakdown);
		contractFinancialsBreakdown.setContract(this);

		return contractFinancialsBreakdown;
	}

	public Contract_Financials_Breakdown removeContractFinancialsBreakdown(
			Contract_Financials_Breakdown contractFinancialsBreakdown) {
		getContractFinancialsBreakdowns().remove(contractFinancialsBreakdown);
		contractFinancialsBreakdown.setContract(null);

		return contractFinancialsBreakdown;
	}

	public List<Contract_Payment_Schedule> getContractPaymentSchedules() {
		return this.contractPaymentSchedules;
	}

	public void setContractPaymentSchedules(List<Contract_Payment_Schedule> contractPaymentSchedules) {
		this.contractPaymentSchedules = contractPaymentSchedules;
	}

	public Contract_Payment_Schedule addContractPaymentSchedule(Contract_Payment_Schedule contractPaymentSchedule) {
		getContractPaymentSchedules().add(contractPaymentSchedule);
		contractPaymentSchedule.setContract(this);

		return contractPaymentSchedule;
	}

	public Contract_Payment_Schedule removeContractPaymentSchedule(Contract_Payment_Schedule contractPaymentSchedule) {
		getContractPaymentSchedules().remove(contractPaymentSchedule);
		contractPaymentSchedule.setContract(null);

		return contractPaymentSchedule;
	}

}