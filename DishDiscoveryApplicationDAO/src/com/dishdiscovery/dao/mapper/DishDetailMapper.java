package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.AnsSetVO;
import com.dishdiscovery.dao.data.DishCatVO;
import com.dishdiscovery.dao.data.DishDetailVO;
import com.dishdiscovery.dao.data.DishTypeVO;
import com.dishdiscovery.dao.data.QsnSetVO;
import com.dishdiscovery.dao.data.ResAddressVO;
import com.dishdiscovery.dao.data.RestDetailVO;
import com.dishdiscovery.dao.data.UserDetailsVO;
import com.dishdiscovery.dao.data.UserLikeVO;
import com.dishdiscovery.dao.data.UserRivewVO;
import com.dishdiscovery.dao.entity.AnsSet;
import com.dishdiscovery.dao.entity.DshCat;
import com.dishdiscovery.dao.entity.DshCatTyp;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.DshTyp;
import com.dishdiscovery.dao.entity.QsnSet;
import com.dishdiscovery.dao.entity.ResDtl;
import com.dishdiscovery.dao.entity.ResDtlMtda;
import com.dishdiscovery.dao.entity.UsrDshLik;
import com.dishdiscovery.dao.entity.UsrDshRvw;

public class DishDetailMapper {

	public static DishDetailVO convertDBObjectToBusinessObject(
			DshDtl dishDetailBO) {

		DishDetailVO dishDetail = new DishDetailVO();

		converBasicDishDetails(dishDetail, dishDetailBO);
		convertUserReviewDBObject(dishDetail, dishDetailBO);
		convertUserLikesDBObject(dishDetail, dishDetailBO);
		convertDishCatandTypDBObject(dishDetail, dishDetailBO);
		
		return dishDetail;

	}

	private static void converBasicDishDetails(DishDetailVO dishDetail,
			DshDtl dishDetailBO) {

		dishDetail.setDshPrc(dishDetailBO.getDsh_PRc());
		dishDetail.setDishName(dishDetailBO.getDshMtda().getDshNme());
		dishDetail.setDishId(dishDetailBO.getDsh_Dtl_ID());
		dishDetail.setDshAvlStsCde(dishDetailBO.getDshAvlStsCde());
		dishDetail.setDshDtlId(dishDetailBO.getDsh_Dtl_ID());
		dishDetail.setIngredient(dishDetailBO.getDshMtda().getDftIng());
		
		ResDtl resDtl = dishDetailBO.getResDtl();
		RestDetailVO resDetailVO = new RestDetailVO();
		if(resDtl!=null){
			resDetailVO.setResDtlId(resDtl.getRes_dtl_id());
			resDetailVO.setResNme(resDtl.getRes_nme());
			
			List<ResDtlMtda> resMtdaList = resDtl.getResDtlMtdas();
			List<ResAddressVO> resAddrList = new ArrayList<ResAddressVO>(0);
			
			for (ResDtlMtda resDtlMtda : resMtdaList) {
				ResAddressVO resAddr = new ResAddressVO();
				resAddr.setResAddr(resDtlMtda.getResAddr());
				resAddr.setMblNbr(resDtlMtda.getMblNbr());
				resAddr.setLndLneNbr(resDtlMtda.getLndLneNbr());
				resAddrList.add(resAddr);
			}
			
			resDetailVO.setResAddrList(resAddrList);
			
		}
		
		dishDetail.setRestDetailVO(resDetailVO);


	}

	private static void convertUserReviewDBObject(DishDetailVO dishDetail,
			DshDtl dishDetailBO) {
		// Populate User Review List.
		List<UserRivewVO> userReviewList = new ArrayList<UserRivewVO>();
		List<UsrDshRvw> userDshBO = dishDetailBO.getUsrDshRvws();
		for (UsrDshRvw userReview : userDshBO) {
			UserRivewVO userReviewObj = new UserRivewVO();
			userReviewObj.setCreTmp(userReview.getCreTmp());
			//userReviewObj.setUsrCmt(userReview.g);//TODO
			userReviewObj.setUsrRvwId(userReview.getUsrDshRvwId());
			
			QsnSet qsnSet = userReview.getQsnSet();
			
			if(qsnSet!=null){
				QsnSetVO qsnVO = new QsnSetVO();
				qsnVO.setQsnId(qsnSet.getQsnId());
				qsnVO.setQsnName(qsnSet.getQsnNme());
				userReviewObj.setQsn(qsnVO);
			}
			
			AnsSet ansSet = userReview.getAnsSet();
			
			if(ansSet!=null){
				AnsSetVO ansVo = new AnsSetVO();
				ansVo.setAnsId(ansSet.getAnsId());
				ansVo.setAnsVal(ansSet.getAnsVal());
				userReviewObj.setAns(ansVo);
			}
			
			// Populating User Details meta data.
			UserDetailsVO userDetails = new UserDetailsVO();
			userDetails.setUsrId(userReview.getUsrMtda().getUsrId());
			userDetails.setUsrMblNbr(userReview.getUsrMtda().getUsrMblNbr());
			userDetails.setUsrNme(userReview.getUsrMtda().getUsrNme());
			userDetails.setUsrSurNme(userReview.getUsrMtda().getUsrSurNme());

			userReviewObj.setUserDetail(userDetails);
			userReviewList.add(userReviewObj);

		}

		dishDetail.setUserRivewList(userReviewList);
	}
	
	private static void convertUserLikesDBObject(DishDetailVO dishDetail,
			DshDtl dishDetailBO){
		
		List<UserLikeVO> userLikeList = new ArrayList<UserLikeVO>();
		List<UsrDshLik> userDshLikBO = dishDetailBO.getUsrDshLiks();

		for (UsrDshLik userDishLike : userDshLikBO) {

			UserLikeVO userLikeObj = new UserLikeVO();
			userLikeObj.setUsrDshLik(userDishLike.getUsrDshLik());
			userLikeObj.setUsrDshUnlik(userDishLike.getUsrDshUnlik());
			userLikeObj.setUsrLikId(userDishLike.getUsrDshLikId());

			// Populating User Details meta data.
			UserDetailsVO userDetails = new UserDetailsVO();
			userDetails.setUsrId(userDishLike.getUsrMtda().getUsrId());
			userDetails.setUsrMblNbr(userDishLike.getUsrMtda().getUsrMblNbr());
			userDetails.setUsrNme(userDishLike.getUsrMtda().getUsrNme());
			userDetails.setUsrSurNme(userDishLike.getUsrMtda().getUsrSurNme());

			userLikeObj.setUserDetail(userDetails);
			userLikeList.add(userLikeObj);

		}
		dishDetail.setUserLikeList(userLikeList);

		
	}
	
	private static void convertDishCatandTypDBObject(DishDetailVO dishDetail,
			DshDtl dishDetailBO){
		
		if (dishDetailBO.getDshMtda() != null) {

			DshCatTyp dshCatType = dishDetailBO.getDshMtda().getDshCatTyp();
			if (dshCatType != null) {

				DshCat dshCat = dshCatType.getDshCat();
				DishCatVO dshCatVO = new DishCatVO();

				if (dshCat != null) {
					dshCatVO.setDshCatId(dshCat.getDsh_Cat_ID());
					dshCatVO.setDshCatNme(dshCat.getDsh_Cat_Nme());
				}
				dishDetail.setDshCatVO(dshCatVO);

				DshTyp dshTyp = dshCatType.getDshTyp();
				DishTypeVO dshTypVO = new DishTypeVO();
				if (dshTyp != null) {
					dshTypVO.setDshTypId(dshTyp.getDshTypId());
					dshTypVO.setDshTypNme(dshTyp.getDsh_Typ_Nme());
				}
				dishDetail.setDshTypVO(dshTypVO);

			}
		}
	}

}
