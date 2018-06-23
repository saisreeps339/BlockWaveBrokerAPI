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
 * The persistent class for the Contract_Section database table.
 * 
 */
@Entity
@Table(name = "Contract_Section")
@NamedQuery(name = "Contract_Section.findAll", query = "SELECT c FROM Contract_Section c")
public class Contract_Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_Section_UUID", columnDefinition = "uniqueidentifier", nullable = false)
	private String contract_Section_UUID;

	@Column(name = "Contract_Section_Name")
	private String contract_Section_Name;

	@Column(name = "Contract_Section_Reference")
	private String contract_Section_Reference;

	@Column(name = "Contract_Subsection_Basis_Code")
	private String contract_Subsection_Basis_Code;

	@Column(name = "Contract_UUID", length = 1)
	private String contract_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Jurisdiction_UUID", length = 255)
	private String jurisdiction_UUID;

	@Column(name = "Legal_Entity_Code", length = 1)
	private String legal_Entity_Code;

	@Column(name = "Loss_Payee_Legal_Entity_Code", length = 255)
	private String loss_Payee_Legal_Entity_Code;

	@Column(name = "Section_Premium", precision = 18, scale = 2)
	private BigDecimal section_Premium;

	@Column(name = "Settlement_Method_UUID", length = 255)
	private String settlement_Method_UUID;

	@Column(name = "Status", length = 255)
	private String status;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Contract_Section_Asset
	@OneToMany(mappedBy = "contractSection")
	private List<Contract_Section_Asset> contractSectionAssets;

	public Contract_Section() {
	}

	public String getContract_Section_UUID() {
		return this.contract_Section_UUID;
	}

	public void setContract_Section_UUID(String contract_Section_UUID) {
		this.contract_Section_UUID = contract_Section_UUID;
	}

	public String getContract_Section_Name() {
		return this.contract_Section_Name;
	}

	public void setContract_Section_Name(String contract_Section_Name) {
		this.contract_Section_Name = contract_Section_Name;
	}

	public String getContract_Section_Reference() {
		return this.contract_Section_Reference;
	}

	public void setContract_Section_Reference(String contract_Section_Reference) {
		this.contract_Section_Reference = contract_Section_Reference;
	}

	public String getContract_Subsection_Basis_Code() {
		return this.contract_Subsection_Basis_Code;
	}

	public void setContract_Subsection_Basis_Code(String contract_Subsection_Basis_Code) {
		this.contract_Subsection_Basis_Code = contract_Subsection_Basis_Code;
	}

	public String getContract_UUID() {
		return this.contract_UUID;
	}

	public void setContract_UUID(String contract_UUID) {
		this.contract_UUID = contract_UUID;
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

	public List<Contract_Section_Asset> getContractSectionAssets() {
		return this.contractSectionAssets;
	}

	public void setContractSectionAssets(List<Contract_Section_Asset> contractSectionAssets) {
		this.contractSectionAssets = contractSectionAssets;
	}

	public Contract_Section_Asset addContractSectionAsset(Contract_Section_Asset contractSectionAsset) {
		getContractSectionAssets().add(contractSectionAsset);
		contractSectionAsset.setContractSection(this);

		return contractSectionAsset;
	}

	public Contract_Section_Asset removeContractSectionAsset(Contract_Section_Asset contractSectionAsset) {
		getContractSectionAssets().remove(contractSectionAsset);
		contractSectionAsset.setContractSection(null);

		return contractSectionAsset;
	}

}