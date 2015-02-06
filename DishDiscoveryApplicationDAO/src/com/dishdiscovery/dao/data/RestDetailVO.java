package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.util.List;

public class RestDetailVO implements Serializable {
	private static final long serialVersionUID = 1034110060879168810L;
	private long resDtlId;
	private String resNme;
	
	List<ResAddressVO> resAddrList;

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

	public List<ResAddressVO> getResAddrList() {
		return resAddrList;
	}

	public void setResAddrList(List<ResAddressVO> resAddrList) {
		this.resAddrList = resAddrList;
	}


}
