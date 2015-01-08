package com.dishdiscovery.service.rest.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.GetDishcategoryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;
import com.dishdiscovery.service.rest.validators.IRequestValidator;

@Component
public class GetDishCategoryHandler extends
		DefaultRequestHandler<GetDishcategoryRequest, GetDishCategoryResponse> {

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;

	@Override
	protected GetDishCategoryResponse processRequest(
			GetDishcategoryRequest request) {
		List<DishCategoriesVO> dishCategories = dishService
				.getAllDishCategories();
		return convertServiceResponseToWebResponse(dishCategories);
	}

	private GetDishCategoryResponse convertServiceResponseToWebResponse(
			List<DishCategoriesVO> dishCategories) {
		GetDishCategoryResponse response = new GetDishCategoryResponse();
		response.setDshCategories(dishCategories);
		return response;
	}

}
