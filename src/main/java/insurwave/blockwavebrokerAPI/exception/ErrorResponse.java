package insurwave.blockwavebrokerAPI.exception;

import java.util.Date;

/**
 * Errors response to be returned.
 * 
 * @author saisree
 *
 */
public class ErrorResponse {
	private Date timestamp;
	private String message;
	private String details;

	/**
	 * Creates the error response to be returned.
	 * 
	 * @param timestamp
	 * @param message
	 * @param details
	 */
	public ErrorResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

}