package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DSH_DTL database table.
 * 
 */
@Entity
@Table(name="DSH_DTL")
@NamedQuery(name="DshDtl.findAll", query="SELECT d FROM DshDtl d")
public class DshDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int dsh_Dtl_ID;

	@Column(name="DSH_AVL_STS_CDE")
	private String dshAvlStsCde;

	private BigDecimal dsh_PRc;

	//bi-directional many-to-one association to DshMtda
	@ManyToOne
	@JoinColumn(name="DSH_MTDA_ID")
	private DshMtda dshMtda;

	//bi-directional many-to-one association to ResDtl
	@ManyToOne
	@JoinColumn(name="Res_dtl_ID")
	private ResDtl resDtl;

	//bi-directional many-to-one association to UsrDshCmt
	@OneToMany(mappedBy="dshDtl")
	private List<UsrDshCmt> usrDshCmts;

	//bi-directional many-to-one association to UsrDshLik
	@OneToMany(mappedBy="dshDtl")
	private List<UsrDshLik> usrDshLiks;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="dshDtl")
	private List<UsrDshRvw> usrDshRvws;

	public DshDtl() {
	}

	public int getDsh_Dtl_ID() {
		return this.dsh_Dtl_ID;
	}

	public void setDsh_Dtl_ID(int dsh_Dtl_ID) {
		this.dsh_Dtl_ID = dsh_Dtl_ID;
	}

	public String getDshAvlStsCde() {
		return this.dshAvlStsCde;
	}

	public void setDshAvlStsCde(String dshAvlStsCde) {
		this.dshAvlStsCde = dshAvlStsCde;
	}

	public BigDecimal getDsh_PRc() {
		return this.dsh_PRc;
	}

	public void setDsh_PRc(BigDecimal dsh_PRc) {
		this.dsh_PRc = dsh_PRc;
	}

	public DshMtda getDshMtda() {
		return this.dshMtda;
	}

	public void setDshMtda(DshMtda dshMtda) {
		this.dshMtda = dshMtda;
	}

	public ResDtl getResDtl() {
		return this.resDtl;
	}

	public void setResDtl(ResDtl resDtl) {
		this.resDtl = resDtl;
	}

	public List<UsrDshCmt> getUsrDshCmts() {
		return this.usrDshCmts;
	}

	public void setUsrDshCmts(List<UsrDshCmt> usrDshCmts) {
		this.usrDshCmts = usrDshCmts;
	}

	public UsrDshCmt addUsrDshCmt(UsrDshCmt usrDshCmt) {
		getUsrDshCmts().add(usrDshCmt);
		usrDshCmt.setDshDtl(this);

		return usrDshCmt;
	}

	public UsrDshCmt removeUsrDshCmt(UsrDshCmt usrDshCmt) {
		getUsrDshCmts().remove(usrDshCmt);
		usrDshCmt.setDshDtl(null);

		return usrDshCmt;
	}

	public List<UsrDshLik> getUsrDshLiks() {
		return this.usrDshLiks;
	}

	public void setUsrDshLiks(List<UsrDshLik> usrDshLiks) {
		this.usrDshLiks = usrDshLiks;
	}

	public UsrDshLik addUsrDshLik(UsrDshLik usrDshLik) {
		getUsrDshLiks().add(usrDshLik);
		usrDshLik.setDshDtl(this);

		return usrDshLik;
	}

	public UsrDshLik removeUsrDshLik(UsrDshLik usrDshLik) {
		getUsrDshLiks().remove(usrDshLik);
		usrDshLik.setDshDtl(null);

		return usrDshLik;
	}

	public List<UsrDshRvw> getUsrDshRvws() {
		return this.usrDshRvws;
	}

	public void setUsrDshRvws(List<UsrDshRvw> usrDshRvws) {
		this.usrDshRvws = usrDshRvws;
	}

	public UsrDshRvw addUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().add(usrDshRvw);
		usrDshRvw.setDshDtl(this);

		return usrDshRvw;
	}

	public UsrDshRvw removeUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().remove(usrDshRvw);
		usrDshRvw.setDshDtl(null);

		return usrDshRvw;
	}

}