package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VW_DSH_CNTNT database table.
 * 
 */
//@Entity
//@Table(name="VW_DSH_CNTNT")
@NamedQuery(name="VwDshCntnt.findAll", query="SELECT v FROM VwDshCntnt v")
public class VwDshCntnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REF_DTA_ITM_CDE")
	private String refDtaItmCde;

	@Column(name="REF_DTA_ITM_VAL")
	private String refDtaItmVal;

	public VwDshCntnt() {
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