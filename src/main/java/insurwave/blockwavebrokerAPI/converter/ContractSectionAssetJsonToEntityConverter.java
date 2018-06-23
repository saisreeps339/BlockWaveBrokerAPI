package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Section_Asset;
import insurwave.blockwavebrokerAPI.jsondto.Vessel;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps the Vessel JSON to Contract_Section_Asset entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractSectionAssetJsonToEntityConverter implements Converter<Vessel, Contract_Section_Asset> {

	/**
	 * INSERT INTO Contract_Section_Asset( Asset_UUID, Activation_Datetime,
	 * Deactivation_Datetime, Version_Number, Status, Created_By, Created_Datetime,
	 * Updated_By, Updated_Datetime, Contract_Section_UUID ) SELECT
	 * CONVERT(UNIQUEIDENTIFIER, Vessels.Asset_Reference),
	 * Vessels.Activation_Datetime, Vessels.Deactivation_Datetime,
	 * Vessels.Version_Number, Vessels.Status, Vessels.Created_By,
	 * Vessels.Created_Datetime, Vessels.Updated_By, Vessels.Updated_Datetime,
	 * Sections.Contract_Section_UUID FROM OPENJSON( @json) WITH(Vessels
	 * NVARCHAR(MAX) AS JSON, Contract_Section_UUID UNIQUEIDENTIFIER) AS Sections
	 * CROSS APPLY OPENJSON (Sections.Vessels) WITH (Asset_Reference
	 * UNIQUEIDENTIFIER, Activation_Datetime DATETIME, Deactivation_Datetime
	 * DATETIME, Version_Number INT, Status NVARCHAR(225), Created_By NVARCHAR(225),
	 * Created_Datetime DATETIME, Updated_By NVARCHAR(225), Updated_Datetime
	 * DATETIME) AS Vessels
	 * 
	 */
	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(Vessel.class, Contract_Section_Asset.class,
			BrokerAPIConstants.CONTRACT_SECTION_ASSET_JSON_TO_ENTITY_TYPEMAP_NAME);
	TypeMap<Vessel, Contract_Section_Asset> typeMap = modelMapper.typeMap(Vessel.class, Contract_Section_Asset.class,
			BrokerAPIConstants.CONTRACT_SECTION_ASSET_JSON_TO_ENTITY_TYPEMAP_NAME);

	/**
	 * Default constructor to create converter instance.
	 */
	public ContractSectionAssetJsonToEntityConverter() {
		// skip PK as it is auto generated for insert
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setContract_Section_Asset_UUID));
		// skip foreign key
		typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setContractSection));

	}

	@Override
	public Contract_Section_Asset convert(Vessel vessel) {
		// apply time stamp converter to date-time strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();
		String createdDateTime = vessel.getCreated_Datetime();
		String activationDateTime = vessel.getActivation_Datetime();
		String deactivationDateTime = vessel.getDeactivation_Datetime();
		String updatedDateTime = vessel.getUpdated_Datetime();

		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(Vessel::getCreated_Datetime,
					Contract_Section_Asset::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setCreated_Datetime));
		}
		if (activationDateTime != null && !activationDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(Vessel::getActivation_Datetime,
					Contract_Section_Asset::setActivation_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setActivation_Datetime));
		}
		if (deactivationDateTime != null && !deactivationDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(Vessel::getDeactivation_Datetime,
					Contract_Section_Asset::setDeactivation_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setDeactivation_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(Vessel::getUpdated_Datetime,
					Contract_Section_Asset::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Section_Asset::setUpdated_Datetime));
		}

		Contract_Section_Asset contract_Section_Asset = modelMapper.map(vessel, Contract_Section_Asset.class,
				BrokerAPIConstants.CONTRACT_SECTION_ASSET_JSON_TO_ENTITY_TYPEMAP_NAME);
		modelMapper.validate();
		return contract_Section_Asset;
	}

}
