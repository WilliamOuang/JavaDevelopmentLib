package com.String;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.StringTokenizer;



public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="A B C";
		
		String[] strArray = string.split("\\s+");
		System.out.println(Arrays.toString(strArray));
		
		String s = new String("A B C");
		StringTokenizer st = new StringTokenizer(s);
		System.out.println( "Token Total: " + st.countTokens() );
		while( st.hasMoreElements() ){
		System.out.println( st.nextToken());
		}
		
		
		String str = "abcd";
		//String repeated = StringUtils.repeat(str,3);
		
		
		String x = new String("ab");
		change(x);
		System.out.println(x);
		
		StringBuilder x1 = new StringBuilder("ab");
		changex(x1);
		System.out.println(x1);
		
		
		
		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
		 
		for (byte t : bytes) {
		   System.out.format("0x%x ", t);
		}
	}
	public static void changex(StringBuilder x) {
		x.delete(0, 2).append("cd");
	}
	public static void change(String x) {
		x = "cd";
	}
}
