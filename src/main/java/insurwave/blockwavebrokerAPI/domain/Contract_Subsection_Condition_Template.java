package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
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
 * The persistent class for the Contract_Subsection_Condition_Template database
 * table.
 * 
 */
@Entity
@Table(name = "Contract_Subsection_Condition_Template")
@NamedQuery(name = "Contract_Subsection_Condition_Template.findAll", query = "SELECT c FROM Contract_Subsection_Condition_Template c")
public class Contract_Subsection_Condition_Template implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contract_Subsection_Condition_Template_Reference", unique = true, nullable = false, length = 1)
	private String contract_Subsection_Condition_Template_Reference;

	@Column(name = "Friendly_Name", nullable = false)
	private String friendly_Name;

	@Column(name = "Name", nullable = false)
	private String name;

	@Column(name = "Template_Raw_Data")
	private String template_Raw_Data;

	@Column(name = "Version", nullable = false)
	private Integer version;

	// bi-directional many-to-one association to Contract_Subsection_Condition
	@OneToMany(mappedBy = "contractSubsectionConditionTemplate")
	private List<Contract_Subsection_Condition> contractSubsectionConditions;

	public Contract_Subsection_Condition_Template() {
	}

	public String getContract_Subsection_Condition_Template_Reference() {
		return this.contract_Subsection_Condition_Template_Reference;
	}

	public void setContract_Subsection_Condition_Template_Reference(
			String contract_Subsection_Condition_Template_Reference) {
		this.contract_Subsection_Condition_Template_Reference = contract_Subsection_Condition_Template_Reference;
	}

	public String getFriendly_Name() {
		return this.friendly_Name;
	}

	public void setFriendly_Name(String friendly_Name) {
		this.friendly_Name = friendly_Name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemplate_Raw_Data() {
		return this.template_Raw_Data;
	}

	public void setTemplate_Raw_Data(String template_Raw_Data) {
		this.template_Raw_Data = template_Raw_Data;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public List<Contract_Subsection_Condition> getContractSubsectionConditions() {
		return this.contractSubsectionConditions;
	}

	public void setContractSubsectionConditions(List<Contract_Subsection_Condition> contractSubsectionConditions) {
		this.contractSubsectionConditions = contractSubsectionConditions;
	}

	public Contract_Subsection_Condition addContractSubsectionCondition(
			Contract_Subsection_Condition contractSubsectionCondition) {
		getContractSubsectionConditions().add(contractSubsectionCondition);
		contractSubsectionCondition.setContractSubsectionConditionTemplate(this);

		return contractSubsectionCondition;
	}

	public Contract_Subsection_Condition removeContractSubsectionCondition(
			Contract_Subsection_Condition contractSubsectionCondition) {
		getContractSubsectionConditions().remove(contractSubsectionCondition);
		contractSubsectionCondition.setContractSubsectionConditionTemplate(null);

		return contractSubsectionCondition;
	}

}