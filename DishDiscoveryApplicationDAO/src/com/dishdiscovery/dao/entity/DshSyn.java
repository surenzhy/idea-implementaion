package com.dishdiscovery.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DSH_SYN database table.
 * 
 */
@Entity
@Table(name="DSH_SYN")
@NamedQuery(name="DshSyn.findAll", query="SELECT d FROM DshSyn d")
public class DshSyn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DSH_SYN_ID")
	private int dshSynId;

	@Column(name="DSH_MTDA_ID")
	private BigDecimal dshMtdaId;

	//bi-directional many-to-one association to DshMtda
	@ManyToOne
	@JoinColumn(name="DSH_SYN_MTDA_ID2")
	private DshMtda dshMtda;

	public DshSyn() {
	}

	public int getDshSynId() {
		return this.dshSynId;
	}

	public void setDshSynId(int dshSynId) {
		this.dshSynId = dshSynId;
	}

	public BigDecimal getDshMtdaId() {
		return this.dshMtdaId;
	}

	public void setDshMtdaId(BigDecimal dshMtdaId) {
		this.dshMtdaId = dshMtdaId;
	}

	public DshMtda getDshMtda() {
		return this.dshMtda;
	}

	public void setDshMtda(DshMtda dshMtda) {
		this.dshMtda = dshMtda;
	}

}