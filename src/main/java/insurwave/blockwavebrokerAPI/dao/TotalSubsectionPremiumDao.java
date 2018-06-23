package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

/**
 * POJO to hold TotalSubsectionPremium query results.
 * 
 * @author sachin.kotagiri
 *
 */
public class TotalSubsectionPremiumDao {

	private String contract_Subsection_UUID;
	private BigDecimal totalPremium;

	/**
	 * Non-default constructor.
	 * 
	 * @param contract_Subsection_UUID
	 * @param totalPremium
	 */
	public TotalSubsectionPremiumDao(String contract_Subsection_UUID, BigDecimal totalPremium) {
		this.totalPremium = totalPremium;
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	/**
	 * @return the contract_Subsection_UUID
	 */
	public String getContract_Subsection_UUID() {
		return contract_Subsection_UUID;
	}

	/**
	 * @param contract_Subsection_UUID
	 *            the contract_Subsection_UUID to set
	 */
	public void setContract_Subsection_UUID(String contract_Subsection_UUID) {
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	/**
	 * @return the totalPremium
	 */
	public BigDecimal getTotalPremium() {
		return totalPremium;
	}

	/**
	 * @param totalPremium
	 *            the totalPremium to set
	 */
	public void setTotalPremium(BigDecimal totalPremium) {
		this.totalPremium = totalPremium;
	}

}
