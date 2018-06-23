package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Premium;
import insurwave.blockwavebrokerAPI.jsondto.CalculationPremium;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps CalculationPremium JSON to Contract_Subsection_Premium entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractSubsectionPremiumJsonToEntityConverter
		implements Converter<CalculationPremium, Contract_Subsection_Premium> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(CalculationPremium.class,
			Contract_Subsection_Premium.class,
			BrokerAPIConstants.CONTRACT_SUBSECTION_PREMIUM_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<CalculationPremium, Contract_Subsection_Premium> typeMap = modelMapper.typeMap(
			CalculationPremium.class, Contract_Subsection_Premium.class,
			BrokerAPIConstants.CONTRACT_SUBSECTION_PREMIUM_JSON_TO_ENTITY_TYPEMAP_NAME);

	/*
	 * --Premium Calculation Insert-- CREATE TABLE
	 * #tempPremiumCal(Contract_Subsection_Premium_Reference UNIQUEIDENTIFIER,
	 * Contract_Subsection_UUID UNIQUEIDENTIFIER, Premium_Position INT, Premium_Name
	 * NVARCHAR(255), Premium_Calculation_Type_Code NVARCHAR(255),
	 * Premium_Calculation_Basis_Code VARCHAR(255), Premium_Rate DECIMAL(18,8),
	 * Fleet_Type_Code VARCHAR(255), Flag VARCHAR(255),
	 * Premium_Calculation_Asset_Basis_Code VARCHAR(255), Premium_Amount
	 * DECIMAL(18,2), Created_By VARCHAR(255), Created_Datetime DATETIME, IsLocal
	 * BIT, Asset_Reference NVARCHAR(255), [Count] INT, Asset_Scope_Code
	 * NVARCHAR(255) )
	 * 
	 * 
	 * INSERT INTO #tempPremiumCal ( Contract_Subsection_Premium_Reference,
	 * Contract_Subsection_UUID, Premium_Position, Premium_Name,
	 * Premium_Calculation_Type_Code, Premium_Calculation_Basis_Code, Premium_Rate,
	 * Fleet_Type_Code, Flag, Premium_Calculation_Asset_Basis_Code, Premium_Amount,
	 * Created_By, Created_Datetime, IsLocal, Asset_Reference, [Count],
	 * Asset_Scope_Code) SELECT CONVERT(UNIQUEIDENTIFIER,
	 * CalculationPremium.Contract_Subsection_Premium_Reference),
	 * CONVERT(UNIQUEIDENTIFIER, CalculationPremium.Contract_Subsection_UUID),
	 * CONVERT(INT, CalculationPremium.Premium_Position),
	 * CalculationPremium.Premium_Name,
	 * CalculationPremium.Premium_Calculation_Type_Code,
	 * CalculationPremium.Premium_Calculation_Basis_Code, CONVERT(DECIMAL(18,8),
	 * CalculationPremium.Premium_Rate), CalculationPremium.Fleet_Type_Code,
	 * CalculationPremium.Flag,
	 * CalculationPremium.Premium_Calculation_Asset_Basis_Code,
	 * CONVERT(DECIMAL(18,2), CalculationPremium.Premium_Amount),
	 * CalculationPremium.Created_By, CalculationPremium.Created_Datetime, CASE WHEN
	 * CalculationPremium.IsLocal IS NULL THEN 0 ELSE 1 END AS IsLocal, CASE WHEN
	 * CalculationPremium.Asset_Reference IN('NONE','SINGLE_ASSET','ALL') THEN NULL
	 * ELSE CalculationPremium.Asset_Reference END AS Asset_Reference,
	 * CalculationPremium.Count, CASE CalculationPremium.Asset_Reference WHEN 'ALL'
	 * THEN 'ALL' WHEN 'NONE' THEN 'NONE' ELSE 'SINGLE_ASSET' END AS
	 * Asset_Scope_Code FROM OPENJSON( @json) WITH(ContractSubsections NVARCHAR(MAX)
	 * AS JSON) AS Sections CROSS APPLY OPENJSON (Sections.ContractSubsections) WITH
	 * (CalculationPremium NVARCHAR(MAX) AS JSON) AS ContractSubsections CROSS APPLY
	 * OPENJSON (ContractSubsections.CalculationPremium) WITH
	 * (Contract_Subsection_Premium_Reference UNIQUEIDENTIFIER,
	 * Contract_Subsection_UUID UNIQUEIDENTIFIER, Premium_Position INT, Premium_Name
	 * NVARCHAR(255), Premium_Calculation_Type_Code NVARCHAR(255),
	 * Premium_Calculation_Basis_Code NVARCHAR(255), Premium_Rate DECIMAL(18,8),
	 * Fleet_Type_Code NVARCHAR(255), Flag NVARCHAR(255),
	 * Premium_Calculation_Asset_Basis_Code NVARCHAR(255), Premium_Amount
	 * DECIMAL(18,2), Created_By VARCHAR(255), Created_Datetime DATETIME, IsLocal
	 * BIT, Asset_Reference VARCHAR(255), Count INT) AS CalculationPremium
	 * 
	 * 
	 * INSERT INTO [Contract_Subsection_Premium] (
	 * Contract_Subsection_Premium_Reference, Contract_Subsection_UUID,
	 * Premium_Position, Premium_Name, Premium_Calculation_Type_Code,
	 * Premium_Calculation_Basis_Code, Premium_Rate, Fleet_Type_Code, Flag,
	 * Premium_Calculation_Asset_Basis_Code, Premium_Amount, Created_By,
	 * Created_Datetime, Asset_Reference, [Count], Asset_Scope_Code) SELECT
	 * TP.Contract_Subsection_Premium_Reference, TP.Contract_Subsection_UUID,
	 * TP.Premium_Position, TP.Premium_Name, TP.Premium_Calculation_Type_Code,
	 * TP.Premium_Calculation_Basis_Code, TP.Premium_Rate, TP.Fleet_Type_Code,
	 * TP.Flag, TP.Premium_Calculation_Asset_Basis_Code, TP.Premium_Amount,
	 * TP.Created_By, TP.Created_Datetime, TP.Asset_Reference, TP.Count,
	 * TP.Asset_Scope_Code FROM #tempPremiumCal TP LEFT JOIN
	 * Contract_Subsection_Premium CSP on TP.Contract_Subsection_Premium_Reference =
	 * CSP.Contract_Subsection_Premium_Reference WHERE TP.IsLocal = 1
	 * 
	 * UPDATE [Contract_Subsection_Premium] SET
	 * Contract_Subsection_Premium.Premium_Name = TP.Premium_Name,
	 * Contract_Subsection_Premium.Premium_Calculation_Type_Code =
	 * TP.Premium_Calculation_Type_Code,
	 * Contract_Subsection_Premium.Premium_Calculation_Basis_Code =
	 * TP.Premium_Calculation_Basis_Code, Contract_Subsection_Premium.Premium_Rate =
	 * TP.Premium_Rate, Contract_Subsection_Premium.Fleet_Type_Code =
	 * TP.Fleet_Type_Code, Contract_Subsection_Premium.Flag = TP.Flag,
	 * Contract_Subsection_Premium.Premium_Calculation_Asset_Basis_Code =
	 * TP.Premium_Calculation_Asset_Basis_Code,
	 * Contract_Subsection_Premium.Premium_Amount = TP.Premium_Amount,
	 * Contract_Subsection_Premium.Updated_By = TP.Created_By,
	 * Contract_Subsection_Premium.Updated_Datetime = TP.Created_Datetime,
	 * Contract_Subsection_Premium.Asset_Reference = TP.Asset_Reference,
	 * Contract_Subsection_Premium.Count = TP.Count,
	 * Contract_Subsection_Premium.Asset_Scope_Code = TP.Asset_Scope_Code FROM
	 * Contract_Subsection_Premium CP INNER JOIN #tempPremiumCal TP ON
	 * CP.Contract_Subsection_Premium_Reference =
	 * TP.Contract_Subsection_Premium_Reference WHERE
	 * CP.Contract_Subsection_Premium_Reference =
	 * TP.Contract_Subsection_Premium_Reference
	 */

	@Override
	public Contract_Subsection_Premium convert(CalculationPremium calculationPremium) {
		// apply time stamp converter to date-time strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();
		String createdDateTime = calculationPremium.getCreated_Datetime();
		;
		String updatedDateTime = calculationPremium.getUpdated_Datetime();
		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(CalculationPremium::getCreated_Datetime,
					Contract_Subsection_Premium::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection_Premium::setCreated_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(CalculationPremium::getUpdated_Datetime,
					Contract_Subsection_Premium::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection_Premium::setUpdated_Datetime));
		}

		/*
		 * CASE WHEN CalculationPremium.IsLocal IS NULL THEN 0 ELSE 1 END AS IsLocal,
		 * CASE WHEN CalculationPremium.Asset_Reference IN('NONE','SINGLE_ASSET','ALL')
		 * THEN NULL ELSE CalculationPremium.Asset_Reference END AS Asset_Reference,
		 * CalculationPremium.Count, CASE CalculationPremium.Asset_Reference WHEN 'ALL'
		 * THEN 'ALL' WHEN 'NONE' THEN 'NONE' ELSE 'SINGLE_ASSET' END AS
		 * Asset_Scope_Code FROM OPENJSON( @json)
		 */

		Contract_Subsection_Premium contract_Subsection_Premium = null;
		if (calculationPremium.getIsLocal() == null || calculationPremium.getIsLocal().isEmpty()) {
			calculationPremium.setIsLocal("0");
		} else {
			calculationPremium.setIsLocal("1");
		}
		String asset_Reference = calculationPremium.getAsset_Reference().toUpperCase();
		if (asset_Reference == "NONE" || asset_Reference == "ALL" || asset_Reference == "SINGLE_ASSET") {
			calculationPremium.setAsset_Scope_Code(asset_Reference);
			calculationPremium.setAsset_Reference(null);

		} else {
			// anything else is also defaulted to 'SINGLE_ASSET'
			calculationPremium.setAsset_Scope_Code("SINGLE_ASSET");
		}
		if (calculationPremium.getIsLocal() == "1") {
			// skip PK as it is auto generated for insert
			typeMap.addMappings(
					mapper -> mapper.skip(Contract_Subsection_Premium::setContract_Subsection_Premium_Reference));
			contract_Subsection_Premium = modelMapper.map(calculationPremium, Contract_Subsection_Premium.class,
					BrokerAPIConstants.CONTRACT_SUBSECTION_PREMIUM_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		} else if (calculationPremium.getContract_Subsection_Premium_Reference() != null) {
			contract_Subsection_Premium = modelMapper.map(calculationPremium, Contract_Subsection_Premium.class,
					BrokerAPIConstants.CONTRACT_SUBSECTION_PREMIUM_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return contract_Subsection_Premium;
	}

}
