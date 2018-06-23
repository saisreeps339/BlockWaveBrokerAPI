package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubsectionPremiumAmount {

	@JsonProperty("Subsection_Premium_Reference")
	public String subsection_Premium_Reference;

	@JsonProperty("Subsection_Premium_Amount_Reference")
	public String subsection_Premium_Amount_Reference;

	@JsonProperty("Premium_Amount_Type_Code")
	public String premium_Amount_Type_Code;

	@JsonProperty("Premium_Amount")
	public String premium_Amount;

	@JsonProperty("DeductionGroup_Total")
	public String deductionGroup_Total;

	@JsonProperty("TaxGroup_Total")
	public String taxGroup_Total;

	@JsonProperty("UI_Premium_Amount_Type_Code")
	public String uI_Premium_Amount_Type_Code;

	@JsonProperty("IsLocal")
	public String isLocal;

	@JsonCreator
	public SubsectionPremiumAmount() {
	}

}
