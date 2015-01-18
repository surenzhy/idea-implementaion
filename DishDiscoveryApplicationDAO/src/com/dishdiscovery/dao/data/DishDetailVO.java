package com.dishdiscovery.dao.data;

import java.math.BigDecimal;
import java.util.List;


public class DishDetailVO extends DishSummaryVO {
	
	private static final long serialVersionUID = -6819314398948303901L;
	
	private long dshDtlId;
	private BigDecimal dshPrc;
	private List<UserRivewVO> userRivewList;
	private List<UserLikeVO> userLikeList;
	private String dshAvlStsCde;
	
	private DishCatVO dshCat;
	private DishTypeVO dshTyp;
	
	public long getDshDtlId() {
		return dshDtlId;
	}
	public void setDshDtlId(long dshDtlId) {
		this.dshDtlId = dshDtlId;
	}
	public BigDecimal getDshPrc() {
		return dshPrc;
	}
	public void setDshPrc(BigDecimal dshPrc) {
		this.dshPrc = dshPrc;
	}
	public List<UserRivewVO> getUserRivewList() {
		return userRivewList;
	}
	public void setUserRivewList(List<UserRivewVO> userRivewList) {
		this.userRivewList = userRivewList;
	}
	public String getDshAvlStsCde() {
		return dshAvlStsCde;
	}
	public void setDshAvlStsCde(String dshAvlStsCde) {
		this.dshAvlStsCde = dshAvlStsCde;
	}
	public List<UserLikeVO> getUserLikeList() {
		return userLikeList;
	}
	public void setUserLikeList(List<UserLikeVO> userLikeList) {
		this.userLikeList = userLikeList;
	}
	public DishCatVO getDshCatVO() {
		return dshCat;
	}
	public void setDshCatVO(DishCatVO dshCatVO) {
		this.dshCat = dshCatVO;
	}
	public DishTypeVO getDshTypVO() {
		return dshTyp;
	}
	public void setDshTypVO(DishTypeVO dshTypVO) {
		this.dshTyp = dshTypVO;
	}
	
	
	
}
