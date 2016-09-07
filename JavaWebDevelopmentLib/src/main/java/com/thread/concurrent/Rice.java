package com.thread.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Rice  implements Callable<String> {

	private boolean flag= true;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	int cont=0;
	@Override
	public String call() throws Exception {
		
		// TODO Auto-generated method stub
		while(flag){
			
			cont++;
			Thread.sleep(1);
		}
		
		return "Coutn:"+cont;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service=Executors.newFixedThreadPool(1);
		Rice rice=	new Rice();
		Future<String> future=service.submit(rice);
		Thread.sleep(1000);
		rice.setFlag(false);
		System.out.println(future.isDone());
		if(future.isDone()){
			System.out.println(future.get());
				
		}
		System.out.println(future.get());
		service.shutdownNow();
	}

}
