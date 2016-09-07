package com.designPattern.Observer;

public class TestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject= new ConcreteSubject();
		Observer observer= new ConcreteObserver();
		Observer observer1= new ConcreteObserver();

		subject.attach(observer);
		subject.attach(observer1);
		subject.change("ddd");
		subject.deattach(observer1);
		subject.change("New State");
	}

}
