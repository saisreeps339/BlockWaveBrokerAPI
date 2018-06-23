package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Subsection;

/**
 * JPA repository for premium related operations on Contract_Section and
 * Contract_Subsection entities.
 * 
 * @author sachin.kotagiri
 *
 */
public interface UpdatePremiumSubsectionRepository extends JpaRepository<Contract_Subsection, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TotalSubsectionPremiumDao(csp.contract_Subsection_UUID, sum(csp.premium_Amount))"
			+ " from Contract_Subsection css,  Contract_Subsection_Premium   csp, Contract_Section cs "
			+ " where css.contract_Subsection_UUID = csp.contract_Subsection_UUID "
			+ " and cs.contract_Section_UUID = css.contract_Section_UUID "
			+ " and cs.contract_Section_UUID in :sectionUuids " + "group by csp.contract_Subsection_UUID")

	List<TotalSubsectionPremiumDao> totalAmountByCSP(@Param("sectionUuids") List<String> sectionUuids);

	@Query("update Contract_Subsection cs set cs.subsection_Premium_Amount = :totalPremium where cs.contract_Subsection_UUID =:contract_Subsection_UUID")
	@Modifying
	@Transactional
	void setSubsectionPremiumAmount(@Param("totalPremium") BigDecimal totalPremium,
			@Param("contract_Subsection_UUID") String contract_Subsection_UUID);

}
