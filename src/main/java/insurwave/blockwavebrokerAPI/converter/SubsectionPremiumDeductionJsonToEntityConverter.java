package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deduction;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumDeduction;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from SubsectionPremiumDeduction JSON to Subsection_Premium_Deduction
 * entity.
 * 
 * @author saisree
 *
 */
@Component
public class SubsectionPremiumDeductionJsonToEntityConverter
		implements Converter<SubsectionPremiumDeduction, Subsection_Premium_Deduction> {
	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(SubsectionPremiumDeduction.class,
			Subsection_Premium_Deduction.class,
			BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTION_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<SubsectionPremiumDeduction, Subsection_Premium_Deduction> typeMap = modelMapper.typeMap(
			SubsectionPremiumDeduction.class, Subsection_Premium_Deduction.class,
			BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTION_JSON_TO_ENTITY_TYPEMAP_NAME);

	@Override
	public Subsection_Premium_Deduction convert(SubsectionPremiumDeduction subsectionPremiumDeduction) {
		String subsection_Premium_Deduction_Reference = subsectionPremiumDeduction.subsection_Premium_Deduction_Reference;
		Subsection_Premium_Deduction subsection_Premium_Deduction = null;

		if (subsectionPremiumDeduction.getIsLocal() == null || subsectionPremiumDeduction.getIsLocal().isEmpty()) {
			subsectionPremiumDeduction.setIsLocal(null);
		} else if (Boolean.parseBoolean(subsectionPremiumDeduction.getIsLocal().toLowerCase()) == false) {
			subsectionPremiumDeduction.setIsLocal("0");
		} else if (Boolean.parseBoolean(subsectionPremiumDeduction.getIsLocal().toLowerCase()) == true) {
			subsectionPremiumDeduction.setIsLocal("1");
		}

		if (subsectionPremiumDeduction.getIsLocal() == "1" && (subsection_Premium_Deduction_Reference == null
				|| subsection_Premium_Deduction_Reference.isEmpty())) {
			// skip PK as it is auto generated
			typeMap.addMappings(
					mapper -> mapper.skip(Subsection_Premium_Deduction::setSubsection_Premium_Deduction_Reference));
			subsection_Premium_Deduction = modelMapper.map(subsectionPremiumDeduction,
					Subsection_Premium_Deduction.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTION_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		} else if (subsection_Premium_Deduction_Reference != null) {
			subsection_Premium_Deduction = modelMapper.map(subsectionPremiumDeduction,
					Subsection_Premium_Deduction.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_DEDUCTION_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return subsection_Premium_Deduction;
	}
}
