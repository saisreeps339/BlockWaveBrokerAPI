package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the User_Role database table.
 * 
 */
@Embeddable
public class User_RolePK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "Role_UUID", insertable = false, updatable = false, unique = true, nullable = false, length = 1)
	private String role_UUID;

	@Column(name = "User_UUID", insertable = false, updatable = false, unique = true, nullable = false, length = 1)
	private String user_UUID;

	public User_RolePK() {
	}

	public String getRole_UUID() {
		return this.role_UUID;
	}

	public void setRole_UUID(String role_UUID) {
		this.role_UUID = role_UUID;
	}

	public String getUser_UUID() {
		return this.user_UUID;
	}

	public void setUser_UUID(String user_UUID) {
		this.user_UUID = user_UUID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof User_RolePK)) {
			return false;
		}
		User_RolePK castOther = (User_RolePK) other;
		return this.role_UUID.equals(castOther.role_UUID) && this.user_UUID.equals(castOther.user_UUID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.role_UUID.hashCode();
		hash = hash * prime + this.user_UUID.hashCode();

		return hash;
	}
}