package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RES_CAT database table.
 * 
 */
@Entity
@Table(name="RES_CAT")
@NamedQuery(name="ResCat.findAll", query="SELECT r FROM ResCat r")
public class ResCat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RES_CAT_ID")
	private long resCatId;

	@Column(name="RES_CAT_NME")
	private String resCatNme;

	//bi-directional many-to-one association to ResDtl
	@OneToMany(mappedBy="resCat")
	private List<ResDtl> resDtls;

	public ResCat() {
	}

	public long getResCatId() {
		return this.resCatId;
	}

	public void setResCatId(long resCatId) {
		this.resCatId = resCatId;
	}

	public String getResCatNme() {
		return this.resCatNme;
	}

	public void setResCatNme(String resCatNme) {
		this.resCatNme = resCatNme;
	}

	public List<ResDtl> getResDtls() {
		return this.resDtls;
	}

	public void setResDtls(List<ResDtl> resDtls) {
		this.resDtls = resDtls;
	}

	public ResDtl addResDtl(ResDtl resDtl) {
		getResDtls().add(resDtl);
		resDtl.setResCat(this);

		return resDtl;
	}

	public ResDtl removeResDtl(ResDtl resDtl) {
		getResDtls().remove(resDtl);
		resDtl.setResCat(null);

		return resDtl;
	}

}