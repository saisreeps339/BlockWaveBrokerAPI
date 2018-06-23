package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract;

/**
 * Spring Boot service interface for Contract related functionality.
 * 
 * @author saisree, sachin.kotagiri
 *
 */
public interface ContractService {

	/**
	 * Persists the given Contract entity instance
	 * 
	 * @param contract
	 * @return
	 */
	public Contract saveContract(Contract contract);

	/**
	 * Fetches the Contract record identified by the given contract_UUID
	 * 
	 * @param contract_UUID
	 * @return
	 */
	public Contract getContract(String contract_UUID);

	/**
	 * Fetches all the Contract records
	 * 
	 * @return
	 */
	public List<Contract> getContracts();

	/**
	 * Get the Total Contract premiums for the given contract_Section_UUID.
	 * 
	 * @param contract_Section_UUID
	 * @return
	 */
	List<TotalContractPremiumDao> getTotalContractPremiumByContractSectionUUID(String contract_Section_UUID);

	/**
	 * Set Premium amount on contract.
	 * 
	 * @param TotalContractPremiumDao
	 */
	public void setContractPremiumAmount(TotalContractPremiumDao totalContractPremiumDao);

	/**
	 * Set Premium amounts on contract.
	 * 
	 * @param TotalContractPremiumDaos
	 */
	public void setContractPremiumAmounts(List<TotalContractPremiumDao> totalContractPremiumDaos);

}
