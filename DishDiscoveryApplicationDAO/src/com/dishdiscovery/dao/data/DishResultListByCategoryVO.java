package com.dishdiscovery.dao.data;

import java.io.Serializable;
import java.util.List;

public class DishResultListByCategoryVO implements Serializable {

	private static final long serialVersionUID = 7946451097869584984L;
	
	private List<DishResultByCategoryVO> dshRsltByCatList;

	public List<DishResultByCategoryVO> getDshRsltByCatList() {
		return dshRsltByCatList;
	}

	public void setDshRsltByCatList(List<DishResultByCategoryVO> dshRsltByCatList) {
		this.dshRsltByCatList = dshRsltByCatList;
	}
	
	

}
