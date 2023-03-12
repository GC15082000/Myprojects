package com.SecondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Country1")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Country {
	@Id
	@Column(name="cID")
	private int cID;
	@Column(name="cName")
	private String cName;

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Country [cID=" + cID + ", cName=" + cName + "]";
	}

}
