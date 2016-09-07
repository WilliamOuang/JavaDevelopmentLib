package com.designPattern.staticProxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceA a=new ClassA();
		InterfaceA bA= new ClassAProxy(a);
		bA.action();

	}

}
