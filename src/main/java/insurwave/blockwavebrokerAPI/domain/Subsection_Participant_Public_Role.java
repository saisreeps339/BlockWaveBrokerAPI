package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Subsection_Participant_Public_Role database
 * table.
 * 
 */
@Entity
@Table(name = "Subsection_Participant_Public_Role")
@NamedQuery(name = "Subsection_Participant_Public_Role.findAll", query = "SELECT s FROM Subsection_Participant_Public_Role s")
public class Subsection_Participant_Public_Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Subsection_Participant_Public_Role_Reference", unique = true, nullable = false, length = 1)
	private String subsection_Participant_Public_Role_Reference;

	@Column(name = "Claim_Participant_Function")
	private String claim_Participant_Function;

	@Column(name = "Declaration_Participant_Function")
	private String declaration_Participant_Function;

	@Column(name = "Endorsement_Participant_Function")
	private String endorsement_Participant_Function;

	@Column(name = "Participant_Function")
	private String participant_Function;

	@Column(name = "Participant_Identity_Reference", nullable = false, length = 1)
	private String participant_Identity_Reference;

	@Column(name = "Participant_Legal_Entity_Reference", nullable = false, length = 1)
	private String participant_Legal_Entity_Reference;

	@Column(name = "Subsection_Reference", nullable = false, length = 1)
	private String subsection_Reference;

	public Subsection_Participant_Public_Role() {
	}

	public String getSubsection_Participant_Public_Role_Reference() {
		return this.subsection_Participant_Public_Role_Reference;
	}

	public void setSubsection_Participant_Public_Role_Reference(String subsection_Participant_Public_Role_Reference) {
		this.subsection_Participant_Public_Role_Reference = subsection_Participant_Public_Role_Reference;
	}

	public String getClaim_Participant_Function() {
		return this.claim_Participant_Function;
	}

	public void setClaim_Participant_Function(String claim_Participant_Function) {
		this.claim_Participant_Function = claim_Participant_Function;
	}

	public String getDeclaration_Participant_Function() {
		return this.declaration_Participant_Function;
	}

	public void setDeclaration_Participant_Function(String declaration_Participant_Function) {
		this.declaration_Participant_Function = declaration_Participant_Function;
	}

	public String getEndorsement_Participant_Function() {
		return this.endorsement_Participant_Function;
	}

	public void setEndorsement_Participant_Function(String endorsement_Participant_Function) {
		this.endorsement_Participant_Function = endorsement_Participant_Function;
	}

	public String getParticipant_Function() {
		return this.participant_Function;
	}

	public void setParticipant_Function(String participant_Function) {
		this.participant_Function = participant_Function;
	}

	public String getParticipant_Identity_Reference() {
		return this.participant_Identity_Reference;
	}

	public void setParticipant_Identity_Reference(String participant_Identity_Reference) {
		this.participant_Identity_Reference = participant_Identity_Reference;
	}

	public String getParticipant_Legal_Entity_Reference() {
		return this.participant_Legal_Entity_Reference;
	}

	public void setParticipant_Legal_Entity_Reference(String participant_Legal_Entity_Reference) {
		this.participant_Legal_Entity_Reference = participant_Legal_Entity_Reference;
	}

	public String getSubsection_Reference() {
		return this.subsection_Reference;
	}

	public void setSubsection_Reference(String subsection_Reference) {
		this.subsection_Reference = subsection_Reference;
	}

}