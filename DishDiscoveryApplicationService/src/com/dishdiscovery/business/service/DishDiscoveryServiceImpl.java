package com.dishdiscovery.business.service;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dishdiscovery.dao.IDishDiscoveryDAO;
import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
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

	public List<DishSummaryVO> getDishSummaryListByName(String name,
			int pageSize, int pageNo) throws ServiceException {
		return dishDiscoveryDAO
				.getDishSummaryListByName(name, pageSize, pageNo);
	}

	public DishDetailVO getDishDetails(String dishId) throws ServiceException {
		return dishDiscoveryDAO.getDishDetails(dishId);

	}

	public List<DishSummaryVO> getDishListByCategory(String cuzType,
			String dishType, String dshName, int pageSize, int pageNo) throws ServiceException {
		return dishDiscoveryDAO.getDishListByCategory(cuzType, dishType,
				dshName, pageSize, pageNo);
	}

	public boolean uploadImage(Properties propFile, InputStream imageContent) {
		return true;
	}

}
