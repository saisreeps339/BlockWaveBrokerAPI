package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentsDetail {

	@JsonProperty("InstallmentNumber")
	public long installmentNumber;
	@JsonProperty("PremiumInstallmentDate")
	public String premiumInstallmentDate;
	@JsonProperty("PremiumInstallmentAmount")
	public long premiumInstallmentAmount;
	@JsonProperty("PremiumInstallmentPercentage")
	public long premiumInstallmentPercentage;

	@JsonCreator
	public PaymentsDetail() {
	}
}
