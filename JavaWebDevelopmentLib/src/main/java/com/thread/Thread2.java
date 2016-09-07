package com.thread;

import java.util.concurrent.ConcurrentHashMap;

class Thread2 implements Runnable{
	  public static ConcurrentHashMap<Integer, String> message=new ConcurrentHashMap<Integer,String>();

	
    private int count=15;
	@Override
	public void run() {
		while(true){
			
			
//			  System.out.println(Thread.currentThread().getName() + "运行  count= " + count--);
//			  if(count<0){
//				  return;
//			  }

		}
		 // for (int i = 0; i < 5; i++) {
//	            try {
//	            	Thread.sleep((int) Math.random() * 10);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
	      //  }
		
	}
	
}