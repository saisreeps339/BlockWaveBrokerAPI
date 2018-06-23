package insurwave.blockwavebrokerAPI.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the t database table.
 * 
 */
@Entity
@Table(name = "t")
@NamedQuery(name = "T.findAll", query = "SELECT t FROM T t")
public class T implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "contract_name")
	private String contractName;

	public T() {
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

}