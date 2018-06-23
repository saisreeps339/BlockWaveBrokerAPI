package insurwave.blockwavebrokerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import insurwave.blockwavebrokerAPI.domain.Subsection_Participant_Public_Role;

/**
 * JPA repository for operations on Subsection_Participant_Public_Role entity.
 * 
 * @author vineet.kumar.sharma
 *
 */
public interface SubsectionParticipantPublicRoleRepository
		extends JpaRepository<Subsection_Participant_Public_Role, String> {

	@Modifying
	@Query("delete from Subsection_Participant_Public_Role c where c.subsection_Reference = ?1")
	void deleteBySubsection_Reference(String subsection_Reference);

	@Query("select c from Subsection_Participant_Public_Role c where c.subsection_Reference = ?1")
	Subsection_Participant_Public_Role findBySubsection_Reference(String subsection_Reference);

}
