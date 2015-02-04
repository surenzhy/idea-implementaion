package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ANS_SET database table.
 * 
 */
@Entity
@Table(name="ANS_SET")
@NamedQuery(name="AnsSet.findAll", query="SELECT a FROM AnsSet a")
public class AnsSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ANS_ID")
	private int ansId;

	@Column(name="ANS_VAL")
	private String ansVal;

	//bi-directional many-to-one association to UsrDshRvw
	@OneToMany(mappedBy="ansSet")
	private List<UsrDshRvw> usrDshRvws;

	public AnsSet() {
	}

	public int getAnsId() {
		return this.ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnsVal() {
		return this.ansVal;
	}

	public void setAnsVal(String ansVal) {
		this.ansVal = ansVal;
	}

	public List<UsrDshRvw> getUsrDshRvws() {
		return this.usrDshRvws;
	}

	public void setUsrDshRvws(List<UsrDshRvw> usrDshRvws) {
		this.usrDshRvws = usrDshRvws;
	}

	public UsrDshRvw addUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().add(usrDshRvw);
		usrDshRvw.setAnsSet(this);

		return usrDshRvw;
	}

	public UsrDshRvw removeUsrDshRvw(UsrDshRvw usrDshRvw) {
		getUsrDshRvws().remove(usrDshRvw);
		usrDshRvw.setAnsSet(null);

		return usrDshRvw;
	}

}