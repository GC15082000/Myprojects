package com.dto;

import java.util.Set;

public class UserDTO {
	private int uId;
	private String uEmail;
	private String uName;
	private Set<ProductDTO> product;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Set<ProductDTO> getProduct() {
		return product;
	}

	public void setProduct(Set<ProductDTO> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "UserDTO [uId=" + uId + ", uEmail=" + uEmail + ", uName=" + uName + ", product=" + product + "]";
	}

}
