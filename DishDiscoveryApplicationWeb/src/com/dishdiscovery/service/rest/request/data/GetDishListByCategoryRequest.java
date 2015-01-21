package com.dishdiscovery.service.rest.request.data;

import com.dishdiscovery.service.rest.request.GenericRequest;

public class GetDishListByCategoryRequest extends GenericRequest {
	private DishType dishType;
	private CusineType cusineType;
	private String dishName;
	private int pageSize;
	private int pageNo;


	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishType(DishType dishType) {
		this.dishType = dishType;
	}

	public CusineType getCusineType() {
		return cusineType;
	}

	public void setCusineType(CusineType cusineType) {
		this.cusineType = cusineType;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	
}
