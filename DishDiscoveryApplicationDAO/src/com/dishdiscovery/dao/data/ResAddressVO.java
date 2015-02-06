package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class ResAddressVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4042398419998627907L;
	
	private String resAddr;
	private String mblNbr;
	private String lndLneNbr;
	
	public String getResAddr() {
		return resAddr;
	}
	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}
	public String getMblNbr() {
		return mblNbr;
	}
	public void setMblNbr(String mblNbr) {
		this.mblNbr = mblNbr;
	}
	public String getLndLneNbr() {
		return lndLneNbr;
	}
	public void setLndLneNbr(String lndLneNbr) {
		this.lndLneNbr = lndLneNbr;
	}
	
	

}
