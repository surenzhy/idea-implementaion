package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RES_DTL database table.
 * 
 */
@Entity
@Table(name="RES_DTL")
@NamedQuery(name="ResDtl.findAll", query="SELECT r FROM ResDtl r")
public class ResDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RES_DTL_ID")
	private long resDtlId;

	@Column(name="LND_LNE_NBR")
	private String lndLneNbr;

	@Column(name="MBL_NBR")
	private String mblNbr;

	@Column(name="RES_ADDR")
	private String resAddr;

	@Column(name="RES_NME")
	private String resNme;

	//bi-directional many-to-one association to DshDtl
	@OneToMany(mappedBy="resDtl")
	private List<DshDtl> dshDtls;

	//bi-directional many-to-one association to ResCat
	@ManyToOne
	@JoinColumn(name="RES_CAT_ID")
	private ResCat resCat;

	public ResDtl() {
	}

	public long getResDtlId() {
		return this.resDtlId;
	}

	public void setResDtlId(long resDtlId) {
		this.resDtlId = resDtlId;
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

	public String getResNme() {
		return this.resNme;
	}

	public void setResNme(String resNme) {
		this.resNme = resNme;
	}

	public List<DshDtl> getDshDtls() {
		return this.dshDtls;
	}

	public void setDshDtls(List<DshDtl> dshDtls) {
		this.dshDtls = dshDtls;
	}

	public DshDtl addDshDtl(DshDtl dshDtl) {
		getDshDtls().add(dshDtl);
		dshDtl.setResDtl(this);

		return dshDtl;
	}

	public DshDtl removeDshDtl(DshDtl dshDtl) {
		getDshDtls().remove(dshDtl);
		dshDtl.setResDtl(null);

		return dshDtl;
	}

	public ResCat getResCat() {
		return this.resCat;
	}

	public void setResCat(ResCat resCat) {
		this.resCat = resCat;
	}

}