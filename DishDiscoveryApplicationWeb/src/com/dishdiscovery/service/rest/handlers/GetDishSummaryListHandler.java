package com.dishdiscovery.service.rest.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.GetDishSummaryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishSummaryResponse;
import com.dishdiscovery.service.rest.validators.IRequestValidator;

public class GetDishSummaryListHandler extends
		DefaultRequestHandler<GetDishSummaryRequest, GetDishSummaryResponse> {

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;

	@Override
	protected GetDishSummaryResponse processRequest(
			GetDishSummaryRequest request) {
		String name = request.getDishName();
		List<DishSummaryVO> dishSummaryVOList = dishService.getDishSummaryListByName(name);
		
		return convertServiceResponseToWebResponse(dishSummaryVOList);
	}

	private GetDishSummaryResponse convertServiceResponseToWebResponse(
			List<DishSummaryVO> dishSummaryVOList) {
		
		GetDishSummaryResponse response = new GetDishSummaryResponse();
		response.setDishSummaryList(dishSummaryVOList);
		
		return response;
	}

}
