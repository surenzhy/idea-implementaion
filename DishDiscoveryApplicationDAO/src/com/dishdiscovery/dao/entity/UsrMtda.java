package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the USR_MTDA database table.
 * 
 */
@Entity
@Table(name="USR_MTDA")
@NamedQuery(name="UsrMtda.findAll", query="SELECT u FROM UsrMtda u")
public class UsrMtda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USR_ID")
	private long usrId;

	@Column(name="CRE_TMP")
	private Timestamp creTmp;

	@Column(name="LST_UPD_TMP")
	private Timestamp lstUpdTmp;

	@Column(name="USR_LGN_ADDR")
	private String usrLgnAddr;

	@Column(name="USR_MBL_NBR")
	private String usrMblNbr;

	@Column(name="USR_NME")
	private String usrNme;

	@Column(name="USR_STS_CDE")
	private String usrStsCde;

	@Column(name="USR_SUR_NME")
	private String usrSurNme;

	//bi-directional many-to-one association to UsrDhLik
	@OneToMany(mappedBy="usrMtda")
	private List<UsrDhLik> usrDhLiks;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="usrMtda")
	private List<UsrDshRvw> usrDshRvws;

	//bi-directional many-to-one association to LgnMtda
	@ManyToOne
	@JoinColumn(name="LGN_MTDA_ID")
	private LgnMtda lgnMtda;

	public UsrMtda() {
	}

	public long getUsrId() {
		return this.usrId;
	}

	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}

	public Timestamp getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Timestamp creTmp) {
		this.creTmp = creTmp;
	}

	public Timestamp getLstUpdTmp() {
		return this.lstUpdTmp;
	}

	public void setLstUpdTmp(Timestamp lstUpdTmp) {
		this.lstUpdTmp = lstUpdTmp;
	}

	public String getUsrLgnAddr() {
		return this.usrLgnAddr;
	}

	public void setUsrLgnAddr(String usrLgnAddr) {
		this.usrLgnAddr = usrLgnAddr;
	}

	public String getUsrMblNbr() {
		return this.usrMblNbr;
	}

	public void setUsrMblNbr(String usrMblNbr) {
		this.usrMblNbr = usrMblNbr;
	}

	public String getUsrNme() {
		return this.usrNme;
	}

	public void setUsrNme(String usrNme) {
		this.usrNme = usrNme;
	}

	public String getUsrStsCde() {
		return this.usrStsCde;
	}

	public void setUsrStsCde(String usrStsCde) {
		this.usrStsCde = usrStsCde;
	}

	public String getUsrSurNme() {
		return this.usrSurNme;
	}

	public void setUsrSurNme(String usrSurNme) {
		this.usrSurNme = usrSurNme;
	}

	public List<UsrDhLik> getUsrDhLiks() {
		return this.usrDhLiks;
	}

	public void setUsrDhLiks(List<UsrDhLik> usrDhLiks) {
		this.usrDhLiks = usrDhLiks;
	}

	public UsrDhLik addUsrDhLik(UsrDhLik usrDhLik) {
		getUsrDhLiks().add(usrDhLik);
		usrDhLik.setUsrMtda(this);

		return usrDhLik;
	}

	public UsrDhLik removeUsrDhLik(UsrDhLik usrDhLik) {
		getUsrDhLiks().remove(usrDhLik);
		usrDhLik.setUsrMtda(null);

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
		usrDshRvw.setUsrMtda(this);

		return usrDshRvw;
	}

	public UsrDshRvw removeUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().remove(usrDshRvw);
		usrDshRvw.setUsrMtda(null);

		return usrDshRvw;
	}

	public LgnMtda getLgnMtda() {
		return this.lgnMtda;
	}

	public void setLgnMtda(LgnMtda lgnMtda) {
		this.lgnMtda = lgnMtda;
	}

}