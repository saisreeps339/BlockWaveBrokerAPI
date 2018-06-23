package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SellerData {
	@JsonProperty("InsurerName")
	public String insurerName;
	@JsonProperty("InsurerId")
	public String insurerId;
	@JsonProperty("IdentityRef")
	public String identityRef;
	@JsonProperty("TotalPremiumDue")
	public long totalPremiumDue;
	@JsonProperty("PaymentsDetails")
	public PaymentsDetail paymentsDetails[];
	@JsonProperty("SellerBrokerage")
	public SellerBrokerage sellerBrokerage[];
	@JsonProperty("Deductions")
	public Deduction deductions[];
	@JsonProperty("Tax")
	public Tax tax[];
	@JsonProperty("BrokeragePayment")
	public BrokeragePayment brokeragePayment;
	@JsonProperty("Selected")
	public boolean selected;
	@JsonProperty("TotalSellerBrokerage")
	public long totalSellerBrokerage;
	@JsonProperty("TotalSellerDeductions")
	public long totalSellerDeductions;
	@JsonProperty("TotalTax")
	public long totalTax;
	@JsonProperty("OverAllSettlementAmount")
	public long overAllSettlementAmount;
	@JsonProperty("PremiumPayable")
	public long premiumPayable;
	@JsonProperty("Payer")
	public Payer payer;
	@JsonProperty("PaymentFrequency")
	public PaymentFrequency paymentFrequency;
	@JsonProperty("PremiumPaymentDate")
	public String premiumPaymentDate;
	@JsonProperty("PremiumPayUpfront")
	public String premiumPayUpfront;
	@JsonProperty("FinalPaymentDate")
	public String finalPaymentDate;
	@JsonProperty("PaymentFrequencyCode")
	public String paymentFrequencyCode;
	@JsonProperty("PayeeLegalEntityCode")
	public String payeeLegalEntityCode;
	@JsonProperty("PayerLegalEntityCode")
	public String payerLegalEntityCode;

	@JsonCreator
	public SellerData() {
	}

	public static final class SellerBrokerage {
		@JsonProperty("ItemNumber")
		public long itemNumber;
		@JsonProperty("ItemName")
		public String itemName;
		@JsonProperty("ItemCalculationType")
		public ItemCalculationType itemCalculationType;
		@JsonProperty("ItemCalculationBasis")
		public ItemCalculationBasis itemCalculationBasis;
		@JsonProperty("ItemRate")
		public long itemRate;
		@JsonProperty("ItemSubTotal")
		public long itemSubTotal;
		@JsonProperty("CalculationBasisList")
		public CalculationBasisList calculationBasisList[];
		@JsonProperty("ItemCalculationTypeCode")
		public String itemCalculationTypeCode;
		@JsonProperty("ItemCalculationBasisCode")
		public String itemCalculationBasisCode;

		@JsonCreator
		public SellerBrokerage() {
		}

		public static final class ItemCalculationType {

			@JsonProperty("Reference_Data_Code")
			public String reference_Data_Code;
			@JsonProperty("Reference_Data_Desc")
			public String reference_Data_Desc;
			@JsonProperty("Version_Number")
			public long version_Number;

			@JsonCreator
			public ItemCalculationType() {
			}
		}

		public static final class ItemCalculationBasis {

			@JsonProperty("Reference_Data_Code")
			public String reference_Data_Code;
			@JsonProperty("Reference_Data_Desc")
			public String reference_Data_Desc;
			@JsonProperty("Version_Number")
			public long version_Number;

			@JsonCreator
			public ItemCalculationBasis() {
			}
		}

		public static final class CalculationBasisList {
			@JsonProperty("Reference_Data_Code")
			public String reference_Data_Code;
			@JsonProperty("Reference_Data_Desc")
			public String reference_Data_Desc;
			@JsonProperty("Version_Number")
			public long version_Number;

			@JsonCreator
			public CalculationBasisList() {
			}
		}
	}

}
