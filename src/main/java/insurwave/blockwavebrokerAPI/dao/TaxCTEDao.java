package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

public class TaxCTEDao {

	private String subsection_Premium_Reference;
	private String tax_Premium_Amount_Type_Code;
	private BigDecimal tax_Amount;

	public TaxCTEDao(String subsection_Premium_Reference, String tax_Premium_Amount_Type_Code, BigDecimal tax_Amount) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
		this.tax_Premium_Amount_Type_Code = tax_Premium_Amount_Type_Code;
		this.tax_Amount = tax_Amount;
	}

	public String getSubsection_Premium_Reference() {
		return subsection_Premium_Reference;
	}

	public String getTax_Premium_Amount_Type_Code() {
		return tax_Premium_Amount_Type_Code;
	}

	public BigDecimal getTax_Amount() {
		return tax_Amount;
	}

}
