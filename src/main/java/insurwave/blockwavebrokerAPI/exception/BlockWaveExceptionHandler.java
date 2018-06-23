package insurwave.blockwavebrokerAPI.exception;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.util.SplunkCimLogEventUtil;

/**
 * Common exception handler class across all nodes.
 * 
 * @author saisree
 *
 */
public class BlockWaveExceptionHandler extends ResponseEntityExceptionHandler {
	@Autowired
	protected SplunkCimLogEventUtil splunkCimLogEventUtil;

	/**
	 * Handles all non-custom exceptions.
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), BrokerAPIConstants.UNKNOWN_ERROR + ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
