package com.javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		
		
		Arrays.sort(fruits);
			
		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}
		
		System.out.println("");
		
		List<String> fruitsList = new ArrayList<String>();
		 
		fruitsList.add("Pineapple");
		fruitsList.add("Apple");
		fruitsList.add("Orange");
		fruitsList.add("Banana");
		
		Collections.sort(fruitsList);
			
		int j=0;
		for(String temp: fruitsList){
			System.out.println("fruits " + ++j + " : " + temp);
		}
		
		
		System.out.println("");

		
Fruit[] fruitsArray = new Fruit[4];
		
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		fruitsArray[0]=pineappale;
		fruitsArray[1]=apple;
		fruitsArray[2]=orange;
		fruitsArray[3]=banana;
		
		
		
		
		Arrays.sort(fruitsArray);

		int k=0;
		for(Fruit temp: fruitsArray){
		   System.out.println("fruits " + ++k + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
		
		
		
		
		
//		
//		System.out.println("");
//
//		
//		List<Fruit> fl= new ArrayList<>();
//				fl.add(pineappale);
//				fl.add(apple);
//				fl.add(orange);
//				fl.add(banana);
//	  //Collections.sort(fl);
//	 //Collections.sort(fl, Fruit.FruitNameComparator);
//		Collections.sort(fl, new FruitCompator());
//						
//		int l=0;
//		for(Fruit temp: fl){
//			   System.out.println("fruits " + ++l + " : " + temp.getFruitName() + 
//				", Quantity : " + temp.getQuantity());
//			}
//		
		

		
	}

}
