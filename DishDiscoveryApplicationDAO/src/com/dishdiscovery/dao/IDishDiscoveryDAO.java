package com.dishdiscovery.dao;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.exception.DAOException;

public interface IDishDiscoveryDAO {
	public List<DishCategoriesVO> getAllDishCategories() throws DAOException;
	List<DishSummaryVO> getDishSummaryListByName(String name, int pageSize, int pageNo) throws DAOException;
	public DishDetailVO getDishDetails(String dishId) throws DAOException;
	public List<DishSummaryVO> getDishListByCategory(String cuzType,
			String dishType, String dishName, int pageSize, int pageNo) throws DAOException;
}
