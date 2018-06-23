package insurwave.blockwavebrokerAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Participant_Public_Role;
import insurwave.blockwavebrokerAPI.repository.SubsectionParticipantPublicRoleRepository;
import insurwave.blockwavebrokerAPI.service.ParticipantPublicRoleService;

@Service
public class ParticipantPublicRoleServiceImpl implements ParticipantPublicRoleService {
	private SubsectionParticipantPublicRoleRepository participantPublicRoleRepository;

	@Autowired
	public ParticipantPublicRoleServiceImpl(SubsectionParticipantPublicRoleRepository participantPublicRoleRepository) {
		this.participantPublicRoleRepository = participantPublicRoleRepository;
	}

	@Override
	public Subsection_Participant_Public_Role saveSubsection_Participant(
			Subsection_Participant_Public_Role participantPublicRole) {
		return participantPublicRoleRepository.save(participantPublicRole);
	}

	@Override
	public Subsection_Participant_Public_Role getBySubsectionReference(String subsectionReference) {
		return participantPublicRoleRepository.findBySubsection_Reference(subsectionReference);
	}

	@Override
	public void deleteBySubsectionReference(String subsectionReference) {
		participantPublicRoleRepository.deleteBySubsection_Reference(subsectionReference);

	}

}
