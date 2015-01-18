package com.dishdiscovery.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.service.rest.handlers.Handler;
import com.dishdiscovery.service.rest.request.data.GetDishDetailsRequest;
import com.dishdiscovery.service.rest.request.data.GetDishSummaryRequest;
import com.dishdiscovery.service.rest.request.data.GetDishcategoryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishDetailsResponse;
import com.dishdiscovery.service.rest.response.data.GetDishSummaryResponse;

@Component
@Path("/service")
public class DishDiscoveryRESTServiceImpl implements IDishDiscoveryRESTService {
	@Autowired
	Handler<GetDishcategoryRequest, GetDishCategoryResponse> dishCategoryHandler;
	@Autowired
	Handler<GetDishSummaryRequest, GetDishSummaryResponse> dishSummaryHandler;
	@Autowired
	Handler<GetDishDetailsRequest, GetDishDetailsResponse> dishDetailsHandler;

	@GET
	@Path("categories")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishCategoryResponse getAllDishCategory() {
		return dishCategoryHandler.execute(null);

	}

	@Override
	@GET
	@Path("search/byname/{name}/{pgeSize}/{pageNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishSummaryResponse searchDishesByName(
			@PathParam("name") String name, @PathParam("pgeSize") int pageSize,
			@PathParam("pageNo") int pageNo) {
		
		GetDishSummaryRequest dishSummaryRequest = new GetDishSummaryRequest();
		
		dishSummaryRequest.setDishName(name);
		dishSummaryRequest.setPageNo(pageNo);
		dishSummaryRequest.setPageSize(pageSize);
		
		return dishSummaryHandler.execute(dishSummaryRequest);
	}

	@GET
	@Path("dish/detail/{dishId}")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishDetailsResponse getDishDetail(
			@PathParam("dishId") String dishId) {
		GetDishDetailsRequest dishDetailsRequest = new GetDishDetailsRequest();
		dishDetailsRequest.setDishId(dishId);
		return dishDetailsHandler.execute(dishDetailsRequest);

	}
}
