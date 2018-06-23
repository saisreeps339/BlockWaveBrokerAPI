package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractStepThree {
	@JsonProperty("ContractUUID")
	public String contractUUID;
	@JsonProperty("CreatedBy")
	public String createdBy;
	@JsonProperty("BuyerData")
	public BuyerData buyerData;
	@JsonProperty("SellerData")
	public SellerData sellerData[];

	@JsonCreator
	public ContractStepThree() {

	}

}
