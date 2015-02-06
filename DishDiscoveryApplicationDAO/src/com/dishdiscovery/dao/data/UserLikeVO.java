package com.dishdiscovery.dao.data;

import java.io.Serializable;



public class UserLikeVO implements Serializable {
	
	private static final long serialVersionUID = -8239224968929247314L;
	
	private long usrLikId;
	private int usrDshLik;
	private int usrDshUnlik;
	private UserDetailsVO userDetail;
	
	public long getUsrLikId() {
		return usrLikId;
	}
	public void setUsrLikId(long usrLikId) {
		this.usrLikId = usrLikId;
	}
	public int getUsrDshLik() {
		return usrDshLik;
	}
	public void setUsrDshLik(int usrDshLik) {
		this.usrDshLik = usrDshLik;
	}
	public int getUsrDshUnlik() {
		return usrDshUnlik;
	}
	public void setUsrDshUnlik(int usrDshUnlik) {
		this.usrDshUnlik = usrDshUnlik;
	}
	public UserDetailsVO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetailsVO userDetail) {
		this.userDetail = userDetail;
	}
	
	
	
	
}
