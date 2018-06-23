package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Related_Contracts database table.
 * 
 */
@Entity
@Table(name = "Related_Contracts")
@NamedQuery(name = "Related_Contract.findAll", query = "SELECT r FROM Related_Contract r")
public class Related_Contract implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Contract_Reference", nullable = false)
	private String contract_Reference;

	@Column(name = "Created_By", nullable = false)
	private String created_By;

	@Column(name = "Created_Datetime", nullable = false)
	private Timestamp created_Datetime;

	@Column(name = "Related_Contract_Reference")
	private String related_Contract_Reference;

	@Column(name = "Related_Contract_Section_Reference", nullable = false)
	private String related_Contract_Section_Reference;

	@Column(name = "Related_Contract_Subsection_Reference", nullable = false)
	private String related_Contract_Subsection_Reference;

	@Column(name = "Relation_Type", nullable = false)
	private String relation_Type;

	@Column(name = "Updated_By", nullable = false)
	private String updated_By;

	@Column(name = "Updated_Datetime", nullable = false)
	private Timestamp updated_Datetime;

	public Related_Contract() {
	}

	public String getContract_Reference() {
		return this.contract_Reference;
	}

	public void setContract_Reference(String contract_Reference) {
		this.contract_Reference = contract_Reference;
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

	public String getRelated_Contract_Reference() {
		return this.related_Contract_Reference;
	}

	public void setRelated_Contract_Reference(String related_Contract_Reference) {
		this.related_Contract_Reference = related_Contract_Reference;
	}

	public String getRelated_Contract_Section_Reference() {
		return this.related_Contract_Section_Reference;
	}

	public void setRelated_Contract_Section_Reference(String related_Contract_Section_Reference) {
		this.related_Contract_Section_Reference = related_Contract_Section_Reference;
	}

	public String getRelated_Contract_Subsection_Reference() {
		return this.related_Contract_Subsection_Reference;
	}

	public void setRelated_Contract_Subsection_Reference(String related_Contract_Subsection_Reference) {
		this.related_Contract_Subsection_Reference = related_Contract_Subsection_Reference;
	}

	public String getRelation_Type() {
		return this.relation_Type;
	}

	public void setRelation_Type(String relation_Type) {
		this.relation_Type = relation_Type;
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

}