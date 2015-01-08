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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DSH_SYN_ID")
	private long dshSynId;

	@Column(name="DSH_SYN_MTDA_ID")
	private BigDecimal dshSynMtdaId;

	//bi-directional many-to-one association to DshMtda
	@ManyToOne
	@JoinColumn(name="DSH_MTDA_ID")
	private DshMtda dshMtda;

	public DshSyn() {
	}

	public long getDshSynId() {
		return this.dshSynId;
	}

	public void setDshSynId(long dshSynId) {
		this.dshSynId = dshSynId;
	}

	public BigDecimal getDshSynMtdaId() {
		return this.dshSynMtdaId;
	}

	public void setDshSynMtdaId(BigDecimal dshSynMtdaId) {
		this.dshSynMtdaId = dshSynMtdaId;
	}

	public DshMtda getDshMtda() {
		return this.dshMtda;
	}

	public void setDshMtda(DshMtda dshMtda) {
		this.dshMtda = dshMtda;
	}

}