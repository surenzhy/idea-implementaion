package com.dishdiscovery.service.rest.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.GetDishDetailRequest;
import com.dishdiscovery.service.rest.response.data.GetDishDetailResponse;
import com.dishdiscovery.service.rest.validators.IRequestValidator;
@Component
public class GetDishDetailHandler extends DefaultRequestHandler<GetDishDetailRequest, GetDishDetailResponse>{

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;
	
	
	@Override
	protected GetDishDetailResponse processRequest(
			GetDishDetailRequest request) {
		
		String dishId = request.getDishId();
		String restId = request.getRestId();
		DishDetailVO dishDetails = dishService.getDishDetails(dishId, restId);
		return convertServiceResponseToWebResponse(dishDetails);
	}

	private GetDishDetailResponse convertServiceResponseToWebResponse(
			DishDetailVO dishDetails) {
		GetDishDetailResponse response = new GetDishDetailResponse();
		response.setDishDetail(dishDetails);
		return response;
	}
	
}
