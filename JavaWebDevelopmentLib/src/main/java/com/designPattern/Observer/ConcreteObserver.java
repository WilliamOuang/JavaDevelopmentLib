package com.designPattern.Observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update(String state) {
		
		System.out.println("Status updated:"+state);
	}

}
