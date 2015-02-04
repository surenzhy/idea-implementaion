package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USR_DSH_CMT database table.
 * 
 */
@Entity
@Table(name="USR_DSH_CMT")
@NamedQuery(name="UsrDshCmt.findAll", query="SELECT u FROM UsrDshCmt u")
public class UsrDshCmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USR_DSH_CMT_ID")
	private int usrDshCmtId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRE_TMP")
	private Date creTmp;

	@Column(name="USR_DSH_CMT")
	private String usrDshCmt;

	//bi-directional many-to-one association to DshDtl
	@ManyToOne
	@JoinColumn(name="Dsh_Dtl_ID")
	private DshDtl dshDtl;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	public UsrDshCmt() {
	}

	public int getUsrDshCmtId() {
		return this.usrDshCmtId;
	}

	public void setUsrDshCmtId(int usrDshCmtId) {
		this.usrDshCmtId = usrDshCmtId;
	}

	public Date getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Date creTmp) {
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