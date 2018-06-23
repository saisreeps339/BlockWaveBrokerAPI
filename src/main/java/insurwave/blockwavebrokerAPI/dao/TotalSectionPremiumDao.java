package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

/**
 * POJO to hold TotalSectionPremium query results.
 * 
 * @author sachin.kotagiri
 *
 */
public class TotalSectionPremiumDao {

	private String contract_Section_UUID;
	private BigDecimal subsection_Premium_Amount;

	/**
	 * Non-default constructor.
	 * 
	 * @param contract_Section_UUID
	 * @param subsection_Premium_Amount
	 */
	public TotalSectionPremiumDao(String contract_Section_UUID, BigDecimal subsection_Premium_Amount) {
		this.contract_Section_UUID = contract_Section_UUID;
		this.subsection_Premium_Amount = subsection_Premium_Amount;
	}

	/**
	 * @return the contract_Section_UUID
	 */
	public String getContract_Section_UUID() {
		return contract_Section_UUID;
	}

	/**
	 * @param contract_Section_UUID
	 *            the contract_Section_UUID to set
	 */
	public void setContract_Section_UUID(String contract_Section_UUID) {
		this.contract_Section_UUID = contract_Section_UUID;
	}

	/**
	 * @return the subsection_Premium_Amount
	 */
	public BigDecimal getSubsection_Premium_Amount() {
		return subsection_Premium_Amount;
	}

	/**
	 * @param subsection_Premium_Amount
	 *            the subsection_Premium_Amount to set
	 */
	public void setSubsection_Premium_Amount(BigDecimal subsection_Premium_Amount) {
		this.subsection_Premium_Amount = subsection_Premium_Amount;
	}

}
