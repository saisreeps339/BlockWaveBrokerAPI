package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

/**
 * POJO to hold TotalContractPremium query results.
 * 
 * @author sachin.kotagiri
 *
 */
public class TotalContractPremiumDao {

	private String contract_UUID;
	private BigDecimal sectionPremium;

	/**
	 * Non-default constructor.
	 * 
	 * @param contract_UUID
	 * @param sectionPremium
	 */
	public TotalContractPremiumDao(String contract_UUID, BigDecimal sectionPremium) {
		this.contract_UUID = contract_UUID;
		this.sectionPremium = sectionPremium;
	}

	/**
	 * @return the contract_UUID
	 */
	public String getContract_UUID() {
		return contract_UUID;
	}

	/**
	 * @param contract_UUID
	 *            the contract_UUID to set
	 */
	public void setContract_UUID(String contract_UUID) {
		this.contract_UUID = contract_UUID;
	}

	/**
	 * @return the sectionPremium
	 */
	public BigDecimal getSectionPremium() {
		return sectionPremium;
	}

	/**
	 * @param sectionPremium
	 *            the sectionPremium to set
	 */
	public void setSectionPremium(BigDecimal sectionPremium) {
		this.sectionPremium = sectionPremium;
	}

}
