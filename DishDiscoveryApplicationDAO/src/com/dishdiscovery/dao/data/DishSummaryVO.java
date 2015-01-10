package com.dishdiscovery.dao.data;

import java.io.Serializable;

public class DishSummaryVO implements Serializable{

	private static final long serialVersionUID = -7726654532122373120L;
	private long dishId;
	private String dishName;
	private String imgURL;
	private RestDetailVO restDetail;
	
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
	public RestDetailVO getRestDetail() {
		return restDetail;
	}
	public void setRestDetail(RestDetailVO restDetail) {
		this.restDetail = restDetail;
	}
	
	
}
