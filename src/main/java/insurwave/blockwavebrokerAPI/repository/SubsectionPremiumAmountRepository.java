package insurwave.blockwavebrokerAPI.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Amount;

public interface SubsectionPremiumAmountRepository extends JpaRepository<Subsection_Premium_Amount, String> {

	@Modifying
	@Transactional
	@Query("update Subsection_Premium_Amount \r\n"
			+ "	set premium_Amount= :amount,  UI_Premium_Amount_Type_Code= :taxpremiumamount	\r\n"
			+ "	  where premium_Amount_Type_Code='LINE_NET_PREMIUM_FOR_SELLERS' and Subsection_Premium_Reference= :subsectionPremiumRef")
	void updateSubsectionRefrence(@Param("amount") BigDecimal amount,
			@Param("taxpremiumamount") String tax_Premium_Amount_Type_code,
			@Param("subsectionPremiumRef") String Subsection_Premium_Reference);
}
