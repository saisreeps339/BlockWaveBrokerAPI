package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Insurer;

/**
 * Spring Boot service interface for Contract_Subsection_Insurer related
 * functionality.
 * 
 * @author saisree
 *
 */
public interface ContractSubsectionInsurerService {

	/**
	 * Persists the given Contract_Subsection_Insurer record
	 * 
	 * @param contractSubsectionInsurer
	 * @return
	 */
	Contract_Subsection_Insurer saveContract_Subsection_Insurer(Contract_Subsection_Insurer contractSubsectionInsurer);

	/**
	 * Gets the Contract_Subsection_Insurer record identified by the given
	 * contract_Subsection_Insurer_UUID.
	 * 
	 * @param contract_Subsection_Insurer_UUID
	 * @return
	 */
	Contract_Subsection_Insurer getContract_Subsection_Insurer(String contract_Subsection_Insurer_UUID);

	/**
	 * Gets the Contract_Subsection_Insurer records
	 * 
	 * @return
	 */
	List<Contract_Subsection_Insurer> getContract_Subsection_Insurers();

}
