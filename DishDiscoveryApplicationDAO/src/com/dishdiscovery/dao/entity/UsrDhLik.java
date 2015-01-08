package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USR_DH_LIK database table.
 * 
 */
@Entity
@Table(name="USR_DH_LIK")
@NamedQuery(name="UsrDhLik.findAll", query="SELECT u FROM UsrDhLik u")
public class UsrDhLik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USR_DSH_LIK_ID")
	private long usrDshLikId;

	@Column(name="USR_DSH_LIK")
	private BigDecimal usrDshLik;

	@Column(name="USR_DSH_UNLIK")
	private BigDecimal usrDshUnlik;

	//bi-directional many-to-one association to DshDtl
	@ManyToOne
	@JoinColumn(name="DSH_DTL_ID")
	private DshDtl dshDtl;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	public UsrDhLik() {
	}

	public long getUsrDshLikId() {
		return this.usrDshLikId;
	}

	public void setUsrDshLikId(long usrDshLikId) {
		this.usrDshLikId = usrDshLikId;
	}

	public BigDecimal getUsrDshLik() {
		return this.usrDshLik;
	}

	public void setUsrDshLik(BigDecimal usrDshLik) {
		this.usrDshLik = usrDshLik;
	}

	public BigDecimal getUsrDshUnlik() {
		return this.usrDshUnlik;
	}

	public void setUsrDshUnlik(BigDecimal usrDshUnlik) {
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