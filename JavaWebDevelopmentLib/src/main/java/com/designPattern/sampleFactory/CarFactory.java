package com.designPattern.sampleFactory;

public class CarFactory {
	
	Car createCar(String carType){
		
		if("BMW".equals(carType)){
			return new BenCar();
		}else if("BEN".equals(carType)){
			return new BMWCar();
		}
		return null;
			
	}
	
}
