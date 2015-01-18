package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishTypeVO implements Serializable{
	
	private static final long serialVersionUID = -4891706146152269496L;
	private long dshTypId;
	private String dshTypNme;
	
	public long getDshTypId() {
		return dshTypId;
	}
	public void setDshTypId(long dshTypId) {
		this.dshTypId = dshTypId;
	}
	public String getDshTypNme() {
		return dshTypNme;
	}
	public void setDshTypNme(String dshTypNme) {
		this.dshTypNme = dshTypNme;
	}
	
	
}
