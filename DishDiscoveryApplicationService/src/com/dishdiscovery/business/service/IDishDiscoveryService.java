package com.dishdiscovery.business.service;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishResultListByCategoryVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.service.business.exception.ServiceException;

public interface IDishDiscoveryService {

	public List<DishCategoriesVO> getAllDishCategories() throws ServiceException;
	
	public List<DishSummaryVO> getDishSummaryListByName(String name, int pageSize, int pageNo) throws ServiceException;
	
	public DishDetailVO getDishDetails(String dishId, String restId) throws ServiceException;
	
	public DishResultListByCategoryVO getDishListByCategory(String cuzType, String dishType, String dshName, int pageSize, int pageNo) throws ServiceException;
	
	public boolean uploadImage(Properties propFile, InputStream imageContent);
}
