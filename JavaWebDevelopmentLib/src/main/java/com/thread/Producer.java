package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

class Producer implements Runnable {
	 
    private final BlockingQueue sharedQueue;
 
    public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
    	int i = 0;
       // for(int i=0; i<10; i++){
    	while(true){
            try {
                System.out.println("Produced: " + (i++));
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
}