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
 * The persistent class for the Contract_Financials_Breakdown database table.
 * 
 */
@Entity
@Table(name = "Contract_Financials_Breakdown")
@NamedQuery(name = "Contract_Financials_Breakdown.findAll", query = "SELECT c FROM Contract_Financials_Breakdown c")
public class Contract_Financials_Breakdown implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Financials_Breakdown_UUID", unique = true, nullable = false, length = 1)
	private String financials_Breakdown_UUID;

	@Column(name = "Amount", precision = 18, scale = 2)
	private BigDecimal amount;

	@Column(name = "Calculation_Basis_UUID")
	private String calculation_Basis_UUID;

	@Column(name = "Calculation_Rate", precision = 18, scale = 8)
	private BigDecimal calculation_Rate;

	@Column(name = "Calculation_Type_UUID")
	private String calculation_Type_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Financial_Breakdown_Name")
	private String financial_Breakdown_Name;

	@Column(name = "Financials_Breakdown_Category_UUID")
	private String financials_Breakdown_Category_UUID;

	@Column(name = "Financials_Breakdown_Type_UUID")
	private String financials_Breakdown_Type_UUID;

	@Column(name = "Item_Number")
	private int item_Number;

	@Column(name = "Payee_Identity_Reference", length = 1)
	private String payee_Identity_Reference;

	@Column(name = "Payee_Legal_Entity_Code", length = 1)
	private String payee_Legal_Entity_Code;

	@Column(name = "Payer_Identity_Reference", length = 1)
	private String payer_Identity_Reference;

	@Column(name = "Payer_Legal_Entity_Code", length = 1)
	private String payer_Legal_Entity_Code;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	// bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name = "Contract_UUID", nullable = false)
	private Contract contract;

	public Contract_Financials_Breakdown() {
	}

	public String getFinancials_Breakdown_UUID() {
		return this.financials_Breakdown_UUID;
	}

	public void setFinancials_Breakdown_UUID(String financials_Breakdown_UUID) {
		this.financials_Breakdown_UUID = financials_Breakdown_UUID;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCalculation_Basis_UUID() {
		return this.calculation_Basis_UUID;
	}

	public void setCalculation_Basis_UUID(String calculation_Basis_UUID) {
		this.calculation_Basis_UUID = calculation_Basis_UUID;
	}

	public BigDecimal getCalculation_Rate() {
		return this.calculation_Rate;
	}

	public void setCalculation_Rate(BigDecimal calculation_Rate) {
		this.calculation_Rate = calculation_Rate;
	}

	public String getCalculation_Type_UUID() {
		return this.calculation_Type_UUID;
	}

	public void setCalculation_Type_UUID(String calculation_Type_UUID) {
		this.calculation_Type_UUID = calculation_Type_UUID;
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

	public String getFinancial_Breakdown_Name() {
		return this.financial_Breakdown_Name;
	}

	public void setFinancial_Breakdown_Name(String financial_Breakdown_Name) {
		this.financial_Breakdown_Name = financial_Breakdown_Name;
	}

	public String getFinancials_Breakdown_Category_UUID() {
		return this.financials_Breakdown_Category_UUID;
	}

	public void setFinancials_Breakdown_Category_UUID(String financials_Breakdown_Category_UUID) {
		this.financials_Breakdown_Category_UUID = financials_Breakdown_Category_UUID;
	}

	public String getFinancials_Breakdown_Type_UUID() {
		return this.financials_Breakdown_Type_UUID;
	}

	public void setFinancials_Breakdown_Type_UUID(String financials_Breakdown_Type_UUID) {
		this.financials_Breakdown_Type_UUID = financials_Breakdown_Type_UUID;
	}

	public int getItem_Number() {
		return this.item_Number;
	}

	public void setItem_Number(int item_Number) {
		this.item_Number = item_Number;
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

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}