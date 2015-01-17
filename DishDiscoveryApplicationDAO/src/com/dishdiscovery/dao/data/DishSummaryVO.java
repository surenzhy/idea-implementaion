package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishSummaryVO implements Serializable{

	private static final long serialVersionUID = -7726654532122373120L;
	private long dishId;
	private String dishName;
	private String ingredient;
	private String imgURL;
	private RestDetailVO restDetailVO;
	
	public long getDishId() {
		return dishId;
	}
	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
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
	public RestDetailVO getRestDetailVO() {
		return restDetailVO;
	}
	public void setRestDetailVO(RestDetailVO restDetailVO) {
		this.restDetailVO = restDetailVO;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	
}
