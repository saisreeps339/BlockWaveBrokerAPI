package insurwave.blockwavebrokerAPI.service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Participant_Public_Role;

/**
 * Spring Boot service interface for Subsection_Participant_Public_Role related
 * functionality.
 * 
 * @author vineet.kumar.sharma
 *
 */
public interface ParticipantPublicRoleService {

	/**
	 * Save record in Subsection_Participant_Public_Role table
	 * 
	 * @param participantPublicRole
	 * @return
	 */
	public Subsection_Participant_Public_Role saveSubsection_Participant(
			Subsection_Participant_Public_Role participantPublicRole);

	/**
	 * Find record by Subsection_Reference
	 * 
	 * @param subsectionRefrence
	 * @return
	 */
	public Subsection_Participant_Public_Role getBySubsectionReference(String subsectionRefrence);

	/**
	 * Delete Record if Subsection_Reference is already exist in
	 * Subsection_Participant_Public_Role table
	 * 
	 * @param subsectionRefrence
	 */
	public void deleteBySubsectionReference(String subsectionRefrence);

}
