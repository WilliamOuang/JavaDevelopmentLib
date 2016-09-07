package com.dataStructure.stack;


public class Stack {

	private int arraylist[];
	private int max;
	private int top;
	
	
	public Stack(int max) {
		this.max=max;
		this.arraylist = new int[max];
		this.top = 0;
	}
	public boolean isFull(){
		if(max==top){
			return true;
		}else{
			return false;
		}
	}
	public boolean isEmpty(){
		if(top==0){
			return true;
		}else{
			return false;
		}
	}
	
	public void push(int v){
		if(isFull()){
			System.out.println("Can not push");
			return ;
		}else {
			arraylist[top++]=v;
			
				
		}
				
	}
	
	public void peek(){	
		if(!isEmpty()){
			System.out.println(arraylist[top-1]);
		}
		
	}
	public void pop(){
		if(!isEmpty()){
		--top;
		}
		//arraylist[];
		//return temp;
	}

	
	public static void main(String[] args) {

		Stack stack= new Stack(3);
		stack.push(1);
		stack.peek();
		stack.push(2);
		stack.peek();
		stack.push(3);
		stack.peek();
		System.out.println("top:"+stack.top);
		
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.pop();
		System.out.println(stack.top);
		//stack.pop();
		
		//stack.pop();
		//stack.peek();
		//System.out.println();
		
		
		String str="Iloveyou";
		Stack reverse= new Stack(str.length());
		
		
	}

}
