package com.dto;

import java.util.Set;

public class BookDTO {
	private int bNum;
	private String bName;
	private int bPrice;
	private Set<AuthorDTO> author;
	
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public Set<AuthorDTO> getAuthor() {
		return author;
	}
	public void setAuthor(Set<AuthorDTO> author) {
		this.author = author;
	}
}
