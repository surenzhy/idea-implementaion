package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class UserRivewVO implements Serializable {
	private static final long serialVersionUID = -7509510784268800398L;
	
	private long usrRvwId;
	private Date creTmp;
	private UserDetailsVO userDetail;
	
	private QsnSetVO qsn;
	private AnsSetVO ans;
	
	public long getUsrRvwId() {
		return usrRvwId;
	}
	public void setUsrRvwId(long usrRvwId) {
		this.usrRvwId = usrRvwId;
	}
	public Date getCreTmp() {
		return creTmp;
	}
	public void setCreTmp(Date creTmp) {
		this.creTmp = creTmp;
	}
	public UserDetailsVO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetailsVO userDetail) {
		this.userDetail = userDetail;
	}
	public QsnSetVO getQsn() {
		return qsn;
	}
	public void setQsn(QsnSetVO qsn) {
		this.qsn = qsn;
	}
	public AnsSetVO getAns() {
		return ans;
	}
	public void setAns(AnsSetVO ans) {
		this.ans = ans;
	}
	
	
	
}
