package insurwave.blockwavebrokerAPI.util;

import java.util.List;

import com.splunk.logging.HttpEventCollectorErrorHandler;
import com.splunk.logging.HttpEventCollectorEventInfo;

/**
 * Utility methods related to Splunk.
 * 
 * @author saisree
 *
 */
public class SplunkUtil {

	/**
	 * For reporting errors on the Splunk HTTP Event Collector
	 */
	public static void reportHttpEventCollectorError() {
		// for reporting error on Splunk HTTP Event Collector
		HttpEventCollectorErrorHandler.onError(new HttpEventCollectorErrorHandler.ErrorCallback() {
			public void error(final List<HttpEventCollectorEventInfo> events, final Exception ex) {
				// FIXME: Dumping stack trace to STDERR is not suitable for production use !
				ex.printStackTrace();
			}
		});
	}
}
