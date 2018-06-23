package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.TotalSectionPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;

/**
 * JPA repository for premium related operations on Contract_Section and
 * Contract_Subsection entities.
 * 
 * @author sachin.kotagiri
 *
 */
public interface UpdatePremiumSectionRepository extends JpaRepository<Contract_Section, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TotalSectionPremiumDao(css.contract_Section_UUID,sum(css.subsection_Premium_Amount)) from Contract_Subsection css where css.contract_Section_UUID in :sectionUuids  group by css.contract_Section_UUID")
	List<TotalSectionPremiumDao> totalAmountByCSP(@Param("sectionUuids") List<String> sectionUuids);

	@Modifying
	@Transactional
	@Query("update Contract_Section cs set cs.section_Premium = :totalPremium where cs.contract_Section_UUID =:contract_Section_UUID")
	void setSectionPremiumAmount(@Param("totalPremium") BigDecimal totalPremium,
			@Param("contract_Section_UUID") String contract_Subsection_UUID);

}
