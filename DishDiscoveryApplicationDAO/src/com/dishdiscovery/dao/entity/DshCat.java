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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_CAT_ID")
	private long dshCatId;

	@Column(name="DSH_CAT_NME")
	private String dshCatNme;

	//bi-directional many-to-one association to DshCatTyp
	@OneToMany(mappedBy="dshCat")
	private List<DshCatTyp> dshCatTyps;

	public DshCat() {
	}

	public long getDshCatId() {
		return this.dshCatId;
	}

	public void setDshCatId(long dshCatId) {
		this.dshCatId = dshCatId;
	}

	public String getDshCatNme() {
		return this.dshCatNme;
	}

	public void setDshCatNme(String dshCatNme) {
		this.dshCatNme = dshCatNme;
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