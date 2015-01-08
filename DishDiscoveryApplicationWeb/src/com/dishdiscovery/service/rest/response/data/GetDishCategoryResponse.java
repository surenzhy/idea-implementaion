package com.dishdiscovery.service.rest.response.data;

import java.util.List;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.service.rest.request.GenericResponse;

public class GetDishCategoryResponse extends GenericResponse {

	List<DishCategoriesVO> dshCategories;

	public List<DishCategoriesVO> getDshCategories() {
		return dshCategories;
	}

	public void setDshCategories(List<DishCategoriesVO> dshCategories) {
		this.dshCategories = dshCategories;
	}

}
