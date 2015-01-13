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
			List<DshDtl> dshDtlList = new ArrayList<DshDtl>();
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
		
		/*DishSummaryVO summaryVo1 = new DishSummaryVO(); 
		summaryVo1.setDishId(1);
		summaryVo1.setDishName("Paneer Tikka");
		summaryVo1.setImgURL("http://test.png");
		RestDetailVO restVO = new RestDetailVO();
		restVO.setLndLneNbr("020 466665");
		restVO.setMblNbr("+91 464568468");
		restVO.setResDtlId(12L);
		restVO.setResAddr("Baner Road");
		restVO.setResNme("Green Park");
		List<RestDetailVO> restDetlVOList1 = new ArrayList<RestDetailVO>();
		restDetlVOList1.add(restVO);
		summaryVo1.setRestDetailList(restDetlVOList1);
		
		DishSummaryVO summaryVo2 = new DishSummaryVO(); 
		
		summaryVo2.setDishId(2);
		summaryVo2.setDishName("Chicken Masala");
		summaryVo2.setImgURL("http://test.png");
		RestDetailVO restVO1 = new RestDetailVO();
		restVO1.setLndLneNbr("020 466665");
		restVO1.setMblNbr("+91 464568468");
		restVO1.setResDtlId(12L);
		restVO1.setResAddr("Wakad Hinjewadi");
		restVO1.setResNme("One 2 One");
		
		List<RestDetailVO> restDetlVOList2 = new ArrayList<RestDetailVO>();
		restDetlVOList1.add(restVO1);
		summaryVo1.setRestDetailList(restDetlVOList2);
		
		dishSummaryList.add(summaryVo1);
		dishSummaryList.add(summaryVo2);*/
		
		return dishSummaryList;
		
	}
}
