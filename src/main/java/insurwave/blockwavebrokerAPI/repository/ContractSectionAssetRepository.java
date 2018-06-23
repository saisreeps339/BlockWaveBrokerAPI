package insurwave.blockwavebrokerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import insurwave.blockwavebrokerAPI.domain.Contract_Section_Asset;

/**
 * JPA repository for operations on Contract_Section_Asset entity.
 * 
 * @author saisree
 *
 */
public interface ContractSectionAssetRepository extends JpaRepository<Contract_Section_Asset, String> {

	/*
	 * 
	 * DELETE Contract_Section_Asset WHERE Contract_Section_UUID IN (SELECT
	 * Sections.Contract_Section_UUID FROM OPENJSON( @json) WITH(ContractSubsections
	 * NVARCHAR(MAX) AS JSON, Contract_Section_UUID UNIQUEIDENTIFIER) AS Sections
	 * CROSS APPLY OPENJSON (Sections.ContractSubsections) WITH
	 * (Contract_Subsection_UUID UNIQUEIDENTIFIER) AS ContractSubsections)
	 * 
	 * 
	 */
	@Modifying
	@Query("delete from Contract_Section_Asset c where c.contractSection.contract_Section_UUID = ?1")
	void deleteByContractSection_UUID(String contract_Section_UUID);

}
