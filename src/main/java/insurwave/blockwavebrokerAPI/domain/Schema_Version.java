package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the Schema_Version database table.
 * 
 */
@Entity
@Table(name = "Schema_Version")
@NamedQuery(name = "Schema_Version.findAll", query = "SELECT s FROM Schema_Version s")
public class Schema_Version implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Schema_Version_UUID", unique = true, nullable = false, length = 1)
	private String schema_Version_UUID;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Effective_From_Datetime", nullable = false)
	private Timestamp effective_From_Datetime;

	@Column(name = "Effective_To_Datetime", nullable = false)
	private Timestamp effective_To_Datetime;

	@Column(name = "Field_List", nullable = false)
	private String field_List;

	@Column(name = "Hash_Algorithm", nullable = false)
	private String hash_Algorithm;

	@Column(name = "Hash_Built_On", nullable = false)
	private String hash_Built_On;

	@Column(name = "Is_Version_Active", nullable = false)
	private boolean is_Version_Active;

	@Column(name = "Schema_Version_Number", nullable = false)
	private Integer schema_Version_Number;

	@Column(name = "Table_Name", nullable = false)
	private String table_Name;

	@Column(name = "Updated_By", nullable = false)
	private String updated_By;

	@Column(name = "Updated_Datetime", nullable = false)
	private Timestamp updated_Datetime;

	// bi-directional many-to-one association to Identity_Type
	@OneToMany(mappedBy = "schemaVersion")
	private List<Identity_Type> identityTypes;

	// bi-directional many-to-one association to Permission
	@OneToMany(mappedBy = "schemaVersion")
	private List<Permission> permissions;

	// bi-directional many-to-one association to Role
	@OneToMany(mappedBy = "schemaVersion")
	private List<Role> roles;

	// bi-directional many-to-one association to Role_Permission
	@OneToMany(mappedBy = "schemaVersion")
	private List<Role_Permission> rolePermissions;

	// bi-directional many-to-one association to User
	@OneToMany(mappedBy = "schemaVersion")
	private List<User> users;

	// bi-directional many-to-one association to User_Role
	@OneToMany(mappedBy = "schemaVersion")
	private List<User_Role> userRoles;

	public Schema_Version() {
	}

	public String getSchema_Version_UUID() {
		return this.schema_Version_UUID;
	}

	public void setSchema_Version_UUID(String schema_Version_UUID) {
		this.schema_Version_UUID = schema_Version_UUID;
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

	public String getField_List() {
		return this.field_List;
	}

	public void setField_List(String field_List) {
		this.field_List = field_List;
	}

	public String getHash_Algorithm() {
		return this.hash_Algorithm;
	}

	public void setHash_Algorithm(String hash_Algorithm) {
		this.hash_Algorithm = hash_Algorithm;
	}

	public String getHash_Built_On() {
		return this.hash_Built_On;
	}

	public void setHash_Built_On(String hash_Built_On) {
		this.hash_Built_On = hash_Built_On;
	}

	public boolean getIs_Version_Active() {
		return this.is_Version_Active;
	}

	public void setIs_Version_Active(boolean is_Version_Active) {
		this.is_Version_Active = is_Version_Active;
	}

	public Integer getSchema_Version_Number() {
		return this.schema_Version_Number;
	}

	public void setSchema_Version_Number(Integer schema_Version_Number) {
		this.schema_Version_Number = schema_Version_Number;
	}

	public String getTable_Name() {
		return this.table_Name;
	}

	public void setTable_Name(String table_Name) {
		this.table_Name = table_Name;
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

	public List<Identity_Type> getIdentityTypes() {
		return this.identityTypes;
	}

	public void setIdentityTypes(List<Identity_Type> identityTypes) {
		this.identityTypes = identityTypes;
	}

	public Identity_Type addIdentityType(Identity_Type identityType) {
		getIdentityTypes().add(identityType);
		identityType.setSchemaVersion(this);

		return identityType;
	}

	public Identity_Type removeIdentityType(Identity_Type identityType) {
		getIdentityTypes().remove(identityType);
		identityType.setSchemaVersion(null);

		return identityType;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Permission addPermission(Permission permission) {
		getPermissions().add(permission);
		permission.setSchemaVersion(this);

		return permission;
	}

	public Permission removePermission(Permission permission) {
		getPermissions().remove(permission);
		permission.setSchemaVersion(null);

		return permission;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.setSchemaVersion(this);

		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.setSchemaVersion(null);

		return role;
	}

	public List<Role_Permission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(List<Role_Permission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	public Role_Permission addRolePermission(Role_Permission rolePermission) {
		getRolePermissions().add(rolePermission);
		rolePermission.setSchemaVersion(this);

		return rolePermission;
	}

	public Role_Permission removeRolePermission(Role_Permission rolePermission) {
		getRolePermissions().remove(rolePermission);
		rolePermission.setSchemaVersion(null);

		return rolePermission;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSchemaVersion(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSchemaVersion(null);

		return user;
	}

	public List<User_Role> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<User_Role> userRoles) {
		this.userRoles = userRoles;
	}

	public User_Role addUserRole(User_Role userRole) {
		getUserRoles().add(userRole);
		userRole.setSchemaVersion(this);

		return userRole;
	}

	public User_Role removeUserRole(User_Role userRole) {
		getUserRoles().remove(userRole);
		userRole.setSchemaVersion(null);

		return userRole;
	}

}