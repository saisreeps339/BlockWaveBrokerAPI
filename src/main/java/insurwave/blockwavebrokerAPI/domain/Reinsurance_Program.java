package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Reinsurance_Program database table.
 * 
 */
@Entity
@Table(name = "Reinsurance_Program")
@NamedQuery(name = "Reinsurance_Program.findAll", query = "SELECT r FROM Reinsurance_Program r")
public class Reinsurance_Program implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reinsurance_Program_UUID", unique = true, nullable = false, length = 1)
	private String reinsurance_Program_UUID;

	@Column(name = "Coverage_Limit", precision = 18, scale = 5)
	private BigDecimal coverage_Limit;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Expiry_Date")
	private Timestamp expiry_Date;

	@Column(name = "Inception_Date")
	private Timestamp inception_Date;

	@Column(name = "Line_Of_Business_UUID")
	private String line_Of_Business_UUID;

	@Column(name = "Proposed_Inception_Date")
	private Timestamp proposed_Inception_Date;

	@Column(name = "Reinsurance_Program_Code", nullable = false)
	private String reinsurance_Program_Code;

	@Column(name = "Reinsurance_Program_Initiated_By_UUID", length = 1)
	private String reinsurance_Program_Initiated_By_UUID;

	@Column(name = "Reinsurance_Program_Name", nullable = false)
	private String reinsurance_Program_Name;

	@Column(name = "Reinsurance_Program_Term")
	private int reinsurance_Program_Term;

	@Column(name = "Reinsurance_Program_Type_UUID", nullable = false)
	private String reinsurance_Program_Type_UUID;

	@Column(name = "Status")
	private String status;

	@Column(name = "Strategic_Intent")
	private String strategic_Intent;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	@Column(name = "Version_Number")
	private Integer version_Number;

	public Reinsurance_Program() {
	}

	public String getReinsurance_Program_UUID() {
		return this.reinsurance_Program_UUID;
	}

	public void setReinsurance_Program_UUID(String reinsurance_Program_UUID) {
		this.reinsurance_Program_UUID = reinsurance_Program_UUID;
	}

	public BigDecimal getCoverage_Limit() {
		return this.coverage_Limit;
	}

	public void setCoverage_Limit(BigDecimal coverage_Limit) {
		this.coverage_Limit = coverage_Limit;
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

	public Timestamp getExpiry_Date() {
		return this.expiry_Date;
	}

	public void setExpiry_Date(Timestamp expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public Timestamp getInception_Date() {
		return this.inception_Date;
	}

	public void setInception_Date(Timestamp inception_Date) {
		this.inception_Date = inception_Date;
	}

	public String getLine_Of_Business_UUID() {
		return this.line_Of_Business_UUID;
	}

	public void setLine_Of_Business_UUID(String line_Of_Business_UUID) {
		this.line_Of_Business_UUID = line_Of_Business_UUID;
	}

	public Timestamp getProposed_Inception_Date() {
		return this.proposed_Inception_Date;
	}

	public void setProposed_Inception_Date(Timestamp proposed_Inception_Date) {
		this.proposed_Inception_Date = proposed_Inception_Date;
	}

	public String getReinsurance_Program_Code() {
		return this.reinsurance_Program_Code;
	}

	public void setReinsurance_Program_Code(String reinsurance_Program_Code) {
		this.reinsurance_Program_Code = reinsurance_Program_Code;
	}

	public String getReinsurance_Program_Initiated_By_UUID() {
		return this.reinsurance_Program_Initiated_By_UUID;
	}

	public void setReinsurance_Program_Initiated_By_UUID(String reinsurance_Program_Initiated_By_UUID) {
		this.reinsurance_Program_Initiated_By_UUID = reinsurance_Program_Initiated_By_UUID;
	}

	public String getReinsurance_Program_Name() {
		return this.reinsurance_Program_Name;
	}

	public void setReinsurance_Program_Name(String reinsurance_Program_Name) {
		this.reinsurance_Program_Name = reinsurance_Program_Name;
	}

	public int getReinsurance_Program_Term() {
		return this.reinsurance_Program_Term;
	}

	public void setReinsurance_Program_Term(int reinsurance_Program_Term) {
		this.reinsurance_Program_Term = reinsurance_Program_Term;
	}

	public String getReinsurance_Program_Type_UUID() {
		return this.reinsurance_Program_Type_UUID;
	}

	public void setReinsurance_Program_Type_UUID(String reinsurance_Program_Type_UUID) {
		this.reinsurance_Program_Type_UUID = reinsurance_Program_Type_UUID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrategic_Intent() {
		return this.strategic_Intent;
	}

	public void setStrategic_Intent(String strategic_Intent) {
		this.strategic_Intent = strategic_Intent;
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