package insurwave.blockwavebrokerAPI.dao;

import java.math.BigDecimal;

public class MasterAmountTypesDao {

	private int sno;
	private String amountTypeCode;
	private BigDecimal amount;

	public MasterAmountTypesDao() {

	}

	public MasterAmountTypesDao(int sno, String amountTypeCode, BigDecimal amount) {
		this.sno = sno;
		this.amountTypeCode = amountTypeCode;
		this.amount = amount;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getAmountTypeCode() {
		return amountTypeCode;
	}

	public void setAmountTypeCode(String amountTypeCode) {
		this.amountTypeCode = amountTypeCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
