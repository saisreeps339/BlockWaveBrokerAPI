package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao;
import insurwave.blockwavebrokerAPI.domain.Contract;

/**
 * JPA repository for operations on Contract entity.
 * 
 * @author sachin.kotagiri
 *
 */
public interface ContractRepository extends JpaRepository<Contract, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TotalContractPremiumDao(cs.contract_UUID,sum(cs.section_Premium)) from Contract_Section"
			+ " cs where cs.contract_Section_UUID = :sectionUuid  group by cs.contract_UUID")
	List<TotalContractPremiumDao> getTotalContractPremiumByContractSectionUUID(
			@Param("sectionUuid") String contract_Section_UUID);

	@Modifying
	@Query("update  Contract c set c.total_Premium_Due = :totalPremium where c.contract_UUID = :contract_UUID")
	void setContractPremiumAmount(@Param("totalPremium") BigDecimal totalPremium,
			@Param("contract_UUID") String contract_UUID);
}
