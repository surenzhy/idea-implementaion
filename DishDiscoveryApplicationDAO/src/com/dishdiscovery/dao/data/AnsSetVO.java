package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class AnsSetVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6838169293990593342L;
	
	private int ansId;
	private String ansVal;
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnsVal() {
		return ansVal;
	}
	public void setAnsVal(String ansVal) {
		this.ansVal = ansVal;
	}
	
	

}
