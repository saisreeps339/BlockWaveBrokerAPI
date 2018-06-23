package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.repository.ContractRepository;
import insurwave.blockwavebrokerAPI.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {
	@Autowired
	private ContractRepository contractRepository;

	@Override
	public Contract saveContract(Contract contract) {
		return contractRepository.save(contract);

	}

	@Override
	public Contract getContract(String contract_UUID) {
		return contractRepository.getOne(contract_UUID);
	}

	@Override
	public List<Contract> getContracts() {
		List<Contract> contracts = new ArrayList<Contract>();
		try {
			Iterable<Contract> contractsIter = contractRepository.findAll();
			contractsIter.forEach(contract -> contracts.add(contract));
		} catch (Exception e) {
			throw new BrokerAPIException("Error retrieving contracts::" + e.getMessage());
		}
		return contracts;
	}

	@Override
	public List<TotalContractPremiumDao> getTotalContractPremiumByContractSectionUUID(String contract_Section_UUID) {
		return contractRepository.getTotalContractPremiumByContractSectionUUID(contract_Section_UUID);
	}

	@Override
	public void setContractPremiumAmount(TotalContractPremiumDao totalContractPremiumDao) {
		contractRepository.setContractPremiumAmount(totalContractPremiumDao.getSectionPremium(),
				totalContractPremiumDao.getContract_UUID());
	}

	@Override
	public void setContractPremiumAmounts(List<TotalContractPremiumDao> totalContractPremiumDaos) {
		if (totalContractPremiumDaos != null && !totalContractPremiumDaos.isEmpty()) {
			for (TotalContractPremiumDao totalContractPremiumDao : totalContractPremiumDaos) {
				setContractPremiumAmount(totalContractPremiumDao);
			}
		}
	}
}
