package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.entity.DshMtda;

public class DishSummaryMapper {
	
	public static List<DishSummaryVO> convertDBObjectToBusinessObject(List<DshMtda> dshMtda){
		List<DishSummaryVO> dishSummaryList = new ArrayList<DishSummaryVO>();
		//TODO map data from the result set, right now returning dummy data for testing purpose
		
		DishSummaryVO summaryVo1 = new DishSummaryVO(); 
		summaryVo1.setDishId(1);
		summaryVo1.setDishName("Paneer Tikka");
		summaryVo1.setImgURL("http://test.png");
		summaryVo1.setLndLnNumber("020 466665");
		summaryVo1.setMobileNumber("+91 464568468");
		summaryVo1.setRating("****");
		summaryVo1.setRestName("Green Park");
		
		DishSummaryVO summaryVo2 = new DishSummaryVO(); 
		
		summaryVo2.setDishId(1);
		summaryVo2.setDishName("Chicken Masala");
		summaryVo2.setImgURL("http://test.png");
		summaryVo2.setLndLnNumber("020 466665");
		summaryVo2.setMobileNumber("+91 464568468");
		summaryVo2.setRating("***");
		summaryVo2.setRestName("XYZ Park");
		dishSummaryList.add(summaryVo1);
		dishSummaryList.add(summaryVo2);
		
		return dishSummaryList;
		
	}
}
