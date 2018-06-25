package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao;
import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;

public interface AllPremiumReferenceService {

	List<AllPremiumReferenceDao> allPremiumReferences(List<String> uuids);

	void deletePremiumRef(List<AllPremiumReferenceDao> allPremiumRef);

	List<ContractSubsectionPremiumDao> getContractSubsectionPrem(List<AllPremiumReferenceDao> allPremiumRef);

}
