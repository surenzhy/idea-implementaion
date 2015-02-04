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
	private int res_dtl_id;

	private String res_nme;

	//bi-directional many-to-one association to DshDtl
	@OneToMany(mappedBy="resDtl")
	private List<DshDtl> dshDtls;

	//bi-directional many-to-one association to ResCat
	@ManyToOne
	@JoinColumn(name="Res_Cat_ID")
	private ResCat resCat;

	//bi-directional many-to-one association to ResDtlMtda
	@OneToMany(mappedBy="resDtl")
	private List<ResDtlMtda> resDtlMtdas;

	public ResDtl() {
	}

	public int getRes_dtl_id() {
		return this.res_dtl_id;
	}

	public void setRes_dtl_id(int res_dtl_id) {
		this.res_dtl_id = res_dtl_id;
	}

	public String getRes_nme() {
		return this.res_nme;
	}

	public void setRes_nme(String res_nme) {
		this.res_nme = res_nme;
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

	public List<ResDtlMtda> getResDtlMtdas() {
		return this.resDtlMtdas;
	}

	public void setResDtlMtdas(List<ResDtlMtda> resDtlMtdas) {
		this.resDtlMtdas = resDtlMtdas;
	}

	public ResDtlMtda addResDtlMtda(ResDtlMtda resDtlMtda) {
		getResDtlMtdas().add(resDtlMtda);
		resDtlMtda.setResDtl(this);

		return resDtlMtda;
	}

	public ResDtlMtda removeResDtlMtda(ResDtlMtda resDtlMtda) {
		getResDtlMtdas().remove(resDtlMtda);
		resDtlMtda.setResDtl(null);

		return resDtlMtda;
	}

}