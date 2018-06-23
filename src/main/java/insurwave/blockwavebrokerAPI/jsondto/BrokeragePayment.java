package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BrokeragePayment {
	@JsonProperty("PremiumPayable")
	public long premiumPayable;
	@JsonProperty("PaymentsDetails")
	public PaymentsDetail paymentsDetails[];
	@JsonProperty("PaymentFrequencyCode")
	public String paymentFrequencyCode;
	@JsonProperty("PayeeLegalEntityCode")
	public String payeeLegalEntityCode;
	@JsonProperty("PayerLegalEntityCode")
	public String payerLegalEntityCode;
	@JsonProperty("premiumPaymentDate")
	public String premiumPaymentDate;
	@JsonProperty("FinalPaymentDate")
	public String finalPaymentDate;
	@JsonProperty("PremiumPayUpfront")
	public String premiumPayUpfront;

	@JsonCreator
	public BrokeragePayment() {

	}

}
