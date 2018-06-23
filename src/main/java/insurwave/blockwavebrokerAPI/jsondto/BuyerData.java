package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuyerData {
	@JsonProperty("BrokeragePayment")
	public BrokeragePayment brokeragePayment;
	@JsonProperty("BuyerBrokerage")
	public BuyerBrokerage buyerBrokerage[];
	@JsonProperty("Deduction")
	public Deduction deductions[];
	@JsonProperty("Tax")
	public Tax tax[];
	@JsonProperty("TotalBuyerBrokerage")
	public long totalBuyerBrokerage;
	@JsonProperty("TotalBuyerDeductions")
	public long totalBuyerDeductions;
	@JsonProperty("TotalTax")
	public long totalTax;
	@JsonProperty("OverAllSettlementAmount")
	public long overAllSettlementAmount;
	@JsonProperty("PremiumPayable")
	public long premiumPayable;
	@JsonProperty("Constants")
	public Constants constants;
	@JsonProperty("PayerIdentityRef")
	public String payerIdentityRef;
	@JsonProperty("PayeeIdentityRef")
	public String payeeIdentityRef;
	@JsonProperty("TotalPremiumDue")
	public long totalPremiumDue;
	@JsonProperty("AdvisorLegalEntity")
	public String advisorLegalEntity;
	@JsonProperty("PaymentsDetails")
	public PaymentsDetail paymentsDetails[];
	@JsonProperty("Payee")
	public Payee payee;
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
	public BuyerData() {
	}

}
