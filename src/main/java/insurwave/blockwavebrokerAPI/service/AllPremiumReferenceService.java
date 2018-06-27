package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao;
import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;

public interface AllPremiumReferenceService {

	List<AllPremiumReferenceDao> allPremiumReferences(List<String> uuids);
	
	List<String> allPremiumReferences(String uuid);

	void deletePremiumRef(List<String> allPremiumRef);

	List<ContractSubsectionPremiumDao> getContractSubsectionPrem(List<String> allPremiumRef);

}
