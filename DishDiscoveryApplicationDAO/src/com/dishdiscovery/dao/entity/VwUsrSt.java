package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VW_USR_STS database table.
 * 
 */
//@Entity
//@Table(name="VW_USR_STS")
@NamedQuery(name="VwUsrSt.findAll", query="SELECT v FROM VwUsrSt v")
public class VwUsrSt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REF_DTA_ITM_CDE")
	private String refDtaItmCde;

	@Column(name="REF_DTA_ITM_VAL")
	private String refDtaItmVal;

	public VwUsrSt() {
	}

	public String getRefDtaItmCde() {
		return this.refDtaItmCde;
	}

	public void setRefDtaItmCde(String refDtaItmCde) {
		this.refDtaItmCde = refDtaItmCde;
	}

	public String getRefDtaItmVal() {
		return this.refDtaItmVal;
	}

	public void setRefDtaItmVal(String refDtaItmVal) {
		this.refDtaItmVal = refDtaItmVal;
	}

}