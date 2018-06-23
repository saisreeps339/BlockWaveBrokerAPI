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
 * The persistent class for the Reinsurance_Contract_Subsection database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Contract_Subsection")
@NamedQuery(name = "Reinsurance_Contract_Subsection.findAll", query = "SELECT r FROM Reinsurance_Contract_Subsection r")
public class Reinsurance_Contract_Subsection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Contract_Subsection_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Contract_Subsection_UUID;

	@Column(name = "Agreed_Value", precision = 18, scale = 5)
	private BigDecimal agreed_Value;

	@Column(name = "Agreed_Value_Date")
	private Timestamp agreed_Value_Date;

	@Column(name = "Agreed_Value_Percentage", precision = 18, scale = 5)
	private BigDecimal agreed_Value_Percentage;

	@Column(name = "Contract_Changes_Agreement_Basis_UUID", length = 1)
	private String contract_Changes_Agreement_Basis_UUID;

	@Column(name = "Coverage_Basis_UUID")
	private String coverage_Basis_UUID;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Deductible", precision = 18, scale = 5)
	private BigDecimal deductible;

	@Column(name = "Limit", precision = 18, scale = 5)
	private BigDecimal limit;

	@Column(name = "Line_Percentage_Basis_UUID", length = 1)
	private String line_Percentage_Basis_UUID;

	@Column(name = "Reinsurance_Contract_Subsection_Basis_UUID", length = 1)
	private String reinsurance_Contract_Subsection_Basis_UUID;

	@Column(name = "Reinsurance_Contract_Subsection_Name")
	private String reinsurance_Contract_Subsection_Name;

	@Column(name = "Reinsurance_Contract_Subsection_Reference")
	private String reinsurance_Contract_Subsection_Reference;

	@Column(name = "Status")
	private String status;

	@Column(name = "Subsection_Premium_Amount", precision = 18, scale = 5)
	private BigDecimal subsection_Premium_Amount;

	@Column(name = "Sum_Insured", precision = 18, scale = 5)
	private BigDecimal sum_Insured;

	@Column(name = "Sum_Insured_Percentage", precision = 18, scale = 5)
	private BigDecimal sum_Insured_Percentage;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Reinsurance_Contract_Section
	@ManyToOne
	@JoinColumn(name = "Reinsurance_Contract_Section_UUID", nullable = false)
	private Reinsurance_Contract_Section reinsuranceContractSection;

	// bi-directional many-to-one association to
	// Reinsurance_Contract_Subsection_Reinsurer
	@OneToMany(mappedBy = "reinsuranceContractSubsection")
	private List<Reinsurance_Contract_Subsection_Reinsurer> reinsuranceContractSubsectionReinsurers;

	public Reinsurance_Contract_Subsection() {
	}

	public String getReinsurance_Contract_Subsection_UUID() {
		return this.reinsurance_Contract_Subsection_UUID;
	}

	public void setReinsurance_Contract_Subsection_UUID(String reinsurance_Contract_Subsection_UUID) {
		this.reinsurance_Contract_Subsection_UUID = reinsurance_Contract_Subsection_UUID;
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

	public BigDecimal getLimit() {
		return this.limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

	public String getLine_Percentage_Basis_UUID() {
		return this.line_Percentage_Basis_UUID;
	}

	public void setLine_Percentage_Basis_UUID(String line_Percentage_Basis_UUID) {
		this.line_Percentage_Basis_UUID = line_Percentage_Basis_UUID;
	}

	public String getReinsurance_Contract_Subsection_Basis_UUID() {
		return this.reinsurance_Contract_Subsection_Basis_UUID;
	}

	public void setReinsurance_Contract_Subsection_Basis_UUID(String reinsurance_Contract_Subsection_Basis_UUID) {
		this.reinsurance_Contract_Subsection_Basis_UUID = reinsurance_Contract_Subsection_Basis_UUID;
	}

	public String getReinsurance_Contract_Subsection_Name() {
		return this.reinsurance_Contract_Subsection_Name;
	}

	public void setReinsurance_Contract_Subsection_Name(String reinsurance_Contract_Subsection_Name) {
		this.reinsurance_Contract_Subsection_Name = reinsurance_Contract_Subsection_Name;
	}

	public String getReinsurance_Contract_Subsection_Reference() {
		return this.reinsurance_Contract_Subsection_Reference;
	}

	public void setReinsurance_Contract_Subsection_Reference(String reinsurance_Contract_Subsection_Reference) {
		this.reinsurance_Contract_Subsection_Reference = reinsurance_Contract_Subsection_Reference;
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

	public Reinsurance_Contract_Section getReinsuranceContractSection() {
		return this.reinsuranceContractSection;
	}

	public void setReinsuranceContractSection(Reinsurance_Contract_Section reinsuranceContractSection) {
		this.reinsuranceContractSection = reinsuranceContractSection;
	}

	public List<Reinsurance_Contract_Subsection_Reinsurer> getReinsuranceContractSubsectionReinsurers() {
		return this.reinsuranceContractSubsectionReinsurers;
	}

	public void setReinsuranceContractSubsectionReinsurers(
			List<Reinsurance_Contract_Subsection_Reinsurer> reinsuranceContractSubsectionReinsurers) {
		this.reinsuranceContractSubsectionReinsurers = reinsuranceContractSubsectionReinsurers;
	}

	public Reinsurance_Contract_Subsection_Reinsurer addReinsuranceContractSubsectionReinsurer(
			Reinsurance_Contract_Subsection_Reinsurer reinsuranceContractSubsectionReinsurer) {
		getReinsuranceContractSubsectionReinsurers().add(reinsuranceContractSubsectionReinsurer);
		reinsuranceContractSubsectionReinsurer.setReinsuranceContractSubsection(this);

		return reinsuranceContractSubsectionReinsurer;
	}

	public Reinsurance_Contract_Subsection_Reinsurer removeReinsuranceContractSubsectionReinsurer(
			Reinsurance_Contract_Subsection_Reinsurer reinsuranceContractSubsectionReinsurer) {
		getReinsuranceContractSubsectionReinsurers().remove(reinsuranceContractSubsectionReinsurer);
		reinsuranceContractSubsectionReinsurer.setReinsuranceContractSubsection(null);

		return reinsuranceContractSubsectionReinsurer;
	}

}