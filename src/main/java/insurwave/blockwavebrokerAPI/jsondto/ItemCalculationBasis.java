package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCalculationBasis {

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
