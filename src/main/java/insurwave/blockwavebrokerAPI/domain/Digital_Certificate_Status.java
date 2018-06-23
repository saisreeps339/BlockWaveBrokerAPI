package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Digital_Certificate_Status database table.
 * 
 */
@Entity
@Table(name = "Digital_Certificate_Status")
@NamedQuery(name = "Digital_Certificate_Status.findAll", query = "SELECT d FROM Digital_Certificate_Status d")
public class Digital_Certificate_Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Digital_Certificate_Status_UUID", unique = true, nullable = false, length = 1)
	private String digital_Certificate_Status_UUID;

	@Column(name = "Created_by")
	private String created_by;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Identity_UUID", length = 1)
	private String identity_UUID;

	@Column(name = "Schema_Version_UUID", length = 1)
	private String schema_Version_UUID;

	@Column(name = "Status")
	private String status;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "VaultKeyForCert")
	private String vaultKeyForCert;

	@Column(name = "VaultKeyForCsr")
	private String vaultKeyForCsr;

	@Column(name = "Version_Number")
	private Integer version_Number;

	public Digital_Certificate_Status() {
	}

	public String getDigital_Certificate_Status_UUID() {
		return this.digital_Certificate_Status_UUID;
	}

	public void setDigital_Certificate_Status_UUID(String digital_Certificate_Status_UUID) {
		this.digital_Certificate_Status_UUID = digital_Certificate_Status_UUID;
	}

	public String getCreated_by() {
		return this.created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_Datetime() {
		return this.created_Datetime;
	}

	public void setCreated_Datetime(Timestamp created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	public String getIdentity_UUID() {
		return this.identity_UUID;
	}

	public void setIdentity_UUID(String identity_UUID) {
		this.identity_UUID = identity_UUID;
	}

	public String getSchema_Version_UUID() {
		return this.schema_Version_UUID;
	}

	public void setSchema_Version_UUID(String schema_Version_UUID) {
		this.schema_Version_UUID = schema_Version_UUID;
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

	public String getVaultKeyForCert() {
		return this.vaultKeyForCert;
	}

	public void setVaultKeyForCert(String vaultKeyForCert) {
		this.vaultKeyForCert = vaultKeyForCert;
	}

	public String getVaultKeyForCsr() {
		return this.vaultKeyForCsr;
	}

	public void setVaultKeyForCsr(String vaultKeyForCsr) {
		this.vaultKeyForCsr = vaultKeyForCsr;
	}

	public Integer getVersion_Number() {
		return this.version_Number;
	}

	public void setVersion_Number(Integer version_Number) {
		this.version_Number = version_Number;
	}

}