package com.dishdiscovery.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dishdiscovery.dao.data.DishCategoriesVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.data.UserDetailsVO;
import com.dishdiscovery.dao.data.UserLikeVO;
import com.dishdiscovery.dao.data.UserRivewVO;
import com.dishdiscovery.dao.entity.DshCat;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.DshMtda;
import com.dishdiscovery.dao.entity.UsrDhLik;
import com.dishdiscovery.dao.entity.UsrDshRvw;
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

	@SuppressWarnings("unchecked")
	public List<DishSummaryVO> getDishSummaryListByName(String name)
			throws DAOException {
		List<DshMtda> disMtdaList = null;
		
		 disMtdaList = sessionFactory.openSession()
				.createCriteria(DshMtda.class).add(Restrictions.ilike("dshNme", name)).list();
		
		return DishSummaryMapper.convertDBObjectToBusinessObject(disMtdaList);
	}
	
	public DishDetailVO getDishDetails(String dishId) throws DAOException {
		// TODO Auto-generated method stub
		
		DishDetailVO dishDetail = new DishDetailVO();
		
	//	Session session = sessionFactory.openSession();
		DshDtl dishDetailBO = (DshDtl) sessionFactory.openSession().createCriteria(DshDtl.class).add(Restrictions.idEq(dishId));
		
		dishDetail.setDshPrc(dishDetailBO.getDshPrc());
		dishDetail.setDishName(dishDetailBO.getDshMtda().getDshNme());
		dishDetail.setDshAvlStsCde(dishDetailBO.getDshAvlStsCde());
		
		//Populate User Review List.
		List<UserRivewVO> userReviewList = new ArrayList<UserRivewVO>();
		List<UsrDshRvw> userDshBO = dishDetailBO.getUsrDshRvws();
		for(UsrDshRvw userReview : userDshBO){
			UserRivewVO userReviewObj = new UserRivewVO();
			userReviewObj.setCreTmp(userReview.getCreTmp());
			userReviewObj.setUsrCmt(userReview.getUsrDshCmt());
			userReviewObj.setUsrRvwId(userReview.getUsrDshRvwId());
			
			//Populating User Details meta data.
			UserDetailsVO userDetails = new UserDetailsVO();
			userDetails.setUsrId(userReview.getUsrMtda().getUsrId());
			userDetails.setUsrMblNbr(userReview.getUsrMtda().getUsrMblNbr());
			userDetails.setUsrNme(userReview.getUsrMtda().getUsrNme());
			userDetails.setUsrSurNme(userReview.getUsrMtda().getUsrSurNme());
			
			userReviewObj.setUserDetail(userDetails);
			userReviewList.add(userReviewObj);
			
		}
		
		dishDetail.setUserRivewList(userReviewList);
		
		
		List<UserLikeVO> userLikeList = new ArrayList<UserLikeVO>();
		List<UsrDhLik> userDshLikBO = dishDetailBO.getUsrDhLiks();
		
		for(UsrDhLik userDishLike : userDshLikBO){
			
			UserLikeVO userLikeObj = new UserLikeVO();
			userLikeObj.setUsrDshLik(Long.parseLong(userDishLike.getUsrDshLik().toString()));
			userLikeObj.setUsrDshUnlik(Long.parseLong(userDishLike.getUsrDshUnlik().toString()));
			userLikeObj.setUsrLikId(userDishLike.getUsrDshLikId());
			
			//Populating User Details meta data.
			UserDetailsVO userDetails = new UserDetailsVO();
			userDetails.setUsrId(userDishLike.getUsrMtda().getUsrId());
			userDetails.setUsrMblNbr(userDishLike.getUsrMtda().getUsrMblNbr());
			userDetails.setUsrNme(userDishLike.getUsrMtda().getUsrNme());
			userDetails.setUsrSurNme(userDishLike.getUsrMtda().getUsrSurNme());
			
			userLikeObj.setUserDetail(userDetails);
			userLikeList.add(userLikeObj);
			
		}
		
		dishDetail.setUserLikeList(userLikeList);
		
		
		return dishDetail;
	}
	

}
