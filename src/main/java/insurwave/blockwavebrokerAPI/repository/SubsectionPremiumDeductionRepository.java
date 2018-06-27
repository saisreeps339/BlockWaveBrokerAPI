package insurwave.blockwavebrokerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.DeductionsCTEDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deduction;

/**
 * JPA repository for operations on Subsection_Premium_Deduction entity.
 * 
 * @author vineet.kumar.sharma
 *
 */
public interface SubsectionPremiumDeductionRepository extends JpaRepository<Subsection_Premium_Deduction, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.DeductionsCTEDao(d.subsection_Premium_Reference,d.deduction_Premium_Amount_Type_Code,sum(d.deduction_Amount)) from  Subsection_Premium_Deduction d "
			+ "where d.deduction_Premium_Amount_Type_Code= :premiumAmountTypeCode and d.subsection_Premium_Reference in :premiumReference "
			+ "group by d.subsection_Premium_Reference,d.deduction_Premium_Amount_Type_Code")
	
	
	List<DeductionsCTEDao> getDeductionDetails(@Param("premiumAmountTypeCode") String premiumAmountTypeCode,
			@Param("premiumReference") List<String> premiumReference);

}
