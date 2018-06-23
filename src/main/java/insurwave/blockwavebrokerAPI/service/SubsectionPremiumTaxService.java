package insurwave.blockwavebrokerAPI.service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;

/**
 * Spring Boot service interface for Subsection_Premium_Tax related
 * functionality.
 * 
 * @author saisree
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

}
