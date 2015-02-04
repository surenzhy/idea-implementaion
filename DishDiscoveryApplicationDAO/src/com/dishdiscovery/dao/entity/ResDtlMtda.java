package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RES_DTL_MTDA database table.
 * 
 */
@Entity
@Table(name="RES_DTL_MTDA")
@NamedQuery(name="ResDtlMtda.findAll", query="SELECT r FROM ResDtlMtda r")
public class ResDtlMtda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RES_DTL_MTDA_ID")
	private int resDtlMtdaId;

	@Column(name="LND_LNE_NBR")
	private String lndLneNbr;

	@Column(name="MBL_NBR")
	private String mblNbr;

	@Column(name="RES_ADDR")
	private String resAddr;

	//bi-directional many-to-one association to ResDtl
	@ManyToOne
	@JoinColumn(name="RES_DTL_ID")
	private ResDtl resDtl;

	public ResDtlMtda() {
	}

	public int getResDtlMtdaId() {
		return this.resDtlMtdaId;
	}

	public void setResDtlMtdaId(int resDtlMtdaId) {
		this.resDtlMtdaId = resDtlMtdaId;
	}

	public String getLndLneNbr() {
		return this.lndLneNbr;
	}

	public void setLndLneNbr(String lndLneNbr) {
		this.lndLneNbr = lndLneNbr;
	}

	public String getMblNbr() {
		return this.mblNbr;
	}

	public void setMblNbr(String mblNbr) {
		this.mblNbr = mblNbr;
	}

	public String getResAddr() {
		return this.resAddr;
	}

	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}

	public ResDtl getResDtl() {
		return this.resDtl;
	}

	public void setResDtl(ResDtl resDtl) {
		this.resDtl = resDtl;
	}

}