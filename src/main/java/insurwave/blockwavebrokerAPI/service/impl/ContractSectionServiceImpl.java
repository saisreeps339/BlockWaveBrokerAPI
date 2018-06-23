package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.dao.TotalSectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.repository.ContractSectionRepository;
import insurwave.blockwavebrokerAPI.service.ContractSectionService;

@Service
public class ContractSectionServiceImpl implements ContractSectionService {
	private ContractSectionRepository contractSectionRepository;

	@Autowired
	public ContractSectionServiceImpl(ContractSectionRepository contractSectionRepository) {
		this.contractSectionRepository = contractSectionRepository;
	}

	@Override
	public Contract_Section getContract_Section(String contract_Section_UUID) {
		return contractSectionRepository.getOne(contract_Section_UUID);
	}

	@Override
	public List<Contract_Section> getContract_Sections_By_Contract_UUID(String contract_UUID) {
		return contractSectionRepository.findByContract_UUID(contract_UUID);
	}

	@Override
	public List<Contract_Section> getContract_Sections() {
		List<Contract_Section> contractSections = new ArrayList<Contract_Section>();
		try {
			Iterable<Contract_Section> contractSectionsIter = contractSectionRepository.findAll();
			contractSectionsIter.forEach(contractSection -> contractSections.add(contractSection));
		} catch (Exception e) {
			throw new BrokerAPIException("Error retrieving contract sections::" + e.getMessage());
		}
		return contractSections;
	}

	@Override
	public Contract_Section saveContract_Section(Contract_Section contractSection) {
		return contractSectionRepository.save(contractSection);
	}

	@Override
	public void deleteContract_Section_ByContract_UUID(String contract_UUID) {
		contractSectionRepository.deleteByContract_UUID(contract_UUID);

	}

	@Override
	public List<Contract_Section> saveContract_Sections(List<Contract_Section> contractSections) {
		return contractSectionRepository.saveAll(contractSections);
	}

	@Override
	public List<TotalSectionPremiumDao> getTotalContractSectionPremiumByContractSectionUUID(
			String contract_Section_UUID) {
		return contractSectionRepository.getTotalContractSectionPremiumByContractSectionUUID(contract_Section_UUID);
	}

	@Override
	public void setSectionPremiumAmount(TotalSectionPremiumDao totalSectionPremiumDao) {
		contractSectionRepository.setSectionPremiumAmount(totalSectionPremiumDao.getSubsection_Premium_Amount(),
				totalSectionPremiumDao.getContract_Section_UUID());
	}

	@Override
	public void setSectionPremiumAmounts(List<TotalSectionPremiumDao> totalSectionPremiumDaos) {
		if (totalSectionPremiumDaos != null && !totalSectionPremiumDaos.isEmpty()) {
			for (TotalSectionPremiumDao totalSectionPremiumDao : totalSectionPremiumDaos) {
				setSectionPremiumAmount(totalSectionPremiumDao);
			}
		}
	}

}
