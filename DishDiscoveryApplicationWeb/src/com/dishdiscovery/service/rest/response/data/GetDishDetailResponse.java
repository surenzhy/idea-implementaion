package com.dishdiscovery.service.rest.response.data;

import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.service.rest.request.GenericResponse;

public class GetDishDetailResponse extends GenericResponse{

	private DishDetailVO dishDetail;

	public DishDetailVO getDishDetail() {
		return dishDetail;
	}

	public void setDishDetail(DishDetailVO dishDetail) {
		this.dishDetail = dishDetail;
	}

	
	
}
