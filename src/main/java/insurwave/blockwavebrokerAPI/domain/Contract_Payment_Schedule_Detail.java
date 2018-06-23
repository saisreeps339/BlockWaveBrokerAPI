package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the Contract_Payment_Schedule_Detail database table.
 * 
 */
@Entity
@Table(name = "Contract_Payment_Schedule_Detail")
@NamedQuery(name = "Contract_Payment_Schedule_Detail.findAll", query = "SELECT c FROM Contract_Payment_Schedule_Detail c")
public class Contract_Payment_Schedule_Detail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contract_Payment_Schedule_Detail_UUID", unique = true, nullable = false, length = 1)
	private String contract_Payment_Schedule_Detail_UUID;

	@Column(name = "Created_By")
	private String created_By;

	@Column(name = "Created_Datetime")
	private Timestamp created_Datetime;

	@Column(name = "Premium_Installment_Amount", precision = 18, scale = 2)
	private BigDecimal premium_Installment_Amount;

	@Column(name = "Premium_Installment_Date")
	private Timestamp premium_Installment_Date;

	@Column(name = "Premium_Installment_Name")
	private String premium_Installment_Name;

	@Column(name = "Premium_Installment_Number")
	private int premium_Installment_Number;

	@Column(name = "Premium_Installment_Percentage", precision = 18, scale = 8)
	private BigDecimal premium_Installment_Percentage;

	@Column(name = "Updated_By")
	private String updated_By;

	@Column(name = "Updated_Datetime")
	private Timestamp updated_Datetime;

	// bi-directional many-to-one association to Contract_Payment_Schedule
	@ManyToOne
	@JoinColumn(name = "Contract_Payment_Schedule_UUID", nullable = false)
	private Contract_Payment_Schedule contractPaymentSchedule;

	public Contract_Payment_Schedule_Detail() {
	}

	public String getContract_Payment_Schedule_Detail_UUID() {
		return this.contract_Payment_Schedule_Detail_UUID;
	}

	public void setContract_Payment_Schedule_Detail_UUID(String contract_Payment_Schedule_Detail_UUID) {
		this.contract_Payment_Schedule_Detail_UUID = contract_Payment_Schedule_Detail_UUID;
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

	public BigDecimal getPremium_Installment_Amount() {
		return this.premium_Installment_Amount;
	}

	public void setPremium_Installment_Amount(BigDecimal premium_Installment_Amount) {
		this.premium_Installment_Amount = premium_Installment_Amount;
	}

	public Timestamp getPremium_Installment_Date() {
		return this.premium_Installment_Date;
	}

	public void setPremium_Installment_Date(Timestamp premium_Installment_Date) {
		this.premium_Installment_Date = premium_Installment_Date;
	}

	public String getPremium_Installment_Name() {
		return this.premium_Installment_Name;
	}

	public void setPremium_Installment_Name(String premium_Installment_Name) {
		this.premium_Installment_Name = premium_Installment_Name;
	}

	public int getPremium_Installment_Number() {
		return this.premium_Installment_Number;
	}

	public void setPremium_Installment_Number(int premium_Installment_Number) {
		this.premium_Installment_Number = premium_Installment_Number;
	}

	public BigDecimal getPremium_Installment_Percentage() {
		return this.premium_Installment_Percentage;
	}

	public void setPremium_Installment_Percentage(BigDecimal premium_Installment_Percentage) {
		this.premium_Installment_Percentage = premium_Installment_Percentage;
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

	public Contract_Payment_Schedule getContractPaymentSchedule() {
		return this.contractPaymentSchedule;
	}

	public void setContractPaymentSchedule(Contract_Payment_Schedule contractPaymentSchedule) {
		this.contractPaymentSchedule = contractPaymentSchedule;
	}

}