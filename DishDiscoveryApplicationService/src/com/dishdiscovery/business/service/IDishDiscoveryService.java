package com.dishdiscovery.business.service;

import java.util.List;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.service.business.exception.ServiceException;

public interface IDishDiscoveryService {

	public List<DishCategoriesVO> getAllDishCategories() throws ServiceException;
}
