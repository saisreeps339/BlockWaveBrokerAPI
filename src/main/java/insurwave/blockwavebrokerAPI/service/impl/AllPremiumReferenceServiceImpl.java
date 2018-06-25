package insurwave.blockwavebrokerAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public void deletePremiumRef(List<AllPremiumReferenceDao> allPremiumRef) {
		for (AllPremiumReferenceDao obj : allPremiumRef) {
			allPremiumRefValue.add(obj.getContract_Subsection_Premium_Reference());
		}
		contractSubsectionRepository.deletePremiumRef(allPremiumRefValue);
	}

	@Override
	public List<ContractSubsectionPremiumDao> getContractSubsectionPrem(List<AllPremiumReferenceDao> allPremiumRef) {
		return contractSubsectionRepository.getContractSubsectionPrem(allPremiumRefValue);
	}
}
