package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;
import insurwave.blockwavebrokerAPI.jsondto.SubsectionPremiumTax;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from SubsectionPremiumTax JSON to Subsection_Premium_Tax entity.
 * 
 * @author saisree
 *
 */
@Component
public class SubsectionPremiumTaxJsonToEntityConverter
		implements Converter<SubsectionPremiumTax, Subsection_Premium_Tax> {
	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(SubsectionPremiumTax.class,
			Subsection_Premium_Tax.class, BrokerAPIConstants.SUBSECTION_PREMIUM_TAX_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<SubsectionPremiumTax, Subsection_Premium_Tax> typeMap = modelMapper.typeMap(
			SubsectionPremiumTax.class, Subsection_Premium_Tax.class,
			BrokerAPIConstants.SUBSECTION_PREMIUM_TAX_JSON_TO_ENTITY_TYPEMAP_NAME);

	@Override
	public Subsection_Premium_Tax convert(SubsectionPremiumTax subsectionPremiumTax) {
		String subsection_Premium_Tax_Reference = subsectionPremiumTax.subsection_Premium_Tax_Reference;
		Subsection_Premium_Tax subsection_Premium_Tax = null;

		if (subsectionPremiumTax.getIsLocal() == null || subsectionPremiumTax.getIsLocal().isEmpty()) {
			subsectionPremiumTax.setIsLocal(null);
		} else if (Boolean.parseBoolean(subsectionPremiumTax.getIsLocal().toLowerCase()) == false) {
			subsectionPremiumTax.setIsLocal("0");
		} else if (Boolean.parseBoolean(subsectionPremiumTax.getIsLocal().toLowerCase()) == true) {
			subsectionPremiumTax.setIsLocal("1");
		}

		if (subsectionPremiumTax.getIsLocal() == "1"
				&& (subsection_Premium_Tax_Reference == null || subsection_Premium_Tax_Reference.isEmpty())) {
			// skip PK as it is auto generated
			typeMap.addMappings(mapper -> mapper.skip(Subsection_Premium_Tax::setSubsection_Premium_Tax_Reference));
			subsection_Premium_Tax = modelMapper.map(subsectionPremiumTax, Subsection_Premium_Tax.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_TAX_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		} else if (subsection_Premium_Tax_Reference != null) {
			subsection_Premium_Tax = modelMapper.map(subsectionPremiumTax, Subsection_Premium_Tax.class,
					BrokerAPIConstants.SUBSECTION_PREMIUM_TAX_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return subsection_Premium_Tax;
	}
}