package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumAmountDeduction extends SubsectionPremiumAmount {

	@JsonProperty("Subsection_Premium_Deduction")
	public SubsectionPremiumDeduction subsection_Premium_Deduction[];

	@JsonCreator
	public SubsectionPremiumAmountDeduction() {

	}

}
