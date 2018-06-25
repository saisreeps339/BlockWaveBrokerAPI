package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.TaxCTEDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;

/**
 * Spring Boot service interface for Subsection_Premium_Tax related
 * functionality.
 * 
 * @author vineet, sachin
 *
 */
public interface SubsectionPremiumTaxService {
	/**
	 * Persists the Subsection_Premium_Tax entity instance.
	 * 
	 * @param subsection_Premium_Tax
	 * @return
	 */
	Subsection_Premium_Tax saveSubsection_Premium_Tax(Subsection_Premium_Tax subsection_Premium_Tax);

	List<TaxCTEDao> getTaxDetails(String premiumAmountTypeCode, List<String> premiumReference);

}
