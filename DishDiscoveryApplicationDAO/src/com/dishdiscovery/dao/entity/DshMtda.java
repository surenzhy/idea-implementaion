package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DSH_MTDA database table.
 * 
 */
@Entity
@Table(name="DSH_MTDA")
@NamedQuery(name="DshMtda.findAll", query="SELECT d FROM DshMtda d")
public class DshMtda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DSH_MTDA_ID")
	private double dshMtdaId;

	@Column(name="DFT_ING")
	private String dftIng;

	private BigDecimal dsh_Cat_Typ_ID;

	@Column(name="DSH_CNT_CDE")
	private String dshCntCde;

	@Column(name="DSH_DFT_IMG")
	private String dshDftImg;

	@Column(name="DSH_NME")
	private String dshNme;

	//bi-directional many-to-one association to DshDtl
	@OneToMany(mappedBy="dshMtda")
	private List<DshDtl> dshDtls;

	//bi-directional many-to-one association to DshCatTyp
	@ManyToOne
	@JoinColumn(name="Dsh_Cat_Typ_ID1")
	private DshCatTyp dshCatTyp;

	//bi-directional many-to-one association to DshSyn
	@OneToMany(mappedBy="dshMtda")
	private List<DshSyn> dshSyns;

	public DshMtda() {
	}

	public double getDshMtdaId() {
		return this.dshMtdaId;
	}

	public void setDshMtdaId(double dshMtdaId) {
		this.dshMtdaId = dshMtdaId;
	}

	public String getDftIng() {
		return this.dftIng;
	}

	public void setDftIng(String dftIng) {
		this.dftIng = dftIng;
	}

	public BigDecimal getDsh_Cat_Typ_ID() {
		return this.dsh_Cat_Typ_ID;
	}

	public void setDsh_Cat_Typ_ID(BigDecimal dsh_Cat_Typ_ID) {
		this.dsh_Cat_Typ_ID = dsh_Cat_Typ_ID;
	}

	public String getDshCntCde() {
		return this.dshCntCde;
	}

	public void setDshCntCde(String dshCntCde) {
		this.dshCntCde = dshCntCde;
	}

	public String getDshDftImg() {
		return this.dshDftImg;
	}

	public void setDshDftImg(String dshDftImg) {
		this.dshDftImg = dshDftImg;
	}

	public String getDshNme() {
		return this.dshNme;
	}

	public void setDshNme(String dshNme) {
		this.dshNme = dshNme;
	}

	public List<DshDtl> getDshDtls() {
		return this.dshDtls;
	}

	public void setDshDtls(List<DshDtl> dshDtls) {
		this.dshDtls = dshDtls;
	}

	public DshDtl addDshDtl(DshDtl dshDtl) {
		getDshDtls().add(dshDtl);
		dshDtl.setDshMtda(this);

		return dshDtl;
	}

	public DshDtl removeDshDtl(DshDtl dshDtl) {
		getDshDtls().remove(dshDtl);
		dshDtl.setDshMtda(null);

		return dshDtl;
	}

	public DshCatTyp getDshCatTyp() {
		return this.dshCatTyp;
	}

	public void setDshCatTyp(DshCatTyp dshCatTyp) {
		this.dshCatTyp = dshCatTyp;
	}

	public List<DshSyn> getDshSyns() {
		return this.dshSyns;
	}

	public void setDshSyns(List<DshSyn> dshSyns) {
		this.dshSyns = dshSyns;
	}

	public DshSyn addDshSyn(DshSyn dshSyn) {
		getDshSyns().add(dshSyn);
		dshSyn.setDshMtda(this);

		return dshSyn;
	}

	public DshSyn removeDshSyn(DshSyn dshSyn) {
		getDshSyns().remove(dshSyn);
		dshSyn.setDshMtda(null);

		return dshSyn;
	}

}