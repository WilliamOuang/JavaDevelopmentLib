package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class Test {

	@org.junit.Test
	public void test() {
		System.out.println("running");

	}

	@Before
	public void test1(){
		System.out.println("before");

	}
	@After
	public void test2(){
		System.out.println("After");
	}
}
