package insurwave.blockwavebrokerAPI.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;
import insurwave.blockwavebrokerAPI.repository.SubsectionPremiumAmountRepository;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumAmountService;

@Service
public class SubsectionPremiumAmountServiceImpl implements SubsectionPremiumAmountService {

	/*
	 * @PersistenceContext private EntityManager em;
	 */

	@Autowired
	private SubsectionPremiumAmountRepository subsectionPremiumAmountRepository;

	@Override
	public List<Subsection_Premium_Amount> findAll() {

		return subsectionPremiumAmountRepository.findAll();
	}

	/*
	 * @Override
	 * 
	 * @Transactional(dontRollbackOn = Exception.class) public void
	 * saveSubsectionPremiumAmount(List<Subsection_Premium_Amount>
	 * subsection_Premium_AmountList) {
	 * 
	 * int batchSize =subsection_Premium_AmountList.size(); int i=0; for
	 * (Subsection_Premium_Amount subsection_Premium_Amount :
	 * subsection_Premium_AmountList) { em.merge(subsection_Premium_Amount); i++; if
	 * (i % batchSize == 0) { // Flush a batch of inserts and release memory.
	 * em.flush(); em.clear(); } } }
	 */

	@Override
	@Transactional(rollbackOn = Exception.class)
	public void saveSubsectionPremiumAmount(List<Subsection_Premium_Amount> subsection_Premium_AmountList) {
		subsectionPremiumAmountRepository.saveAll(subsection_Premium_AmountList);
	}

	public void update(Subsection_Premium_Amount subsection_Premium_Amount) {

		subsectionPremiumAmountRepository.updateSubsectionRefrence(subsection_Premium_Amount.getPremium_Amount(),
				subsection_Premium_Amount.getUI_Premium_Amount_Type_Code(),
				subsection_Premium_Amount.getSubsection_Premium_Reference());
	}

	@Override
	public void saveSubsectionPremiumAmount(Subsection_Premium_Amount subsection_Premium_Amount) {
		subsectionPremiumAmountRepository.save(subsection_Premium_Amount);
	}

}
