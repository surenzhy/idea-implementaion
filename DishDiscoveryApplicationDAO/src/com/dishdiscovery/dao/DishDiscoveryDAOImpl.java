package com.dishdiscovery.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.entity.DshCat;
import com.dishdiscovery.dao.entity.DshMtda;
import com.dishdiscovery.dao.exception.DAOException;
import com.dishdiscovery.dao.mapper.DishSummaryMapper;

@Repository
public class DishDiscoveryDAOImpl implements IDishDiscoveryDAO {
	@Autowired
	SessionFactory sessionFactory;

	public List<DishCategoriesVO> getAllDishCategories() throws DAOException {
		@SuppressWarnings("unchecked")
		List<DshCat> disCategories = sessionFactory.openSession()
				.createCriteria(DshCat.class).list();
		return convertDBObjectToBusinessObject(disCategories);
	}
	
	private List<DishCategoriesVO> convertDBObjectToBusinessObject(
			List<DshCat> dishCategories) {
		List<DishCategoriesVO> allDishCategories = new ArrayList<DishCategoriesVO>();
		for (Iterator<DshCat> iterator = dishCategories.iterator(); iterator.hasNext();) {
			DshCat dshCat = iterator.next();
			DishCategoriesVO dishCategoryVO = new DishCategoriesVO();
			dishCategoryVO.setDshCatId(dshCat.getDshCatId());
			dishCategoryVO.setDshCatNme(dshCat.getDshCatNme());
			allDishCategories.add(dishCategoryVO);
		}
		return allDishCategories;
	}

	public List<DishSummaryVO> getDishSummaryListByName(String name)
			throws DAOException {
		List<DshMtda> disMtdaList = new ArrayList<DshMtda>();
		/*@SuppressWarnings("unchecked")
		List<DshMtda> disMtdaList = sessionFactory.openSession()
				.createCriteria(DshMtda.class).add(Restrictions.ilike("dshNme", name)).list();
*/		
		return DishSummaryMapper.convertDBObjectToBusinessObject(disMtdaList);
	}
	

}
