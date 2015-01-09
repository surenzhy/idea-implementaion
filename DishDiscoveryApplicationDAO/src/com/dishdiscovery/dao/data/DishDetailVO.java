package com.dishdiscovery.dao.data;


public class DishDetailVO extends DishSummaryVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;
	private String price;
	private String dshTypNme;
	private String dshCatNme;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDshTypNme() {
		return dshTypNme;
	}
	public void setDshTypNme(String dshTypNme) {
		this.dshTypNme = dshTypNme;
	}
	public String getDshCatNme() {
		return dshCatNme;
	}
	public void setDshCatNme(String dshCatNme) {
		this.dshCatNme = dshCatNme;
	}
	
	
	
}
