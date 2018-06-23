package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Premium;

/**
 * Spring Boot service interface for Contract_Subsection_Premium related
 * functionality.
 * 
 * @author saisree
 *
 */
public interface ContractSubsectionPremiumService {

	/**
	 * Persists the given Contract_Subsection_Premium entity instance.
	 * 
	 * @param contract_Subsection_Premium
	 * @return
	 */
	Contract_Subsection_Premium saveContract_Subsection_Premium(
			Contract_Subsection_Premium contract_Subsection_Premium);

	/**
	 * Fetches the given Contract_Subsection_Premium record identified by the given
	 * contract_Subsection_Premium_Reference.
	 * 
	 * @param contract_Subsection_Premium_Reference
	 * @return
	 */
	Contract_Subsection_Premium getContract_Subsection_Premium(String contract_Subsection_Premium_Reference);

	/**
	 * Gets all the Contract_Subsection_Premium records
	 * 
	 * @return
	 */
	List<Contract_Subsection_Premium> getContract_Subsection_Premiums();

}
