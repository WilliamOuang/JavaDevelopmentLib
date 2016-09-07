package com.javaBasic;

import java.util.Comparator;

public class FruitCompator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		String fruitName1 = fruit1.getFruitName().toUpperCase();
		String fruitName2 = fruit2.getFruitName().toUpperCase();	
		
		return fruitName1.compareTo(fruitName2);
		
//		int q1 = fruit1.getQuantity(); 
//		int q2 = fruit2.getQuantity(); 
//		return q1-q2;
	
	}

}
