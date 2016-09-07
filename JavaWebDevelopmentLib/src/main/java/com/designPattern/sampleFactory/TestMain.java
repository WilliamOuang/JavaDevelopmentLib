package com.designPattern.sampleFactory;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory= new CarFactory();
		Car car=  factory.createCar("BEN");
		car.createCar();
		car=  factory.createCar("BMW");
		car.createCar();
		
	}

}
