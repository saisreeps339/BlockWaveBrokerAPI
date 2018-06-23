package insurwave.blockwavebrokerAPI.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepOne;
import insurwave.blockwavebrokerAPI.process.ContractStepOneProcessor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Rest WebService for Step One of Draft Contract Sharing.
 * 
 * @author saisree
 */
@RestController
@RequestMapping(path = ContractStepOneController.BASE_URL)
@Api("Operations pertaining to step one of draft contract creation")
public class ContractStepOneController {
	private static Logger _logger = LoggerFactory.getLogger(BrokerAPIConstants.BLOCKWAVE_BROKERAPI_SPLUNK_LOGGER);

	public static final String BASE_URL = "/ContractStep1/";

	@Autowired
	private ContractStepOneProcessor contractStepOneProcessor;

	/**
	 * Persists data from step 1 of draft contract creation to the off-ledger
	 * 
	 * @param contractStepOne
	 * @return
	 */
	@CrossOrigin(origins = "http://localhost:7000")
	@PostMapping(path = "/Contract", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation("Persists data from step 1 of draft contract creation to the off-ledger")
	public String saveContract(@RequestBody ContractStepOne contractStepOne) {
		_logger.trace("Entering");
		/*
		 * Processor class contains the business logic for persisting contract and
		 * contract section details.
		 */
		Contract contract = contractStepOneProcessor.process(contractStepOne);
		_logger.trace("Exiting");
		/*
		 * Note, prepending and appending " to avoid angularjs error: "[$http:baddata]
		 * Data must be a valid JSON object.
		 */
		return JSONObject.quote(contract.getContract_UUID());
	}
}
