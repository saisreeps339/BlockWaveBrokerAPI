package insurwave.blockwavebrokerAPI.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * Utility class for date and time related functions.
 * 
 * @author saisree
 *
 */
public class DateTimeUtil {

	/**
	 * Converts the given date string to java.sql.Timestamp.
	 * 
	 * @param dateString
	 * @return
	 */
	public static Timestamp createTimestamp(String dateString) {
		Timestamp timestamp = null;
		if (dateString != null && !dateString.isEmpty()) {

			try {
				Instant instant = Instant.parse(dateString);
				timestamp = Timestamp.from(instant);

			} catch (Exception e) {
				// TODO -- need a custom DateTimeFromatBuilder
				DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
				LocalDateTime localDateTime = LocalDateTime.parse(dateString, format);
				ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
				timestamp = Timestamp.from(zonedDateTime.toInstant());
			}
			// Start: for printing purpose only
			DateFormat df = DateFormat.getDateTimeInstance();
			df.setTimeZone(TimeZone.getTimeZone("UTC"));
			// the following prints: Timestamp in UTC:
			System.out.println("Timestamp in UTC: " + df.format(timestamp));
			// End: for printing purpose only
		}
		return timestamp;
	}
}
