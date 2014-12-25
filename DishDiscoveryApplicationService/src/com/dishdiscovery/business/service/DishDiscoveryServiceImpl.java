package com.dishdiscovery.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dishdiscovery.dao.IDishDiscoveryDAO;
import com.dishdiscovery.dao.data.DishCategoryVO;
import com.dishdiscovery.service.business.exception.ServiceException;

@Service
public class DishDiscoveryServiceImpl implements IDishDiscoveryService {

	@Autowired
	private IDishDiscoveryDAO dishDiscoveryDAO;

	public DishCategoryVO getAllDishCategories() throws ServiceException {
		dishDiscoveryDAO.getAllDishCategories();
		return null;
	}

}
