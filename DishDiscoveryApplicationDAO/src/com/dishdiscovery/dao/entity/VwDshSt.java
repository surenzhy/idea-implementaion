package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VW_DSH_STS database table.
 * 
 */
//@Entity
//@Table(name="VW_DSH_STS")
@NamedQuery(name="VwDshSt.findAll", query="SELECT v FROM VwDshSt v")
public class VwDshSt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DSH_STS_CDE")
	private String dshStsCde;

	@Column(name="DSH_STS_VAL")
	private String dshStsVal;

	public VwDshSt() {
	}

	public String getDshStsCde() {
		return this.dshStsCde;
	}

	public void setDshStsCde(String dshStsCde) {
		this.dshStsCde = dshStsCde;
	}

	public String getDshStsVal() {
		return this.dshStsVal;
	}

	public void setDshStsVal(String dshStsVal) {
		this.dshStsVal = dshStsVal;
	}

}