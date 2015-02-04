package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	@Column(name="USR_DSH_RVW_ID")
	private int usrDshRvwId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRE_TMP")
	private Date creTmp;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	//bi-directional many-to-one association to AnsSet
	@ManyToOne
	@JoinColumn(name="ANS_ID")
	private AnsSet ansSet;

	//bi-directional many-to-one association to QsnSet
	@ManyToOne
	@JoinColumn(name="QSN_ID")
	private QsnSet qsnSet;

	//bi-directional many-to-one association to DshDtl
	@ManyToOne
	@JoinColumn(name="DSH_DTL_ID")
	private DshDtl dshDtl;

	public UsrDshRvw() {
	}

	public int getUsrDshRvwId() {
		return this.usrDshRvwId;
	}

	public void setUsrDshRvwId(int usrDshRvwId) {
		this.usrDshRvwId = usrDshRvwId;
	}

	public Date getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Date creTmp) {
		this.creTmp = creTmp;
	}

	public UsrMtda getUsrMtda() {
		return this.usrMtda;
	}

	public void setUsrMtda(UsrMtda usrMtda) {
		this.usrMtda = usrMtda;
	}

	public AnsSet getAnsSet() {
		return this.ansSet;
	}

	public void setAnsSet(AnsSet ansSet) {
		this.ansSet = ansSet;
	}

	public QsnSet getQsnSet() {
		return this.qsnSet;
	}

	public void setQsnSet(QsnSet qsnSet) {
		this.qsnSet = qsnSet;
	}

	public DshDtl getDshDtl() {
		return this.dshDtl;
	}

	public void setDshDtl(DshDtl dshDtl) {
		this.dshDtl = dshDtl;
	}

}