package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

public class SubsectionPremiumAmountDao {

	private BigDecimal premium_Amount;

	public SubsectionPremiumAmountDao(BigDecimal premium_Amount) {
		this.premium_Amount = premium_Amount;
	}

	public BigDecimal getPremium_Amount() {
		return premium_Amount;
	}

	public void setPremium_Amount(BigDecimal premium_Amount) {
		this.premium_Amount = premium_Amount;
	}

}
