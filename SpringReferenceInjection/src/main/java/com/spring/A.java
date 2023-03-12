package com.spring;

public class A {
	private Integer id;
	private B b;

	@Override
	public String toString() {
		return "A [id=" + id + ", b=" + b + "]";
	}

	public A(Integer id, B b) {
		super();
		this.id = id;
		this.b = b;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
