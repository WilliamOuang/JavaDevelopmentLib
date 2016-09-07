package com.thread;

public class ThreadOne extends Thread {
	
	public void run(){
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println(Thread.currentThread().getName());
	}

}
