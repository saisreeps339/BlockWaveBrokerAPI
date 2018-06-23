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
 * The persistent class for the Subsection_Premium_Deduction database table.
 * 
 */
@Entity
@Table(name = "Subsection_Premium_Deduction")
@NamedQuery(name = "Subsection_Premium_Deduction.findAll", query = "SELECT s FROM Subsection_Premium_Deduction s")
public class Subsection_Premium_Deduction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Subsection_Premium_Deduction_Reference", unique = true, nullable = false, length = 1)
	private String subsection_Premium_Deduction_Reference;

	@Column(name = "Deduction_Amount", nullable = false, precision = 18, scale = 2)
	private BigDecimal deduction_Amount;

	@Column(name = "Deduction_Calculation_Type_Code")
	private String deduction_Calculation_Type_Code;

	@Column(name = "Deduction_Name", nullable = false)
	private String deduction_Name;

	@Column(name = "Deduction_Position", nullable = false)
	private int deduction_Position;

	@Column(name = "Deduction_Premium_Amount_Type_Code", nullable = false)
	private String deduction_Premium_Amount_Type_Code;

	@Column(name = "Deduction_Rate", nullable = false, precision = 18, scale = 8)
	private BigDecimal deduction_Rate;

	@Column(name = "Deduction_Type_Code", nullable = false)
	private String deduction_Type_Code;

	@Column(name = "Subsection_Premium_Reference", nullable = false, length = 1)
	private String subsection_Premium_Reference;

	public Subsection_Premium_Deduction() {
	}

	public String getSubsection_Premium_Deduction_Reference() {
		return this.subsection_Premium_Deduction_Reference;
	}

	public void setSubsection_Premium_Deduction_Reference(String subsection_Premium_Deduction_Reference) {
		this.subsection_Premium_Deduction_Reference = subsection_Premium_Deduction_Reference;
	}

	public BigDecimal getDeduction_Amount() {
		return this.deduction_Amount;
	}

	public void setDeduction_Amount(BigDecimal deduction_Amount) {
		this.deduction_Amount = deduction_Amount;
	}

	public String getDeduction_Calculation_Type_Code() {
		return this.deduction_Calculation_Type_Code;
	}

	public void setDeduction_Calculation_Type_Code(String deduction_Calculation_Type_Code) {
		this.deduction_Calculation_Type_Code = deduction_Calculation_Type_Code;
	}

	public String getDeduction_Name() {
		return this.deduction_Name;
	}

	public void setDeduction_Name(String deduction_Name) {
		this.deduction_Name = deduction_Name;
	}

	public int getDeduction_Position() {
		return this.deduction_Position;
	}

	public void setDeduction_Position(int deduction_Position) {
		this.deduction_Position = deduction_Position;
	}

	public String getDeduction_Premium_Amount_Type_Code() {
		return this.deduction_Premium_Amount_Type_Code;
	}

	public void setDeduction_Premium_Amount_Type_Code(String deduction_Premium_Amount_Type_Code) {
		this.deduction_Premium_Amount_Type_Code = deduction_Premium_Amount_Type_Code;
	}

	public BigDecimal getDeduction_Rate() {
		return this.deduction_Rate;
	}

	public void setDeduction_Rate(BigDecimal deduction_Rate) {
		this.deduction_Rate = deduction_Rate;
	}

	public String getDeduction_Type_Code() {
		return this.deduction_Type_Code;
	}

	public void setDeduction_Type_Code(String deduction_Type_Code) {
		this.deduction_Type_Code = deduction_Type_Code;
	}

	public String getSubsection_Premium_Reference() {
		return this.subsection_Premium_Reference;
	}

	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

}