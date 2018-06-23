package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Role_Permission database table.
 * 
 */
@Entity
@Table(name = "Role_Permission")
@NamedQuery(name = "Role_Permission.findAll", query = "SELECT r FROM Role_Permission r")
public class Role_Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Role_PermissionPK id;

	@Column(name = "Assignment_Datetime", nullable = false)
	private Timestamp assignment_Datetime;

	@Column(name = "Created_by")
	private String created_by;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Deactivation_Datetime", nullable = false)
	private Timestamp deactivation_Datetime;

	@Column(name = "Effective_From_Datetime", nullable = false)
	private Timestamp effective_From_Datetime;

	@Column(name = "Effective_To_Datetime", nullable = false)
	private Timestamp effective_To_Datetime;

	@Column(name = "Is_Active", nullable = false)
	private boolean is_Active;

	@Column(name = "Is_Version_Active")
	private boolean is_Version_Active;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumn(name = "Permission_UUID", nullable = false, insertable = false, updatable = false)
	private Permission permission;

	// bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name = "Role_UUID", nullable = false, insertable = false, updatable = false)
	private Role role;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID")
	private Schema_Version schemaVersion;

	public Role_Permission() {
	}

	public Role_PermissionPK getId() {
		return this.id;
	}

	public void setId(Role_PermissionPK id) {
		this.id = id;
	}

	public Timestamp getAssignment_Datetime() {
		return this.assignment_Datetime;
	}

	public void setAssignment_Datetime(Timestamp assignment_Datetime) {
		this.assignment_Datetime = assignment_Datetime;
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

	public Timestamp getDeactivation_Datetime() {
		return this.deactivation_Datetime;
	}

	public void setDeactivation_Datetime(Timestamp deactivation_Datetime) {
		this.deactivation_Datetime = deactivation_Datetime;
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

	public boolean getIs_Active() {
		return this.is_Active;
	}

	public void setIs_Active(boolean is_Active) {
		this.is_Active = is_Active;
	}

	public boolean getIs_Version_Active() {
		return this.is_Version_Active;
	}

	public void setIs_Version_Active(boolean is_Version_Active) {
		this.is_Version_Active = is_Version_Active;
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

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Schema_Version getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(Schema_Version schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

}