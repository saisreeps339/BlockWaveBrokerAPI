package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepTwo;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps the ContractStepTwo JSON to Contract_Section entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractSectionStep2JsonToEntityConverter implements Converter<ContractStepTwo, Contract_Section> {
	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ContractStepTwo.class, Contract_Section.class,
			BrokerAPIConstants.CONTRACT_SECTION_STEP2_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<ContractStepTwo, Contract_Section> typeMap = modelMapper.typeMap(ContractStepTwo.class,
			Contract_Section.class, BrokerAPIConstants.CONTRACT_SECTION_STEP2_JSON_TO_ENTITY_TYPEMAP_NAME);

	/**
	 * Default constructor to create converter instance.
	 */
	public ContractSectionStep2JsonToEntityConverter() {

		// skip entity fields that do not have JSON mappings
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContract_Subsection_Basis_Code));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setStatus));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setVersion_Number));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContractSectionAssets));

	}

	/**
	 * UPDATE Contract_Section SET Section_Premium = json.Section_Premium,
	 * Jurisdiction_UUID = json.Jurisdiction_UUID, Loss_Payee_Legal_Entity_Code =
	 * json.Loss_Payee_Legal_Entity_Code, Settlement_Method_UUID =
	 * json.Settlement_Method_UUID, Contract_Subsection_Basis_Code =
	 * json.Contract_Subsection_Basis_Code FROM OPENJSON(@json) WITH
	 * (Contract_Section_UUID UNIQUEIDENTIFIER '$.Contract_Section_UUID',
	 * Legal_Entity_UUID UNIQUEIDENTIFIER '$.Legal_Entity_UUID', Section_Premium
	 * DECIMAL(18,2) '$.Section_Premium', Jurisdiction_UUID NVARCHAR(255)
	 * '$.Jurisdiction_UUID', Loss_Payee_Legal_Entity_Code NVARCHAR(255)
	 * '$.Loss_Payee_Legal_Entity_Code', Settlement_Method_UUID NVARCHAR(255)
	 * '$.Settlement_Method_UUID', Contract_Subsection_Basis_Code NVARCHAR(255)
	 * '$.Contract_Subsection_Basis_Code') AS json WHERE
	 * Contract_Section.Contract_Section_UUID = json.Contract_Section_UUID
	 */
	@Override
	public Contract_Section convert(ContractStepTwo contractStepTwo) {
		String contract_Section_UUID = contractStepTwo.getContract_Section_UUID();
		if (contract_Section_UUID == null || contract_Section_UUID.isEmpty()) {
			// skip PK as it is auto generated for insert
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setContract_Section_UUID));
		}

		// apply time stamp converter to datetime strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();
		String createdDateTime = contractStepTwo.getCreated_Datetime();
		String updatedDateTime = contractStepTwo.getUpdated_Datetime();

		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepTwo::getCreated_Datetime,
					Contract_Section::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setCreated_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepTwo::getUpdated_Datetime,
					Contract_Section::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section::setUpdated_Datetime));
		}

		Contract_Section contract_Section = modelMapper.map(contractStepTwo, Contract_Section.class,
				BrokerAPIConstants.CONTRACT_SECTION_STEP2_JSON_TO_ENTITY_TYPEMAP_NAME);

		modelMapper.validate();
		return contract_Section;
	}

}
