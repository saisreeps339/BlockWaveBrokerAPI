package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
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
 * The persistent class for the Reinsurance_Referenced_DI_Contract database
 * table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Referenced_DI_Contract")
@NamedQuery(name = "Reinsurance_Referenced_DI_Contract.findAll", query = "SELECT r FROM Reinsurance_Referenced_DI_Contract r")
public class Reinsurance_Referenced_DI_Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Referenced_DI_Contract_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Referenced_DI_Contract_UUID;

	@Column(name = "Activation_Datetime")
	private Timestamp activation_Datetime;

	@Column(name = "Contract_Reference")
	private String contract_Reference;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
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

	// bi-directional many-to-one association to Reinsurance_Contract
	@ManyToOne
	@JoinColumn(name = "Reinsurance_Contract_UUID", nullable = false)
	private Reinsurance_Contract reinsuranceContract;

	public Reinsurance_Referenced_DI_Contract() {
	}

	public String getReinsurance_Referenced_DI_Contract_UUID() {
		return this.reinsurance_Referenced_DI_Contract_UUID;
	}

	public void setReinsurance_Referenced_DI_Contract_UUID(String reinsurance_Referenced_DI_Contract_UUID) {
		this.reinsurance_Referenced_DI_Contract_UUID = reinsurance_Referenced_DI_Contract_UUID;
	}

	public Timestamp getActivation_Datetime() {
		return this.activation_Datetime;
	}

	public void setActivation_Datetime(Timestamp activation_Datetime) {
		this.activation_Datetime = activation_Datetime;
	}

	public String getContract_Reference() {
		return this.contract_Reference;
	}

	public void setContract_Reference(String contract_Reference) {
		this.contract_Reference = contract_Reference;
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

	public Reinsurance_Contract getReinsuranceContract() {
		return this.reinsuranceContract;
	}

	public void setReinsuranceContract(Reinsurance_Contract reinsuranceContract) {
		this.reinsuranceContract = reinsuranceContract;
	}

}