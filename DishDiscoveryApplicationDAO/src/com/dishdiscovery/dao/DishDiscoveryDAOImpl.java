package com.dishdiscovery.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishResultListByCategoryVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.entity.DshCat;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.DshMtda;
import com.dishdiscovery.dao.exception.DAOException;
import com.dishdiscovery.dao.mapper.DishDetailMapper;
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
		for (Iterator<DshCat> iterator = dishCategories.iterator(); iterator
				.hasNext();) {
			DshCat dshCat = iterator.next();
			DishCategoriesVO dishCategoryVO = new DishCategoriesVO();
			dishCategoryVO.setDshCatId(dshCat.getDsh_Cat_ID());
			dishCategoryVO.setDshCatNme(dshCat.getDsh_Cat_Nme());
			allDishCategories.add(dishCategoryVO);
		}
		return allDishCategories;
	}

	@SuppressWarnings("unchecked")
	public List<DishSummaryVO> getDishSummaryListByName(String name,
			int pageSize, int pageNo) throws DAOException {
		List<DshMtda> disMtdaList = null;
		String dishSummaryHql = "from DshMtda as dish left join fetch dish.dshCatTyp as dshCatTyp "
				+ "left join fetch dshCatTyp.dshCat left join fetch dshCatTyp.dshTyp "
				+ "inner join fetch dish.dshDtls as dshDtl inner join fetch dshDtl.resDtl where lower(dish.dshNme) like:name";

		Query query = sessionFactory.openSession().createQuery(dishSummaryHql);

		query.setParameter("name", "%" + name.toLowerCase() + "%");
		query.setFirstResult((pageNo - 1) * pageSize);
		query.setMaxResults(pageSize);

		disMtdaList = query.list();

		/*
		 * disMtdaList = sessionFactory.openSession()
		 * .createCriteria(DshMtda.class) .add(Restrictions.ilike("dshNme",
		 * name, MatchMode.ANYWHERE)) .list();
		 */

		return DishSummaryMapper.convertDBObjectToBusinessObject(disMtdaList);
	}

	public DishDetailVO getDishDetails(String dishId, String restId) throws DAOException {

		DshDtl dishDetailBO = (DshDtl) sessionFactory.openSession()
				.createCriteria(DshDtl.class)
				.add(Restrictions.idEq(Integer.valueOf(dishId))).add(Restrictions.eq("resDtl.res_dtl_id", Integer.valueOf(restId))).uniqueResult();

		return DishDetailMapper.convertDBObjectToBusinessObject(dishDetailBO);
	}

	public DishResultListByCategoryVO getDishListByCategory(String cuzType,
			String dshType, String dishName, int pageSize, int pageNo)
			throws DAOException {

		List<DshMtda> disMtdaList = null;

		if (dshType == null) {
			String dishSummaryHql = "from DshMtda as dish left join fetch dish.dshCatTyp as dshCatTyp "
					+ "left join fetch dshCatTyp.dshCat left join fetch dshCatTyp.dshTyp "
					+ "where dshCatTyp.dshCat=:cuzType groupby dshCatTyp.dshTyp";
			Query query = sessionFactory.openSession().createQuery(
					dishSummaryHql);
			query.setParameter("cuzType", cuzType);
			disMtdaList = query.list();

		} else if (cuzType == null) {
			String dishSummaryHql = "from DshMtda as dish left join fetch dish.dshCatTyp as dshCatTyp "
					+ "left join fetch dshCatTyp.dshCat left join fetch dshCatTyp.dshTyp "
					+ "where dshCatTyp.dshTyp=:dshType groupby dshCatTyp.dshCat";
			Query query = sessionFactory.openSession().createQuery(
					dishSummaryHql);
			query.setParameter("dshType", dshType);
			disMtdaList = query.list();

		} else {
			String concatCAT_TYP = cuzType + dshType;
			String dishSummaryHql = "from DshMtda as dish left join fetch dish.dshCatTyp as dshCatTyp "
					+ "where dshCatTyp=:concatCAT_TYP";
			Query query = sessionFactory.openSession().createQuery(
					dishSummaryHql);
			query.setParameter("dshType", concatCAT_TYP);
			disMtdaList = query.list();

		}

		return null;

	}

}
