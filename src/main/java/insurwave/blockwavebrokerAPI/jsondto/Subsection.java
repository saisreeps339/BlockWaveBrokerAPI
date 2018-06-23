package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Subsection {

	@JsonProperty("Contract_Subsection_Reference")
	public String contract_Subsection_Reference;
	@JsonProperty("Contract_Subsection_Name")
	public String contract_Subsection_Name;
	@JsonProperty("Cover_Type_Code")
	public String cover_Type_Code;
	@JsonProperty("Maximum_Insurable_Value")
	public long maximum_Insurable_Value;
	@JsonProperty("Deductible")
	public long deductible;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;

	@JsonCreator
	public Subsection() {
	}
}
