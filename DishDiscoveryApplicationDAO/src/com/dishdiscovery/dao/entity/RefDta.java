package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REF_DTA database table.
 * 
 */
@Entity
@Table(name="REF_DTA")
@NamedQuery(name="RefDta.findAll", query="SELECT r FROM RefDta r")
public class RefDta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RefDtaPK id;

	@Column(name="REF_DTA_ITM_CDE")
	private String refDtaItmCde;

	@Column(name="REF_DTA_ITM_VAL")
	private String refDtaItmVal;

	public RefDta() {
	}

	public RefDtaPK getId() {
		return this.id;
	}

	public void setId(RefDtaPK id) {
		this.id = id;
	}

	public String getRefDtaItmCde() {
		return this.refDtaItmCde;
	}

	public void setRefDtaItmCde(String refDtaItmCde) {
		this.refDtaItmCde = refDtaItmCde;
	}

	public String getRefDtaItmVal() {
		return this.refDtaItmVal;
	}

	public void setRefDtaItmVal(String refDtaItmVal) {
		this.refDtaItmVal = refDtaItmVal;
	}

}