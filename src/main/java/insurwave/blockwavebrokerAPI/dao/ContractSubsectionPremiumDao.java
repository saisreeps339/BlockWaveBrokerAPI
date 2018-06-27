package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

public class ContractSubsectionPremiumDao {

	
	private String contract_Subsection_Premium_Reference;

	private BigDecimal premiumAmount;

	public ContractSubsectionPremiumDao(String contract_Subsection_Premium_Reference, BigDecimal premiumAmount) {
		this.contract_Subsection_Premium_Reference = contract_Subsection_Premium_Reference;
		this.premiumAmount = premiumAmount;

	}

	public String getContract_Subsection_Premium_Reference() {
		return contract_Subsection_Premium_Reference;
	}

	public void setContract_Subsection_Premium_Reference(String contract_Subsection_Premium_Reference) {
		this.contract_Subsection_Premium_Reference = contract_Subsection_Premium_Reference;
	}
	
	public BigDecimal getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
