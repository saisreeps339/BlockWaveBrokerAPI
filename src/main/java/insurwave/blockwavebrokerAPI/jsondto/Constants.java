package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Constants {
	@JsonProperty("Premium")
	public String premium;
	@JsonProperty("Brokerage")
	public String brokerage;
	@JsonProperty("Brokerage")
	public String lineNetPremiumBuyer;
	@JsonProperty("Brokerage")
	public String buyerToAdvisor;
	@JsonProperty("Brokerage")
	public String advisorToSeller;

	@JsonCreator
	public Constants() {

	}
}
