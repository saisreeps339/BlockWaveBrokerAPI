package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProgramsectionDetail {
	@JsonProperty("Contract_Section_Reference")
	public String contract_Section_Reference;
	@JsonProperty("Contract_Section_Name")
	public String contract_Section_Name;
	@JsonProperty("Legal_Entity_Reference")
	public String legal_Entity_Reference;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;
	@JsonProperty("Assets")
	public Asset assets[];
	@JsonProperty("Subsections")
	public Subsection subsections[];

	@JsonCreator
	public ProgramsectionDetail() {

	}

}
