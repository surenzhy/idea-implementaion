package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishCatVO implements Serializable{

	private static final long serialVersionUID = 8787977193438898795L;

	private long dshCatId;
	
	private String dshCatNme;

	public long getDshCatId() {
		return dshCatId;
	}

	public void setDshCatId(long dshCatId) {
		this.dshCatId = dshCatId;
	}

	public String getDshCatNme() {
		return dshCatNme;
	}

	public void setDshCatNme(String dshCatNme) {
		this.dshCatNme = dshCatNme;
	}
	
	
}
