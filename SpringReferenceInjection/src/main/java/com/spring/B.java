package com.spring;

public class B {
	private Integer y;

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(Integer y) {
		super();
		this.y = y;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
}
