package com.designPattern.Observer;

public class ConcreteSubject extends Subject {

		public void change(String state){
			this.nodifyObservers(state);
		}
}
