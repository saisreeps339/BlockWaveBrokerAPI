package insurwave.blockwavebrokerAPI.converter;

import java.sql.Timestamp;

import org.modelmapper.AbstractConverter;

import insurwave.blockwavebrokerAPI.util.DateTimeUtil;

/**
 * Converts a given date string to java.sql.Timestamp.
 * 
 * @author saisree
 *
 */
public class TimestampConverter extends AbstractConverter<String, Timestamp> {

	@Override
	protected Timestamp convert(String source) {
		return source == null || source.isEmpty() ? null : DateTimeUtil.createTimestamp(source);
	}

}
