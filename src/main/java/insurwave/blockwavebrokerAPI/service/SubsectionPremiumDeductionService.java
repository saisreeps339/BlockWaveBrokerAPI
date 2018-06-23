package insurwave.blockwavebrokerAPI.service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deduction;

/**
 * Spring Boot service interface for Subsection_Premium_Deduction related
 * functionality.
 * 
 * @author saisree
 *
 */
public interface SubsectionPremiumDeductionService {

	/**
	 * Persists the given Subsection_Premium_Deduction record.
	 * 
	 * @param subsection_Premium_Deduction
	 * @return
	 */
	Subsection_Premium_Deduction saveSubsection_Premium_Deduction(
			Subsection_Premium_Deduction subsection_Premium_Deduction);

}
