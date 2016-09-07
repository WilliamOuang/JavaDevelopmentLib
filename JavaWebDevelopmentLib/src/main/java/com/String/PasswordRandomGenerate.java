package com.String;

import java.util.Random;

public class PasswordRandomGenerate {

	public static void main(String[] args) {
		String string="abcdefghigklmnopqrstABCDEFGHIGKLMNOPQRST0123456789";
		System.out.println(getPassword(string,10));
	}
	
	public static String getPassword(String str,int len){
		StringBuffer buffer= new StringBuffer();
		char c[] =str.toCharArray();
		Random r= new Random();	 
		//System.out.println(r.nextInt(str.length()));
		for(int i=0;i<len;i++){
			buffer.append(c[r.nextInt(str.length())]);
		}
		return buffer.toString();
		
		
		
	}

}
