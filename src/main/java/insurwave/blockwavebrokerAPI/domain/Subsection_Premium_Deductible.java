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
 * The persistent class for the Subsection_Premium_Deductible database table.
 * 
 */
@Entity
@Table(name = "Subsection_Premium_Deductible")
@NamedQuery(name = "Subsection_Premium_Deductible.findAll", query = "SELECT s FROM Subsection_Premium_Deductible s")
public class Subsection_Premium_Deductible implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Subsection_Premium_Deductible_Reference", unique = true, nullable = false, length = 1)
	private String subsection_Premium_Deductible_Reference;

	@Column(name = "Deductible_Amount", nullable = false, precision = 18, scale = 2)
	private BigDecimal deductible_Amount;

	@Column(name = "Deductible_Basis_Code")
	private String deductible_Basis_Code;

	@Column(name = "Deductible_Basis_Description")
	private String deductible_Basis_Description;

	@Column(name = "Deductible_Name", nullable = false)
	private String deductible_Name;

	@Column(name = "Deductible_Position", nullable = false)
	private int deductible_Position;

	@Column(name = "Deductible_Type_Code")
	private String deductible_Type_Code;

	@Column(name = "Subsection_Premium_Reference", nullable = false, length = 1)
	private String subsection_Premium_Reference;

	public Subsection_Premium_Deductible() {
	}

	public String getSubsection_Premium_Deductible_Reference() {
		return this.subsection_Premium_Deductible_Reference;
	}

	public void setSubsection_Premium_Deductible_Reference(String subsection_Premium_Deductible_Reference) {
		this.subsection_Premium_Deductible_Reference = subsection_Premium_Deductible_Reference;
	}

	public BigDecimal getDeductible_Amount() {
		return this.deductible_Amount;
	}

	public void setDeductible_Amount(BigDecimal deductible_Amount) {
		this.deductible_Amount = deductible_Amount;
	}

	public String getDeductible_Basis_Code() {
		return this.deductible_Basis_Code;
	}

	public void setDeductible_Basis_Code(String deductible_Basis_Code) {
		this.deductible_Basis_Code = deductible_Basis_Code;
	}

	public String getDeductible_Basis_Description() {
		return this.deductible_Basis_Description;
	}

	public void setDeductible_Basis_Description(String deductible_Basis_Description) {
		this.deductible_Basis_Description = deductible_Basis_Description;
	}

	public String getDeductible_Name() {
		return this.deductible_Name;
	}

	public void setDeductible_Name(String deductible_Name) {
		this.deductible_Name = deductible_Name;
	}

	public int getDeductible_Position() {
		return this.deductible_Position;
	}

	public void setDeductible_Position(int deductible_Position) {
		this.deductible_Position = deductible_Position;
	}

	public String getDeductible_Type_Code() {
		return this.deductible_Type_Code;
	}

	public void setDeductible_Type_Code(String deductible_Type_Code) {
		this.deductible_Type_Code = deductible_Type_Code;
	}

	public String getSubsection_Premium_Reference() {
		return this.subsection_Premium_Reference;
	}

	public void setSubsection_Premium_Reference(String subsection_Premium_Reference) {
		this.subsection_Premium_Reference = subsection_Premium_Reference;
	}

}