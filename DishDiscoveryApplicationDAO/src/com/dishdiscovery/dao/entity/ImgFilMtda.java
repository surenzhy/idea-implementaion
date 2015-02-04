package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the IMG_FIL_MTDA database table.
 * 
 */
@Entity
@Table(name="IMG_FIL_MTDA")
@NamedQuery(name="ImgFilMtda.findAll", query="SELECT i FROM ImgFilMtda i")
public class ImgFilMtda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IMG_FLE_MTDA_ID")
	private int imgFleMtdaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRE_TMP")
	private Date creTmp;

	@Column(name="FLE_SZE_KLB")
	private int fleSzeKlb;

	@Column(name="IMG_FLE_NME")
	private String imgFleNme;

	//bi-directional many-to-one association to UsrMtda
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrMtda usrMtda;

	public ImgFilMtda() {
	}

	public int getImgFleMtdaId() {
		return this.imgFleMtdaId;
	}

	public void setImgFleMtdaId(int imgFleMtdaId) {
		this.imgFleMtdaId = imgFleMtdaId;
	}

	public Date getCreTmp() {
		return this.creTmp;
	}

	public void setCreTmp(Date creTmp) {
		this.creTmp = creTmp;
	}

	public int getFleSzeKlb() {
		return this.fleSzeKlb;
	}

	public void setFleSzeKlb(int fleSzeKlb) {
		this.fleSzeKlb = fleSzeKlb;
	}

	public String getImgFleNme() {
		return this.imgFleNme;
	}

	public void setImgFleNme(String imgFleNme) {
		this.imgFleNme = imgFleNme;
	}

	public UsrMtda getUsrMtda() {
		return this.usrMtda;
	}

	public void setUsrMtda(UsrMtda usrMtda) {
		this.usrMtda = usrMtda;
	}

}