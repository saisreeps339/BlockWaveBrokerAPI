package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deductible;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumDeductible;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from SubsectionPremiumDeductible JSON to Subsection_Premium_Deductible
 * entity.
 * 
 * @author saisree
 *
 */
@Component
public class SubsectionPremiumDeductibleJsonToEntityConverter
		implements Converter<SubsectionPremiumDeductible, Subsection_Premium_Deductible> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(SubsectionPremiumDeductible.class,
			Subsection_Premium_Deductible.class,
			BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTIBLE_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<SubsectionPremiumDeductible, Subsection_Premium_Deductible> typeMap = modelMapper.typeMap(
			SubsectionPremiumDeductible.class, Subsection_Premium_Deductible.class,
			BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTIBLE_JSON_TO_ENTITY_TYPEMAP_NAME);

	@Override
	public Subsection_Premium_Deductible convert(SubsectionPremiumDeductible subsectionPremiumDeductible) {
		String subsection_Premium_Deductible_Reference = subsectionPremiumDeductible.subsection_Premium_Deductible_Reference;
		Subsection_Premium_Deductible subsection_Premium_Deductible = null;

		if (subsectionPremiumDeductible.getIsLocal() == null || subsectionPremiumDeductible.getIsLocal().isEmpty()) {
			subsectionPremiumDeductible.setIsLocal(null);
		} else if (Boolean.parseBoolean(subsectionPremiumDeductible.getIsLocal().toLowerCase()) == false) {
			subsectionPremiumDeductible.setIsLocal("0");
		} else if (Boolean.parseBoolean(subsectionPremiumDeductible.getIsLocal().toLowerCase()) == true) {
			subsectionPremiumDeductible.setIsLocal("1");
		}

		if (subsectionPremiumDeductible.getIsLocal() == "1" && (subsection_Premium_Deductible_Reference == null
				|| subsection_Premium_Deductible_Reference.isEmpty())) {
			// skip PK as it is auto generated
			typeMap.addMappings(
					mapper -> mapper.skip(Subsection_Premium_Deductible::setSubsection_Premium_Deductible_Reference));
			subsection_Premium_Deductible = modelMapper.map(subsectionPremiumDeductible,
					Subsection_Premium_Deductible.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTIBLE_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		} else if (subsection_Premium_Deductible_Reference != null) {
			subsection_Premium_Deductible = modelMapper.map(subsectionPremiumDeductible,
					Subsection_Premium_Deductible.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTIBLE_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return subsection_Premium_Deductible;
	}

}
