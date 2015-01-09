package com.dishdiscovery.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dishdiscovery.dao.IDishDiscoveryDAO;
import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.business.exception.ServiceException;

@Service
public class DishDiscoveryServiceImpl implements IDishDiscoveryService {

	@Autowired
	private IDishDiscoveryDAO dishDiscoveryDAO;

	public List<DishCategoriesVO> getAllDishCategories()
			throws ServiceException {
		return dishDiscoveryDAO.getAllDishCategories();

	}

	public List<DishSummaryVO> getDishSummaryListByName(String name)
			throws ServiceException {
		return dishDiscoveryDAO.getDishSummaryListByName(name);
	}



}
