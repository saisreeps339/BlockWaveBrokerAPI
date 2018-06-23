package insurwave.blockwavebrokerAPI.util;

import org.springframework.stereotype.Component;

import com.splunk.logging.SplunkCimLogEvent;

/**
 * Utility class to Splunk recommended SplunkCimLogEvent generation.
 * 
 * @author saisree
 *
 */
@Component
public class SplunkCimLogEventUtil {
	/**
	 * Create the SplunkCimLogEvent with the given parameters.
	 * 
	 * @param evenName
	 * @param eventId
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	public SplunkCimLogEvent createEvent(String evenName, String eventId, String fieldName, String fieldValue) {
		return new SplunkCimLogEvent(evenName, eventId) {
			{
				// You can add an arbitrary key=value pair with addField.
				addField(fieldName, fieldValue);
			}
		};
	}

	/**
	 * Create the SplunkCimLogEvent with the given parameters and the authAction.
	 * 
	 * @param evenName
	 * @param eventId
	 * @param fieldName
	 * @param fieldValue
	 * @param authAction
	 * @return
	 */
	public SplunkCimLogEvent createEvent(String evenName, String eventId, String fieldName, String fieldValue,
			String authAction) {
		return new SplunkCimLogEvent(evenName, eventId) {
			{
				// You can add an arbitrary key=value pair with addField.
				addField(fieldName, fieldValue);
				// SplunkCimLogEvent provides lots of convenience methods for
				// fields defined by Splunk's Common Information Model. See
				// the SplunkCimLogEvent JavaDoc for a complete list.
				setAuthAction(authAction);
			}
		};
	}

	/**
	 * Creates the SplunkCimLogEvent with the given parameters and exception.
	 * 
	 * @param evenName
	 * @param eventId
	 * @param ex
	 * @return
	 */
	public SplunkCimLogEvent createExceptionEvent(String evenName, String eventId, Exception ex) {
		return new SplunkCimLogEvent(evenName, eventId) {
			{

				// If you are logging exceptions, use addThrowable, which
				// does nice formatting. If ex is an exception you have caught
				// you would log it with
				addThrowableWithStacktrace(ex);
			}
		};
	}

	/**
	 * SplunkCimLogEvent with the given parameters and exception.
	 * 
	 * @param evenName
	 * @param eventId
	 * @param fieldName
	 * @param fieldValue
	 * @param ex
	 * @return
	 */
	public SplunkCimLogEvent createExceptionEvent(String evenName, String eventId, String fieldName, String fieldValue,
			Exception ex) {
		return new SplunkCimLogEvent(evenName, eventId) {
			{
				// You can add an arbitrary key=value pair with addField.
				addField(fieldName, fieldValue);

				// If you are logging exceptions, use addThrowable, which
				// does nice formatting. If ex is an exception you have caught
				// you would log it with
				addThrowableWithStacktrace(ex);
			}
		};
	}

	/**
	 * SplunkCimLogEvent with the given parameters, exception and authAction.
	 * 
	 * @param evenName
	 * @param eventId
	 * @param fieldName
	 * @param fieldValue
	 * @param ex
	 * @param authAction
	 * @return
	 */
	public SplunkCimLogEvent createExceptionEvent(String evenName, String eventId, String fieldName, String fieldValue,
			Exception ex, String authAction) {
		return new SplunkCimLogEvent(evenName, eventId) {
			{
				// You can add an arbitrary key=value pair with addField.
				addField(fieldName, fieldValue);

				// If you are logging exceptions, use addThrowable, which
				// does nice formatting. If ex is an exception you have caught
				// you would log it with
				addThrowableWithStacktrace(ex);

				// SplunkCimLogEvent provides lots of convenience methods for
				// fields defined by Splunk's Common Information Model. See
				// the SplunkCimLogEvent JavaDoc for a complete list.
				setAuthAction(authAction);
			}
		};
	}
}
