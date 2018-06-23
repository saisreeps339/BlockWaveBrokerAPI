package insurwave.blockwavebrokerAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Deductible;
import insurwave.blockwavebrokerAPI.repository.SubsectionPremiumDeductibleRepository;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumDeductibleService;

@Service
public class SubsectionPremiumDeductibleServiceImpl implements SubsectionPremiumDeductibleService {
	private SubsectionPremiumDeductibleRepository subsectionPremiumDeductibleRepository;

	@Autowired
	public SubsectionPremiumDeductibleServiceImpl(
			SubsectionPremiumDeductibleRepository subsectionPremiumDeductibleRepository) {
		this.subsectionPremiumDeductibleRepository = subsectionPremiumDeductibleRepository;
	}

	@Override
	public Subsection_Premium_Deductible saveSubsection_Premium_Deductible(
			Subsection_Premium_Deductible subsection_Premium_Deductible) {
		return subsectionPremiumDeductibleRepository.save(subsection_Premium_Deductible);
	}

}
