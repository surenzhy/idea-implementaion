package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.data.RestDetailVO;
import com.dishdiscovery.dao.entity.DshMtda;

public class DishSummaryMapper {
	
	public static List<DishSummaryVO> convertDBObjectToBusinessObject(List<DshMtda> dshMtda){
		List<DishSummaryVO> dishSummaryList = new ArrayList<DishSummaryVO>();
		//TODO map data from the result set, right now returning dummy data for testing purpose
		
		DishSummaryVO summaryVo1 = new DishSummaryVO(); 
		summaryVo1.setDishId(1);
		summaryVo1.setDishName("Paneer Tikka");
		summaryVo1.setImgURL("http://test.png");
		RestDetailVO restVO = new RestDetailVO();
		restVO.setLndLneNbr("020 466665");
		restVO.setMblNbr("+91 464568468");
		restVO.setResDtlId(12L);
		restVO.setResAddr("Baner Road");
		restVO.setResNme("Green Park");
		summaryVo1.setRestDetail(restVO);
		
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
		
		summaryVo2.setRestDetail(restVO1);
		
		dishSummaryList.add(summaryVo1);
		dishSummaryList.add(summaryVo2);
		
		return dishSummaryList;
		
	}
}
