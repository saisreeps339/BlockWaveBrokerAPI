package insurwave.blockwavebrokerAPI.process;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.converter.ContractJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.converter.ContractSectionJsonToEntityConverter;
import insurwave.blockwavebrokerAPI.domain.Contract;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepOne;
import insurwave.blockwavebrokerAPI.jsondto.ProgramDataDetail;
import insurwave.blockwavebrokerAPI.service.ContractSectionService;
import insurwave.blockwavebrokerAPI.service.ContractService;

/**
 * Processor class that handles the business flow of Contract Step One.
 * 
 * @author saisree
 *
 */
@Component
public class ContractStepOneProcessor {
	private static Logger _logger = LoggerFactory.getLogger(BrokerAPIConstants.BLOCKWAVE_BROKERAPI_SPLUNK_LOGGER);

	@Autowired
	private ContractSectionJsonToEntityConverter contractSectionJsonToEntityConverter;

	@Autowired
	private ContractJsonToEntityConverter contractJsonToEntityConverter;

	@Autowired
	private ContractService contractService;

	@Autowired
	private ContractSectionService contractSectionService;

	/**
	 * Processes the Contract Step One data.
	 * 
	 * @param contractStepOne
	 * @return
	 */
	@Transactional
	public Contract process(ContractStepOne contractStepOne) {
		Contract contract = saveContract(contractStepOne);
		// save contract section details
		if (contractStepOne.getLegalEntityDisplay() == 1) {
			saveContract_Sections(contractStepOne, contract);
		}
		return contract;
	}

	/**
	 * Saves the Contract details.
	 * 
	 * @param contractStepOne
	 * @return
	 */
	private Contract saveContract(ContractStepOne contractStepOne) {
		Contract contract = contractJsonToEntityConverter.convert(contractStepOne);
		contract = contractService.saveContract(contract);
		_logger.info("Created Contract record with contract_UUID: {}", contract.getContract_UUID());
		return contract;
	}

	/**
	 * Saves the Contract Section details.
	 * 
	 * @param contractStepOne
	 * @param contract
	 */
	private void saveContract_Sections(ContractStepOne contractStepOne, Contract contract) {
		String contract_UUID = contract.getContract_UUID();
		// list of entities to be persisted
		List<Contract_Section> contract_Sections = new ArrayList<Contract_Section>();
		ProgramDataDetail[] programDataDetails = contractStepOne.getProgramDataDetails();

		for (ProgramDataDetail programDataDetail : programDataDetails) {
			// populate from ContractStepOne JSON/Contract entity
			programDataDetail.setContract_UUID(contract_UUID);
			programDataDetail.setJurisdiction_UUID(contractStepOne.getJurisdiction());
			Contract_Section contract_Section = contractSectionJsonToEntityConverter.convert(programDataDetail);
			// add to list to be persisted.
			contract_Sections.add(contract_Section);
		}
		// get existing contract_section records with the given contract_UUID
		List<Contract_Section> existingContractSections = contractSectionService
				.getContract_Sections_By_Contract_UUID(contract_UUID);
		if (existingContractSections != null && !existingContractSections.isEmpty()) {
			// delete the existing contract section records by contract_UID
			contractSectionService.deleteContract_Section_ByContract_UUID(contract_UUID);
			_logger.info("Deleted Contract_Section records associated with with Contract_UUID: {}", contract_UUID);
		}
		contract_Sections = contractSectionService.saveContract_Sections(contract_Sections);
		_logger.info("Created Contract_Section records for Contract_UUID: {}", contract_UUID);
	}
}
