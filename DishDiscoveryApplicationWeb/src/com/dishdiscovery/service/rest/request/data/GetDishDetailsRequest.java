package com.dishdiscovery.service.rest.request.data;

import com.dishdiscovery.service.rest.request.GenericRequest;

public class GetDishDetailsRequest  extends GenericRequest{
	
	String dishId;

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	

}
