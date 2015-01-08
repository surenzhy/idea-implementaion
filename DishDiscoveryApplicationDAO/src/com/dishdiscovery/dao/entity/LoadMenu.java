package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAD_MENU database table.
 * 
 */
//@Entity
//@Table(name="LOAD_MENU")
@NamedQuery(name="LoadMenu.findAll", query="SELECT l FROM LoadMenu l")
public class LoadMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DSH_MTDA_ID")
	private BigDecimal dshMtdaId;

	@Column(name="DSH_NME")
	private String dshNme;

	private String msg;

	public LoadMenu() {
	}

	public BigDecimal getDshMtdaId() {
		return this.dshMtdaId;
	}

	public void setDshMtdaId(BigDecimal dshMtdaId) {
		this.dshMtdaId = dshMtdaId;
	}

	public String getDshNme() {
		return this.dshNme;
	}

	public void setDshNme(String dshNme) {
		this.dshNme = dshNme;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}