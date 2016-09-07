package com.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {

	private List<Observer> list= new ArrayList<>();
	
	public void attach(Observer o){
		this.list.add(o);
	}
	
	public void deattach(Observer o){
		this.list.remove(o);
	}
	public void nodifyObservers(String newState){
		for(Observer ob:list){
			ob.update(newState);
		}
	}
	
}
