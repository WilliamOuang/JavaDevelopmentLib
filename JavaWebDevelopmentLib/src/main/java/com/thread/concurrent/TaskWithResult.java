package com.thread.concurrent;

import java.util.concurrent.Callable;

class TaskWithResult implements Callable<String> {  
    private int id;  
  
    public TaskWithResult(int id) {  
        this.id = id;  
    }  
  
    @Override  
    public String call() throws Exception {  
    	//Thread.sleep(1000);
        return "result of TaskWithResult " + id;  
    }  
} 
