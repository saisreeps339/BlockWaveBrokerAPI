package insurwave.blockwavebrokerAPI.service;

import insurwave.blockwavebrokerAPI.domain.Contract_Section_Asset;

/**
 * Spring Boot service interface for Contract_Section_Asset related
 * functionality.
 * 
 * @author saisree
 *
 */
public interface ContractSectionAssetService {

	/**
	 * Delete by contract_Section_UUID
	 * 
	 * @param contract_Section_UUID
	 */
	void deleteByContractSection_UUID(String contract_Section_UUID);

	/**
	 * Persist (create/update) the given contractSectionAsset
	 * 
	 * @param contractSectionAsset
	 * @return
	 */
	Contract_Section_Asset saveContract_Section_Asset(Contract_Section_Asset contractSectionAsset);
}
