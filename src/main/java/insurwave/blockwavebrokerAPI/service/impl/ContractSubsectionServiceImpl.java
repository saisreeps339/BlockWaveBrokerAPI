package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.repository.ContractSubsectionRepository;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionService;

@Service
public class ContractSubsectionServiceImpl implements ContractSubsectionService {

	private ContractSubsectionRepository contractSubsectionRepository;

	@Autowired
	public ContractSubsectionServiceImpl(ContractSubsectionRepository contractSubsectionRepository) {
		this.contractSubsectionRepository = contractSubsectionRepository;
	}

	@Override
	public Contract_Subsection saveContract_Subsection(Contract_Subsection contractSubsection) {
		return contractSubsectionRepository.save(contractSubsection);
	}

	@Override
	public Contract_Subsection getContract_Subsection(String contract_Subsection_UUID) {
		return contractSubsectionRepository.getOne(contract_Subsection_UUID);
	}

	@Override
	public List<Contract_Subsection> getContract_Subsections() {
		List<Contract_Subsection> contractSubsections = new ArrayList<Contract_Subsection>();
		try {
			Iterable<Contract_Subsection> contractSubsectionsIter = contractSubsectionRepository.findAll();
			contractSubsectionsIter.forEach(contractSubsection -> contractSubsections.add(contractSubsection));
		} catch (Exception e) {
			throw new BrokerAPIException("Error retrieving contract sub sections::" + e.getMessage());
		}
		return contractSubsections;
	}

	@Override
	public List<TotalSubsectionPremiumDao> getTotalContractSubsectionPremiumByContractSectionUUID(
			String contract_Section_UUID) {
		return contractSubsectionRepository
				.getTotalContractSubsectionPremiumByContractSectionUUID(contract_Section_UUID);
	}

	@Override
	public void setSubsectionPremiumAmount(TotalSubsectionPremiumDao totalSubsectionPremiumDao) {
		contractSubsectionRepository.setSubsectionPremiumAmount(totalSubsectionPremiumDao.getTotalPremium(),
				totalSubsectionPremiumDao.getContract_Subsection_UUID());
	}

	@Override
	public void setSubsectionPremiumAmounts(List<TotalSubsectionPremiumDao> totalSubsectionPremiumDaos) {
		if (totalSubsectionPremiumDaos != null && !totalSubsectionPremiumDaos.isEmpty()) {
			for (TotalSubsectionPremiumDao totalSubsectionPremiumDao : totalSubsectionPremiumDaos) {
				setSubsectionPremiumAmount(totalSubsectionPremiumDao);
			}
		}
	}

}
