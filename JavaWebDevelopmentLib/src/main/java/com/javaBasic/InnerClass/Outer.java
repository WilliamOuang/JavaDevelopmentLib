package com.javaBasic.InnerClass;

public class Outer {
	public void someOuterMethod() {
		
		  new Outer.Inner();
	}
	
	public class Inner{}
	public static void main( String[]argv ) {
		Outer o = new Outer();
		//	new o.Inner();
		//new Inner();    
		}
}
