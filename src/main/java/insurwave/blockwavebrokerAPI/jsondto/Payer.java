package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Payer {

	@JsonProperty("LegalEntityUUID")
	public String legalEntityUUID;
	@JsonProperty("PayerName")
	public String payerName;

	@JsonCreator
	public Payer() {

	}
}
