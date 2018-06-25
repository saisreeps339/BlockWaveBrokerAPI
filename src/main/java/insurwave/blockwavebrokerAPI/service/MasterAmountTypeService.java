package insurwave.blockwavebrokerAPI.service;

import java.math.BigDecimal;
import java.util.List;

import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;

public interface MasterAmountTypeService {

	List<MasterAmountTypesDao> getMasterAmountFor(String premiumAmountTypeCode);

	BigDecimal getAmountValue(String subsection_Premium_Reference,
			List<Subsection_Premium_Amount> subsectionPremiumAmounts, List<MasterAmountTypesDao> masterAmountTypesDaos);

}
