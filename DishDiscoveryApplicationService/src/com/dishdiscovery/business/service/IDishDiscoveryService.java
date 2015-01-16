package com.dishdiscovery.business.service;

import java.util.List;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.business.exception.ServiceException;

public interface IDishDiscoveryService {

	public List<DishCategoriesVO> getAllDishCategories() throws ServiceException;
	
	public List<DishSummaryVO> getDishSummaryListByName(String name) throws ServiceException;
	
	public DishDetailVO getDishDetails(String dishId) throws ServiceException;
}
