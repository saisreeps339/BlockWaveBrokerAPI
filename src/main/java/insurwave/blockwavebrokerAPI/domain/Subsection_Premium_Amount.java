package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Subsection_Premium_Amount database table.
 * 
 */
@Entity
@Table(name = "Subsection_Premium_Amount")
@NamedQuery(name = "Subsection_Premium_Amount.findAll", query = "SELECT s FROM Subsection_Premium_Amount s")
public class Subsection_Premium_Amount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Subsection_Premium_Amount_Reference", unique = true, nullable = false, length = 1)
	private String subsection_Premium_Amount_Reference;

	@Column(name = "Premium_Amount", nullable = false, precision = 18, scale = 2)
	private BigDecimal premium_Amount;

	@Column(name = "Premium_Amount_Type_Code", nullable = false)
	private String premium_Amount_Type_Code;

	@Column(name = "Subsection_Premium_Reference", nullable = false, length = 1)
	private String subsection_Premium_Reference;

	private String UI_Premium_Amount_Type_Code;

	public Subsection_Premium_Amount() {
	}

	public String getSubsection_Premium_Amount_Reference() {
		return this.subsection_Premium_Amount_Reference;
	}

	public void setSubsection_Premium_Amount_Reference(String subsection_Premium_Amount_Reference) {
		this.subsection_Premium_Amount_Reference = subsection_Premium_Amount_Reference;
	}

	public BigDecimal getPremium_Amount() {
		return this.premium_Amount;
	}

	public void setPremium_Amount(BigDecimal premium_Amount) {
		this.premium_Amount = premium_Amount;
	}

	public String getPremium_Amount_Type_Code() {
		return this.premium_Amount_Type_Code;
	}

	public void setPremium_Amount_Type_Code(String premium_Amount_Type_Code) {
		this.premium_Amount_Type_Code = premium_Amount_Type_Code;
	}

	public String getSubsection_Premium_Reference() {
		return this.subsection_Premium_Reference;
	}

	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

	public String getUI_Premium_Amount_Type_Code() {
		return this.UI_Premium_Amount_Type_Code;
	}

	public void setUI_Premium_Amount_Type_Code(String UI_Premium_Amount_Type_Code) {
		this.UI_Premium_Amount_Type_Code = UI_Premium_Amount_Type_Code;
	}

}