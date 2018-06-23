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
 * The persistent class for the Reinsurance_Program_Subscription database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Program_Subscription")
@NamedQuery(name = "Reinsurance_Program_Subscription.findAll", query = "SELECT r FROM Reinsurance_Program_Subscription r")
public class Reinsurance_Program_Subscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Program_Subscription_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Program_Subscription_UUID;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Reinsurance_Program_Code", nullable = false, length = 1)
	private String reinsurance_Program_Code;

	@Column(name = "Share_Activation_Datetime", nullable = false)
	private Timestamp share_Activation_Datetime;

	@Column(name = "Share_Deactivation_Datetime")
	private Timestamp share_Deactivation_Datetime;

	@Column(name = "Shared_By_Identity_Reference", nullable = false, length = 1)
	private String shared_By_Identity_Reference;

	@Column(name = "Shared_By_Legal_Entity_Code")
	private String shared_By_Legal_Entity_Code;

	@Column(name = "Shared_With_Identity_Reference", nullable = false, length = 1)
	private String shared_With_Identity_Reference;

	@Column(name = "Shared_With_Legal_Entity_Code")
	private String shared_With_Legal_Entity_Code;

	@Column(name = "Status")
	private String status;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	public Reinsurance_Program_Subscription() {
	}

	public String getReinsurance_Program_Subscription_UUID() {
		return this.reinsurance_Program_Subscription_UUID;
	}

	public void setReinsurance_Program_Subscription_UUID(String reinsurance_Program_Subscription_UUID) {
		this.reinsurance_Program_Subscription_UUID = reinsurance_Program_Subscription_UUID;
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

	public String getReinsurance_Program_Code() {
		return this.reinsurance_Program_Code;
	}

	public void setReinsurance_Program_Code(String reinsurance_Program_Code) {
		this.reinsurance_Program_Code = reinsurance_Program_Code;
	}

	public Timestamp getShare_Activation_Datetime() {
		return this.share_Activation_Datetime;
	}

	public void setShare_Activation_Datetime(Timestamp share_Activation_Datetime) {
		this.share_Activation_Datetime = share_Activation_Datetime;
	}

	public Timestamp getShare_Deactivation_Datetime() {
		return this.share_Deactivation_Datetime;
	}

	public void setShare_Deactivation_Datetime(Timestamp share_Deactivation_Datetime) {
		this.share_Deactivation_Datetime = share_Deactivation_Datetime;
	}

	public String getShared_By_Identity_Reference() {
		return this.shared_By_Identity_Reference;
	}

	public void setShared_By_Identity_Reference(String shared_By_Identity_Reference) {
		this.shared_By_Identity_Reference = shared_By_Identity_Reference;
	}

	public String getShared_By_Legal_Entity_Code() {
		return this.shared_By_Legal_Entity_Code;
	}

	public void setShared_By_Legal_Entity_Code(String shared_By_Legal_Entity_Code) {
		this.shared_By_Legal_Entity_Code = shared_By_Legal_Entity_Code;
	}

	public String getShared_With_Identity_Reference() {
		return this.shared_With_Identity_Reference;
	}

	public void setShared_With_Identity_Reference(String shared_With_Identity_Reference) {
		this.shared_With_Identity_Reference = shared_With_Identity_Reference;
	}

	public String getShared_With_Legal_Entity_Code() {
		return this.shared_With_Legal_Entity_Code;
	}

	public void setShared_With_Legal_Entity_Code(String shared_With_Legal_Entity_Code) {
		this.shared_With_Legal_Entity_Code = shared_With_Legal_Entity_Code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}