package com.algorithm;

import java.util.Stack;

public class Blanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Stack<Character> stack = new Stack<>();
		            String line = "";
		            for(char c : line.toCharArray()) {
		                if(c == '{' || c == '(' || c == '[') {
		                   stack.push(c);
		                   continue;
		                }                    
		                
		                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
		                    stack.pop();
		                    continue;
		                }
		                
		                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
		                    stack.pop();
		                    continue;
		                }
		                
		                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
		                    stack.pop();
		                    continue;
		                }
		                
		                if(c == '}' || c == ')' || c == ']') {
		                    stack.push(c);
		                    break;
		                }   
		            }
		            System.out.println(stack.isEmpty());
	}

}
