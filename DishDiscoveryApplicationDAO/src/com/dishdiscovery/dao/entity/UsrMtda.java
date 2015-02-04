package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
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
	@Column(name="USR_ID")
	private int usrId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRE_TMP")
	private Date creTmp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LST_UPD_TMP")
	private Date lstUpdTmp;

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

	//bi-directional many-to-one association to ImgFilMtda
	@OneToMany(mappedBy="usrMtda")
	private List<ImgFilMtda> imgFilMtdas;

	//bi-directional many-to-one association to UsrDshCmt
	@OneToMany(mappedBy="usrMtda")
	private List<UsrDshCmt> usrDshCmts;

	//bi-directional many-to-one association to UsrDshLik
	@OneToMany(mappedBy="usrMtda")
	private List<UsrDshLik> usrDshLiks;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="usrMtda")
	private List<UsrDshRvw> usrDshRvws;

	//bi-directional many-to-one association to LgnMtda
	@ManyToOne
	@JoinColumn(name="LGN_MTDA_ID")
	private LgnMtda lgnMtda;

	public UsrMtda() {
	}

	public int getUsrId() {
		return this.usrId;
	}

	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}

	public Date getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Date creTmp) {
		this.creTmp = creTmp;
	}

	public Date getLstUpdTmp() {
		return this.lstUpdTmp;
	}

	public void setLstUpdTmp(Date lstUpdTmp) {
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

	public List<ImgFilMtda> getImgFilMtdas() {
		return this.imgFilMtdas;
	}

	public void setImgFilMtdas(List<ImgFilMtda> imgFilMtdas) {
		this.imgFilMtdas = imgFilMtdas;
	}

	public ImgFilMtda addImgFilMtda(ImgFilMtda imgFilMtda) {
		getImgFilMtdas().add(imgFilMtda);
		imgFilMtda.setUsrMtda(this);

		return imgFilMtda;
	}

	public ImgFilMtda removeImgFilMtda(ImgFilMtda imgFilMtda) {
		getImgFilMtdas().remove(imgFilMtda);
		imgFilMtda.setUsrMtda(null);

		return imgFilMtda;
	}

	public List<UsrDshCmt> getUsrDshCmts() {
		return this.usrDshCmts;
	}

	public void setUsrDshCmts(List<UsrDshCmt> usrDshCmts) {
		this.usrDshCmts = usrDshCmts;
	}

	public UsrDshCmt addUsrDshCmt(UsrDshCmt usrDshCmt) {
		getUsrDshCmts().add(usrDshCmt);
		usrDshCmt.setUsrMtda(this);

		return usrDshCmt;
	}

	public UsrDshCmt removeUsrDshCmt(UsrDshCmt usrDshCmt) {
		getUsrDshCmts().remove(usrDshCmt);
		usrDshCmt.setUsrMtda(null);

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
		usrDshLik.setUsrMtda(this);

		return usrDshLik;
	}

	public UsrDshLik removeUsrDshLik(UsrDshLik usrDshLik) {
		getUsrDshLiks().remove(usrDshLik);
		usrDshLik.setUsrMtda(null);

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