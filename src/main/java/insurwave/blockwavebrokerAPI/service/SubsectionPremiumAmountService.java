package insurwave.blockwavebrokerAPI.service;

import java.util.List;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;

public interface SubsectionPremiumAmountService {

	List<Subsection_Premium_Amount> findAll();

	void saveSubsectionPremiumAmount(List<Subsection_Premium_Amount> subsection_Premium_AmountList);

	void update(Subsection_Premium_Amount subsection_Premium_Amount);
}
