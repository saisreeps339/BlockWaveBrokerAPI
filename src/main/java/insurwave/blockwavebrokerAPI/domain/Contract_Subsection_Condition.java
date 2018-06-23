package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
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
 * The persistent class for the Contract_Subsection_Condition database table.
 * 
 */
@Entity
@Table(name = "Contract_Subsection_Condition")
@NamedQuery(name = "Contract_Subsection_Condition.findAll", query = "SELECT c FROM Contract_Subsection_Condition c")
public class Contract_Subsection_Condition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contract_Subsection_Condition_Reference", unique = true, nullable = false, length = 1)
	private String contract_Subsection_Condition_Reference;

	@Column(name = "Clause_Raw_Data")
	private String clause_Raw_Data;

	@Column(name = "Id", nullable = false, length = 1)
	private String id;

	@Column(name = "Subject_Type", nullable = false)
	private String subject_Type;

	@Column(name = "Title", nullable = false)
	private String title;

	// bi-directional many-to-one association to Applicable_Vessel_Property
	@OneToMany(mappedBy = "contractSubsectionCondition")
	private List<Applicable_Vessel_Property> applicableVesselProperties;

	// bi-directional many-to-one association to Contract_Subsection
	@ManyToOne
	@JoinColumn(name = "Contract_Subsection_UUID", nullable = false)
	private Contract_Subsection contractSubsection;

	// bi-directional many-to-one association to
	// Contract_Subsection_Condition_Template
	@ManyToOne
	@JoinColumn(name = "Contract_Subsection_Condition_Template_Reference")
	private Contract_Subsection_Condition_Template contractSubsectionConditionTemplate;

	public Contract_Subsection_Condition() {
	}

	public String getContract_Subsection_Condition_Reference() {
		return this.contract_Subsection_Condition_Reference;
	}

	public void setContract_Subsection_Condition_Reference(String contract_Subsection_Condition_Reference) {
		this.contract_Subsection_Condition_Reference = contract_Subsection_Condition_Reference;
	}

	public String getClause_Raw_Data() {
		return this.clause_Raw_Data;
	}

	public void setClause_Raw_Data(String clause_Raw_Data) {
		this.clause_Raw_Data = clause_Raw_Data;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject_Type() {
		return this.subject_Type;
	}

	public void setSubject_Type(String subject_Type) {
		this.subject_Type = subject_Type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Applicable_Vessel_Property> getApplicableVesselProperties() {
		return this.applicableVesselProperties;
	}

	public void setApplicableVesselProperties(List<Applicable_Vessel_Property> applicableVesselProperties) {
		this.applicableVesselProperties = applicableVesselProperties;
	}

	public Applicable_Vessel_Property addApplicableVesselProperty(Applicable_Vessel_Property applicableVesselProperty) {
		getApplicableVesselProperties().add(applicableVesselProperty);
		applicableVesselProperty.setContractSubsectionCondition(this);

		return applicableVesselProperty;
	}

	public Applicable_Vessel_Property removeApplicableVesselProperty(
			Applicable_Vessel_Property applicableVesselProperty) {
		getApplicableVesselProperties().remove(applicableVesselProperty);
		applicableVesselProperty.setContractSubsectionCondition(null);

		return applicableVesselProperty;
	}

	public Contract_Subsection getContractSubsection() {
		return this.contractSubsection;
	}

	public void setContractSubsection(Contract_Subsection contractSubsection) {
		this.contractSubsection = contractSubsection;
	}

	public Contract_Subsection_Condition_Template getContractSubsectionConditionTemplate() {
		return this.contractSubsectionConditionTemplate;
	}

	public void setContractSubsectionConditionTemplate(
			Contract_Subsection_Condition_Template contractSubsectionConditionTemplate) {
		this.contractSubsectionConditionTemplate = contractSubsectionConditionTemplate;
	}

}