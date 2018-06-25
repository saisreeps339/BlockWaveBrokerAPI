package insurwave.blockwavebrokerAPI.comparator;

import java.util.Comparator;

import insurwave.blockwavebrokerAPI.dao.MasterAmountTypesDao;

public class MasterAmountTypesComparator implements Comparator<MasterAmountTypesDao> {

	@Override
	public int compare(MasterAmountTypesDao o1, MasterAmountTypesDao o2) {

		return o2.getSno() - o1.getSno();
	}

}
