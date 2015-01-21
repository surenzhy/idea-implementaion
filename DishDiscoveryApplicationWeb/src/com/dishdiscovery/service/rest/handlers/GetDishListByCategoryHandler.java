package com.dishdiscovery.service.rest.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.CusineType;
import com.dishdiscovery.service.rest.request.data.DishType;
import com.dishdiscovery.service.rest.request.data.GetDishListByCategoryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishListByCategoryResponse;
import com.dishdiscovery.service.rest.validators.IRequestValidator;

@Component
public class GetDishListByCategoryHandler extends
		DefaultRequestHandler<GetDishListByCategoryRequest, GetDishListByCategoryResponse> {

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;

	@Override
	protected GetDishListByCategoryResponse processRequest(
			GetDishListByCategoryRequest request) {
		CusineType cuzType = request.getCusineType();
		DishType dshType = request.getDishType();
		int pageSize = request.getPageSize();
		int pageNum = request.getPageNo();
		String dishName = request.getDishName();
		List<DishSummaryVO> dishSummaryVOList = dishService.getDishListByCategory(cuzType.toString(), dshType.toString(),dishName, pageSize, pageNum);
		
		return convertServiceResponseToWebResponse(dishSummaryVOList);
	}

	private GetDishListByCategoryResponse convertServiceResponseToWebResponse(
			List<DishSummaryVO> dishSummaryVOList) {
		
		GetDishListByCategoryResponse response = new GetDishListByCategoryResponse();
		response.setDishSummaryList(dishSummaryVOList);
		
		return response;
	}

}
