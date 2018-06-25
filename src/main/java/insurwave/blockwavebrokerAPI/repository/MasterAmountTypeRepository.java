package insurwave.blockwavebrokerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;
import insurwave.blockwavebrokerAPI.domain.MasterAmountType;

public interface MasterAmountTypeRepository extends JpaRepository<MasterAmountType, Integer> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDaao(m.sno,m.amountTypeCode,m.amount)\r\n"
			+ "from MasterAmountType m where m.sno < (select p.sno from MasterAmountType p where p.amountTypeCode= :premiumAmountTypeCode)")
	List<MasterAmountTypesDao> getMasterAmountFor(@Param("premiumAmountTypeCode") String premiumAmountTypeCode);

}
