package com.practice.MethodRefrence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WorkInterface workInterface=() ->{
//			System.out.println("This WorkInterface");
//		};
//		
//		workInterface.doWork();
		
//		WorkInterface workInterface=MyStuff::doStuff;
//		
//		workInterface.doWork();
		
//		Runnable runnable=MyStuff::MyThread;
//		
//		Thread d=new Thread(runnable);
//		d.start();
		
		MyStuff obj=new MyStuff();
        Runnable runnable=obj::printNumber;
        Thread d=new Thread(runnable);
		d.start();
	    
	}

}
