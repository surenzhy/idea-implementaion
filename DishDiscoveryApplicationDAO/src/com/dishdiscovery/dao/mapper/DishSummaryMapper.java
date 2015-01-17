package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.data.RestDetailVO;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.DshMtda;
import com.dishdiscovery.dao.entity.ResDtl;

public class DishSummaryMapper {
	
	public static List<DishSummaryVO> convertDBObjectToBusinessObject(List<DshMtda> dshMtdaList){
		
		List<DishSummaryVO> dishSummaryList = new ArrayList<DishSummaryVO>();
		
		for (DshMtda dshmtda : dshMtdaList) {
			
			List<DshDtl> dshDtlList = dshmtda.getDshDtls();
			for (DshDtl dshDtl : dshDtlList) {
				
				DishSummaryVO summaryVo = new DishSummaryVO();
				summaryVo.setDishId(dshDtl.getDshDtlId());
				summaryVo.setDishName(dshDtl.getDshMtda().getDshNme());
				summaryVo.setIngredient(dshDtl.getDshMtda().getDftIng());
				
				RestDetailVO restVO = new RestDetailVO();
				ResDtl restDtl = dshDtl.getResDtl();
				if(restDtl!=null){
					restVO.setResDtlId(restDtl.getResDtlId());
					restVO.setResNme(restDtl.getResNme());
					restVO.setResAddr(restDtl.getResAddr());
					restVO.setMblNbr(restDtl.getMblNbr());
					restVO.setLndLneNbr(restDtl.getLndLneNbr());
				}
				summaryVo.setRestDetailVO(restVO);
				dishSummaryList.add(summaryVo);
			}
			
			
		}
		
		return dishSummaryList;
		
	}
}
