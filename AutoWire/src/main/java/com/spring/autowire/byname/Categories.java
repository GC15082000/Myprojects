package com.spring.autowire.byname;

public class Categories {
	private String name;
	private Book bk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public void show() {
		System.out.println("Categories name=" + name);
		System.out.println("Book name=" + bk.getbName() + " and book price " + bk.getbPRice());
	}
}
