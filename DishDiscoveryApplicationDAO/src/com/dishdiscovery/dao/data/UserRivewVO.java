package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserRivewVO implements Serializable {
	private static final long serialVersionUID = -7509510784268800398L;
	
	private long usrRvwId;
	private String usrCmt;
	private Timestamp creTmp;
	private UserDetailsVO userDetail;
	
	public long getUsrRvwId() {
		return usrRvwId;
	}
	public void setUsrRvwId(long usrRvwId) {
		this.usrRvwId = usrRvwId;
	}
	public String getUsrCmt() {
		return usrCmt;
	}
	public void setUsrCmt(String usrCmt) {
		this.usrCmt = usrCmt;
	}
	public Timestamp getCreTmp() {
		return creTmp;
	}
	public void setCreTmp(Timestamp creTmp) {
		this.creTmp = creTmp;
	}
	public UserDetailsVO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetailsVO userDetail) {
		this.userDetail = userDetail;
	}
	
	
}
