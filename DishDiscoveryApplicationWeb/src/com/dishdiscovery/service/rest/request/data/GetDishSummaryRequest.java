package com.dishdiscovery.service.rest.request.data;

import com.dishdiscovery.service.rest.request.GenericRequest;

public class GetDishSummaryRequest extends GenericRequest {
	String dishName;

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	
}
