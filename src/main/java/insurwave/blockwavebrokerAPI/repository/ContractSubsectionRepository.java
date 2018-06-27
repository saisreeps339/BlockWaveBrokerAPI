package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao;
import insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;

/**
 * JPA repository for operations on Contract_Subsection entity.
 * 
 * @author sachin.kotagiri
 *
 */
public interface ContractSubsectionRepository extends JpaRepository<Contract_Subsection, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao(csp.contract_Subsection_UUID, sum(csp.premium_Amount))"
			+ " from Contract_Subsection css,  Contract_Subsection_Premium   csp, Contract_Section cs "
			+ " where css.contract_Subsection_UUID = csp.contract_Subsection_UUID "
			+ " and cs.contract_Section_UUID = css.contract_Section_UUID "
			+ " and cs.contract_Section_UUID = :sectionUuid " + "group by csp.contract_Subsection_UUID")

	List<TotalSubsectionPremiumDao> getTotalContractSubsectionPremiumByContractSectionUUID(
			@Param("sectionUuid") String contract_Section_UUID);

	@Modifying
	@Query("update Contract_Subsection cs set cs.subsection_Premium_Amount = :totalPremium where cs.contract_Subsection_UUID =:contract_Subsection_UUID")
	void setSubsectionPremiumAmount(@Param("totalPremium") BigDecimal totalPremium,
			@Param("contract_Subsection_UUID") String contract_Subsection_UUID);

	@Query("select new insurwave.blockwavebrokerAPI.dao.AllPremiumReferenceDao(csp.contract_Subsection_Premium_Reference)\r\n"
			+ "from Contract_Subsection css,  Contract_Subsection_Premium   csp, Contract_Section cs\r\n"
			+ "where css.contract_Subsection_UUID = csp.contract_Subsection_UUID\r\n"
			+ "and cs.contract_Section_UUID = css.contract_Section_UUID\r\n" + "and cs.contract_Section_UUID in :uuids")

	List<AllPremiumReferenceDao> allPremiumReferences(@Param("uuids") List<String> uuids);
	
	@Query("select csp.contract_Subsection_Premium_Reference\r\n"
			+ "from Contract_Subsection css,  Contract_Subsection_Premium   csp, Contract_Section cs\r\n"
			+ "where css.contract_Subsection_UUID = csp.contract_Subsection_UUID\r\n"
			+ "and cs.contract_Section_UUID = css.contract_Section_UUID\r\n" + "and cs.contract_Section_UUID = :uuid")

	List<String> allPremiumReferences(@Param("uuid") String uuid);


	@Modifying
	@Query("delete from Subsection_Premium_Amount c where c.subsection_Premium_Reference in :allPremiumRef")
	void deletePremiumRef(@Param("allPremiumRef") List<String> allPremiumRef);

	@Query("select new insurwave.blockwavebrokerAPI.dao.ContractSubsectionPremiumDao(csp.contract_Subsection_Premium_Reference "
			+ " , csp.premium_Amount)  from Contract_Subsection_Premium csp where csp.contract_Subsection_Premium_Reference in :allPremiumRef ")
	List<ContractSubsectionPremiumDao> getContractSubsectionPrem(@Param("allPremiumRef") List<String> allPremiumRef);

}
