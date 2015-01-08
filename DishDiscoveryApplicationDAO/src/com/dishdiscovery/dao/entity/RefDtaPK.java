package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the REF_DTA database table.
 * 
 */
@Embeddable
public class RefDtaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REF_DTA_ID")
	private long refDtaId;

	@Column(name="REF_DTA_ITM")
	private String refDtaItm;

	public RefDtaPK() {
	}
	public long getRefDtaId() {
		return this.refDtaId;
	}
	public void setRefDtaId(long refDtaId) {
		this.refDtaId = refDtaId;
	}
	public String getRefDtaItm() {
		return this.refDtaItm;
	}
	public void setRefDtaItm(String refDtaItm) {
		this.refDtaItm = refDtaItm;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RefDtaPK)) {
			return false;
		}
		RefDtaPK castOther = (RefDtaPK)other;
		return 
			(this.refDtaId == castOther.refDtaId)
			&& this.refDtaItm.equals(castOther.refDtaItm);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.refDtaId ^ (this.refDtaId >>> 32)));
		hash = hash * prime + this.refDtaItm.hashCode();
		
		return hash;
	}
}