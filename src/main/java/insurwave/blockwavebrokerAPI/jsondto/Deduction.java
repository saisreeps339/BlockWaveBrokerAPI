package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Deduction {
	@JsonProperty("ItemNumber")
	public long itemNumber;
	@JsonProperty("ItemName")
	public String itemName;
	@JsonProperty("ItemCalculationType")
	public ItemCalculationType itemCalculationType;
	@JsonProperty("ItemCalculationBasis")
	public ItemCalculationBasis itemCalculationBasis;
	@JsonProperty("ItemRate")
	public long itemRate;
	@JsonProperty("ItemSubTotal")
	public long itemSubTotal;
	@JsonProperty("CalculationBasisList")
	public CalculationBasisList calculationBasisList[];
	@JsonProperty("ItemCalculationTypeCode")
	public String itemCalculationTypeCode;
	@JsonProperty("ItemCalculationBasisCode")
	public String itemCalculationBasisCode;

	@JsonCreator
	public Deduction() {
	}

}
