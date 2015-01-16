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
			DishSummaryVO summaryVo = new DishSummaryVO();
			summaryVo.setDishId(dshmtda.getDshMtdaId());
			summaryVo.setDishName(dshmtda.getDshNme());
			List<RestDetailVO> restDetlVOList = new ArrayList<RestDetailVO>();
			List<DshDtl> dshDtlList = dshmtda.getDshDtls();
			for (DshDtl dshDtl : dshDtlList) {
				RestDetailVO restVO = new RestDetailVO();
				ResDtl restDtl = dshDtl.getResDtl();
				if(restDtl!=null){
					restVO.setResDtlId(restDtl.getResDtlId());
					restVO.setResNme(restDtl.getResNme());
					restVO.setResAddr(restDtl.getResAddr());
					restVO.setMblNbr(restDtl.getMblNbr());
					restVO.setLndLneNbr(restDtl.getLndLneNbr());
					restDetlVOList.add(restVO);
				}
			}
			
			summaryVo.setRestDetailList(restDetlVOList);
			dishSummaryList.add(summaryVo);
			
		}
		
		
		return dishSummaryList;
		
	}
}
