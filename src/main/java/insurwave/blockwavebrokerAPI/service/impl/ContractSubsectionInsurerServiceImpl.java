package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Insurer;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.repository.ContractSubsectionInsurerRepository;
import insurwave.blockwavebrokerAPI.service.ContractSubsectionInsurerService;

@Service
public class ContractSubsectionInsurerServiceImpl implements ContractSubsectionInsurerService {
	private ContractSubsectionInsurerRepository contractSubsectionInsurerRepository;

	@Autowired
	public ContractSubsectionInsurerServiceImpl(
			ContractSubsectionInsurerRepository contractSubsectionInsurerRepository) {
		this.contractSubsectionInsurerRepository = contractSubsectionInsurerRepository;
	}

	@Override
	public Contract_Subsection_Insurer saveContract_Subsection_Insurer(
			Contract_Subsection_Insurer contractSubsectionInsurer) {
		return contractSubsectionInsurerRepository.save(contractSubsectionInsurer);
	}

	@Override
	public Contract_Subsection_Insurer getContract_Subsection_Insurer(String contract_Subsection_Insurer_UUID) {
		return contractSubsectionInsurerRepository.getOne(contract_Subsection_Insurer_UUID);
	}

	@Override
	public List<Contract_Subsection_Insurer> getContract_Subsection_Insurers() {
		List<Contract_Subsection_Insurer> contractSubsectionInsurers = new ArrayList<Contract_Subsection_Insurer>();
		try {
			Iterable<Contract_Subsection_Insurer> contractSubsectionInsurerIter = contractSubsectionInsurerRepository
					.findAll();
			contractSubsectionInsurerIter
					.forEach(contractSubsectionInsurer -> contractSubsectionInsurers.add(contractSubsectionInsurer));
		} catch (Exception e) {
			throw new BrokerAPIException("Error retrieving contract sub section insurers::" + e.getMessage());
		}
		return contractSubsectionInsurers;
	}
}
