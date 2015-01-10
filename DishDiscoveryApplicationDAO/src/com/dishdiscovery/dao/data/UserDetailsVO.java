package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class UserDetailsVO implements Serializable{
	private static final long serialVersionUID = 1755054220794668675L;
	private long usrId;
	private String usrMblNbr;
	private String usrNme;
	private String usrSurNme;
	public long getUsrId() {
		return usrId;
	}
	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}
	public String getUsrMblNbr() {
		return usrMblNbr;
	}
	public void setUsrMblNbr(String usrMblNbr) {
		this.usrMblNbr = usrMblNbr;
	}
	public String getUsrNme() {
		return usrNme;
	}
	public void setUsrNme(String usrNme) {
		this.usrNme = usrNme;
	}
	public String getUsrSurNme() {
		return usrSurNme;
	}
	public void setUsrSurNme(String usrSurNme) {
		this.usrSurNme = usrSurNme;
	}
	
}
