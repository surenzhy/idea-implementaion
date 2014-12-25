package com.dishdiscovery.business.service;

import com.dishdiscovery.dao.data.DishCategoryVO;
import com.dishdiscovery.service.business.exception.ServiceException;

public interface IDishDiscoveryService {

	public DishCategoryVO getAllDishCategories() throws ServiceException;
}
