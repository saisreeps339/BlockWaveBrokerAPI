package insurwave.blockwavebrokerAPI.service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deductible;

/**
 * Spring Boot service interface for Subsection_Premium_Deductible related
 * functionality.
 * 
 * @author saisree
 *
 */
public interface SubsectionPremiumDeductibleService {

	/**
	 * Persists the given Subsection_Premium_Deductible entity instance.
	 * 
	 * @param subsection_Premium_Deductible
	 * @return
	 */
	Subsection_Premium_Deductible saveSubsection_Premium_Deductible(
			Subsection_Premium_Deductible subsection_Premium_Deductible);
}
