package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MasterAmountTypes database table.
 * 
 */
@Entity
@Table(name = "MasterAmountTypes")
@NamedQuery(name = "MasterAmountType.findAll", query = "SELECT m FROM MasterAmountType m")
public class MasterAmountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno", unique = true, nullable = false)
	private int sno;

	@Column(name = "Amount", precision = 18, scale = 2)
	private BigDecimal amount;

	@Column(name = "AmountTypeCode", length = 255)
	private String amountTypeCode;

	public MasterAmountType() {
	}

	public int getSno() {
		return this.sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAmountTypeCode() {
		return this.amountTypeCode;
	}

	public void setAmountTypeCode(String amountTypeCode) {
		this.amountTypeCode = amountTypeCode;
	}

}