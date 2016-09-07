package com.thread;

import com.sun.org.apache.xerces.internal.util.EntityResolver2Wrapper;

public class TestThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ThreadOne threadOne= new ThreadOne();
//		System.out.println(threadOne.isAlive());
//		threadOne.start();
//		System.out.println(threadOne.isAlive());
//
//		ThreadOne threadOne1= new ThreadOne();
//		System.out.println(threadOne1.isAlive());
//		threadOne1.start();
//		System.out.println(threadOne1.isAlive());		
//		
//		
//		
//		for(int i=0;i<10;i++){
//			ThreadOne threadOne2= new ThreadOne();
//			//threadOne2.start();
//			
//		}
//		
//		
//		ThreadTwo threadTwo= new ThreadTwo();
		//threadTwo.run();
		
	long s=	System.currentTimeMillis();
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
	long e=	System.currentTimeMillis();
	System.out.println(e-s);
		Thread2 my = new Thread2();
		Thread  thread=    new Thread(my, "C");
			thread.start(); //同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常   
		Thread  thread1 =new Thread(my, "D");
			thread1.start();
		Thread  thread2 =new Thread(my, "E");
			thread2.start();
			
			//thread.wait(10);
			//Thread.sleep(10000);
//			try {
//				thread.wait(1000);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
        
        
    	
	}

}
