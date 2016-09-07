package com.dataStructure.stack;

public class StringReverse {
	private char arraylist[];
	private int max;
	private int top;
	
	
	public StringReverse(int max) {
		this.max=max;
		this.arraylist = new char[max];
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
	
	public void push(char v){
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
	public char pop(){
		if(!isEmpty()){
		return	arraylist[--top];
		}
		//arraylist[];
		//return temp;
		return 0;
	}
	
	public String reverse(String s){

		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			push(c);
		}
		String reString="";
		while(!isEmpty()){
			reString+=pop();
		}
		return reString;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Iloveyou";
		StringReverse  reverse=new StringReverse(str.length());
		System.out.println(reverse.reverse(str));

		
	}

}
