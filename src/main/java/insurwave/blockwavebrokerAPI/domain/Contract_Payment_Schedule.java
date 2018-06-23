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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the Contract_Payment_Schedule database table.
 * 
 */
@Entity
@Table(name = "Contract_Payment_Schedule")
@NamedQuery(name = "Contract_Payment_Schedule.findAll", query = "SELECT c FROM Contract_Payment_Schedule c")
public class Contract_Payment_Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contract_Payment_Schedule_UUID", unique = true, nullable = false, length = 1)
	private String contract_Payment_Schedule_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Final_Settlement_Date")
	private Timestamp final_Settlement_Date;

	@Column(name = "First_Payment_Date")
	private Timestamp first_Payment_Date;

	@Column(name = "Payee_Identity_Reference")
	private String payee_Identity_Reference;

	@Column(name = "Payee_Legal_Entity_Code")
	private String payee_Legal_Entity_Code;

	@Column(name = "Payer_Identity_Reference")
	private String payer_Identity_Reference;

	@Column(name = "Payer_Legal_Entity_Code")
	private String payer_Legal_Entity_Code;

	@Column(name = "Payment_Frequency_UUID")
	private String payment_Frequency_UUID;

	@Column(name = "Payment_Schedule_Category_Code")
	private String payment_Schedule_Category_Code;

	@Column(name = "Payment_Schedule_Type")
	private String payment_Schedule_Type;

	@Column(name = "Premium_Payable_Upfront", precision = 18, scale = 2)
	private BigDecimal premium_Payable_Upfront;

	@Column(name = "Total_Deductions", precision = 18, scale = 2)
	private BigDecimal total_Deductions;

	@Column(name = "Total_Premium_Due", precision = 18, scale = 2)
	private BigDecimal total_Premium_Due;

	@Column(name = "Total_Settlement_Amount", precision = 18, scale = 2)
	private BigDecimal total_Settlement_Amount;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name = "Contract_UUID", nullable = false)
	private Contract contract;

	// bi-directional many-to-one association to Contract_Payment_Schedule_Detail
	@OneToMany(mappedBy = "contractPaymentSchedule")
	private List<Contract_Payment_Schedule_Detail> contractPaymentScheduleDetails;

	public Contract_Payment_Schedule() {
	}

	public String getContract_Payment_Schedule_UUID() {
		return this.contract_Payment_Schedule_UUID;
	}

	public void setContract_Payment_Schedule_UUID(String contract_Payment_Schedule_UUID) {
		this.contract_Payment_Schedule_UUID = contract_Payment_Schedule_UUID;
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

	public Timestamp getFinal_Settlement_Date() {
		return this.final_Settlement_Date;
	}

	public void setFinal_Settlement_Date(Timestamp final_Settlement_Date) {
		this.final_Settlement_Date = final_Settlement_Date;
	}

	public Timestamp getFirst_Payment_Date() {
		return this.first_Payment_Date;
	}

	public void setFirst_Payment_Date(Timestamp first_Payment_Date) {
		this.first_Payment_Date = first_Payment_Date;
	}

	public String getPayee_Identity_Reference() {
		return this.payee_Identity_Reference;
	}

	public void setPayee_Identity_Reference(String payee_Identity_Reference) {
		this.payee_Identity_Reference = payee_Identity_Reference;
	}

	public String getPayee_Legal_Entity_Code() {
		return this.payee_Legal_Entity_Code;
	}

	public void setPayee_Legal_Entity_Code(String payee_Legal_Entity_Code) {
		this.payee_Legal_Entity_Code = payee_Legal_Entity_Code;
	}

	public String getPayer_Identity_Reference() {
		return this.payer_Identity_Reference;
	}

	public void setPayer_Identity_Reference(String payer_Identity_Reference) {
		this.payer_Identity_Reference = payer_Identity_Reference;
	}

	public String getPayer_Legal_Entity_Code() {
		return this.payer_Legal_Entity_Code;
	}

	public void setPayer_Legal_Entity_Code(String payer_Legal_Entity_Code) {
		this.payer_Legal_Entity_Code = payer_Legal_Entity_Code;
	}

	public String getPayment_Frequency_UUID() {
		return this.payment_Frequency_UUID;
	}

	public void setPayment_Frequency_UUID(String payment_Frequency_UUID) {
		this.payment_Frequency_UUID = payment_Frequency_UUID;
	}

	public String getPayment_Schedule_Category_Code() {
		return this.payment_Schedule_Category_Code;
	}

	public void setPayment_Schedule_Category_Code(String payment_Schedule_Category_Code) {
		this.payment_Schedule_Category_Code = payment_Schedule_Category_Code;
	}

	public String getPayment_Schedule_Type() {
		return this.payment_Schedule_Type;
	}

	public void setPayment_Schedule_Type(String payment_Schedule_Type) {
		this.payment_Schedule_Type = payment_Schedule_Type;
	}

	public BigDecimal getPremium_Payable_Upfront() {
		return this.premium_Payable_Upfront;
	}

	public void setPremium_Payable_Upfront(BigDecimal premium_Payable_Upfront) {
		this.premium_Payable_Upfront = premium_Payable_Upfront;
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

	public BigDecimal getTotal_Settlement_Amount() {
		return this.total_Settlement_Amount;
	}

	public void setTotal_Settlement_Amount(BigDecimal total_Settlement_Amount) {
		this.total_Settlement_Amount = total_Settlement_Amount;
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

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public List<Contract_Payment_Schedule_Detail> getContractPaymentScheduleDetails() {
		return this.contractPaymentScheduleDetails;
	}

	public void setContractPaymentScheduleDetails(
			List<Contract_Payment_Schedule_Detail> contractPaymentScheduleDetails) {
		this.contractPaymentScheduleDetails = contractPaymentScheduleDetails;
	}

	public Contract_Payment_Schedule_Detail addContractPaymentScheduleDetail(
			Contract_Payment_Schedule_Detail contractPaymentScheduleDetail) {
		getContractPaymentScheduleDetails().add(contractPaymentScheduleDetail);
		contractPaymentScheduleDetail.setContractPaymentSchedule(this);

		return contractPaymentScheduleDetail;
	}

	public Contract_Payment_Schedule_Detail removeContractPaymentScheduleDetail(
			Contract_Payment_Schedule_Detail contractPaymentScheduleDetail) {
		getContractPaymentScheduleDetails().remove(contractPaymentScheduleDetail);
		contractPaymentScheduleDetail.setContractPaymentSchedule(null);

		return contractPaymentScheduleDetail;
	}

}