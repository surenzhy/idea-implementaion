package com.dishdiscovery.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.service.rest.handlers.Handler;
import com.dishdiscovery.service.rest.request.data.CusineType;
import com.dishdiscovery.service.rest.request.data.DishType;
import com.dishdiscovery.service.rest.request.data.GetDishDetailRequest;
import com.dishdiscovery.service.rest.request.data.GetDishListByCategoryRequest;
import com.dishdiscovery.service.rest.request.data.GetDishSummaryRequest;
import com.dishdiscovery.service.rest.request.data.GetDishcategoryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishDetailResponse;
import com.dishdiscovery.service.rest.response.data.GetDishListByCategoryResponse;
import com.dishdiscovery.service.rest.response.data.GetDishSummaryResponse;

@Component
@Path("/service")
public class DishDiscoveryRESTServiceImpl implements IDishDiscoveryRESTService {
	@Autowired
	Handler<GetDishcategoryRequest, GetDishCategoryResponse> dishCategoryHandler;
	@Autowired
	Handler<GetDishSummaryRequest, GetDishSummaryResponse> dishSummaryHandler;
	@Autowired
	Handler<GetDishDetailRequest, GetDishDetailResponse> dishDetailHandler;
	@Autowired
	Handler<GetDishListByCategoryRequest, GetDishListByCategoryResponse> dishListByCategoryHandler;

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
	@Path("dish/detail/{dishId}/{restId}")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishDetailResponse getDishDetail(
			@PathParam("dishId") String dishId, @PathParam("restId") String restId) {
		GetDishDetailRequest dishDetailsRequest = new GetDishDetailRequest();
		dishDetailsRequest.setDishId(dishId);
		dishDetailsRequest.setRestId(restId);
		return dishDetailHandler.execute(dishDetailsRequest);

	}

	@Override
	@GET
	@Path("category/{cusineType}/{dishType}/{dishName}/{pgeSize}/{pageNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishListByCategoryResponse searchDishByCategory(
			@PathParam("cusineType") CusineType cusineType,
			@PathParam("dishType") DishType dishType,
			@PathParam("dishName") String dishName,
			@PathParam("pgeSize") int pageSize, @PathParam("pageNo") int pageNo) {

		GetDishListByCategoryRequest dishListByCategoryRequest = new GetDishListByCategoryRequest();

		dishListByCategoryRequest.setCusineType(cusineType);
		dishListByCategoryRequest.setDishType(dishType);
		dishListByCategoryRequest.setDishName(dishName);
		dishListByCategoryRequest.setPageNo(pageNo);
		dishListByCategoryRequest.setPageSize(pageSize);

		return dishListByCategoryHandler.execute(dishListByCategoryRequest);
	}
}
