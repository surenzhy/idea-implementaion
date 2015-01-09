package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishSummaryVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long dishId;
	private String dishName;
	private String restName;
	private String rating;
	private String lndLnNumber;
	private String mobileNumber;
	private String imgURL;
	
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
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getLndLnNumber() {
		return lndLnNumber;
	}
	public void setLndLnNumber(String lndLnNumber) {
		this.lndLnNumber = lndLnNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
