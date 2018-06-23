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
 * The persistent class for the Role database table.
 * 
 */
@Entity
@Table(name = "Role")
@NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Role_UUID", unique = true, nullable = false, length = 1)
	private String role_UUID;

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

	@Column(name = "Role_Name", nullable = false)
	private String role_Name;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	// bi-directional many-to-one association to Identity_Type
	@ManyToOne
	@JoinColumn(name = "Identity_Type_UUID")
	private Identity_Type identityType;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID")
	private Schema_Version schemaVersion;

	// bi-directional many-to-one association to Role_Permission
	@OneToMany(mappedBy = "role")
	private List<Role_Permission> rolePermissions;

	// bi-directional many-to-one association to User_Role
	@OneToMany(mappedBy = "role")
	private List<User_Role> userRoles;

	public Role() {
	}

	public String getRole_UUID() {
		return this.role_UUID;
	}

	public void setRole_UUID(String role_UUID) {
		this.role_UUID = role_UUID;
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

	public String getRole_Name() {
		return this.role_Name;
	}

	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
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

	public Identity_Type getIdentityType() {
		return this.identityType;
	}

	public void setIdentityType(Identity_Type identityType) {
		this.identityType = identityType;
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
		rolePermission.setRole(this);

		return rolePermission;
	}

	public Role_Permission removeRolePermission(Role_Permission rolePermission) {
		getRolePermissions().remove(rolePermission);
		rolePermission.setRole(null);

		return rolePermission;
	}

	public List<User_Role> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<User_Role> userRoles) {
		this.userRoles = userRoles;
	}

	public User_Role addUserRole(User_Role userRole) {
		getUserRoles().add(userRole);
		userRole.setRole(this);

		return userRole;
	}

	public User_Role removeUserRole(User_Role userRole) {
		getUserRoles().remove(userRole);
		userRole.setRole(null);

		return userRole;
	}

}