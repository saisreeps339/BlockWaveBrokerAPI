package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;

/**
 * Spring Boot service interface for Contract_Subsection related functionality.
 * 
 * @author saisree, sachin.kotagiri
 *
 */
public interface ContractSubsectionService {

	/**
	 * Persists the given Contract_Subsection record.
	 * 
	 * @param contractSubsection
	 * @return
	 */
	public Contract_Subsection saveContract_Subsection(Contract_Subsection contractSubsection);

	/**
	 * Fetches the Contract_Subsection record identified by the given
	 * contract_Subsection_UUID.
	 * 
	 * @param contract_Subsection_UUID
	 * @return
	 */
	public Contract_Subsection getContract_Subsection(String contract_Subsection_UUID);

	/**
	 * Fetches all the Contract_Subsection records.
	 * 
	 * @return
	 */
	public List<Contract_Subsection> getContract_Subsections();

	/**
	 * Get the Total Contract Subsection premiums for the given
	 * contract_Section_UUIDs.
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	List<TotalSubsectionPremiumDao> getTotalContractSubsectionPremiumByContractSectionUUID(
			String contract_Section_UUID);

	/**
	 * Update the Contract Subsection total premium.
	 * 
	 * @param totalSubsectionPremiumDao
	 */
	void setSubsectionPremiumAmount(TotalSubsectionPremiumDao totalSubsectionPremiumDao);

	/**
	 * Update the Contract Subsection total premiums.
	 * 
	 * @param totalSubsectionPremiumDaos
	 */
	void setSubsectionPremiumAmounts(List<TotalSubsectionPremiumDao> totalSubsectionPremiumDaos);
}
