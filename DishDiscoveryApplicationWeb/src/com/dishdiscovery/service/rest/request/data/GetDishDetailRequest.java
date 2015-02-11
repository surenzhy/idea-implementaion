package com.dishdiscovery.service.rest.request.data;

import com.dishdiscovery.service.rest.request.GenericRequest;

public class GetDishDetailRequest  extends GenericRequest{
	
	private String dishId;
	private String restId;

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getRestId() {
		return restId;
	}

	public void setRestId(String restId) {
		this.restId = restId;
	}
	
	

}
