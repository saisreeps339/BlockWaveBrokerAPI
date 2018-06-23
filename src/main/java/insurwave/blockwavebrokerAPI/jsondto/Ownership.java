package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ownership {

	@JsonProperty("Owner_Legal_Entity_Reference")
	public String owner_Legal_Entity_Reference;

	@JsonProperty("Holding_Ratio")
	public String holding_Ratio;

	@JsonCreator
	public Ownership() {

	}
}
