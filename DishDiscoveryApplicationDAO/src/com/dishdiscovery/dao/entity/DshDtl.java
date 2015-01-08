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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_DTL_ID")
	private long dshDtlId;

	@Column(name="DSH_AVL_STS_CDE")
	private String dshAvlStsCde;

	@Column(name="DSH_PRC")
	private BigDecimal dshPrc;

	//bi-directional many-to-one association to DshMtda
	@ManyToOne
	@JoinColumn(name="DSH_MTDA_ID")
	private DshMtda dshMtda;

	//bi-directional many-to-one association to ResDtl
	@ManyToOne
	@JoinColumn(name="RES_DTL_ID")
	private ResDtl resDtl;

	//bi-directional many-to-one association to UsrDhLik
	@OneToMany(mappedBy="dshDtl")
	private List<UsrDhLik> usrDhLiks;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="dshDtl")
	private List<UsrDshRvw> usrDshRvws;

	public DshDtl() {
	}

	public long getDshDtlId() {
		return this.dshDtlId;
	}

	public void setDshDtlId(long dshDtlId) {
		this.dshDtlId = dshDtlId;
	}

	public String getDshAvlStsCde() {
		return this.dshAvlStsCde;
	}

	public void setDshAvlStsCde(String dshAvlStsCde) {
		this.dshAvlStsCde = dshAvlStsCde;
	}

	public BigDecimal getDshPrc() {
		return this.dshPrc;
	}

	public void setDshPrc(BigDecimal dshPrc) {
		this.dshPrc = dshPrc;
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

	public List<UsrDhLik> getUsrDhLiks() {
		return this.usrDhLiks;
	}

	public void setUsrDhLiks(List<UsrDhLik> usrDhLiks) {
		this.usrDhLiks = usrDhLiks;
	}

	public UsrDhLik addUsrDhLik(UsrDhLik usrDhLik) {
		getUsrDhLiks().add(usrDhLik);
		usrDhLik.setDshDtl(this);

		return usrDhLik;
	}

	public UsrDhLik removeUsrDhLik(UsrDhLik usrDhLik) {
		getUsrDhLiks().remove(usrDhLik);
		usrDhLik.setDshDtl(null);

		return usrDhLik;
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