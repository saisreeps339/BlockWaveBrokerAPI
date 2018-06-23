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
 * The persistent class for the User_Role database table.
 * 
 */
@Entity
@Table(name = "User_Role")
@NamedQuery(name = "User_Role.findAll", query = "SELECT u FROM User_Role u")
public class User_Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private User_RolePK id;

	@Column(name = "Created_by")
	private String created_by;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Effective_From_Datetime", nullable = false)
	private Timestamp effective_From_Datetime;

	@Column(name = "Effective_To_Datetime", nullable = false)
	private Timestamp effective_To_Datetime;

	@Column(name = "Is_Active", nullable = false)
	private boolean is_Active;

	@Column(name = "Role_Assignment_Datetime", nullable = false)
	private Timestamp role_Assignment_Datetime;

	@Column(name = "Role_Deactivation_Datetime", nullable = false)
	private Timestamp role_Deactivation_Datetime;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	// bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name = "Role_UUID", nullable = false, insertable = false, updatable = false)
	private Role role;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID")
	private Schema_Version schemaVersion;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "User_UUID", nullable = false, insertable = false, updatable = false)
	private User user;

	public User_Role() {
	}

	public User_RolePK getId() {
		return this.id;
	}

	public void setId(User_RolePK id) {
		this.id = id;
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

	public boolean getIs_Active() {
		return this.is_Active;
	}

	public void setIs_Active(boolean is_Active) {
		this.is_Active = is_Active;
	}

	public Timestamp getRole_Assignment_Datetime() {
		return this.role_Assignment_Datetime;
	}

	public void setRole_Assignment_Datetime(Timestamp role_Assignment_Datetime) {
		this.role_Assignment_Datetime = role_Assignment_Datetime;
	}

	public Timestamp getRole_Deactivation_Datetime() {
		return this.role_Deactivation_Datetime;
	}

	public void setRole_Deactivation_Datetime(Timestamp role_Deactivation_Datetime) {
		this.role_Deactivation_Datetime = role_Deactivation_Datetime;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}