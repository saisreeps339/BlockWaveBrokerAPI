package insurwave.blockwavebrokerAPI.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

import insurwave.blockwavebrokerAPI.constants.BrokerAPIConstants;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Insurer;
import insurwave.blockwavebrokerAPI.jsondto.ShareAllocation;
import insurwave.blockwavebrokerAPI.util.ModelMapperUtil;

/**
 * Maps from ShareAllocation JSO to Contract_Subsection_Insurer entity.
 * 
 * @author saisree
 *
 */
@Component
public class ContractSubsectionInsurerJsonToEntityConverter
		implements Converter<ShareAllocation, Contract_Subsection_Insurer> {

	private ModelMapper modelMapper = ModelMapperUtil.getModelMapper(ShareAllocation.class,
			Contract_Subsection_Insurer.class,
			BrokerAPIConstants.CONTRACT_SUBSECTION_INSURER_JSON_TO_ENTITY_TYPEMAP_NAME);
	private TypeMap<ShareAllocation, Contract_Subsection_Insurer> typeMap = modelMapper.typeMap(ShareAllocation.class,
			Contract_Subsection_Insurer.class,
			BrokerAPIConstants.CONTRACT_SUBSECTION_INSURER_JSON_TO_ENTITY_TYPEMAP_NAME);

	/*
	 * -- Contract_Subsection_Insurer Start-- CREATE TABLE #tempInsurer(
	 * Contract_Subsection_Insurer_UUID UNIQUEIDENTIFIER,
	 * Participant_Identity_Reference UNIQUEIDENTIFIER,
	 * Participant_Legal_Entity_Code UNIQUEIDENTIFIER, Contract_Subsection_UUID
	 * UNIQUEIDENTIFIER, Participant_Sequence_Number NVARCHAR(255),
	 * New_Business_Indicator BIT, Line_Percentage_Basis_UUID NVARCHAR(255),
	 * Line_Percentage DECIMAL(18,8), Line_Premium_Amount DECIMAL(18,2),
	 * Declaration_Participant_Function_UUID NVARCHAR(255),
	 * Endorsement_Participant_Function_UUID NVARCHAR(255),
	 * Claim_Participant_Function_UUID NVARCHAR(255),
	 * Endorsement_Agreement_Type_UUID NVARCHAR(255),
	 * Endorsement_Notification_Follower_Flag BIT, Endorsement_Notification_Due_Days
	 * INT, Always_Require_Notification_Flag BIT, Subaccount_Reference
	 * NVARCHAR(255), Settlement_Channel_UUID NVARCHAR(255),
	 * Line_Transaction_Function_UUID NVARCHAR(255), Participant_Function_UUID
	 * NVARCHAR(255), Status VARCHAR(255), Version_Number INT, Created_By
	 * VARCHAR(255), Created_Datetime DATETIME, IsLocal BIT )
	 * 
	 * INSERT INTO #tempInsurer ( Contract_Subsection_Insurer_UUID,
	 * Participant_Identity_Reference, Participant_Legal_Entity_Code,
	 * Contract_Subsection_UUID, Participant_Sequence_Number,
	 * New_Business_Indicator, Line_Percentage_Basis_UUID, Line_Percentage,
	 * Line_Premium_Amount, Declaration_Participant_Function_UUID,
	 * Endorsement_Participant_Function_UUID, Claim_Participant_Function_UUID,
	 * Endorsement_Agreement_Type_UUID, Endorsement_Notification_Follower_Flag,
	 * Endorsement_Notification_Due_Days, Always_Require_Notification_Flag,
	 * Subaccount_Reference, Settlement_Channel_UUID,
	 * Line_Transaction_Function_UUID, Participant_Function_UUID, Status,
	 * Version_Number, Created_By, Created_Datetime, IsLocal) SELECT
	 * CONVERT(UNIQUEIDENTIFIER, ShareAllocations.Contract_Subsection_Insurer_UUID),
	 * CONVERT(UNIQUEIDENTIFIER, ShareAllocations.Participant_Identity_Reference),
	 * CONVERT(UNIQUEIDENTIFIER, ShareAllocations.Participant_Legal_Entity_Code),
	 * CONVERT(UNIQUEIDENTIFIER, ShareAllocations.Contract_Subsection_UUID),
	 * ShareAllocations.Participant_Sequence_Number,
	 * ShareAllocations.New_Business_Indicator,
	 * ShareAllocations.Line_Percentage_Basis_UUID, CONVERT(DECIMAL(18,8),
	 * ShareAllocations.Line_Percentage), CONVERT(DECIMAL(18,2),
	 * ShareAllocations.Line_Premium_Amount),
	 * ShareAllocations.Declaration_Participant_Function_UUID,
	 * ShareAllocations.Endorsement_Participant_Function_UUID,
	 * ShareAllocations.Claim_Participant_Function_UUID,
	 * ShareAllocations.Endorsement_Agreement_Type_UUID,
	 * ShareAllocations.Endorsement_Notification_Follower_Flag,
	 * ShareAllocations.Endorsement_Notification_Due_Days,
	 * ShareAllocations.Always_Require_Notification_Flag,
	 * ShareAllocations.Subaccount_Reference,
	 * ShareAllocations.Settlement_Channel_UUID,
	 * ShareAllocations.Line_Transaction_Function_UUID,
	 * ShareAllocations.Participant_Function_UUID, ShareAllocations.Status,
	 * ShareAllocations.Version_Number, ShareAllocations.Created_By,
	 * ShareAllocations.Created_Datetime, CASE WHEN ShareAllocations.IsLocal IS NULL
	 * THEN 0 ELSE 1 END AS IsLocal FROM OPENJSON(@json) WITH(ContractSubsections
	 * NVARCHAR(MAX) AS JSON) AS Sections CROSS APPLY OPENJSON
	 * (Sections.ContractSubsections) WITH (ShareAllocations NVARCHAR(MAX) AS JSON)
	 * AS ContractSubsections CROSS APPLY OPENJSON
	 * (ContractSubsections.ShareAllocations) WITH (Contract_Subsection_Insurer_UUID
	 * UNIQUEIDENTIFIER, Participant_Identity_Reference UNIQUEIDENTIFIER,
	 * Participant_Legal_Entity_Code UNIQUEIDENTIFIER, Contract_Subsection_UUID
	 * UNIQUEIDENTIFIER, Participant_Sequence_Number NVARCHAR(255),
	 * New_Business_Indicator BIT, Line_Percentage_Basis_UUID NVARCHAR(255),
	 * Line_Percentage DECIMAL(18,8), Line_Premium_Amount DECIMAL(18,2),
	 * Declaration_Participant_Function_UUID NVARCHAR(255),
	 * Endorsement_Participant_Function_UUID NVARCHAR(255),
	 * Claim_Participant_Function_UUID NVARCHAR(255),
	 * Endorsement_Agreement_Type_UUID NVARCHAR(255),
	 * Endorsement_Notification_Follower_Flag BIT, Endorsement_Notification_Due_Days
	 * INT, Always_Require_Notification_Flag BIT, Subaccount_Reference
	 * NVARCHAR(255), Settlement_Channel_UUID NVARCHAR(255),
	 * Line_Transaction_Function_UUID NVARCHAR(255), Participant_Function_UUID
	 * NVARCHAR(255), Status VARCHAR(255), Version_Number INT, Created_By
	 * VARCHAR(255), Created_Datetime DATETIME, IsLocal BIT) AS ShareAllocations
	 * 
	 * INSERT INTO Contract_Subsection_Insurer ( Participant_Identity_Reference,
	 * Participant_Legal_Entity_Code, Contract_Subsection_UUID,
	 * Participant_Sequence_Number, New_Business_Indicator,
	 * Line_Percentage_Basis_UUID, Line_Percentage, Line_Premium_Amount,
	 * Declaration_Participant_Function_UUID, Endorsement_Participant_Function_UUID,
	 * Claim_Participant_Function_UUID, Endorsement_Agreement_Type_UUID,
	 * Endorsement_Notification_Follower_Flag, Endorsement_Notification_Due_Days,
	 * Always_Require_Notification_Flag, Subaccount_Reference,
	 * Settlement_Channel_UUID, Line_Transaction_Function_UUID,
	 * Participant_Function_UUID, Status, Version_Number, Created_By,
	 * Created_Datetime) SELECT TI.Participant_Identity_Reference,
	 * TI.Participant_Legal_Entity_Code, TI.Contract_Subsection_UUID,
	 * TI.Participant_Sequence_Number, TI.New_Business_Indicator,
	 * TI.Line_Percentage_Basis_UUID, TI.Line_Percentage, TI.Line_Premium_Amount,
	 * TI.Declaration_Participant_Function_UUID,
	 * TI.Endorsement_Participant_Function_UUID, TI.Claim_Participant_Function_UUID,
	 * TI.Endorsement_Agreement_Type_UUID,
	 * TI.Endorsement_Notification_Follower_Flag,
	 * TI.Endorsement_Notification_Due_Days, TI.Always_Require_Notification_Flag,
	 * TI.Subaccount_Reference, TI.Settlement_Channel_UUID,
	 * TI.Line_Transaction_Function_UUID, TI.Participant_Function_UUID, TI.Status,
	 * TI.Version_Number, TI.Created_By, TI.Created_Datetime FROM #tempInsurer TI
	 * LEFT JOIN Contract_Subsection_Insurer CSI on
	 * TI.Contract_Subsection_Insurer_UUID = CSI.Contract_Subsection_Insurer_UUID
	 * WHERE TI.IsLocal = 1 AND TI.Contract_Subsection_Insurer_UUID IS NULL
	 * 
	 * 
	 * UPDATE [Contract_Subsection_Insurer] SET Participant_Identity_Reference =
	 * TI.Participant_Identity_Reference, Participant_Legal_Entity_Code =
	 * TI.Participant_Legal_Entity_Code, Contract_Subsection_UUID =
	 * TI.Contract_Subsection_UUID, Participant_Sequence_Number =
	 * TI.Participant_Sequence_Number, New_Business_Indicator =
	 * TI.New_Business_Indicator, Line_Percentage_Basis_UUID =
	 * TI.Line_Percentage_Basis_UUID, Line_Percentage = TI.Line_Percentage,
	 * Line_Premium_Amount = TI.Line_Premium_Amount,
	 * Declaration_Participant_Function_UUID =
	 * TI.Declaration_Participant_Function_UUID,
	 * Endorsement_Participant_Function_UUID =
	 * TI.Endorsement_Participant_Function_UUID, Claim_Participant_Function_UUID =
	 * TI.Claim_Participant_Function_UUID, Endorsement_Agreement_Type_UUID =
	 * TI.Endorsement_Agreement_Type_UUID, Endorsement_Notification_Follower_Flag =
	 * TI.Endorsement_Notification_Follower_Flag, Endorsement_Notification_Due_Days
	 * = TI.Endorsement_Notification_Due_Days, Always_Require_Notification_Flag =
	 * TI.Always_Require_Notification_Flag, Subaccount_Reference =
	 * TI.Subaccount_Reference, Settlement_Channel_UUID =
	 * TI.Settlement_Channel_UUID, Line_Transaction_Function_UUID =
	 * TI.Line_Transaction_Function_UUID, Participant_Function_UUID =
	 * TI.Participant_Function_UUID, Updated_By = TI.Created_By, Updated_Datetime =
	 * TI.Created_Datetime FROM Contract_Subsection_Insurer CSI INNER JOIN
	 * #tempInsurer TI ON CSI.Contract_Subsection_Insurer_UUID =
	 * TI.Contract_Subsection_Insurer_UUID WHERE
	 * CSI.Contract_Subsection_Insurer_UUID = TI.Contract_Subsection_Insurer_UUID
	 * 
	 * -- End of Contract_Subsection_Insurer--
	 * 
	 */
	@Override
	public Contract_Subsection_Insurer convert(ShareAllocation shareAllocation) {
		Contract_Subsection_Insurer contract_Subsection_Insurer = null;
		// skip Participant_Legal_Entity_Code if it is null or empty
		String participant_Legal_Entity_Code = shareAllocation.getParticipant_Legal_Entity_Code();
		if (participant_Legal_Entity_Code == null || participant_Legal_Entity_Code.trim().isEmpty()) {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection_Insurer::setParticipant_Legal_Entity_Code));
		}
		// apply time stamp converter to date-time strings in the JSON
		TimestampConverter timestampConverter = new TimestampConverter();
		String createdDateTime = shareAllocation.getCreated_Datetime();

		String updatedDateTime = shareAllocation.getUpdated_Datetime();
		if (createdDateTime != null && !createdDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ShareAllocation::getCreated_Datetime,
					Contract_Subsection_Insurer::setCreated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection_Insurer::setCreated_Datetime));
		}
		if (updatedDateTime != null && !updatedDateTime.isEmpty()) {
			typeMap.addMappings(mapper -> mapper.using(timestampConverter).map(ShareAllocation::getUpdated_Datetime,
					Contract_Subsection_Insurer::setUpdated_Datetime));
		} else {
			typeMap.addMappings(mapper -> mapper.skip(Contract_Subsection_Insurer::setUpdated_Datetime));
		}

		if (shareAllocation.getIsLocal() == null || shareAllocation.getIsLocal().isEmpty()) {
			shareAllocation.setIsLocal("0");
		} else {
			shareAllocation.setIsLocal("1");
		}
		if (shareAllocation.getIsLocal() == "1" && (shareAllocation.getContract_Subsection_Insurer_UUID() == null
				|| shareAllocation.getContract_Subsection_Insurer_UUID().isEmpty())) {
			// skip PK as it is auto generated
			typeMap.addMappings(
					mapper -> mapper.skip(Contract_Subsection_Insurer::setContract_Subsection_Insurer_UUID));

			contract_Subsection_Insurer = modelMapper.map(shareAllocation, Contract_Subsection_Insurer.class,
					BrokerAPIConstants.CONTRACT_SUBSECTION_INSURER_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		} else if (shareAllocation.getContract_Subsection_Insurer_UUID() != null) {
			contract_Subsection_Insurer = modelMapper.map(shareAllocation, Contract_Subsection_Insurer.class,
					BrokerAPIConstants.CONTRACT_SUBSECTION_INSURER_JSON_TO_ENTITY_TYPEMAP_NAME);
			modelMapper.validate();
		}
		return contract_Subsection_Insurer;
	}

}
