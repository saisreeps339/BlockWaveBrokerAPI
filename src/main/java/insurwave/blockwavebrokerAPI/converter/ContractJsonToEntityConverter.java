package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepOne;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps the Contract Step JSON to Contract entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractJsonToEntityConverter implements Converter<ContractStepOne, Contract> {

	@Override
	public Contract convert(ContractStepOne contractStepOne) {
		if (contractStepOne.contractUUIDDisplayedit == null || contractStepOne.contractUUIDDisplayedit == "undefined"
				|| contractStepOne.contractUUIDDisplayedit.isEmpty()) {
			if (contractStepOne.contractUUIDDisplay == null || contractStepOne.contractUUIDDisplay == "undefined"
					|| contractStepOne.contractUUIDDisplay.isEmpty()) {
				contractStepOne.contractUUIDDisplays = contractStepOne.contractUUIDdefault;
			} else {
				contractStepOne.contractUUIDDisplays = contractStepOne.contractUUIDDisplay;
			}
		} else {
			contractStepOne.contractUUIDDisplays = contractStepOne.contractUUIDDisplayedit;
		}
		ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ContractStepOne.class, Contract.class,
				BrokerAPIConstants.CONTRACT_JSON_TO_ENTITY_TYPEMAP_NAME);
		// fetches the type map
		TypeMap<ContractStepOne, Contract> typeMap = modelMapper.typeMap(ContractStepOne.class, Contract.class,
				BrokerAPIConstants.CONTRACT_JSON_TO_ENTITY_TYPEMAP_NAME);
		// conditional mapping- map only when contractUUID field is not null
		/*
		 * TODO -- needs to be fixed Condition<ContractStepOne, Contract>
		 * contract_UUIDNotNull = new Condition<ContractStepOne, Contract>() {
		 * 
		 * @Override public boolean applies(MappingContext<ContractStepOne, Contract>
		 * context) { return (context.getSource().getContractUUIDDisplays() != null &&
		 * !context.getSource().getContractUUIDDisplays().isEmpty()); } };
		 * 
		 * typeMap.addMappings(mapper ->
		 * mapper.when(contract_UUIDNotNull).map(ContractStepOne::
		 * getContractUUIDDisplays, Contract::setContract_UUID));
		 */

		// temporarily skip contract id field
		typeMap.addMappings(mapper -> mapper.skip(Contract::setContract_UUID));
		/// skip
		typeMap.addMappings(mapper -> mapper.skip(Contract::setContractFinancialsBreakdowns));
		typeMap.addMappings(mapper -> mapper.skip(Contract::setContractPaymentSchedules));

		// apply time stamp converter to date-time strings in the JSON
		// TODO - null check to be handled with when condition
		String createdDateTime = contractStepOne.getCreated_Datetime();
		String expiryDateTime = contractStepOne.getExpiry_Date();
		String inceptionDateTime = contractStepOne.getInception_Date();
		String updatedDateTime = contractStepOne.getUpdated_Datetime();

		TimestampConverter timestampConverter = new TimestampConverter();
		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepOne::getCreated_Datetime,
					Contract::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract::setCreated_Datetime));
		}
		if (expiryDateTime != null && !expiryDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepOne::getExpiry_Date,
					Contract::setExpiry_Date));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract::setExpiry_Date));
		}
		if (inceptionDateTime != null && !inceptionDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepOne::getInception_Date,
					Contract::setInception_Date));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract::setInception_Date));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractStepOne::getUpdated_Datetime,
					Contract::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract::setUpdated_Datetime));
		}

		Contract contract = modelMapper.map(contractStepOne, Contract.class, typeMap.getName());
		modelMapper.validate();
		return contract;
	}

}
