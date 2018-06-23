package insurwave.blockwavebrokerAPI.jsondto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Vessel extends Asset {

	@JsonProperty("Asset_Reference")
	public String asset_UUID;
	@JsonProperty("Version_Number")
	public long version_Number;
	@JsonProperty("Status")
	public String status;
	@JsonProperty("Created_By")
	public String created_By;
	@JsonProperty("Created_Datetime")
	public String created_Datetime;
	@JsonProperty("Updated_By")
	public String updated_By;
	@JsonProperty("Updated_Datetime")
	public String updated_Datetime;

	@JsonProperty("Activation_Datetime")
	public String activation_Datetime;

	@JsonProperty("Deactivation_Datetime")
	public String deactivation_Datetime;

	@JsonCreator
	public Vessel() {

	}

	/**
	 * @return the asset_Reference
	 */
	public String getAsset_UUID() {
		return asset_UUID;
	}

	/**
	 * @param asset_Reference
	 *            the asset_Reference to set
	 */
	public void setAsset_UUID(String asset_Reference) {
		this.asset_UUID = asset_Reference;
	}

	/**
	 * @return the version_Number
	 */
	public long getVersion_Number() {
		return version_Number;
	}

	/**
	 * @param version_Number
	 *            the version_Number to set
	 */
	public void setVersion_Number(long version_Number) {
		this.version_Number = version_Number;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the created_By
	 */
	public String getCreated_By() {
		return created_By;
	}

	/**
	 * @param created_By
	 *            the created_By to set
	 */
	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	/**
	 * @return the created_Datetime
	 */
	public String getCreated_Datetime() {
		return created_Datetime;
	}

	/**
	 * @param created_Datetime
	 *            the created_Datetime to set
	 */
	public void setCreated_Datetime(String created_Datetime) {
		this.created_Datetime = created_Datetime;
	}

	/**
	 * @return the updated_By
	 */
	public String getUpdated_By() {
		return updated_By;
	}

	/**
	 * @param updated_By
	 *            the updated_By to set
	 */
	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	/**
	 * @return the updated_Datetime
	 */
	public String getUpdated_Datetime() {
		return updated_Datetime;
	}

	/**
	 * @param updated_Datetime
	 *            the updated_Datetime to set
	 */
	public void setUpdated_Datetime(String updated_Datetime) {
		this.updated_Datetime = updated_Datetime;
	}

	/**
	 * @return the activation_Datetime
	 */
	public String getActivation_Datetime() {
		return activation_Datetime;
	}

	/**
	 * @param activation_Datetime
	 *            the activation_Datetime to set
	 */
	public void setActivation_Datetime(String activation_Datetime) {
		this.activation_Datetime = activation_Datetime;
	}

	/**
	 * @return the deactivation_Datetime
	 */
	public String getDeactivation_Datetime() {
		return deactivation_Datetime;
	}

	/**
	 * @param deactivation_Datetime
	 *            the deactivation_Datetime to set
	 */
	public void setDeactivation_Datetime(String deactivation_Datetime) {
		this.deactivation_Datetime = deactivation_Datetime;
	}

}
