package insurwave.blockwavebrokerAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Contract_Section_Asset;
import insurwave.blockwavebrokerAPI.repository.ContractSectionAssetRepository;
import insurwave.blockwavebrokerAPI.service.ContractSectionAssetService;

@Service
public class ContractSectionAssetServiceImpl implements ContractSectionAssetService {

	private ContractSectionAssetRepository contractSectionAssetRepository;

	@Autowired
	public ContractSectionAssetServiceImpl(ContractSectionAssetRepository contractSectionAssetRepository) {
		this.contractSectionAssetRepository = contractSectionAssetRepository;
	}

	@Override
	public void deleteByContractSection_UUID(String contract_Section_UUID) {
		contractSectionAssetRepository.deleteByContractSection_UUID(contract_Section_UUID);
	}

	@Override
	public Contract_Section_Asset saveContract_Section_Asset(Contract_Section_Asset contractSectionAsset) {
		return contractSectionAssetRepository.save(contractSectionAsset);
	}

}
