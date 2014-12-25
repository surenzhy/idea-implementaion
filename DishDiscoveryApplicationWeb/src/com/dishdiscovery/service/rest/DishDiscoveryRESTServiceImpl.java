package com.dishdiscovery.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.service.rest.handlers.Handler;
import com.dishdiscovery.service.rest.request.data.GetDishcategoryRequest;
import com.dishdiscovery.service.rest.response.data.GetDishCategoryResponse;

@Component
@Path("/service")
public class DishDiscoveryRESTServiceImpl implements IDishDiscoveryRESTService {
	@Autowired
	Handler<GetDishcategoryRequest, GetDishCategoryResponse> dishCategoryHandler;

	@GET
	@Path("categories")
	@Produces(MediaType.APPLICATION_JSON)
	public GetDishCategoryResponse getAllDishCategory() {
		return dishCategoryHandler.execute(null);

	}
}
