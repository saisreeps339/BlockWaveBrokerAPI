package insurwave.blockwavebrokerAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import insurwave.blockwavebrokerAPI.dao.TaxCTEDao;
import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;

/**
 * JPA repository for operations on Subsection_Premium_Tax entity.
 * 
 * @author vineet.kumar.sharma
 *
 */
public interface SubsectionPremiumTaxRepository extends JpaRepository<Subsection_Premium_Tax, String> {

	@Query("select new insurwave.blockwavebrokerAPI.dao.TaxCTEDao(d.subsection_Premium_Reference,tax_Premium_Amount_Type_Code,sum(tax_Amount))\r\n"
			+ "from  Subsection_Premium_Tax d \r\n" + "where tax_Premium_Amount_Type_Code= :premiumAmountTypeCode \r\n"
			+ "and d.subsection_Premium_Reference in :premiumReference  \r\n"
			+ "group by subsection_Premium_Reference,tax_Premium_Amount_Type_Code")

	List<TaxCTEDao> getTaxPojoDetails(@Param("premiumAmountTypeCode") String premiumAmountTypeCode,
			@Param("premiumReference") List<String> premiumReference);

}
