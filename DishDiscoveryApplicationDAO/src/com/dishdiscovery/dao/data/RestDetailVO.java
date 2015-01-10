package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class RestDetailVO implements Serializable {
	private static final long serialVersionUID = 1034110060879168810L;
	private long resDtlId;
	private String resNme;
	private String resAddr;
	private String mblNbr;
	private String lndLneNbr;

	public long getResDtlId() {
		return resDtlId;
	}

	public void setResDtlId(long resDtlId) {
		this.resDtlId = resDtlId;
	}

	public String getResNme() {
		return resNme;
	}

	public void setResNme(String resNme) {
		this.resNme = resNme;
	}

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
