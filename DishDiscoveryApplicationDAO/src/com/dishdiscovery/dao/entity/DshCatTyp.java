package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DSH_CAT_TYP database table.
 * 
 */
@Entity
@Table(name="DSH_CAT_TYP")
@NamedQuery(name="DshCatTyp.findAll", query="SELECT d FROM DshCatTyp d")
public class DshCatTyp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_CAT_TYP_ID")
	private long dshCatTypId;

	//bi-directional many-to-one association to DshCat
	@ManyToOne
	@JoinColumn(name="DSH_CAT_ID")
	private DshCat dshCat;

	//bi-directional many-to-one association to DshTyp
	@ManyToOne
	@JoinColumn(name="DSH_TYP_ID")
	private DshTyp dshTyp;

	//bi-directional many-to-one association to DshMtda
	@OneToMany(mappedBy="dshCatTyp")
	private List<DshMtda> dshMtdas;

	public DshCatTyp() {
	}

	public long getDshCatTypId() {
		return this.dshCatTypId;
	}

	public void setDshCatTypId(long dshCatTypId) {
		this.dshCatTypId = dshCatTypId;
	}

	public DshCat getDshCat() {
		return this.dshCat;
	}

	public void setDshCat(DshCat dshCat) {
		this.dshCat = dshCat;
	}

	public DshTyp getDshTyp() {
		return this.dshTyp;
	}

	public void setDshTyp(DshTyp dshTyp) {
		this.dshTyp = dshTyp;
	}

	public List<DshMtda> getDshMtdas() {
		return this.dshMtdas;
	}

	public void setDshMtdas(List<DshMtda> dshMtdas) {
		this.dshMtdas = dshMtdas;
	}

	public DshMtda addDshMtda(DshMtda dshMtda) {
		getDshMtdas().add(dshMtda);
		dshMtda.setDshCatTyp(this);

		return dshMtda;
	}

	public DshMtda removeDshMtda(DshMtda dshMtda) {
		getDshMtdas().remove(dshMtda);
		dshMtda.setDshCatTyp(null);

		return dshMtda;
	}

}