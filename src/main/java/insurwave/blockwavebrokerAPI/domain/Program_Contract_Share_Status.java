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
 * The persistent class for the Program_Contract_Share_Status database table.
 * 
 */
@Entity
@Table(name = "Program_Contract_Share_Status")
@NamedQuery(name = "Program_Contract_Share_Status.findAll", query = "SELECT p FROM Program_Contract_Share_Status p")
public class Program_Contract_Share_Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Share_Status_UUID", unique = true, nullable = false, length = 1)
	private String share_Status_UUID;

	@Column(name = "CreatedBy", length = 255)
	private String createdBy;

	@Column(name = "CreatedDatetime")
	private Timestamp createdDatetime;

	@Column(name = "Shared_Status", nullable = false, length = 20)
	private String shared_Status;

	@Column(name = "SharedDateTime")
	private Timestamp sharedDateTime;

	@Column(name = "Subject_Reference", nullable = false, length = 1)
	private String subject_Reference;

	@Column(name = "UpdatedBy", length = 255)
	private String updatedBy;

	@Column(name = "UpdatedDatetime")
	private Timestamp updatedDatetime;

	public Program_Contract_Share_Status() {
	}

	public String getShare_Status_UUID() {
		return this.share_Status_UUID;
	}

	public void setShare_Status_UUID(String share_Status_UUID) {
		this.share_Status_UUID = share_Status_UUID;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getShared_Status() {
		return this.shared_Status;
	}

	public void setShared_Status(String shared_Status) {
		this.shared_Status = shared_Status;
	}

	public Timestamp getSharedDateTime() {
		return this.sharedDateTime;
	}

	public void setSharedDateTime(Timestamp sharedDateTime) {
		this.sharedDateTime = sharedDateTime;
	}

	public String getSubject_Reference() {
		return this.subject_Reference;
	}

	public void setSubject_Reference(String subject_Reference) {
		this.subject_Reference = subject_Reference;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDatetime() {
		return this.updatedDatetime;
	}

	public void setUpdatedDatetime(Timestamp updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

}