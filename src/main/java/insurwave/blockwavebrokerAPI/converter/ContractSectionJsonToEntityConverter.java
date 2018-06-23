package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.jsondto.ProgramDataDetail;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps the ProgramDataDetail JSON to Contract_Section entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractSectionJsonToEntityConverter implements Converter<ProgramDataDetail, Contract_Section> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ProgramDataDetail.class, Contract_Section.class,
			BrokerAPIConstants.CONTRACT_SECTION_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<ProgramDataDetail, Contract_Section> typeMap = modelMapper.typeMap(ProgramDataDetail.class,
			Contract_Section.class, BrokerAPIConstants.CONTRACT_SECTION_JSON_TO_ENTITY_TYPEMAP_NAME);

	/**
	 * Default constructor to create converter instance.
	 */
	public ContractSectionJsonToEntityConverter() {

		// skip PK as it is auto generated
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContract_Section_UUID));

		// skip entity fields that do not have JSON mappings
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContract_Subsection_Basis_Code));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setStatus));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setVersion_Number));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContractSectionAssets));

	}

	@Override
	public Contract_Section convert(ProgramDataDetail programDataDetail) {
		// apply time stamp converter to date-time strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();
		// TODO - null check to be handled with when condition
		String createdDateTime = programDataDetail.getCreated_Datetime();
		String updatedDateTime = programDataDetail.getUpdated_Datetime();
		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ProgramDataDetail::getCreated_Datetime,
					Contract_Section::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setCreated_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ProgramDataDetail::getUpdated_Datetime,
					Contract_Section::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setUpdated_Datetime));
		}

		Contract_Section contract_Section = modelMapper.map(programDataDetail, Contract_Section.class,
				BrokerAPIConstants.CONTRACT_SECTION_JSON_TO_ENTITY_TYPEMAP_NAME);
		modelMapper.validate();
		return contract_Section;

	}

}
