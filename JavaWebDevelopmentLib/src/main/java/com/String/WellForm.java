package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.bjsxt.strategy.NewCustomerFewStrategy;

public class WellForm {

	public static void main(String[] args) {
		int i=5;
		if(i>3){
			System.out.println(">3");
		}else if(i>4){
			System.out.println(">4");
		}else{
			
		}
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		System.out.println(list);
		list.remove(list.size()-1);
		System.out.println(list);

		// TODO Auto-generated method stub
		System.out.println(wellForm("([)]"));
	}
 
	public static boolean wellForm(String s){
		Map<Character,Character> map = new HashMap<Character,Character>();
			map.put('(', ')');
			map.put('[', ']');
			
		Stack<Character> stack = new Stack<>(); 
		for(int i=0;i<s.length();i++){
			Character c=s.charAt(i);
			if(map.keySet().contains(c)){
				stack.push(c);
			}else if(map.values().contains(c) && map.get(stack.peek())==c){
				stack.pop();
			}else{
				return false;
			}
		}
		
		
		
		return stack.empty();
		
	}
}
