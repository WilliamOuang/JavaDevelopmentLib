package com.designPattern.staticProxy;

import org.junit.Before;

public class ClassAProxy implements InterfaceA {
	
	private InterfaceA classa;
	

	public ClassAProxy(InterfaceA a) {
		//super();
		this.classa = a;
	}


	

	public InterfaceA getClassa() {
		return classa;
	}




	public void setClassa(InterfaceA classa) {
		this.classa = classa;
	}




	public void Before(){
		System.out.println("Before");
	}
	public void After(){
		System.out.println("After");

	}

	@Override
	public void action() {
		Before();
		classa.action();
		After();
		// TODO Auto-generated method stub
		
	}

}
