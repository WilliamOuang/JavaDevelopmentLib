package com.thread;

public class ThreadTest extends Thread{
    
    private final int Max = 7;
     
    private String name;
 
    public static void main(String[] args) throws InterruptedException {
        ThreadTest ta = new ThreadTest("A");
        ThreadTest tb = new ThreadTest("B");
        ta.start();
        Thread.sleep(1000);
        tb.start();
    }
     
    public ThreadTest(String name) {
        this.name = name;
    }
 
    @Override
    public void run() {
         
        synchronized (Thread.class) {//这个this换成类对象 就可以了
            for(int i=0;i<this.Max;i++){
                System.out.println("name:"+this.name);
                Thread.class.notify();
                 
                System.out.println("nofity after:"+this.name);
                try {
                    System.out.println(this.name+" wait before");
                    Thread.class.wait();
                     
                    System.out.println(this.name+" wait after");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}