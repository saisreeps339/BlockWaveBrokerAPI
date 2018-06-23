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
 * The persistent class for the Subsection_Premium_Tax database table.
 * 
 */
@Entity
@Table(name = "Subsection_Premium_Tax")
@NamedQuery(name = "Subsection_Premium_Tax.findAll", query = "SELECT s FROM Subsection_Premium_Tax s")
public class Subsection_Premium_Tax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Subsection_Premium_Tax_Reference", unique = true, nullable = false, length = 1)
	private String subsection_Premium_Tax_Reference;

	@Column(name = "Subsection_Premium_Reference", nullable = false, length = 1)
	private String subsection_Premium_Reference;

	@Column(name = "Tax_Amount", nullable = false, precision = 18, scale = 2)
	private BigDecimal tax_Amount;

	@Column(name = "Tax_Authority_Jurisdiction_Code", length = 255)
	private String tax_Authority_Jurisdiction_Code;

	@Column(name = "Tax_Calculation_Type_Code", nullable = false)
	private String tax_Calculation_Type_Code;

	@Column(name = "Tax_Level_Code", nullable = false)
	private String tax_Level_Code;

	@Column(name = "Tax_Name")
	private String tax_Name;

	@Column(name = "Tax_Payer_Role_Code")
	private String tax_Payer_Role_Code;

	@Column(name = "Tax_Position", nullable = false)
	private int tax_Position;

	@Column(name = "Tax_Premium_Amount_Type_Code", nullable = false, length = 255)
	private String tax_Premium_Amount_Type_Code;

	@Column(name = "Tax_Rate", nullable = false, precision = 18, scale = 8)
	private BigDecimal tax_Rate;

	@Column(name = "Tax_Type_Code", nullable = false)
	private String tax_Type_Code;

	public Subsection_Premium_Tax() {
	}

	public String getSubsection_Premium_Tax_Reference() {
		return this.subsection_Premium_Tax_Reference;
	}

	public void setSubsection_Premium_Tax_Reference(String subsection_Premium_Tax_Reference) {
		this.subsection_Premium_Tax_Reference = subsection_Premium_Tax_Reference;
	}

	public String getSubsection_Premium_Reference() {
		return this.subsection_Premium_Reference;
	}

	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

	public BigDecimal getTax_Amount() {
		return this.tax_Amount;
	}

	public void setTax_Amount(BigDecimal tax_Amount) {
		this.tax_Amount = tax_Amount;
	}

	public String getTax_Authority_Jurisdiction_Code() {
		return this.tax_Authority_Jurisdiction_Code;
	}

	public void setTax_Authority_Jurisdiction_Code(String tax_Authority_Jurisdiction_Code) {
		this.tax_Authority_Jurisdiction_Code = tax_Authority_Jurisdiction_Code;
	}

	public String getTax_Calculation_Type_Code() {
		return this.tax_Calculation_Type_Code;
	}

	public void setTax_Calculation_Type_Code(String tax_Calculation_Type_Code) {
		this.tax_Calculation_Type_Code = tax_Calculation_Type_Code;
	}

	public String getTax_Level_Code() {
		return this.tax_Level_Code;
	}

	public void setTax_Level_Code(String tax_Level_Code) {
		this.tax_Level_Code = tax_Level_Code;
	}

	public String getTax_Name() {
		return this.tax_Name;
	}

	public void setTax_Name(String tax_Name) {
		this.tax_Name = tax_Name;
	}

	public String getTax_Payer_Role_Code() {
		return this.tax_Payer_Role_Code;
	}

	public void setTax_Payer_Role_Code(String tax_Payer_Role_Code) {
		this.tax_Payer_Role_Code = tax_Payer_Role_Code;
	}

	public int getTax_Position() {
		return this.tax_Position;
	}

	public void setTax_Position(int tax_Position) {
		this.tax_Position = tax_Position;
	}

	public String getTax_Premium_Amount_Type_Code() {
		return this.tax_Premium_Amount_Type_Code;
	}

	public void setTax_Premium_Amount_Type_Code(String tax_Premium_Amount_Type_Code) {
		this.tax_Premium_Amount_Type_Code = tax_Premium_Amount_Type_Code;
	}

	public BigDecimal getTax_Rate() {
		return this.tax_Rate;
	}

	public void setTax_Rate(BigDecimal tax_Rate) {
		this.tax_Rate = tax_Rate;
	}

	public String getTax_Type_Code() {
		return this.tax_Type_Code;
	}

	public void setTax_Type_Code(String tax_Type_Code) {
		this.tax_Type_Code = tax_Type_Code;
	}

}