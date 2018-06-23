package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Contract_Section_Asset database table.
 * 
 */
@Entity
@Table(name = "Contract_Section_Asset")
@NamedQueries({ @NamedQuery(name = "Contract_Section_Asset.findAll", query = "SELECT c FROM Contract_Section_Asset c"),
		@NamedQuery(name = "Contract_Section_Asset.deleteByContractSection_UUID", query = "DELETE FROM Contract_Section_Asset c where c.contractSection = ?1"), })
public class Contract_Section_Asset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_Section_Asset_UUID", unique = true, nullable = false, length = 1)
	private String contract_Section_Asset_UUID;

	@Column(name = "Activation_Datetime")
	private Timestamp activation_Datetime;

	@Column(name = "Asset_UUID", length = 1)
	private String asset_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Deactivation_Datetime")
	private Timestamp deactivation_Datetime;

	@Column(name = "Status")
	private String status;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Contract_Section
	@ManyToOne
	@JoinColumn(name = "Contract_Section_UUID", nullable = false)
	private Contract_Section contractSection;

	public Contract_Section_Asset() {
	}

	public String getContract_Section_Asset_UUID() {
		return this.contract_Section_Asset_UUID;
	}

	public void setContract_Section_Asset_UUID(String contract_Section_Asset_UUID) {
		this.contract_Section_Asset_UUID = contract_Section_Asset_UUID;
	}

	public Timestamp getActivation_Datetime() {
		return this.activation_Datetime;
	}

	public void setActivation_Datetime(Timestamp activation_Datetime) {
		this.activation_Datetime = activation_Datetime;
	}

	public String getAsset_UUID() {
		return this.asset_UUID;
	}

	public void setAsset_UUID(String asset_UUID) {
		this.asset_UUID = asset_UUID;
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

	public Timestamp getDeactivation_Datetime() {
		return this.deactivation_Datetime;
	}

	public void setDeactivation_Datetime(Timestamp deactivation_Datetime) {
		this.deactivation_Datetime = deactivation_Datetime;
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

	public Contract_Section getContractSection() {
		return this.contractSection;
	}

	public void setContractSection(Contract_Section contractSection) {
		this.contractSection = contractSection;
	}

}