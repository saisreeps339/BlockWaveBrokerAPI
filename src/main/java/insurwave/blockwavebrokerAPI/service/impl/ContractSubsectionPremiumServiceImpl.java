package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Premium;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.repository.ContractSubsectionPremiumRepository;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionPremiumService;

@Service
public class ContractSubsectionPremiumServiceImpl implements ContractSubsectionPremiumService {
	private ContractSubsectionPremiumRepository contractSubsectionPremiumRepository;

	@Autowired
	public ContractSubsectionPremiumServiceImpl(
			ContractSubsectionPremiumRepository contractSubsectionPremiumRepository) {
		this.contractSubsectionPremiumRepository = contractSubsectionPremiumRepository;
	}

	@Override
	public Contract_Subsection_Premium saveContract_Subsection_Premium(
			Contract_Subsection_Premium contract_Subsection_Premium) {
		return contractSubsectionPremiumRepository.save(contract_Subsection_Premium);
	}

	@Override
	public Contract_Subsection_Premium getContract_Subsection_Premium(String contract_Subsection_Premium_Reference) {
		return contractSubsectionPremiumRepository.getOne(contract_Subsection_Premium_Reference);
	}

	@Override
	public List<Contract_Subsection_Premium> getContract_Subsection_Premiums() {
		List<Contract_Subsection_Premium> contractSubsectionPremiums = new ArrayList<Contract_Subsection_Premium>();
		try {
			Iterable<Contract_Subsection_Premium> contractSubsectionPremiumIter = contractSubsectionPremiumRepository
					.findAll();
			contractSubsectionPremiumIter
					.forEach(contractSubsectionPremium -> contractSubsectionPremiums.add(contractSubsectionPremium));
		} catch (Exception e) {
			throw new BrokerAPIException("Error retrieving contract sub section Premiums::" + e.getMessage());
		}
		return contractSubsectionPremiums;
	}

}
