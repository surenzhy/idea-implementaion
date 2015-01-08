package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DSH_TYP database table.
 * 
 */
@Entity
@Table(name="DSH_TYP")
@NamedQuery(name="DshTyp.findAll", query="SELECT d FROM DshTyp d")
public class DshTyp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_TYP_ID")
	private long dshTypId;

	@Column(name="DSH_TYP_NME")
	private String dshTypNme;

	//bi-directional many-to-one association to DshCatTyp
	@OneToMany(mappedBy="dshTyp")
	private List<DshCatTyp> dshCatTyps;

	public DshTyp() {
	}

	public long getDshTypId() {
		return this.dshTypId;
	}

	public void setDshTypId(long dshTypId) {
		this.dshTypId = dshTypId;
	}

	public String getDshTypNme() {
		return this.dshTypNme;
	}

	public void setDshTypNme(String dshTypNme) {
		this.dshTypNme = dshTypNme;
	}

	public List<DshCatTyp> getDshCatTyps() {
		return this.dshCatTyps;
	}

	public void setDshCatTyps(List<DshCatTyp> dshCatTyps) {
		this.dshCatTyps = dshCatTyps;
	}

	public DshCatTyp addDshCatTyp(DshCatTyp dshCatTyp) {
		getDshCatTyps().add(dshCatTyp);
		dshCatTyp.setDshTyp(this);

		return dshCatTyp;
	}

	public DshCatTyp removeDshCatTyp(DshCatTyp dshCatTyp) {
		getDshCatTyps().remove(dshCatTyp);
		dshCatTyp.setDshTyp(null);

		return dshCatTyp;
	}

}