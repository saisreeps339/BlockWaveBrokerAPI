package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao;
import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.repository.ContractSubsectionRepository;
import insurwave.blockwavebrokerAPI.service.AllPremiumReferenceService;

@Service
public class AllPremiumReferenceServiceImpl implements AllPremiumReferenceService {

	private ContractSubsectionRepository contractSubsectionRepository;
	List<String> allPremiumRefValue = new ArrayList<>();

	@Autowired
	public AllPremiumReferenceServiceImpl(ContractSubsectionRepository contractSubsectionRepository) {
		this.contractSubsectionRepository = contractSubsectionRepository;
	}

	@Override
	public List<AllPremiumReferenceDao> allPremiumReferences(List<String> uuids) {

		return contractSubsectionRepository.allPremiumReferences(uuids);
	}

	
	@Override
	public void deletePremiumRef(List<String> allPremiumRef) {	
		contractSubsectionRepository.deletePremiumRef(allPremiumRef);
	}

	@Override
	public List<ContractSubsectionPremiumDao> getContractSubsectionPrem(List<String> allPremiumRef) {
		return contractSubsectionRepository.getContractSubsectionPrem(allPremiumRef);
	}

	@Override
	public List<String> allPremiumReferences(String uuid) {
		return contractSubsectionRepository.allPremiumReferences(uuid);
	}
}
