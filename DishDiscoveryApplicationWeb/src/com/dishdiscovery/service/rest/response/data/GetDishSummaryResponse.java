package com.dishdiscovery.service.rest.response.data;

import java.util.List;

import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.rest.request.GenericResponse;

public class GetDishSummaryResponse extends GenericResponse{
	private List<DishSummaryVO> dishSummaryList;

	public List<DishSummaryVO> getDishSummaryList() {
		return dishSummaryList;
	}

	public void setDishSummaryList(List<DishSummaryVO> dishSummaryList) {
		this.dishSummaryList = dishSummaryList;
	}
	
}
