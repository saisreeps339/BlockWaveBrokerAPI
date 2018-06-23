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
 * The persistent class for the Permission database table.
 * 
 */
@Entity
@Table(name = "Permission")
@NamedQuery(name = "Permission.findAll", query = "SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Permission_UUID", unique = true, nullable = false, length = 1)
	private String permission_UUID;

	@Column(name = "Created_by")
	private String created_by;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Effective_From_Datetime", nullable = false)
	private Timestamp effective_From_Datetime;

	@Column(name = "Effective_To_Datetime", nullable = false)
	private Timestamp effective_To_Datetime;

	@Column(name = "Is_Version_Active")
	private boolean is_Version_Active;

	@Column(name = "Permission_Name", nullable = false)
	private String permission_Name;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID")
	private Schema_Version schemaVersion;

	// bi-directional many-to-one association to Role_Permission
	@OneToMany(mappedBy = "permission")
	private List<Role_Permission> rolePermissions;

	public Permission() {
	}

	public String getPermission_UUID() {
		return this.permission_UUID;
	}

	public void setPermission_UUID(String permission_UUID) {
		this.permission_UUID = permission_UUID;
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

	public boolean getIs_Version_Active() {
		return this.is_Version_Active;
	}

	public void setIs_Version_Active(boolean is_Version_Active) {
		this.is_Version_Active = is_Version_Active;
	}

	public String getPermission_Name() {
		return this.permission_Name;
	}

	public void setPermission_Name(String permission_Name) {
		this.permission_Name = permission_Name;
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

	public Schema_Version getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(Schema_Version schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public List<Role_Permission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(List<Role_Permission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	public Role_Permission addRolePermission(Role_Permission rolePermission) {
		getRolePermissions().add(rolePermission);
		rolePermission.setPermission(this);

		return rolePermission;
	}

	public Role_Permission removeRolePermission(Role_Permission rolePermission) {
		getRolePermissions().remove(rolePermission);
		rolePermission.setPermission(null);

		return rolePermission;
	}

}