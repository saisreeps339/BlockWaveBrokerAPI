package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {

	@JsonProperty("Contract_Section_Asset_Reference")
	public String contract_Section_Asset_Reference;

	@JsonProperty("Asset_Reference")
	public String asset_Reference;

	@JsonProperty("Activation_Datetime")
	public String activation_Datetime;

	@JsonProperty("Created_By")
	public String created_By;

	@JsonProperty("Created_Datetime")
	public String created_Datetime;

	@JsonProperty("Asset_State")
	public String asset_State;

	@JsonProperty("Fleet_Number")
	public String fleet_Number;

	@JsonProperty("Vessel_Name")
	public String vessel_Name;

	@JsonProperty("Vessel_Type")
	public String vessel_Type;

	@JsonProperty("Ownership_Status")
	public String ownership_Status;

	@JsonProperty("Activity_Status")
	public String activity_Status;

	@JsonProperty("IMO_Number")
	public String iMO_Number;

	@JsonProperty("Port_Of_Registry")
	public String port_Of_Registry;

	@JsonProperty("Capacity")
	public String capacity;

	@JsonProperty("Capacity_Unit")
	public String capacity_Unit;

	@JsonProperty("Dead_Weight_Tonnage")
	public String dead_Weight_Tonnage;

	@JsonProperty("Gross_Tonnage")
	public String gross_Tonnage;

	@JsonProperty("IMO_Type")
	public String iMO_Type;

	@JsonProperty("Commercial_Manager")
	public String commercial_Manager;

	@JsonProperty("Crew_Manager")
	public String crew_Manager;

	@JsonProperty("Trading_Area")
	public String trading_Area;

	@JsonProperty("Operating_Company_Reference")
	public String operating_Company_Reference;

	@JsonProperty("Date_Built")
	public String date_Built;

	@JsonProperty("Mortgaged")
	public String mortgaged;

	@JsonProperty("Mortgagee")
	public String mortgagee;

	@JsonProperty("Net_Tonnage")
	public String net_Tonnage;

	@JsonProperty("Light_Weight_Tonnage")
	public String light_Weight_Tonnage;

	@JsonProperty("3rd_Party_Managers")
	public String third_Party_Managers;

	@JsonProperty("3rd_Party_Manager_Name")
	public String third_Party_Manager_Name;

	@JsonProperty("Flag")
	public String flag;

	@JsonProperty("Laid_Up_At_Inception")
	public String laid_Up_At_Inception;

	@JsonProperty("Lay_Up_Location")
	public String lay_Up_Location;

	@JsonProperty("Ownership")
	public Ownership ownership[];

	@JsonProperty("Status")
	public String status;

	@JsonProperty("Classification_Status_Code")
	public String classification_Status_Code;

	@JsonProperty("Comments")
	public String comments;

	@JsonProperty("Vessel_Active_Reason")
	public String vessel_Active_Reason;

	@JsonProperty("Classification_Status_Reason_Code")
	public String classification_Status_Reason_Code;

	@JsonProperty("Classification_Society_Code")
	public String classification_Society_Code;

	@JsonProperty("Classification_Survey_Date")
	public String classification_Survey_Date;

	@JsonProperty("Next_Classification_Survey_Date")
	public String next_Classification_Survey_Date;

	@JsonProperty("Classification_Status_Effective_Date")
	public String classification_Status_Effective_Date;

	@JsonProperty("Increased_Value")
	public String increased_Value;

	@JsonProperty("Version_Number")
	public String version_Number;

	@JsonProperty("Effective_Date")
	public String effective_Date;

	@JsonProperty("Business_Unit_Reference")
	public String business_Unit_Reference;

	@JsonProperty("Is_Part_Of_Joint_Venture")
	public String is_Part_Of_Joint_Venture;

	@JsonProperty("Is_Chartered")
	public String is_Chartered;

	@JsonProperty("Is_Vessel_Active")
	public String is_Vessel_Active;

	@JsonProperty("Hull_Value")
	public String hull_Value;

	@JsonProperty("Insured_Value")
	public String insured_Value;

	@JsonProperty("Legal_Entity_Friendly_Name")
	public String legal_Entity_Friendly_Name;

	@JsonProperty("selected")
	public String selected;

	@JsonCreator
	public Asset() {

	}
}
