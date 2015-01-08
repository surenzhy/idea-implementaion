package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VW_DSH_CAT_TYP database table.
 * 
 */
//@Entity
//@Table(name="VW_DSH_CAT_TYP")
@NamedQuery(name="VwDshCatTyp.findAll", query="SELECT v FROM VwDshCatTyp v")
public class VwDshCatTyp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DSH_CAT_NME")
	private String dshCatNme;

	@Column(name="DSH_CAT_TYP_ID")
	private BigDecimal dshCatTypId;

	@Column(name="DSH_TYP_NME")
	private String dshTypNme;

	public VwDshCatTyp() {
	}

	public String getDshCatNme() {
		return this.dshCatNme;
	}

	public void setDshCatNme(String dshCatNme) {
		this.dshCatNme = dshCatNme;
	}

	public BigDecimal getDshCatTypId() {
		return this.dshCatTypId;
	}

	public void setDshCatTypId(BigDecimal dshCatTypId) {
		this.dshCatTypId = dshCatTypId;
	}

	public String getDshTypNme() {
		return this.dshTypNme;
	}

	public void setDshTypNme(String dshTypNme) {
		this.dshTypNme = dshTypNme;
	}

}