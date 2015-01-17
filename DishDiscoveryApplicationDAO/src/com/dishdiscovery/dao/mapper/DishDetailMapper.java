package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.UserDetailsVO;
import com.dishdiscovery.dao.data.UserLikeVO;
import com.dishdiscovery.dao.data.UserRivewVO;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.UsrDhLik;
import com.dishdiscovery.dao.entity.UsrDshRvw;

public class DishDetailMapper {
	
	public static DishDetailVO convertDBObjectToBusinessObject(DshDtl dishDetailBO){
		
		DishDetailVO dishDetail = new DishDetailVO();
		
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
