package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Payee {

	@JsonProperty("LegalEntityUUID")
	public String legalEntityUUID;
	@JsonProperty("PayeeName")
	public String payeeName;

	@JsonCreator
	public Payee() {
	}
}
