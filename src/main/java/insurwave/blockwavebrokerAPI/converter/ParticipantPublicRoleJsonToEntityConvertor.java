package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Subsection_Participant_Public_Role;
import insurwave.blockwavebrokerAPI.jsondto.ShareAllocation;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from ShareAllocation JSON to Subsection_Participant_Public_Role entity.
 * 
 * @author vineet.kumar.sharma
 *
 */
@Component
public class ParticipantPublicRoleJsonToEntityConvertor
		implements Converter<ShareAllocation, Subsection_Participant_Public_Role> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ShareAllocation.class,
			Subsection_Participant_Public_Role.class,
			BrokerAPIConstants.PARTICIPANT_PUBLIC_ROLE_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<ShareAllocation, Subsection_Participant_Public_Role> typeMap = modelMapper.typeMap(
			ShareAllocation.class, Subsection_Participant_Public_Role.class,
			BrokerAPIConstants.PARTICIPANT_PUBLIC_ROLE_JSON_TO_ENTITY_TYPEMAP_NAME);

	/**
	 * Default constructor to create converter instance.
	 */
	public ParticipantPublicRoleJsonToEntityConvertor() {

		// skip PK as it is auto generated
		typeMap.addMappings(mapper -> mapper
				.skip(Subsection_Participant_Public_Role::setSubsection_Participant_Public_Role_Reference));

		// map fields that are different in name
		typeMap.addMappings(mapper -> mapper.map(ShareAllocation::getClaim_Participant_Function_UUID,
				Subsection_Participant_Public_Role::setClaim_Participant_Function));
		typeMap.addMappings(mapper -> mapper.map(ShareAllocation::getEndorsement_Participant_Function_UUID,
				Subsection_Participant_Public_Role::setEndorsement_Participant_Function));
		typeMap.addMappings(mapper -> mapper.map(ShareAllocation::getParticipant_Function_UUID,
				Subsection_Participant_Public_Role::setParticipant_Function));
		typeMap.addMappings(mapper -> mapper.map(ShareAllocation::getParticipant_Legal_Entity_Code,
				Subsection_Participant_Public_Role::setParticipant_Legal_Entity_Reference));
		typeMap.addMappings(mapper -> mapper.map(ShareAllocation::getContract_Subsection_UUID,
				Subsection_Participant_Public_Role::setSubsection_Reference));
	}

	@Override
	public Subsection_Participant_Public_Role convert(ShareAllocation shareAllocation) {
		Subsection_Participant_Public_Role subsection_Participant_Public_Role = null;
		String participantFunction = shareAllocation.getParticipant_Function_UUID() != null
				? shareAllocation.getParticipant_Function_UUID().toUpperCase()
				: "";
		String declarationParticipantFunction = shareAllocation.getDeclaration_Participant_Function_UUID() != null
				? shareAllocation.getDeclaration_Participant_Function_UUID().toUpperCase()
				: "";
		String endorsement_Participant_Function = shareAllocation.getParticipant_Function_UUID() != null
				? shareAllocation.getParticipant_Function_UUID().toUpperCase()
				: "";
		String claim_Participant_Function = shareAllocation.getClaim_Participant_Function_UUID() != null
				? shareAllocation.getClaim_Participant_Function_UUID().toUpperCase()
				: "";
		/*
		 * Note: At least one of the below 4 fields need to have value LEADER/CO_LEADER
		 * in order to insert into Subsection_Participant_Public_Role
		 * participantFunction declarationParticipantFunction
		 * endorsement_Participant_Function claim_Participant_Function
		 * 
		 * If none of the above fields have LEADER/CO_LEADER value, we do NOT proceed
		 * with the conversion and insert. The matchedCount property keeps track of
		 * this. If matchedCount = 0, it means we do NOT insert.
		 */

		int matchedCount = 4;
		if (!participantFunction.equals("LEADER") && !participantFunction.equals("CO_LEADER")) {
			// skipping sets Participant_Function to null
			typeMap.addMappings(mapper -> mapper.skip(Subsection_Participant_Public_Role::setParticipant_Function));
			matchedCount--;
		}

		if (!declarationParticipantFunction.equals("LEADER") && !declarationParticipantFunction.equals("CO_LEADER")) {
			// skipping sets Declaration_Participant_Function to null
			typeMap.addMappings(
					mapper -> mapper.skip(Subsection_Participant_Public_Role::setDeclaration_Participant_Function));
			matchedCount--;
		}

		if (!endorsement_Participant_Function.equals("LEADER")
				&& !endorsement_Participant_Function.equals("CO_LEADER")) {
			// skipping sets Endorsement_Participant_Function to null
			typeMap.addMappings(
					mapper -> mapper.skip(Subsection_Participant_Public_Role::setEndorsement_Participant_Function));
			matchedCount--;
		}

		if (!claim_Participant_Function.equals("LEADER") && !claim_Participant_Function.equals("CO_LEADER")) {
			// skipping sets Claim_Participant_Function to null
			typeMap.addMappings(
					mapper -> mapper.skip(Subsection_Participant_Public_Role::setClaim_Participant_Function));
			matchedCount--;
		}

		if (matchedCount > 0) {
			subsection_Participant_Public_Role = modelMapper.map(shareAllocation,
					Subsection_Participant_Public_Role.class,
					BrokerAPIConstants.PARTICIPANT_PUBLIC_ROLE_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return subsection_Participant_Public_Role;

	}

}
