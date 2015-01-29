package com.dishdiscovery.service.rest.response.data;

import com.dishdiscovery.dao.data.DishResultListByCategoryVO;
import com.dishdiscovery.service.rest.request.GenericResponse;

public class GetDishListByCategoryResponse extends GenericResponse{
	private DishResultListByCategoryVO dshRsltListByCat;

	public DishResultListByCategoryVO getDshRsltListByCat() {
		return dshRsltListByCat;
	}

	public void setDshRsltListByCat(DishResultListByCategoryVO dshRsltListByCat) {
		this.dshRsltListByCat = dshRsltListByCat;
	}
	
}
