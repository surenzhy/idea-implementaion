package com.dishdiscovery.dao.data;

import java.io.Serializable;



public class UserLikeVO implements Serializable {
	
	private static final long serialVersionUID = -8239224968929247314L;
	
	private long usrLikId;
	private long usrDshLik;
	private long usrDshUnlik;
	private UserDetailsVO userDetail;
	
	public long getUsrLikId() {
		return usrLikId;
	}
	public void setUsrLikId(long usrLikId) {
		this.usrLikId = usrLikId;
	}
	public long getUsrDshLik() {
		return usrDshLik;
	}
	public void setUsrDshLik(long usrDshLik) {
		this.usrDshLik = usrDshLik;
	}
	public long getUsrDshUnlik() {
		return usrDshUnlik;
	}
	public void setUsrDshUnlik(long usrDshUnlik) {
		this.usrDshUnlik = usrDshUnlik;
	}
	public UserDetailsVO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetailsVO userDetail) {
		this.userDetail = userDetail;
	}
	
	
	
	
}
