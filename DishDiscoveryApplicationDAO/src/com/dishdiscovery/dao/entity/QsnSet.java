package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the QSN_SET database table.
 * 
 */
@Entity
@Table(name="QSN_SET")
@NamedQuery(name="QsnSet.findAll", query="SELECT q FROM QsnSet q")
public class QsnSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QSN_ID")
	private int qsnId;

	@Column(name="QSN_NME")
	private String qsnNme;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="qsnSet")
	private List<UsrDshRvw> usrDshRvws;

	public QsnSet() {
	}

	public int getQsnId() {
		return this.qsnId;
	}

	public void setQsnId(int qsnId) {
		this.qsnId = qsnId;
	}

	public String getQsnNme() {
		return this.qsnNme;
	}

	public void setQsnNme(String qsnNme) {
		this.qsnNme = qsnNme;
	}

	public List<UsrDshRvw> getUsrDshRvws() {
		return this.usrDshRvws;
	}

	public void setUsrDshRvws(List<UsrDshRvw> usrDshRvws) {
		this.usrDshRvws = usrDshRvws;
	}

	public UsrDshRvw addUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().add(usrDshRvw);
		usrDshRvw.setQsnSet(this);

		return usrDshRvw;
	}

	public UsrDshRvw removeUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().remove(usrDshRvw);
		usrDshRvw.setQsnSet(null);

		return usrDshRvw;
	}

}