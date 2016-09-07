package com.javaBasic;

import java.util.HashSet;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

		
		
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(!set.add(1));
		//System.out.println(test("qwe1"));
		//System.out.println((int)"123rty".charAt(4));
	}
	public static  boolean test(String s){
		boolean[] char_set=new boolean[256];

		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
		if(char_set[val]) return false;
			char_set[val]=true;

		}
		return true;
	}

}
