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
 * The persistent class for the User database table.
 * 
 */
@Entity
@Table(name = "User")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_UUID", unique = true, nullable = false, length = 1)
	private String user_UUID;

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

	@Column(name = "Last_LogIn_Datetime")
	private Timestamp last_LogIn_Datetime;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "User_Id", nullable = false)
	private String user_Id;

	@Column(name = "User_Name", nullable = false)
	private String user_Name;

	// bi-directional many-to-one association to Schema_Version
	@ManyToOne
	@JoinColumn(name = "Schema_Version_UUID")
	private Schema_Version schemaVersion;

	// bi-directional many-to-one association to User_Role
	@OneToMany(mappedBy = "user")
	private List<User_Role> userRoles;

	public User() {
	}

	public String getUser_UUID() {
		return this.user_UUID;
	}

	public void setUser_UUID(String user_UUID) {
		this.user_UUID = user_UUID;
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

	public Timestamp getLast_LogIn_Datetime() {
		return this.last_LogIn_Datetime;
	}

	public void setLast_LogIn_Datetime(Timestamp last_LogIn_Datetime) {
		this.last_LogIn_Datetime = last_LogIn_Datetime;
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

	public String getUser_Id() {
		return this.user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Name() {
		return this.user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public Schema_Version getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(Schema_Version schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public List<User_Role> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<User_Role> userRoles) {
		this.userRoles = userRoles;
	}

	public User_Role addUserRole(User_Role userRole) {
		getUserRoles().add(userRole);
		userRole.setUser(this);

		return userRole;
	}

	public User_Role removeUserRole(User_Role userRole) {
		getUserRoles().remove(userRole);
		userRole.setUser(null);

		return userRole;
	}

}