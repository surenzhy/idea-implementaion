package com.dishdiscovery.service.rest.response.data;

import com.dishdiscovery.dao.data.DishDetailVO;

public class GetDishDetailsResponse {

	DishDetailVO dishDetails;

	public DishDetailVO getDishDetails(String dishId) {
		return dishDetails;
	}

	public void setDishDetails(DishDetailVO dishDetails) {
		this.dishDetails = dishDetails;
	}
	
	
}
