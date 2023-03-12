package com.dto;

import java.util.Set;

public class AuthorDTO {
	private int aID;
	private String aName;
	private Set<BookDTO> book;

	public int getaID() {
		return aID;
	}

	public void setaID(int aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public Set<BookDTO> getBook() {
		return book;
	}

	public void setBook(Set<BookDTO> book) {
		this.book = book;
	}


}
