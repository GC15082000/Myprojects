package com.thread;

public class MyThread extends Synchronize {
	public static void main(String[] args) {
		Thread1 obj1= new Thread1();
		Thread1 obj2=new Thread1();
		obj1.start();
		obj2.start();
		   
	}

}
class Thread1 extends Thread{
    
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
}

