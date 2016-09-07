package com.javaBasic;

import java.util.ArrayList;
import java.util.List;

class Add{
    public void add(int ... numbers){
        int sum = 0;
        int index;
        for(index = 0; index < numbers.length - 1; index++){
            sum += numbers[index];
            System.out.print(numbers[index] + "+");
            
        }
        sum += numbers[index];
        System.out.println(numbers[index] + "=" + sum);
    }
    
    public static void main(String[] args) {
    	Add add= new Add();
    	add.add(1,2,3);
    	
    	List<Integer> list=new ArrayList<Integer>();
    	list.add(1);
    	System.out.println(list.size());
    	list.clear();
    	System.out.println(list.size());

	}
}
