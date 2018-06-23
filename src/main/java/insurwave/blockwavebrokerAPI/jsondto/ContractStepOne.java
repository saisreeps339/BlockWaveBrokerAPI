package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractStepOne {

	@JsonProperty("Version_Number")
	public String version_Number;

	@JsonProperty("Total_Deductions")
	public String total_Deductions;

	@JsonProperty("Total_Premium_Due")
	public String total_Premium_Due;

	@JsonProperty("Cancellation_Notice_Periods")
	public String cancellation_Notice_Periods;

	@JsonProperty("Buyer_Brokerage_Amount")
	public String buyer_Brokerage_Amount;

	@JsonProperty("Buyer_Brokerage_Basis_UUID")
	public String buyer_Brokerage_Basis_UUID;

	@JsonProperty("Buyer_Brokerage_Percentage")
	public String buyer_Brokerage_Percentage;

	@JsonProperty("ContractUUIDDisplays")
	public String contractUUIDDisplays;

	@JsonProperty("ContractUUIDDisplay")
	public String contractUUIDDisplay;

	@JsonProperty("ContractUUIDdefault")
	public String contractUUIDdefault;

	@JsonProperty("ProgramData")
	private ProgramData[] programData;

	@JsonProperty("Legal_EntitynameL1")
	private String[] legal_EntitynameL1;

	@JsonProperty("ProgramDataDetails")
	private ProgramDataDetail[] programDataDetails;

	@JsonProperty("ProgramsectionDetail")
	private ProgramsectionDetail[] programsectionDetail;

	@JsonProperty("ContractUUIDDisplayedit")
	public String contractUUIDDisplayedit;

	@JsonProperty("Program_Subscription_UUID")
	private String program_Subscription_UUID;

	@JsonProperty("UniqueMarketRefId")
	private String unique_Market_Reference;

	@JsonProperty("ContractorType")
	private String contract_Type_UUID;

	@JsonProperty("ContractName")
	private String contract_Name;

	@JsonProperty("ContractorPeriod")
	private String contract_Period_Scope_UUID;

	@JsonProperty("businesschannel")
	private String busines_Channel_UUID;

	@JsonProperty("BasisValuation")
	private String valuation_Basis_UUID;

	@JsonProperty("ContractCurrency")
	private String contract_Currency_UUID;

	@JsonProperty("AccountingBasis")
	private String accounting_Basis_UUID;

	@JsonProperty("BreakdownSelection")
	private String section_Breakdown_UUID;

	@JsonProperty("Jurisdiction")
	private String jurisdiction;

	@JsonProperty("Inception_Date")
	private String inception_Date;

	@JsonProperty("Expiry_Date")
	private String expiry_Date;

	@JsonProperty("Contract_Term")
	private Long contract_Term;

	@JsonProperty("legalEntityDisplay")
	private Long legalEntityDisplay;

	@JsonProperty("Contract_Reference")
	private String contract_Reference;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Created_By")
	private String created_By;

	@JsonProperty("Created_Datetime")
	private String created_Datetime;

	@JsonProperty("Updated_By")
	private String updated_By;

	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;

	@JsonProperty("Buyer_Identity_Reference")
	private String buyer_Identity_Reference;

	@JsonProperty("Buyer_Legal_Entity_Reference")
	private String buyer_Legal_Entity_Reference;

	@JsonProperty("Advisor_Identity_Reference")
	private String advisor_Identity_Reference;

	@JsonProperty("AdvisorLegalEntityCode")
	private String advisor_Legal_Entity_Code;

	@JsonProperty("Notice_Period_Type_Code")
	private String notice_Period_Type_UUID;

	@JsonProperty("Total_Settlement_Amount_Due")
	private String total_Settlement_Amount_Due;

	@JsonCreator
	private ContractStepOne() {

	}

	/**
	 * @return the contractUUIDDisplays
	 */
	public String getContractUUIDDisplays() {
		return contractUUIDDisplays;
	}

	/**
	 * @param contractUUIDDisplays
	 *            the contractUUIDDisplays to set
	 */
	public void setContractUUIDDisplays(String contractUUIDDisplays) {
		this.contractUUIDDisplays = contractUUIDDisplays;
	}

	/**
	 * @return the contractUUIDDisplay
	 */
	public String getContractUUIDDisplay() {
		return contractUUIDDisplay;
	}

	/**
	 * @param contractUUIDDisplay
	 *            the contractUUIDDisplay to set
	 */
	public void setContractUUIDDisplay(String contractUUIDDisplay) {
		this.contractUUIDDisplay = contractUUIDDisplay;
	}

	/**
	 * @return the contractUUIDdefault
	 */
	public String getContractUUIDdefault() {
		return contractUUIDdefault;
	}

	/**
	 * @param contractUUIDdefault
	 *            the contractUUIDdefault to set
	 */
	public void setContractUUIDdefault(String contractUUIDdefault) {
		this.contractUUIDdefault = contractUUIDdefault;
	}

	/**
	 * @return the programData
	 */
	public ProgramData[] getProgramData() {
		return programData;
	}

	/**
	 * @param programData
	 *            the programData to set
	 */
	public void setProgramData(ProgramData[] programData) {
		this.programData = programData;
	}

	/**
	 * @return the legal_EntitynameL1
	 */
	public String[] getLegal_EntitynameL1() {
		return legal_EntitynameL1;
	}

	/**
	 * @param legal_EntitynameL1
	 *            the legal_EntitynameL1 to set
	 */
	public void setLegal_EntitynameL1(String[] legal_EntitynameL1) {
		this.legal_EntitynameL1 = legal_EntitynameL1;
	}

	/**
	 * @return the programDataDetails
	 */
	public ProgramDataDetail[] getProgramDataDetails() {
		return programDataDetails;
	}

	/**
	 * @param programDataDetails
	 *            the programDataDetails to set
	 */
	public void setProgramDataDetails(ProgramDataDetail[] programDataDetails) {
		this.programDataDetails = programDataDetails;
	}

	/**
	 * @return the programsectionDetail
	 */
	public ProgramsectionDetail[] getProgramsectionDetail() {
		return programsectionDetail;
	}

	/**
	 * @param programsectionDetail
	 *            the programsectionDetail to set
	 */
	public void setProgramsectionDetail(ProgramsectionDetail[] programsectionDetail) {
		this.programsectionDetail = programsectionDetail;
	}

	/**
	 * @return the contractUUIDDisplayedit
	 */
	public String getContractUUIDDisplayedit() {
		return contractUUIDDisplayedit;
	}

	/**
	 * @param contractUUIDDisplayedit
	 *            the contractUUIDDisplayedit to set
	 */
	public void setContractUUIDDisplayedit(String contractUUIDDisplayedit) {
		this.contractUUIDDisplayedit = contractUUIDDisplayedit;
	}

	/**
	 * @return the program_Subscription_UUID
	 */
	public String getProgram_Subscription_UUID() {
		return program_Subscription_UUID;
	}

	/**
	 * @param program_Subscription_UUID
	 *            the program_Subscription_UUID to set
	 */
	public void setProgram_Subscription_UUID(String program_Subscription_UUID) {
		this.program_Subscription_UUID = program_Subscription_UUID;
	}

	/**
	 * @return the uniqueMarketRefId
	 */
	public String getUnique_Market_Reference() {
		return unique_Market_Reference;
	}

	/**
	 * @param uniqueMarketRefId
	 *            the uniqueMarketRefId to set
	 */
	public void setUnique_Market_Reference(String uniqueMarketRefId) {
		this.unique_Market_Reference = uniqueMarketRefId;
	}

	/**
	 * @return the contractorType
	 */
	public String getContract_Type_UUID() {
		return contract_Type_UUID;
	}

	/**
	 * @param contractorType
	 *            the contractorType to set
	 */
	public void setContract_Type_UUID(String contractorType) {
		this.contract_Type_UUID = contractorType;
	}

	/**
	 * @return the contractName
	 */
	public String getContract_Name() {
		return contract_Name;
	}

	/**
	 * @param contractName
	 *            the contractName to set
	 */
	public void setContract_Name(String contractName) {
		this.contract_Name = contractName;
	}

	/**
	 * @return the contractorPeriod
	 */
	public String getContract_Period_Scope_UUID() {
		return contract_Period_Scope_UUID;
	}

	/**
	 * @param contractorPeriod
	 *            the contractorPeriod to set
	 */
	public void setContract_Period_Scope_UUID(String contractorPeriod) {
		this.contract_Period_Scope_UUID = contractorPeriod;
	}

	/**
	 * @return the businesschannel
	 */
	public String getBusines_Channel_UUID() {
		return busines_Channel_UUID;
	}

	/**
	 * @param businesschannel
	 *            the businesschannel to set
	 */
	public void setBusines_Channel_UUID(String businesschannel) {
		this.busines_Channel_UUID = businesschannel;
	}

	/**
	 * @return the contractCurrency
	 */
	public String getContract_Currency_UUID() {
		return contract_Currency_UUID;
	}

	/**
	 * @param contractCurrency
	 *            the contractCurrency to set
	 */
	public void setContract_Currency_UUID(String contractCurrency) {
		this.contract_Currency_UUID = contractCurrency;
	}

	/**
	 * @return the accountingBasis
	 */
	public String getAccounting_Basis_UUID() {
		return accounting_Basis_UUID;
	}

	/**
	 * @param accountingBasis
	 *            the accountingBasis to set
	 */
	public void setAccounting_Basis_UUID(String accountingBasis) {
		this.accounting_Basis_UUID = accountingBasis;
	}

	/**
	 * @return the breakdownSelection
	 */
	public String getSection_Breakdown_UUID() {
		return section_Breakdown_UUID;
	}

	/**
	 * @param breakdownSelection
	 *            the breakdownSelection to set
	 */
	public void setSection_Breakdown_UUID(String breakdownSelection) {
		this.section_Breakdown_UUID = breakdownSelection;
	}

	/**
	 * @return the jurisdiction
	 */
	public String getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * @param jurisdiction
	 *            the jurisdiction to set
	 */
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	/**
	 * @return the inception_Date
	 */
	public String getInception_Date() {
		return inception_Date;
	}

	/**
	 * @param inception_Date
	 *            the inception_Date to set
	 */
	public void setInception_Date(String inception_Date) {
		this.inception_Date = inception_Date;
	}

	/**
	 * @return the expiry_Date
	 */
	public String getExpiry_Date() {
		return expiry_Date;
	}

	/**
	 * @param expiry_Date
	 *            the expiry_Date to set
	 */
	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	/**
	 * @return the contract_Term
	 */
	public Long getContract_Term() {
		return contract_Term;
	}

	/**
	 * @param contract_Term
	 *            the contract_Term to set
	 */
	public void setContract_Term(Long contract_Term) {
		this.contract_Term = contract_Term;
	}

	/**
	 * @return the legalEntityDisplay
	 */
	public Long getLegalEntityDisplay() {
		return legalEntityDisplay;
	}

	/**
	 * @param legalEntityDisplay
	 *            the legalEntityDisplay to set
	 */
	public void setLegalEntityDisplay(Long legalEntityDisplay) {
		this.legalEntityDisplay = legalEntityDisplay;
	}

	/**
	 * @return the contract_Reference
	 */
	public String getContract_Reference() {
		return contract_Reference;
	}

	/**
	 * @param contract_Reference
	 *            the contract_Reference to set
	 */
	public void setContract_Reference(String contract_Reference) {
		this.contract_Reference = contract_Reference;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the created_By
	 */
	public String getCreated_By() {
		return created_By;
	}

	/**
	 * @param created_By
	 *            the created_By to set
	 */
	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	/**
	 * @return the created_Datetime
	 */
	public String getCreated_Datetime() {
		return created_Datetime;
	}

	/**
	 * @param created_Datetime
	 *            the created_Datetime to set
	 */
	public void setCreated_Datetime(String created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return updated_By;
	}

	/**
	 * @param updated_By
	 *            the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	/**
	 * @return the buyer_Identity_Reference
	 */
	public String getBuyer_Identity_Reference() {
		return buyer_Identity_Reference;
	}

	/**
	 * @param buyer_Identity_Reference
	 *            the buyer_Identity_Reference to set
	 */
	public void setBuyer_Identity_Reference(String buyer_Identity_Reference) {
		this.buyer_Identity_Reference = buyer_Identity_Reference;
	}

	/**
	 * @return the buyer_Legal_Entity_Reference
	 */
	public String getBuyer_Legal_Entity_Reference() {
		return buyer_Legal_Entity_Reference;
	}

	/**
	 * @param buyer_Legal_Entity_Reference
	 *            the buyer_Legal_Entity_Reference to set
	 */
	public void setBuyer_Legal_Entity_Reference(String buyer_Legal_Entity_Reference) {
		this.buyer_Legal_Entity_Reference = buyer_Legal_Entity_Reference;
	}

	/**
	 * @return the advisor_Identity_Reference
	 */
	public String getAdvisor_Identity_Reference() {
		return advisor_Identity_Reference;
	}

	/**
	 * @param advisor_Identity_Reference
	 *            the advisor_Identity_Reference to set
	 */
	public void setAdvisor_Identity_Reference(String advisor_Identity_Reference) {
		this.advisor_Identity_Reference = advisor_Identity_Reference;
	}

	/**
	 * @return the advisorLegalEntityCode
	 */
	public String getAdvisor_Legal_Entity_Code() {
		return advisor_Legal_Entity_Code;
	}

	/**
	 * @param advisorLegalEntityCode
	 *            the advisorLegalEntityCode to set
	 */
	public void setAdvisor_Legal_Entity_Code(String advisorLegalEntityCode) {
		this.advisor_Legal_Entity_Code = advisorLegalEntityCode;
	}

	/**
	 * @return the total_Settlement_Amount_Due
	 */
	public String getTotal_Settlement_Amount_Due() {
		return total_Settlement_Amount_Due;
	}

	/**
	 * @param total_Settlement_Amount_Due
	 *            the total_Settlement_Amount_Due to set
	 */
	public void setTotal_Settlement_Amount_Due(String total_Settlement_Amount_Due) {
		this.total_Settlement_Amount_Due = total_Settlement_Amount_Due;
	}

	/**
	 * @return the notice_Period_Type_UUID
	 */
	public String getNotice_Period_Type_UUID() {
		return notice_Period_Type_UUID;
	}

	/**
	 * @param notice_Period_Type_UUID
	 *            the notice_Period_Type_UUID to set
	 */
	public void setNotice_Period_Type_UUID(String notice_Period_Type_UUID) {
		this.notice_Period_Type_UUID = notice_Period_Type_UUID;
	}

	/**
	 * @return the valuation_Basis_UUID
	 */
	public String getValuation_Basis_UUID() {
		return valuation_Basis_UUID;
	}

	/**
	 * @param valuation_Basis_UUID
	 *            the valuation_Basis_UUID to set
	 */
	public void setValuation_Basis_UUID(String valuation_Basis_UUID) {
		this.valuation_Basis_UUID = valuation_Basis_UUID;
	}

	/**
	 * @return the buyer_Brokerage_Amount
	 */
	public String getBuyer_Brokerage_Amount() {
		return buyer_Brokerage_Amount;
	}

	/**
	 * @param buyer_Brokerage_Amount
	 *            the buyer_Brokerage_Amount to set
	 */
	public void setBuyer_Brokerage_Amount(String buyer_Brokerage_Amount) {
		this.buyer_Brokerage_Amount = buyer_Brokerage_Amount;
	}

	/**
	 * @return the buyer_Brokerage_Basis_UUID
	 */
	public String getBuyer_Brokerage_Basis_UUID() {
		return buyer_Brokerage_Basis_UUID;
	}

	/**
	 * @param buyer_Brokerage_Basis_UUID
	 *            the buyer_Brokerage_Basis_UUID to set
	 */
	public void setBuyer_Brokerage_Basis_UUID(String buyer_Brokerage_Basis_UUID) {
		this.buyer_Brokerage_Basis_UUID = buyer_Brokerage_Basis_UUID;
	}

	/**
	 * @return the buyer_Brokerage_Percentage
	 */
	public String getBuyer_Brokerage_Percentage() {
		return buyer_Brokerage_Percentage;
	}

	/**
	 * @param buyer_Brokerage_Percentage
	 *            the buyer_Brokerage_Percentage to set
	 */
	public void setBuyer_Brokerage_Percentage(String buyer_Brokerage_Percentage) {
		this.buyer_Brokerage_Percentage = buyer_Brokerage_Percentage;
	}

	/**
	 * @return the cancellation_Notice_Periods
	 */
	public String getCancellation_Notice_Periods() {
		return cancellation_Notice_Periods;
	}

	/**
	 * @param cancellation_Notice_Periods
	 *            the cancellation_Notice_Periods to set
	 */
	public void setCancellation_Notice_Periods(String cancellation_Notice_Periods) {
		this.cancellation_Notice_Periods = cancellation_Notice_Periods;
	}

	/**
	 * @return the version_Number
	 */
	public String getVersion_Number() {
		return version_Number;
	}

	/**
	 * @param version_Number
	 *            the version_Number to set
	 */
	public void setVersion_Number(String version_Number) {
		this.version_Number = version_Number;
	}

	/**
	 * @return the total_Deductions
	 */
	public String getTotal_Deductions() {
		return total_Deductions;
	}

	/**
	 * @param total_Deductions
	 *            the total_Deductions to set
	 */
	public void setTotal_Deductions(String total_Deductions) {
		this.total_Deductions = total_Deductions;
	}

	/**
	 * @return the total_Premium_Due
	 */
	public String getTotal_Premium_Due() {
		return total_Premium_Due;
	}

	/**
	 * @param total_Premium_Due
	 *            the total_Premium_Due to set
	 */
	public void setTotal_Premium_Due(String total_Premium_Due) {
		this.total_Premium_Due = total_Premium_Due;
	}

	/**
	 * @return the updated_Datetime
	 */
	public String getUpdated_Datetime() {
		return updated_Datetime;
	}

	/**
	 * @param updated_Datetime
	 *            the updated_Datetime to set
	 */
	public void setUpdated_Datetime(String updated_Datetime) {
		this.updated_Datetime = updated_Datetime;
	}

}