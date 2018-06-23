package insurwave.blockwavebrokerAPI.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.service.InsertUpdSubsectionPremiumAmountService;

//For DEMO- TO BE REMOVED!!!
@Service
public class InsertUpdSubsectionPremiumAmountServiceImpl implements InsertUpdSubsectionPremiumAmountService {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int update(List<String> contract_section_UUIDs) {
		/*
		 * //"login" this is the name of your procedure StoredProcedureQuery query =
		 * entityManager.createStoredProcedureQuery(
		 * "usp_InsertUpdSubsectionPremiumAmount");
		 * 
		 * //Declare the parameters in the same order
		 * query.registerStoredProcedureParameter(1, List.class, ParameterMode.IN);
		 * 
		 * //Pass the parameter values query.setParameter(1, contract_section_UUIDs);
		 * //Execute query query.execute();
		 * 
		 * //Get output parameters Integer outCode = (Integer)
		 * query.getOutputParameterValue(3); String outMessage = (String)
		 * query.getOutputParameterValue(4);
		 * 
		 * return true; //enter your condition
		 */
		StoredProcedureQuery storedProcedureQuery = entityManager
				.createNamedStoredProcedureQuery("insertUpdateSubsectionPremiumAmount");
		storedProcedureQuery.registerStoredProcedureParameter(1, List.class, ParameterMode.IN);
		storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);

		storedProcedureQuery.setParameter(1, contract_section_UUIDs);

		storedProcedureQuery.execute();
		// Get output parameters
		Integer count = (Integer) storedProcedureQuery.getOutputParameterValue(2);
		// return storedProcedureQuery.getResultList();
		return count;

	}

}
