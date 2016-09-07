package com.thread;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		
		while (true) { 
            try { 
                   Thread.sleep(5000); 
            		System.out.println("_____________");
            		System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName()); 
            } catch (InterruptedException e) { 
                    e.printStackTrace(); 
            } 
    } 
		// TODO Auto-generated method stub


	}

}
