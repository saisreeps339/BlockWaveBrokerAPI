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
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Contract_Subsection database table.
 * 
 */
@Entity
@Table(name = "Contract_Subsection")
@NamedQuery(name = "Contract_Subsection.findAll", query = "SELECT c FROM Contract_Subsection c")
@NamedStoredProcedureQuery(name = "insertUpdateSubsectionPremiumAmount", procedureName = "usp_InsertUpdSubsectionPremiumAmount", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = List.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, type = Integer.class) })

public class Contract_Subsection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_Subsection_UUID", unique = true, nullable = false, length = 1)
	private String contract_Subsection_UUID;

	@Column(name = "Agreed_Value", precision = 18, scale = 2)
	private BigDecimal agreed_Value;

	@Column(name = "Agreed_Value_Date")
	private Timestamp agreed_Value_Date;

	@Column(name = "Agreed_Value_Percentage", precision = 18, scale = 8)
	private BigDecimal agreed_Value_Percentage;

	@Column(name = "Contract_Changes_Agreement_Basis_UUID")
	private String contract_Changes_Agreement_Basis_UUID;

	@Column(name = "Contract_Section_UUID", length = 1)
	private String contract_Section_UUID;

	@Column(name = "Contract_Subsection_Basis_UUID")
	private String contract_Subsection_Basis_UUID;

	@Column(name = "Contract_Subsection_Name")
	private String contract_Subsection_Name;

	@Column(name = "Contract_Subsection_Reference")
	private String contract_Subsection_Reference;

	@Column(name = "Cover_Type_Reference")
	private String cover_Type_Reference;

	@Column(name = "Coverage_Basis_UUID")
	private String coverage_Basis_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Deductible", precision = 18, scale = 2)
	private BigDecimal deductible;

	@Column(name = "Line_Percentage_Basis_UUID")
	private String line_Percentage_Basis_UUID;

	@Column(name = "Maximum_Insurable_Value", precision = 18, scale = 2)
	private BigDecimal maximum_Insurable_Value;

	@Column(name = "Order_Percentage", precision = 18, scale = 8)
	private BigDecimal order_Percentage;

	@Column(name = "Retained_Percentage", precision = 18, scale = 8)
	private BigDecimal retained_Percentage;

	@Column(name = "Status", length = 255)
	private String status;

	@Column(name = "Subsection_Premium_Amount", precision = 18, scale = 2)
	private BigDecimal subsection_Premium_Amount;

	@Column(name = "Sum_Insured", precision = 18, scale = 2)
	private BigDecimal sum_Insured;

	@Column(name = "Sum_Insured_Percentage", precision = 18, scale = 8)
	private BigDecimal sum_Insured_Percentage;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Contract_Subsection_Condition
	@OneToMany(mappedBy = "contractSubsection")
	private List<Contract_Subsection_Condition> contractSubsectionConditions;

	public Contract_Subsection() {
	}

	public String getContract_Subsection_UUID() {
		return this.contract_Subsection_UUID;
	}

	public void setContract_Subsection_UUID(String contract_Subsection_UUID) {
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	public BigDecimal getAgreed_Value() {
		return this.agreed_Value;
	}

	public void setAgreed_Value(BigDecimal agreed_Value) {
		this.agreed_Value = agreed_Value;
	}

	public Timestamp getAgreed_Value_Date() {
		return this.agreed_Value_Date;
	}

	public void setAgreed_Value_Date(Timestamp agreed_Value_Date) {
		this.agreed_Value_Date = agreed_Value_Date;
	}

	public BigDecimal getAgreed_Value_Percentage() {
		return this.agreed_Value_Percentage;
	}

	public void setAgreed_Value_Percentage(BigDecimal agreed_Value_Percentage) {
		this.agreed_Value_Percentage = agreed_Value_Percentage;
	}

	public String getContract_Changes_Agreement_Basis_UUID() {
		return this.contract_Changes_Agreement_Basis_UUID;
	}

	public void setContract_Changes_Agreement_Basis_UUID(String contract_Changes_Agreement_Basis_UUID) {
		this.contract_Changes_Agreement_Basis_UUID = contract_Changes_Agreement_Basis_UUID;
	}

	public String getContract_Section_UUID() {
		return this.contract_Section_UUID;
	}

	public void setContract_Section_UUID(String contract_Section_UUID) {
		this.contract_Section_UUID = contract_Section_UUID;
	}

	public String getContract_Subsection_Basis_UUID() {
		return this.contract_Subsection_Basis_UUID;
	}

	public void setContract_Subsection_Basis_UUID(String contract_Subsection_Basis_UUID) {
		this.contract_Subsection_Basis_UUID = contract_Subsection_Basis_UUID;
	}

	public String getContract_Subsection_Name() {
		return this.contract_Subsection_Name;
	}

	public void setContract_Subsection_Name(String contract_Subsection_Name) {
		this.contract_Subsection_Name = contract_Subsection_Name;
	}

	public String getContract_Subsection_Reference() {
		return this.contract_Subsection_Reference;
	}

	public void setContract_Subsection_Reference(String contract_Subsection_Reference) {
		this.contract_Subsection_Reference = contract_Subsection_Reference;
	}

	public String getCover_Type_Reference() {
		return this.cover_Type_Reference;
	}

	public void setCover_Type_Reference(String cover_Type_Reference) {
		this.cover_Type_Reference = cover_Type_Reference;
	}

	public String getCoverage_Basis_UUID() {
		return this.coverage_Basis_UUID;
	}

	public void setCoverage_Basis_UUID(String coverage_Basis_UUID) {
		this.coverage_Basis_UUID = coverage_Basis_UUID;
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

	public BigDecimal getDeductible() {
		return this.deductible;
	}

	public void setDeductible(BigDecimal deductible) {
		this.deductible = deductible;
	}

	public String getLine_Percentage_Basis_UUID() {
		return this.line_Percentage_Basis_UUID;
	}

	public void setLine_Percentage_Basis_UUID(String line_Percentage_Basis_UUID) {
		this.line_Percentage_Basis_UUID = line_Percentage_Basis_UUID;
	}

	public BigDecimal getMaximum_Insurable_Value() {
		return this.maximum_Insurable_Value;
	}

	public void setMaximum_Insurable_Value(BigDecimal maximum_Insurable_Value) {
		this.maximum_Insurable_Value = maximum_Insurable_Value;
	}

	public BigDecimal getOrder_Percentage() {
		return this.order_Percentage;
	}

	public void setOrder_Percentage(BigDecimal order_Percentage) {
		this.order_Percentage = order_Percentage;
	}

	public BigDecimal getRetained_Percentage() {
		return this.retained_Percentage;
	}

	public void setRetained_Percentage(BigDecimal retained_Percentage) {
		this.retained_Percentage = retained_Percentage;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getSubsection_Premium_Amount() {
		return this.subsection_Premium_Amount;
	}

	public void setSubsection_Premium_Amount(BigDecimal subsection_Premium_Amount) {
		this.subsection_Premium_Amount = subsection_Premium_Amount;
	}

	public BigDecimal getSum_Insured() {
		return this.sum_Insured;
	}

	public void setSum_Insured(BigDecimal sum_Insured) {
		this.sum_Insured = sum_Insured;
	}

	public BigDecimal getSum_Insured_Percentage() {
		return this.sum_Insured_Percentage;
	}

	public void setSum_Insured_Percentage(BigDecimal sum_Insured_Percentage) {
		this.sum_Insured_Percentage = sum_Insured_Percentage;
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

	public List<Contract_Subsection_Condition> getContractSubsectionConditions() {
		return this.contractSubsectionConditions;
	}

	public void setContractSubsectionConditions(List<Contract_Subsection_Condition> contractSubsectionConditions) {
		this.contractSubsectionConditions = contractSubsectionConditions;
	}

	public Contract_Subsection_Condition addContractSubsectionCondition(
			Contract_Subsection_Condition contractSubsectionCondition) {
		getContractSubsectionConditions().add(contractSubsectionCondition);
		contractSubsectionCondition.setContractSubsection(this);

		return contractSubsectionCondition;
	}

	public Contract_Subsection_Condition removeContractSubsectionCondition(
			Contract_Subsection_Condition contractSubsectionCondition) {
		getContractSubsectionConditions().remove(contractSubsectionCondition);
		contractSubsectionCondition.setContractSubsection(null);

		return contractSubsectionCondition;
	}

}