package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract_Section;

/**
 * JPA repository for premium related operations on Contract and
 * Contract_Section entities.
 * 
 * @author sachin.kotagiri
 *
 */
public interface UpdatePremiumContractRepository extends JpaRepository<Contract_Section, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao(cs.contract_UUID,sum(cs.section_Premium)) from Contract_Section"
			+ " cs where cs.contract_Section_UUID in :sectionUuids  group by cs.contract_UUID")
	List<TotalContractPremiumDao> totalAmountByCSP(@Param("sectionUuids") List<String> sectionUuids);

	@Modifying
	@Transactional
	@Query("update  Contract c set c.total_Premium_Due = :totalPremium where c.contract_UUID = :contract_UUID")
	void setContractPremiumAmount(@Param("totalPremium") BigDecimal totalPremium,
			@Param("contract_UUID") String contract_Subsection_UUID);

}
