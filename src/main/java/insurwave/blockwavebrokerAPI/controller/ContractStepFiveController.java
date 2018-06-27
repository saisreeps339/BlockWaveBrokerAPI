package insurwave.blockwavebrokerAPI.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import insurwave.blockwavebrokerAPI.domain.Contract;
import insurwave.blockwavebrokerAPI.exception.BrokerAPIException;
import insurwave.blockwavebrokerAPI.service.ContractService;

@RestController
@RequestMapping(path = ContractStepFiveController.BASE_URL)
public class ContractStepFiveController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ContractService contractService;
	public static final String BASE_URL = "/api/ContractStep5/";

	@GetMapping("/contractsSummary")
	@ResponseStatus(HttpStatus.OK)
	public String getContractsSummary(@RequestParam("programUUID") String programId) {
		/**
		 * let args = { parameters: { programReference: req.query.programUUID } }; let
		 * url = serviceUrl + "dir-contracts/summary"; let httpMethod = "GET";
		 * restClientUtil.call(client, url, httpMethod, req, res, args);
		 */
		System.out.println("1....................");
		logger.debug("1......");
		List<Contract> contracts = contractService.getContracts();
		System.out.println("2....................");
		logger.debug("2......");
		if (contracts == null || contracts.isEmpty())
			throw new BrokerAPIException("No contracts found");
		System.out.println("3....................");
		logger.debug("3......");
		StringBuffer sb = new StringBuffer();
		contracts.forEach(contract -> sb.append(contract.getContract_Name()).append("\r\n"));
		return sb.toString();
	}
}
