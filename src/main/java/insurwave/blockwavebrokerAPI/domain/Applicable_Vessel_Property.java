package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Applicable_Vessel_Property database table.
 * 
 */
@Entity
@Table(name = "Applicable_Vessel_Property")
@NamedQuery(name = "Applicable_Vessel_Property.findAll", query = "SELECT a FROM Applicable_Vessel_Property a")
public class Applicable_Vessel_Property implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Applicable_Vessel_Property_Reference", unique = true, nullable = false, length = 1)
	private String applicable_Vessel_Property_Reference;

	@Column(name = "Name", nullable = false)
	private String name;

	// bi-directional many-to-one association to Contract_Subsection_Condition
	@ManyToOne
	@JoinColumn(name = "Contract_Subsection_Condition_Reference", nullable = false)
	private Contract_Subsection_Condition contractSubsectionCondition;

	public Applicable_Vessel_Property() {
	}

	public String getApplicable_Vessel_Property_Reference() {
		return this.applicable_Vessel_Property_Reference;
	}

	public void setApplicable_Vessel_Property_Reference(String applicable_Vessel_Property_Reference) {
		this.applicable_Vessel_Property_Reference = applicable_Vessel_Property_Reference;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contract_Subsection_Condition getContractSubsectionCondition() {
		return this.contractSubsectionCondition;
	}

	public void setContractSubsectionCondition(Contract_Subsection_Condition contractSubsectionCondition) {
		this.contractSubsectionCondition = contractSubsectionCondition;
	}

}