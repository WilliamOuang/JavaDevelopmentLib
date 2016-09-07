package com.algorithm.onlineTest;

import java.util.HashMap;
import java.util.Stack;

public class TestHireView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer gInteger=Integer.valueOf("2");
		System.out.println(gInteger*gInteger);
//(Integer.valueOf("2")) * (Integer.valueOf("2"));
		
		
		 int end   = Integer.valueOf("2");
	        int sum=0;
	        for(int i=1;i<=end;i++){
	            sum +=i; 
	        }
	        
	    //  System.out.println(  WellFormed("()"));
	    //  System.out.println(  isFullyQualifiedClassname("()"));
	      System.out.println(  isValid("]"));

	      

	      
	}
	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
	
}
