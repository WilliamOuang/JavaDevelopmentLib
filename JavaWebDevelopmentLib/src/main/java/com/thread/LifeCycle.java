package com.thread;

public class LifeCycle extends Thread  
{  
    public void run()  
    {  
        int n = 0;  
       // System.out.println("Run"+this.getName());
        try {
			Thread.sleep(2000);
			System.out.println("Run"+this.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //while ((++n) < 1000);          
    }  
       
    public static void main(String[] args) throws Exception  
    {  
        LifeCycle thread1 = new LifeCycle();  
        System.out.println("isAlive: " + thread1.isAlive());  
        thread1.start();  
        LifeCycle thread2 = new LifeCycle();  
        thread2.run();
        System.out.println("isAlive: " + thread1.isAlive());  
       thread1.join();  // 等线程thread1结束后再继续执行   
       thread2.join();
        System.out.println("thread1已经结束!");  
        System.out.println("isAlive1: " + thread1.isAlive());  
        System.out.println("isAlive2: " + thread2.isAlive());  

    }  
}  

