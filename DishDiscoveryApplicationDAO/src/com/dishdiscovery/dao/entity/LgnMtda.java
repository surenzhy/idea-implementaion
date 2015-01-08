package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LGN_MTDA database table.
 * 
 */
@Entity
@Table(name="LGN_MTDA")
@NamedQuery(name="LgnMtda.findAll", query="SELECT l FROM LgnMtda l")
public class LgnMtda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LGN_MTDA_ID")
	private long lgnMtdaId;

	@Column(name="LGN_MTDA_DTL")
	private String lgnMtdaDtl;

	//bi-directional many-to-one association to UsrMtda
	@OneToMany(mappedBy="lgnMtda")
	private List<UsrMtda> usrMtdas;

	public LgnMtda() {
	}

	public long getLgnMtdaId() {
		return this.lgnMtdaId;
	}

	public void setLgnMtdaId(long lgnMtdaId) {
		this.lgnMtdaId = lgnMtdaId;
	}

	public String getLgnMtdaDtl() {
		return this.lgnMtdaDtl;
	}

	public void setLgnMtdaDtl(String lgnMtdaDtl) {
		this.lgnMtdaDtl = lgnMtdaDtl;
	}

	public List<UsrMtda> getUsrMtdas() {
		return this.usrMtdas;
	}

	public void setUsrMtdas(List<UsrMtda> usrMtdas) {
		this.usrMtdas = usrMtdas;
	}

	public UsrMtda addUsrMtda(UsrMtda usrMtda) {
		getUsrMtdas().add(usrMtda);
		usrMtda.setLgnMtda(this);

		return usrMtda;
	}

	public UsrMtda removeUsrMtda(UsrMtda usrMtda) {
		getUsrMtdas().remove(usrMtda);
		usrMtda.setLgnMtda(null);

		return usrMtda;
	}

}