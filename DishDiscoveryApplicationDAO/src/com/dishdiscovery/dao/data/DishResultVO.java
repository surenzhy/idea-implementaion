package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.util.List;

public class DishResultVO implements Serializable {

	private static final long serialVersionUID = 5219281437582667591L;
	private String dishName;
	private String imgURL;
	private List<RestDetailVO> rstList;
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public List<RestDetailVO> getRstList() {
		return rstList;
	}
	public void setRstList(List<RestDetailVO> rstList) {
		this.rstList = rstList;
	}
	
	
}
