package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishCategoriesVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long dshCatId;

	private String dshCatNme;

	// private List<DishCategoryTypeVO> dshCatTyps;

	public DishCategoriesVO() {
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

	/*
	 * public List<DishCategoryTypeVO> getDshCatTyps() { return this.dshCatTyps;
	 * }
	 * 
	 * public void setDshCatTyps(List<DishCategoryTypeVO> dshCatTyps) {
	 * this.dshCatTyps = dshCatTyps; }
	 */
}