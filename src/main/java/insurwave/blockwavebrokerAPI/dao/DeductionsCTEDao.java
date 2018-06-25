package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

public class DeductionsCTEDao {

	private String subsection_Premium_Reference;
	private String deduction_Premium_Amount_Type_Code;
	private BigDecimal deduction_Amount;

	public DeductionsCTEDao(String subsection_Premium_Reference, String deduction_Premium_Amount_Type_Code,
			BigDecimal deduction_Amount) {

		this.subsection_Premium_Reference = subsection_Premium_Reference;
		this.deduction_Premium_Amount_Type_Code = deduction_Premium_Amount_Type_Code;
		this.deduction_Amount = deduction_Amount;
	}

	public String getSubsection_Premium_Reference() {
		return subsection_Premium_Reference;
	}

	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

	public String getDeduction_Premium_Amount_Type_Code() {
		return deduction_Premium_Amount_Type_Code;
	}

	public void setDeduction_Premium_Amount_Type_Code(String deduction_Premium_Amount_Type_Code) {
		this.deduction_Premium_Amount_Type_Code = deduction_Premium_Amount_Type_Code;
	}

	public BigDecimal getDeduction_Amount() {
		return deduction_Amount;
	}

	public void setDeduction_Amount(BigDecimal deduction_Amount) {
		this.deduction_Amount = deduction_Amount;
	}

}
