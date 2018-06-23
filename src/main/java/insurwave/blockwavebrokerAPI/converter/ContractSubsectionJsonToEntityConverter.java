package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;
import insurwave.blockwavebrokerAPI.jsondto.ContractSubsection;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from ContractSubsection JSON to Contract_Subsection entity
 * 
 * @author saisree
 *
 */
@Component
public class ContractSubsectionJsonToEntityConverter implements Converter<ContractSubsection, Contract_Subsection> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ContractSubsection.class,
			Contract_Subsection.class, BrokerAPIConstants.CONTRACT_SUBSECTION_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<ContractSubsection, Contract_Subsection> typeMap = modelMapper.typeMap(ContractSubsection.class,
			Contract_Subsection.class, BrokerAPIConstants.CONTRACT_SUBSECTION_JSON_TO_ENTITY_TYPEMAP_NAME);

	/**
	 * Default constructor to create converter instance.
	 */
	public ContractSubsectionJsonToEntityConverter() {
		// skip unmatched entity fields
		typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setContractSubsectionConditions));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setCover_Type_Reference));
		typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setRetained_Percentage));
	}

	/*
	 * CREATE TABLE #temp( Contract_Subsection_UUID UNIQUEIDENTIFIER,
	 * Contract_Section_UUID UNIQUEIDENTIFIER, Contract_Subsection_Name
	 * NVARCHAR(255), Cover_Type_Reference NVARCHAR(255),
	 * Contract_Subsection_Reference NVARCHAR(255), Contract_Subsection_Basis_UUID
	 * NVARCHAR(255), Coverage_Basis_UUID NVARCHAR(255), Maximum_Insurable_Value
	 * DECIMAL(18,2), Deductible DECIMAL(18,2), Agreed_Value_Percentage
	 * DECIMAL(18,8), Sum_Insured_Percentage DECIMAL(18,8), Agreed_Value_Date
	 * VARCHAR(50), Agreed_Value DECIMAL(18,2), Sum_Insured DECIMAL(18,2),
	 * Line_Percentage_Basis_UUID NVARCHAR(255), Status NVARCHAR(255),
	 * Version_Number INT, Created_By NVARCHAR(255), Created_Datetime DATETIME,
	 * Contract_Changes_Agreement_Basis_UUID NVARCHAR(255),
	 * Subsection_Premium_Amount DECIMAL(18,2), Order_Percentage DECIMAL(18,8) )
	 * 
	 * 
	 * INSERT INTO #temp ( Contract_Subsection_UUID, Contract_Section_UUID,
	 * Contract_Subsection_Name, Cover_Type_Reference,
	 * Contract_Subsection_Reference, Contract_Subsection_Basis_UUID,
	 * Coverage_Basis_UUID, Maximum_Insurable_Value, Deductible,
	 * Agreed_Value_Percentage, Sum_Insured_Percentage, Agreed_Value_Date,
	 * Agreed_Value, Sum_Insured, Line_Percentage_Basis_UUID, Status,
	 * Version_Number, Created_By, Created_Datetime,
	 * Contract_Changes_Agreement_Basis_UUID, Subsection_Premium_Amount,
	 * Order_Percentage) SELECT CONVERT(UNIQUEIDENTIFIER,
	 * ContractSubsections.Contract_Subsection_UUID), CONVERT(UNIQUEIDENTIFIER,
	 * ContractSubsections.Contract_Section_UUID),
	 * ContractSubsections.Contract_Subsection_Name,
	 * ContractSubsections.Cover_Type_Reference,
	 * ContractSubsections.Contract_Subsection_Reference,
	 * ContractSubsections.Contract_Subsection_Basis_UUID,
	 * ContractSubsections.Coverage_Basis_UUID,
	 * ContractSubsections.Maximum_Insurable_Value, ContractSubsections.Deductible,
	 * ContractSubsections.Agreed_Value_Percentage,
	 * ContractSubsections.Sum_Insured_Percentage,
	 * ContractSubsections.Agreed_Value_Date, CONVERT(DECIMAL(18,2),
	 * ContractSubsections.Agreed_Value), ContractSubsections.Sum_Insured,
	 * ContractSubsections.Line_Percentage_Basis_UUID, ContractSubsections.Status,
	 * ContractSubsections.Version_Number, ContractSubsections.Created_By,
	 * ContractSubsections.Created_Datetime,
	 * ContractSubsections.Contract_Changes_Agreement_Basis_UUID,
	 * CONVERT(DECIMAL(18,2), ContractSubsections.Subsection_Premium_Amount),
	 * Order_Percentage FROM OPENJSON( @json) WITH(ContractSubsections NVARCHAR(MAX)
	 * AS JSON) AS Sections CROSS APPLY OPENJSON (Sections.ContractSubsections) WITH
	 * (Contract_Subsection_UUID UNIQUEIDENTIFIER, Contract_Section_UUID
	 * UNIQUEIDENTIFIER, Contract_Subsection_Name NVARCHAR(255),
	 * Cover_Type_Reference NVARCHAR(255), Contract_Subsection_Reference
	 * NVARCHAR(255), Contract_Subsection_Basis_UUID NVARCHAR(255),
	 * Coverage_Basis_UUID NVARCHAR(255), Maximum_Insurable_Value DECIMAL(18,2),
	 * Deductible DECIMAL(18,2), Agreed_Value_Percentage DECIMAL(18,8),
	 * Sum_Insured_Percentage DECIMAL(18,8), Agreed_Value_Date VARCHAR(50),
	 * Agreed_Value DECIMAL(18,2), Sum_Insured DECIMAL(18,2),
	 * Line_Percentage_Basis_UUID NVARCHAR(255), Status NVARCHAR(255),
	 * Version_Number INT, Created_By NVARCHAR(255), Created_Datetime DATETIME,
	 * Contract_Changes_Agreement_Basis_UUID NVARCHAR(255),
	 * Subsection_Premium_Amount DECIMAL(18,2), Order_Percentage DECIMAL(18,8)) AS
	 * ContractSubsections
	 * 
	 * 
	 * INSERT INTO Contract_Subsection ( Contract_Subsection_UUID,
	 * Contract_Section_UUID, Contract_Subsection_Name, Cover_Type_Reference,
	 * Contract_Subsection_Reference, Contract_Subsection_Basis_UUID,
	 * Coverage_Basis_UUID, Maximum_Insurable_Value, Deductible,
	 * Agreed_Value_Percentage, Sum_Insured_Percentage, Agreed_Value_Date,
	 * Agreed_Value, Sum_Insured, Line_Percentage_Basis_UUID, Status,
	 * Version_Number, Created_By, Created_Datetime,
	 * Contract_Changes_Agreement_Basis_UUID, Subsection_Premium_Amount,
	 * Order_Percentage) SELECT T.Contract_Subsection_UUID, T.Contract_Section_UUID,
	 * T.Contract_Subsection_Name, T.Cover_Type_Reference,
	 * T.Contract_Subsection_Reference, T.Contract_Subsection_Basis_UUID,
	 * T.Coverage_Basis_UUID, T.Maximum_Insurable_Value, T.Deductible,
	 * T.Agreed_Value_Percentage, T.Sum_Insured_Percentage, T.Agreed_Value_Date,
	 * T.Agreed_Value, T.Sum_Insured, T.Line_Percentage_Basis_UUID, T.Status,
	 * T.Version_Number, T.Created_By, T.Created_Datetime,
	 * T.Contract_Changes_Agreement_Basis_UUID, T.Subsection_Premium_Amount,
	 * T.Order_Percentage FROM #temp T LEFT JOIN Contract_Subsection CS on
	 * T.Contract_Subsection_UUID = CS.Contract_Subsection_UUID WHERE
	 * CS.Contract_Subsection_UUID IS NULL
	 * 
	 * 
	 * UPDATE Contract_Subsection SET
	 * Contract_Subsection.Contract_Subsection_Basis_UUID =
	 * T.Contract_Subsection_Basis_UUID, Contract_Subsection.Coverage_Basis_UUID =
	 * T.Coverage_Basis_UUID, Contract_Subsection.Maximum_Insurable_Value =
	 * T.Maximum_Insurable_Value, Contract_Subsection.Deductible = T.Deductible,
	 * Contract_Subsection.Agreed_Value_Percentage = T.Agreed_Value_Percentage,
	 * Contract_Subsection.Sum_Insured_Percentage = T.Sum_Insured_Percentage,
	 * Contract_Subsection.Agreed_Value_Date = T.Agreed_Value_Date,
	 * Contract_Subsection.Agreed_Value = T.Agreed_Value,
	 * Contract_Subsection.Sum_Insured = T.Sum_Insured,
	 * Contract_Subsection.Line_Percentage_Basis_UUID =
	 * T.Line_Percentage_Basis_UUID, Contract_Subsection.Updated_By = T.Created_By,
	 * Contract_Subsection.Updated_Datetime = T.Created_Datetime,
	 * Contract_Subsection.Contract_Changes_Agreement_Basis_UUID =
	 * T.Contract_Changes_Agreement_Basis_UUID,
	 * Contract_Subsection.Subsection_Premium_Amount = T.Subsection_Premium_Amount,
	 * Contract_Subsection.Order_Percentage = T.Order_Percentage FROM
	 * Contract_Subsection CS INNER JOIN #temp T ON CS.Contract_Subsection_UUID =
	 * T.Contract_Subsection_UUID WHERE CS.Contract_Subsection_UUID =
	 * T.Contract_Subsection_UUID
	 */

	@Override
	public Contract_Subsection convert(ContractSubsection contractSubsection) {
		String contract_Subsection_UUID = contractSubsection.getContract_Subsection_UUID();
		if (contract_Subsection_UUID == null || contract_Subsection_UUID.isEmpty()) {
			// skip PK as it is auto generated
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setContract_Subsection_UUID));
		}
		// apply time stamp converter to date-time strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();

		String agreedDateTime = contractSubsection.getAgreed_Value_Date();
		String createdDateTime = contractSubsection.getCreated_Datetime();
		String updatedDateTime = contractSubsection.getUpdated_Datetime();

		if (agreedDateTime != null && !agreedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractSubsection::getAgreed_Value_Date,
					Contract_Subsection::setAgreed_Value_Date));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setAgreed_Value_Date));
		}
		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractSubsection::getCreated_Datetime,
					Contract_Subsection::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setCreated_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ContractSubsection::getUpdated_Datetime,
					Contract_Subsection::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection::setUpdated_Datetime));
		}

		Contract_Subsection contract_Subsection = modelMapper.map(contractSubsection, Contract_Subsection.class,
				BrokerAPIConstants.CONTRACT_SUBSECTION_JSON_TO_ENTITY_TYPEMAP_NAME);
		modelMapper.validate();
		return contract_Subsection;
	}

}
