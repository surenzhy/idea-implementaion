package com.dishdiscovery.service.rest.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.GetDishDetailsRequest;
import com.dishdiscovery.service.rest.response.data.GetDishDetailsResponse;
import com.dishdiscovery.service.rest.validators.IRequestValidator;
@Component
public class GetDishDetailsHandler extends DefaultRequestHandler<GetDishDetailsRequest, GetDishDetailsResponse>{

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;
	
	
	@Override
	protected GetDishDetailsResponse processRequest(
			GetDishDetailsRequest request) {
		
		String dishId = request.getDishId();
		DishDetailVO dishDetails = dishService.getDishDetails(dishId);
		return convertServiceResponseToWebResponse(dishDetails);
	}

	private GetDishDetailsResponse convertServiceResponseToWebResponse(
			DishDetailVO dishDetails) {
		GetDishDetailsResponse response = new GetDishDetailsResponse();
		response.setDishDetails(dishDetails);
		return response;
	}
	
}
