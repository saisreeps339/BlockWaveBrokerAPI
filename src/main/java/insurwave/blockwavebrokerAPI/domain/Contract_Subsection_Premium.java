package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the Contract_Subsection_Premium database table.
 * 
 */
@Entity
@Table(name = "Contract_Subsection_Premium")
@NamedQuery(name = "Contract_Subsection_Premium.findAll", query = "SELECT c FROM Contract_Subsection_Premium c")
public class Contract_Subsection_Premium implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "Contract_Subsection_Premium_Reference", unique = true, nullable = false, length = 1)
	private String contract_Subsection_Premium_Reference;

	@Column(name = "Asset_Reference", length = 255)
	private String asset_Reference;

	@Column(name = "Asset_Scope_Code", length = 255)
	private String asset_Scope_Code;

	@Column(name = "Contract_Subsection_UUID", nullable = false, length = 1)
	private String contract_Subsection_UUID;

	@Column(name = "Count")
	private int count;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Flag")
	private String flag;

	@Column(name = "Fleet_Type_Code")
	private String fleet_Type_Code;

	@Column(name = "Premium_Amount", precision = 18, scale = 2)
	private BigDecimal premium_Amount;

	@Column(name = "Premium_Calculation_Asset_Basis_Code", length = 255)
	private String premium_Calculation_Asset_Basis_Code;

	@Column(name = "Premium_Calculation_Basis_Code")
	private String premium_Calculation_Basis_Code;

	@Column(name = "Premium_Calculation_Type_Code")
	private String premium_Calculation_Type_Code;

	@Column(name = "Premium_Name")
	private String premium_Name;

	@Column(name = "Premium_Position")
	private int premium_Position;

	@Column(name = "Premium_Rate", precision = 18, scale = 8)
	private BigDecimal premium_Rate;

	@Column(name = "Updated_By", length = 255)
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	public Contract_Subsection_Premium() {
	}

	public String getContract_Subsection_Premium_Reference() {
		return this.contract_Subsection_Premium_Reference;
	}

	public void setContract_Subsection_Premium_Reference(String contract_Subsection_Premium_Reference) {
		this.contract_Subsection_Premium_Reference = contract_Subsection_Premium_Reference;
	}

	public String getAsset_Reference() {
		return this.asset_Reference;
	}

	public void setAsset_Reference(String asset_Reference) {
		this.asset_Reference = asset_Reference;
	}

	public String getAsset_Scope_Code() {
		return this.asset_Scope_Code;
	}

	public void setAsset_Scope_Code(String asset_Scope_Code) {
		this.asset_Scope_Code = asset_Scope_Code;
	}

	public String getContract_Subsection_UUID() {
		return this.contract_Subsection_UUID;
	}

	public void setContract_Subsection_UUID(String contract_Subsection_UUID) {
		this.contract_Subsection_UUID = contract_Subsection_UUID;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCreated_By() {
		return this.created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	public Timestamp getCreated_Datetime() {
		return this.created_Datetime;
	}

	public void setCreated_Datetime(Timestamp created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFleet_Type_Code() {
		return this.fleet_Type_Code;
	}

	public void setFleet_Type_Code(String fleet_Type_Code) {
		this.fleet_Type_Code = fleet_Type_Code;
	}

	public BigDecimal getPremium_Amount() {
		return this.premium_Amount;
	}

	public void setPremium_Amount(BigDecimal premium_Amount) {
		this.premium_Amount = premium_Amount;
	}

	public String getPremium_Calculation_Asset_Basis_Code() {
		return this.premium_Calculation_Asset_Basis_Code;
	}

	public void setPremium_Calculation_Asset_Basis_Code(String premium_Calculation_Asset_Basis_Code) {
		this.premium_Calculation_Asset_Basis_Code = premium_Calculation_Asset_Basis_Code;
	}

	public String getPremium_Calculation_Basis_Code() {
		return this.premium_Calculation_Basis_Code;
	}

	public void setPremium_Calculation_Basis_Code(String premium_Calculation_Basis_Code) {
		this.premium_Calculation_Basis_Code = premium_Calculation_Basis_Code;
	}

	public String getPremium_Calculation_Type_Code() {
		return this.premium_Calculation_Type_Code;
	}

	public void setPremium_Calculation_Type_Code(String premium_Calculation_Type_Code) {
		this.premium_Calculation_Type_Code = premium_Calculation_Type_Code;
	}

	public String getPremium_Name() {
		return this.premium_Name;
	}

	public void setPremium_Name(String premium_Name) {
		this.premium_Name = premium_Name;
	}

	public int getPremium_Position() {
		return this.premium_Position;
	}

	public void setPremium_Position(int premium_Position) {
		this.premium_Position = premium_Position;
	}

	public BigDecimal getPremium_Rate() {
		return this.premium_Rate;
	}

	public void setPremium_Rate(BigDecimal premium_Rate) {
		this.premium_Rate = premium_Rate;
	}

	public String getUpdated_By() {
		return this.updated_By;
	}

	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	public Timestamp getUpdated_Datetime() {
		return this.updated_Datetime;
	}

	public void setUpdated_Datetime(Timestamp updated_Datetime) {
		this.updated_Datetime = updated_Datetime;
	}

}