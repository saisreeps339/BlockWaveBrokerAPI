package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.TotalSectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;

/**
 * Spring Boot service interface for Contract_Section related functionality.
 * 
 * @author saisree, sachin.kotagiri
 *
 */
public interface ContractSectionService {

	/**
	 * Persists the given Contract_Section
	 * 
	 * @param contractSection
	 * @return
	 */
	Contract_Section saveContract_Section(Contract_Section contractSection);

	/**
	 * Persists the given Contract_Sections
	 * 
	 * @param contractSections
	 * @return
	 */
	List<Contract_Section> saveContract_Sections(List<Contract_Section> contractSections);

	/**
	 * Gets the Contract_section record identified by the given
	 * contract_Section_UUID
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	Contract_Section getContract_Section(String contract_Section_UUID);

	/**
	 * Get all Contract_Section records
	 * 
	 * @return
	 */
	List<Contract_Section> getContract_Sections();

	/**
	 * Delete Contract_Section records having the given contract_UUID
	 * 
	 * @param contract_UUID
	 */
	void deleteContract_Section_ByContract_UUID(String contract_UUID);

	/**
	 * Gets the Contract_section records identified by the given contract_UUID
	 * 
	 * @param contract_UUID
	 * @return
	 */
	List<Contract_Section> getContract_Sections_By_Contract_UUID(String contract_UUID);

	/**
	 * Get the Total Contract Section premiums for the given contract_Section_UUID.
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	List<TotalSectionPremiumDao> getTotalContractSectionPremiumByContractSectionUUID(String contract_Section_UUID);

	/**
	 * Update the Contract Section total premium.
	 * 
	 * @param totalSectionPremiumDao
	 */
	void setSectionPremiumAmount(TotalSectionPremiumDao totalSectionPremiumDao);

	/**
	 * Update the Contract Section total premiums.
	 * 
	 * @param totalSectionPremiumDaos
	 */
	void setSectionPremiumAmounts(List<TotalSectionPremiumDao> totalSectionPremiumDaos);

}
