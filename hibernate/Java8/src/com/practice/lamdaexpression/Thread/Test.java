package com.practice.lamdaexpression.Thread;

public class Test {

	public static void main(String[] args) {
		Runnable Thread1=() ->
		{
			for(int i=0;i<=10;i++) {
				System.out.println("Value of i="+i);
			}
		};
		
		Thread t=new Thread(Thread1);
		t.setName("Gaurav");
		t.start();

	}

}
