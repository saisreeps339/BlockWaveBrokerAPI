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
 * The persistent class for the Reinsurance_Contract_Section database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Contract_Section")
@NamedQuery(name = "Reinsurance_Contract_Section.findAll", query = "SELECT r FROM Reinsurance_Contract_Section r")
public class Reinsurance_Contract_Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Contract_Section_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Contract_Section_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Jurisdiction_UUID", nullable = false)
	private String jurisdiction_UUID;

	@Column(name = "Legal_Entity_Code", length = 1)
	private String legal_Entity_Code;

	@Column(name = "Loss_Payee_Legal_Entity_Code")
	private String loss_Payee_Legal_Entity_Code;

	@Column(name = "Reinsurance_Contract_Section_Name")
	private String reinsurance_Contract_Section_Name;

	@Column(name = "Reinsurance_Contract_Section_Reference")
	private String reinsurance_Contract_Section_Reference;

	@Column(name = "Section_Premium", precision = 18, scale = 5)
	private BigDecimal section_Premium;

	@Column(name = "Settlement_Method_UUID", length = 1)
	private String settlement_Method_UUID;

	@Column(name = "Status", length = 255)
	private String status;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Reinsurance_Contract
	@ManyToOne
	@JoinColumn(name = "Reinsurance_Contract_UUID")
	private Reinsurance_Contract reinsuranceContract;

	// bi-directional many-to-one association to Reinsurance_Contract_Subsection
	@OneToMany(mappedBy = "reinsuranceContractSection")
	private List<Reinsurance_Contract_Subsection> reinsuranceContractSubsections;

	public Reinsurance_Contract_Section() {
	}

	public String getReinsurance_Contract_Section_UUID() {
		return this.reinsurance_Contract_Section_UUID;
	}

	public void setReinsurance_Contract_Section_UUID(String reinsurance_Contract_Section_UUID) {
		this.reinsurance_Contract_Section_UUID = reinsurance_Contract_Section_UUID;
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

	public String getJurisdiction_UUID() {
		return this.jurisdiction_UUID;
	}

	public void setJurisdiction_UUID(String jurisdiction_UUID) {
		this.jurisdiction_UUID = jurisdiction_UUID;
	}

	public String getLegal_Entity_Code() {
		return this.legal_Entity_Code;
	}

	public void setLegal_Entity_Code(String legal_Entity_Code) {
		this.legal_Entity_Code = legal_Entity_Code;
	}

	public String getLoss_Payee_Legal_Entity_Code() {
		return this.loss_Payee_Legal_Entity_Code;
	}

	public void setLoss_Payee_Legal_Entity_Code(String loss_Payee_Legal_Entity_Code) {
		this.loss_Payee_Legal_Entity_Code = loss_Payee_Legal_Entity_Code;
	}

	public String getReinsurance_Contract_Section_Name() {
		return this.reinsurance_Contract_Section_Name;
	}

	public void setReinsurance_Contract_Section_Name(String reinsurance_Contract_Section_Name) {
		this.reinsurance_Contract_Section_Name = reinsurance_Contract_Section_Name;
	}

	public String getReinsurance_Contract_Section_Reference() {
		return this.reinsurance_Contract_Section_Reference;
	}

	public void setReinsurance_Contract_Section_Reference(String reinsurance_Contract_Section_Reference) {
		this.reinsurance_Contract_Section_Reference = reinsurance_Contract_Section_Reference;
	}

	public BigDecimal getSection_Premium() {
		return this.section_Premium;
	}

	public void setSection_Premium(BigDecimal section_Premium) {
		this.section_Premium = section_Premium;
	}

	public String getSettlement_Method_UUID() {
		return this.settlement_Method_UUID;
	}

	public void setSettlement_Method_UUID(String settlement_Method_UUID) {
		this.settlement_Method_UUID = settlement_Method_UUID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Reinsurance_Contract getReinsuranceContract() {
		return this.reinsuranceContract;
	}

	public void setReinsuranceContract(Reinsurance_Contract reinsuranceContract) {
		this.reinsuranceContract = reinsuranceContract;
	}

	public List<Reinsurance_Contract_Subsection> getReinsuranceContractSubsections() {
		return this.reinsuranceContractSubsections;
	}

	public void setReinsuranceContractSubsections(
			List<Reinsurance_Contract_Subsection> reinsuranceContractSubsections) {
		this.reinsuranceContractSubsections = reinsuranceContractSubsections;
	}

	public Reinsurance_Contract_Subsection addReinsuranceContractSubsection(
			Reinsurance_Contract_Subsection reinsuranceContractSubsection) {
		getReinsuranceContractSubsections().add(reinsuranceContractSubsection);
		reinsuranceContractSubsection.setReinsuranceContractSection(this);

		return reinsuranceContractSubsection;
	}

	public Reinsurance_Contract_Subsection removeReinsuranceContractSubsection(
			Reinsurance_Contract_Subsection reinsuranceContractSubsection) {
		getReinsuranceContractSubsections().remove(reinsuranceContractSubsection);
		reinsuranceContractSubsection.setReinsuranceContractSection(null);

		return reinsuranceContractSubsection;
	}

}