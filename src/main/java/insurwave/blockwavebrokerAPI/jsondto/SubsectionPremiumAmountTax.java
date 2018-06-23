package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumAmountTax extends SubsectionPremiumAmount {

	@JsonProperty("Subsection_Premium_Tax")
	public SubsectionPremiumTax subsection_Premium_Tax[];

	@JsonCreator
	public SubsectionPremiumAmountTax() {
	}

}
