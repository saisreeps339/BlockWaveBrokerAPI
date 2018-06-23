package insurwave.blockwavebrokerAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurwave.blockwavebrokerAPI.domain.Subsection_Premium_Tax;
import insurwave.blockwavebrokerAPI.repository.SubsectionPremiumTaxRepository;
import insurwave.blockwavebrokerAPI.service.SubsectionPremiumTaxService;

@Service
public class SubsectionPremiumTaxServiceImpl implements SubsectionPremiumTaxService {
	private SubsectionPremiumTaxRepository subsectionPremiumTaxRepository;

	@Autowired
	public SubsectionPremiumTaxServiceImpl(SubsectionPremiumTaxRepository subsectionPremiumTaxRepository) {
		this.subsectionPremiumTaxRepository = subsectionPremiumTaxRepository;
	}

	@Override
	public Subsection_Premium_Tax saveSubsection_Premium_Tax(Subsection_Premium_Tax subsection_Premium_Tax) {
		return subsectionPremiumTaxRepository.save(subsection_Premium_Tax);
	}

}
