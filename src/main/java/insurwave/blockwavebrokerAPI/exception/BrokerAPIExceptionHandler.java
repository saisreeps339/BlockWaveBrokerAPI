package insurwave.blockwavebrokerAPI.exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;

/**
 * Generic exception handler class for BrokerAPI node.
 * 
 * @author saisree
 */
@ControllerAdvice
@RestController
public class BrokerAPIExceptionHandler extends BlockWaveExceptionHandler {

	private static Logger _logger = LoggerFactory.getLogger(BrokerAPIConstants.BLOCKWAVE_BROKERAPI_SPLUNK_LOGGER);

	/**
	 * Handles custom BrokerAPI exception for the Broker API module.
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(BrokerAPIException.class)
	public final ResponseEntity<ErrorResponse> handleBrokerAPIException(BrokerAPIException ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		_logger.error("Not found");
		_logger.error(splunkCimLogEventUtil
				.createExceptionEvent(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.toString(), ex).toString());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}

}