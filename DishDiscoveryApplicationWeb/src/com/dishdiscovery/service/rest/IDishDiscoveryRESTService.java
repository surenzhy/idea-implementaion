package com.dishdiscovery.service.rest;

import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishDetailsResponse;
import com.dishdiscovery.service.rest.response.data.GetDishSummaryResponse;

public interface IDishDiscoveryRESTService {
	public GetDishCategoryResponse getAllDishCategory();
	public GetDishSummaryResponse searchDishesByName(String name);
	public GetDishDetailsResponse getDishDetail(String dishId);
}