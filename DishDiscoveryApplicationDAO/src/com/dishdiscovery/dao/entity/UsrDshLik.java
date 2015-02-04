package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USR_DSH_LIK database table.
 * 
 */
@Entity
@Table(name="USR_DSH_LIK")
@NamedQuery(name="UsrDshLik.findAll", query="SELECT u FROM UsrDshLik u")
public class UsrDshLik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USR_DSH_LIK_ID")
	private int usrDshLikId;

	@Column(name="USR_DSH_LIK")
	private int usrDshLik;

	@Column(name="USR_DSH_UNLIK")
	private int usrDshUnlik;

	//bi-directional many-to-one association to DshDtl
	@ManyToOne
	@JoinColumn(name="Dsh_Dtl_ID")
	private DshDtl dshDtl;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	public UsrDshLik() {
	}

	public int getUsrDshLikId() {
		return this.usrDshLikId;
	}

	public void setUsrDshLikId(int usrDshLikId) {
		this.usrDshLikId = usrDshLikId;
	}

	public int getUsrDshLik() {
		return this.usrDshLik;
	}

	public void setUsrDshLik(int usrDshLik) {
		this.usrDshLik = usrDshLik;
	}

	public int getUsrDshUnlik() {
		return this.usrDshUnlik;
	}

	public void setUsrDshUnlik(int usrDshUnlik) {
		this.usrDshUnlik = usrDshUnlik;
	}

	public DshDtl getDshDtl() {
		return this.dshDtl;
	}

	public void setDshDtl(DshDtl dshDtl) {
		this.dshDtl = dshDtl;
	}

	public UsrMtda getUsrMtda() {
		return this.usrMtda;
	}

	public void setUsrMtda(UsrMtda usrMtda) {
		this.usrMtda = usrMtda;
	}

}