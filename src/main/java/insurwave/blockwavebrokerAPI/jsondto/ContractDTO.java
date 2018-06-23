package insurwave.blockwavebrokerAPI.jsondto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

//testing purpose only
@Getter
@Setter
public final class ContractDTO {

	@JsonProperty("Contract_UUID")
	private String contract_UUID;

	@JsonProperty("Accounting_Basis_UUID")
	private String accounting_Basis_UUID;

	@JsonProperty("Advisor_Identity_Reference")
	private String advisor_Identity_Reference;

	@JsonProperty("Advisor_Legal_Entity_Code")
	private String advisor_Legal_Entity_Code;

	@JsonProperty("Busines_Channel_UUID")
	private String busines_Channel_UUID;

	@JsonProperty("Buyer_Brokerage_Amount")
	private BigDecimal buyer_Brokerage_Amount;

	@JsonProperty("Buyer_Brokerage_Basis_UUID")
	private String buyer_Brokerage_Basis_UUID;

	@JsonProperty("Buyer_Brokerage_Percentage")
	private BigDecimal buyer_Brokerage_Percentage;

	@JsonProperty("Buyer_Identity_Reference")
	private String buyer_Identity_Reference;

	@JsonProperty("Buyer_Legal_Entity_Reference")
	private String buyer_Legal_Entity_Reference;

	@JsonProperty("Cancellation_Notice_Periods")
	private Integer cancellation_Notice_Periods;

	@JsonProperty("Contract_Currency_UUID")
	private String contract_Currency_UUID;

	@JsonProperty("Contract_Name")
	private String contract_Name;

	@JsonProperty("Contract_Period_Scope_UUID")
	private String contract_Period_Scope_UUID;

	@JsonProperty("Contract_Reference")
	private String contract_Reference;

	@JsonProperty("Contract_Term")
	private Integer contract_Term;

	@JsonProperty("Contract_Type_UUID")
	private String contract_Type_UUID;

	@JsonProperty("Created_By")
	private String created_By;

	@JsonProperty("Created_Datetime")
	private Timestamp created_Datetime;

	@JsonProperty("Expiry_Date")
	private Timestamp expiry_Date;

	@JsonProperty("Inception_Date")
	private Timestamp inception_Date;

	@JsonProperty("Notice_Period_Type_UUID")
	private String notice_Period_Type_UUID;

	@JsonProperty("Program_Subscription_UUID")
	private String program_Subscription_UUID;

	@JsonProperty("Section_Breakdown_UUID")
	private String section_Breakdown_UUID;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Total_Deductions")
	private BigDecimal total_Deductions;

	@JsonProperty("Total_Premium_Due")
	private BigDecimal total_Premium_Due;

	@JsonProperty("Total_Settlement_Amount_Due")
	private BigDecimal total_Settlement_Amount_Due;

	@JsonProperty("Unique_Market_Reference")
	private String unique_Market_Reference;

	@JsonProperty("Updated_By")
	private String updated_By;

	@JsonProperty("Updated_Datetime")
	private Timestamp updated_Datetime;

	@JsonProperty("Valuation_Basis_UUID")
	private String valuation_Basis_UUID;

	@JsonProperty("Version_Number")
	private Integer version_Number;

	@JsonCreator
	public ContractDTO() {

	}

}