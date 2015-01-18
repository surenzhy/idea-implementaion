package com.dishdiscovery.dao;

import java.util.List;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.exception.DAOException;

public interface IDishDiscoveryDAO {
	public List<DishCategoriesVO> getAllDishCategories() throws DAOException;
	List<DishSummaryVO> getDishSummaryListByName(String name, int pageSize, int pageNo) throws DAOException;
	public DishDetailVO getDishDetails(String dishId) throws DAOException;
}
