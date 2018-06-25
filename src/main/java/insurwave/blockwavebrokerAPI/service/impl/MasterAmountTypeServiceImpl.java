package insurwave.blockwavebrokerAPI.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.comparator.MasterAmountTypesComparator;
import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;
import insurwave.blockwavebrokerAPI.repository.MasterAmountTypeRepository;
import insurwave.blockwavebrokerAPI.service.MasterAmountTypeService;

@Service
public class MasterAmountTypeServiceImpl implements MasterAmountTypeService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MasterAmountTypeRepository masterAmountTypeRepository;

	@Override
	public List<MasterAmountTypesDao> getMasterAmountFor(String premiumAmountTypeCode) {
		return masterAmountTypeRepository.getMasterAmountFor(premiumAmountTypeCode);
	}


	@Override
	public BigDecimal getAmountValue(String subsection_Premium_Reference,
			List<Subsection_Premium_Amount> subsectionPremiumAmounts, List<MasterAmountTypesDao> masterAmountDaos) {

		BigDecimal amount = null;
		List<MasterAmountTypesDao> masterAmountTypesDaoAddedValues = new ArrayList<>();

		log.info(
				" -----Step 5 populate MasterAmountTypesDao for premiumamount user defined table after updating with Premium_Amount from function GetPremiumAmountForAmountType  -----------");

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

		log.info(" -----Step 6 Sort  masterAmountTypesDao by Des order od sNo -----------");

		Collections.sort(masterAmountTypesDaoAddedValues, new MasterAmountTypesComparator());

		for (MasterAmountTypesDao m1 : masterAmountTypesDaoAddedValues) {

			if (m1.getAmount().compareTo(BigDecimal.ZERO) > 0)
				amount = masterAmountTypesDaoAddedValues.get(0).getAmount();
		}
		log.info(" -----Step 7 return Top Amount value from function GetPremiumAmountForAmountType -----------");
		return amount;

	}

}
