package com.dataStructure.queqe;


public class Queqe {
	private int queqe[];
	private int front;
	private int end;
	private int number;
	private int max;
	
	public Queqe(int max) {
		this.queqe = new int[max];
		this.front = 0;
		this.end = 0;
		this.number = 0;
		this.max = max;
	}
	
	public boolean isEmpty(){
		if(number==0){
			return true;
		}else{
			return false;
		}
	}
	
	public void addQueqe(int v){
		if(!isFull()){
			queqe[end++]=v;
			number++;
		}else{
			System.out.println("Queqe is full");
		}
		
	}
	public int removeQueqe(){
		if(isEmpty()){
			System.out.println("Queqe is empty");
			return 0;
		}else{
			number--;
			return queqe[front++];
		}
		
	}
	
	public boolean isFull(){
		if(number==max){
			return true;
		}else{
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queqe q=new Queqe(5);
		q.addQueqe(1);
		q.addQueqe(2);
		q.addQueqe(3);
		q.addQueqe(4);
		q.addQueqe(5);
		q.addQueqe(6);

		
		System.out.println(q.removeQueqe());
		System.out.println(q.removeQueqe());
		System.out.println(q.removeQueqe());
		System.out.println(q.removeQueqe());
		System.out.println(q.removeQueqe());
		System.out.println(q.removeQueqe());

		//q.addQueqe(6);

	}

}
