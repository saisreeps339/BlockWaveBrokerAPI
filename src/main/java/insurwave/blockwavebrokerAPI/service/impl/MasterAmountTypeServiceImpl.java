package insurwave.blockwavebrokerAPI.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.comparator.MasterAmountTypesComparator;
import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;
import insurwave.blockwavebrokerAPI.repository.MasterAmountTypeRepository;
import insurwave.blockwavebrokerAPI.service.MasterAmountTypeService;

@Service
public class MasterAmountTypeServiceImpl implements MasterAmountTypeService {
	
	@Autowired
	private MasterAmountTypeRepository masterAmountTypeRepository;

	@Override
	public List<MasterAmountTypesDao> getMasterAmountFor(String premiumAmountTypeCode) {
		return masterAmountTypeRepository.getMasterAmountFor(premiumAmountTypeCode);
	}


	@Override
	public BigDecimal getAmountValue(String subsection_Premium_Reference,
			List<Subsection_Premium_Amount> subsectionPremiumAmounts, List<MasterAmountTypesDao> masterAmountDaos) {

		BigDecimal amount = BigDecimal.ZERO;
		List<MasterAmountTypesDao> masterAmountTypesDaoAddedValues = new ArrayList<>();
		for (Subsection_Premium_Amount subsectionPremiumAmount : subsectionPremiumAmounts) {
			for (MasterAmountTypesDao masterAmountTypesDao : masterAmountDaos) {

				if (subsectionPremiumAmount.getPremium_Amount_Type_Code()
						.equals(masterAmountTypesDao.getAmountTypeCode())
						&& subsectionPremiumAmount.getSubsection_Premium_Reference()
								.equals(subsection_Premium_Reference)) {
					masterAmountTypesDao.setAmount(subsectionPremiumAmount.getPremium_Amount());
					masterAmountTypesDaoAddedValues.add(new MasterAmountTypesDao(masterAmountTypesDao.getSno(),
							masterAmountTypesDao.getAmountTypeCode(), masterAmountTypesDao.getAmount()));
				}
			}
		}

		Collections.sort(masterAmountTypesDaoAddedValues, new MasterAmountTypesComparator());

		for (MasterAmountTypesDao m1 : masterAmountTypesDaoAddedValues) {

			if (m1.getAmount().compareTo(BigDecimal.ZERO) > 0)
				amount = masterAmountTypesDaoAddedValues.get(0).getAmount();
		}
		return amount;

	}

}
