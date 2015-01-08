package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_MTDA_ID")
	private long dshMtdaId;

	@Column(name="DFT_ING")
	private String dftIng;

	@Column(name="DSH_CNT_CDE")
	private String dshCntCde;

	@Column(name="DSH_NME")
	private String dshNme;

	//bi-directional many-to-one association to DshDtl
	@OneToMany(mappedBy="dshMtda")
	private List<DshDtl> dshDtls;

	//bi-directional many-to-one association to DshCatTyp
	@ManyToOne
	@JoinColumn(name="DSH_CAT_TYP_ID")
	private DshCatTyp dshCatTyp;

	//bi-directional many-to-one association to DshSyn
	@OneToMany(mappedBy="dshMtda")
	private List<DshSyn> dshSyns;

	public DshMtda() {
	}

	public long getDshMtdaId() {
		return this.dshMtdaId;
	}

	public void setDshMtdaId(long dshMtdaId) {
		this.dshMtdaId = dshMtdaId;
	}

	public String getDftIng() {
		return this.dftIng;
	}

	public void setDftIng(String dftIng) {
		this.dftIng = dftIng;
	}

	public String getDshCntCde() {
		return this.dshCntCde;
	}

	public void setDshCntCde(String dshCntCde) {
		this.dshCntCde = dshCntCde;
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