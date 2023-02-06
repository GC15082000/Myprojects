package com.thread;

public class Synchronize {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
       A a =new A();
	  Thread t1 =new Thread(a);
      Thread t2 =new Thread(a);
      t1.start();
      t2.start();
   
	}

}

 class A implements Runnable{
	public void run() {
	  synchronized(this) {	for(int i=1;i<=5;i++)
       {
    	   System.out.println(Thread.currentThread().getName()+" > "+i);
       }
	  }
      }	
}