package insurwave.blockwavebrokerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import insurwave.blockwavebrokerAPI.domain.Contract_Subsection_Insurer;

/**
 * JPA repository for operations on Contract_Subsection_Insurer entity.
 * 
 * @author saisree
 *
 */
public interface ContractSubsectionInsurerRepository extends JpaRepository<Contract_Subsection_Insurer, String> {

}
