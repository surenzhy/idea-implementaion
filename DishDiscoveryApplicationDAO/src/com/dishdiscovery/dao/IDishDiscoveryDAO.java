package com.dishdiscovery.dao;

import com.dishdiscovery.dao.data.DishCategoryVO;
import com.dishdiscovery.dao.exception.DAOException;

public interface IDishDiscoveryDAO {
	public DishCategoryVO getAllDishCategories() throws DAOException;
}
