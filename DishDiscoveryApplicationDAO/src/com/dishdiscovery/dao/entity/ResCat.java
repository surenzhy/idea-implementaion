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
	private String res_Cat_ID;

	private String res_Cat_Nme;

	//bi-directional many-to-one association to ResDtl
	@OneToMany(mappedBy="resCat")
	private List<ResDtl> resDtls;

	public ResCat() {
	}

	public String getRes_Cat_ID() {
		return this.res_Cat_ID;
	}

	public void setRes_Cat_ID(String res_Cat_ID) {
		this.res_Cat_ID = res_Cat_ID;
	}

	public String getRes_Cat_Nme() {
		return this.res_Cat_Nme;
	}

	public void setRes_Cat_Nme(String res_Cat_Nme) {
		this.res_Cat_Nme = res_Cat_Nme;
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