package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
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
 * The persistent class for the Identity_Type database table.
 * 
 */
@Entity
@Table(name = "Identity_Type")
@NamedQuery(name = "Identity_Type.findAll", query = "SELECT i FROM Identity_Type i")
public class Identity_Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Identity_Type_UUID", unique = true, nullable = false, length = 1)
	private String identity_Type_UUID;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Effective_From_Datetime", nullable = false)
	private Timestamp effective_From_Datetime;

	@Column(name = "Effective_To_Datetime", nullable = false)
	private Timestamp effective_To_Datetime;

	@Column(name = "Identity_Type_Code", nullable = false)
	private String identity_Type_Code;

	@Column(name = "Identity_Type_Desc", nullable = false)
	private String identity_Type_Desc;

	@Column(name = "Updated_By", nullable = false)
	private String updated_By;

	@Column(name = "Updated_Datetime", nullable = false)
	private Timestamp updated_Datetime;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID", nullable = false)
	private Schema_Version schemaVersion;

	// bi-directional many-to-one association to Role
	@OneToMany(mappedBy = "identityType")
	private List<Role> roles;

	public Identity_Type() {
	}

	public String getIdentity_Type_UUID() {
		return this.identity_Type_UUID;
	}

	public void setIdentity_Type_UUID(String identity_Type_UUID) {
		this.identity_Type_UUID = identity_Type_UUID;
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

	public Timestamp getEffective_From_Datetime() {
		return this.effective_From_Datetime;
	}

	public void setEffective_From_Datetime(Timestamp effective_From_Datetime) {
		this.effective_From_Datetime = effective_From_Datetime;
	}

	public Timestamp getEffective_To_Datetime() {
		return this.effective_To_Datetime;
	}

	public void setEffective_To_Datetime(Timestamp effective_To_Datetime) {
		this.effective_To_Datetime = effective_To_Datetime;
	}

	public String getIdentity_Type_Code() {
		return this.identity_Type_Code;
	}

	public void setIdentity_Type_Code(String identity_Type_Code) {
		this.identity_Type_Code = identity_Type_Code;
	}

	public String getIdentity_Type_Desc() {
		return this.identity_Type_Desc;
	}

	public void setIdentity_Type_Desc(String identity_Type_Desc) {
		this.identity_Type_Desc = identity_Type_Desc;
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

	public Schema_Version getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(Schema_Version schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.setIdentityType(this);

		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.setIdentityType(null);

		return role;
	}

}