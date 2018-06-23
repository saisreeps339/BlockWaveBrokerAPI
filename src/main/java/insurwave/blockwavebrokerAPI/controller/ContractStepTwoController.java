package insurwave.blockwavebrokerAPI.controller;

import java.util.List;

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
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepTwo;
import insurwave.blockwavebrokerAPI.process.ContractStepTwoProcessor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = ContractStepTwoController.BASE_URL)
@Api("Operations pertaining to step two of draft contract creation")
public class ContractStepTwoController {
	private static Logger _logger = LoggerFactory.getLogger(BrokerAPIConstants.BLOCKWAVE_BROKERAPI_SPLUNK_LOGGER);

	public static final String BASE_URL = "/Contract/";

	@Autowired
	private ContractStepTwoProcessor contractStepTwoProcessor;

	@CrossOrigin(origins = "http://localhost:7000")
	@PostMapping(path = "/Section2ContractDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation("Persists data from step 2 of draft contract creation to the off-ledger")
	public boolean saveSection2ContractDetails(@RequestBody ContractStepTwo[] contractSections) {
		_logger.trace("Entering...");
		List<Contract_Section> contract_Sections = contractStepTwoProcessor.process(contractSections);
		_logger.trace("Exiting...");
		return contract_Sections.isEmpty() ? false : true;

	}

}
