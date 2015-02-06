package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class QsnSetVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5598606008798934607L;
	
	private int qsnId;
	private String qsnName;
	public int getQsnId() {
		return qsnId;
	}
	public void setQsnId(int qsnId) {
		this.qsnId = qsnId;
	}
	public String getQsnName() {
		return qsnName;
	}
	public void setQsnName(String qsnName) {
		this.qsnName = qsnName;
	}
	

}
