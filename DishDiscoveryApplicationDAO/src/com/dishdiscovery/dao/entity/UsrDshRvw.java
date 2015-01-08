package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the USR_DSH_RVW database table.
 * 
 */
@Entity
@Table(name="USR_DSH_RVW")
@NamedQuery(name="UsrDshRvw.findAll", query="SELECT u FROM UsrDshRvw u")
public class UsrDshRvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USR_DSH_RVW_ID")
	private long usrDshRvwId;

	@Column(name="CRE_TMP")
	private Timestamp creTmp;

	@Column(name="USR_DSH_CMT")
	private String usrDshCmt;

	//bi-directional many-to-one association to DshDtl
	@ManyToOne
	@JoinColumn(name="DSH_DTL_ID")
	private DshDtl dshDtl;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	public UsrDshRvw() {
	}

	public long getUsrDshRvwId() {
		return this.usrDshRvwId;
	}

	public void setUsrDshRvwId(long usrDshRvwId) {
		this.usrDshRvwId = usrDshRvwId;
	}

	public Timestamp getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Timestamp creTmp) {
		this.creTmp = creTmp;
	}

	public String getUsrDshCmt() {
		return this.usrDshCmt;
	}

	public void setUsrDshCmt(String usrDshCmt) {
		this.usrDshCmt = usrDshCmt;
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