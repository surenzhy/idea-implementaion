package com.dishdiscovery.service.rest;

import com.dishdiscovery.service.rest.request.data.CusineType;
import com.dishdiscovery.service.rest.request.data.DishType;
import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishDetailResponse;
import com.dishdiscovery.service.rest.response.data.GetDishListByCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishSummaryResponse;

public interface IDishDiscoveryRESTService {
	public GetDishCategoryResponse getAllDishCategory();
	public GetDishSummaryResponse searchDishesByName(String name, int pageSize, int pageNo);
	public GetDishDetailResponse getDishDetail(String dishId);
	public GetDishListByCategoryResponse searchDishByCategory(CusineType cusineType,
			DishType dishType, String dishName, int pageSize, int pageNo);
}