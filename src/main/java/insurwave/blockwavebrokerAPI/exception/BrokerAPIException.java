package insurwave.blockwavebrokerAPI.exception;

/**
 * Custom exception for Broker API.
 * 
 * @author saisree
 *
 */
public class BrokerAPIException extends RuntimeException {

	private static final long serialVersionUID = -848532243370779989L;

	/**
	 * Creates custom exception with the given message.
	 * 
	 * @param errorMessage
	 */
	public BrokerAPIException(String errorMessage) {
		super(errorMessage);
	}

}
