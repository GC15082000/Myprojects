package com.dto;

public class ElectronicItemsDTO {

	private int eid;
	private int eprice;
	private String ename;
	private String emanufacturedCompany;
    private boolean echargable;
    
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEprice() {
		return eprice;
	}
	public void setEprice(int eprice) {
		this.eprice = eprice;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmanufacturedCompany() {
		return emanufacturedCompany;
	}
	public void setEmanufacturedCompany(String emanufacturedCompany) {
		this.emanufacturedCompany = emanufacturedCompany;
	}
	public boolean isEchargable() {
		return echargable;
	}
	public void setEchargable(boolean echargable) {
		this.echargable = echargable;
	}
	
}
