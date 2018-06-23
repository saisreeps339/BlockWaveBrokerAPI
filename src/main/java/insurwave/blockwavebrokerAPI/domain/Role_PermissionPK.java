package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the Role_Permission database table.
 * 
 */
@Embeddable
public class Role_PermissionPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "Role_UUID", insertable = false, updatable = false, unique = true, nullable = false, length = 1)
	private String role_UUID;

	@Column(name = "Permission_UUID", insertable = false, updatable = false, unique = true, nullable = false, length = 1)
	private String permission_UUID;

	public Role_PermissionPK() {
	}

	public String getRole_UUID() {
		return this.role_UUID;
	}

	public void setRole_UUID(String role_UUID) {
		this.role_UUID = role_UUID;
	}

	public String getPermission_UUID() {
		return this.permission_UUID;
	}

	public void setPermission_UUID(String permission_UUID) {
		this.permission_UUID = permission_UUID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Role_PermissionPK)) {
			return false;
		}
		Role_PermissionPK castOther = (Role_PermissionPK) other;
		return this.role_UUID.equals(castOther.role_UUID) && this.permission_UUID.equals(castOther.permission_UUID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.role_UUID.hashCode();
		hash = hash * prime + this.permission_UUID.hashCode();

		return hash;
	}
}