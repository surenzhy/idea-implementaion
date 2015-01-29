package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.util.List;

public class DishResultByCategoryVO implements Serializable {

	private static final long serialVersionUID = 6542788203767454826L;
	
	private String category;
	
	private List<DishResultVO> dshRsltList;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<DishResultVO> getDshRsltList() {
		return dshRsltList;
	}

	public void setDshRsltList(List<DishResultVO> dshRsltList) {
		this.dshRsltList = dshRsltList;
	}
	
	

}
