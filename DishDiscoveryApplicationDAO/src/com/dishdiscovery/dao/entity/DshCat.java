package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DSH_CAT database table.
 * 
 */
@Entity
@Table(name="DSH_CAT")
@NamedQuery(name="DshCat.findAll", query="SELECT d FROM DshCat d")
public class DshCat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long dsh_Cat_ID;

	private String dsh_Cat_Nme;

	//bi-directional many-to-one association to DshCatTyp
	@OneToMany(mappedBy="dshCat")
	private List<DshCatTyp> dshCatTyps;

	public DshCat() {
	}

	public long getDsh_Cat_ID() {
		return this.dsh_Cat_ID;
	}

	public void setDsh_Cat_ID(long dsh_Cat_ID) {
		this.dsh_Cat_ID = dsh_Cat_ID;
	}

	public String getDsh_Cat_Nme() {
		return this.dsh_Cat_Nme;
	}

	public void setDsh_Cat_Nme(String dsh_Cat_Nme) {
		this.dsh_Cat_Nme = dsh_Cat_Nme;
	}

	public List<DshCatTyp> getDshCatTyps() {
		return this.dshCatTyps;
	}

	public void setDshCatTyps(List<DshCatTyp> dshCatTyps) {
		this.dshCatTyps = dshCatTyps;
	}

	public DshCatTyp addDshCatTyp(DshCatTyp dshCatTyp) {
		getDshCatTyps().add(dshCatTyp);
		dshCatTyp.setDshCat(this);

		return dshCatTyp;
	}

	public DshCatTyp removeDshCatTyp(DshCatTyp dshCatTyp) {
		getDshCatTyps().remove(dshCatTyp);
		dshCatTyp.setDshCat(null);

		return dshCatTyp;
	}

}