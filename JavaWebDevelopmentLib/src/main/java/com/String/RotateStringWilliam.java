package com.String;

import javax.xml.stream.events.StartDocument;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class RotateStringWilliam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcde";
		//Rotate(string);
		//System.out.println(Rotate(string));
		
		//System.out.println(rotateWilliam("ABCDEFH",3,6));
		System.out.println(rotateString("ABCD1234",5));
		
		String string2="I Love you";
		System.out.println(Swap(string2));
		
		
	}
	public static String Swap(String s){
		s=rotateWilliam(s,0,s.length()-1);
		System.out.println(s);
		char[] cs=s.toCharArray();
		int count=0;
		for(int i=0;i<cs.length;i++){
			if(cs[i]!=' '){
				count++;
			}else{
				rotateChar(cs,i-count,i-1);
				count=0;
			}
		}
	return new String(cs);
//	return s;
		
	}
	
	public static String rotateString(String s,int end){
		//Three Step Method
		s=rotateWilliam(s,0,end-1);
		s=rotateWilliam(s,end,s.length()-1);
		s=rotateWilliam(s, 0, s.length()-1);
		return s;
		
	}
	
	public static void rotateChar(char[] c,int start,int end){
		//char c[]= str.toCharArray();
			int len=start+(end-start)/2;
			for(int i=start;i<=len;i++){
				char t=c[i];
				c[i]= c[end];
				c[end]=t;
				end--;
			}
		
	}
	
	public static String rotateWilliam(String str,int start,int end){
		char c[]= str.toCharArray();
			int len=start+(end-start)/2;
			for(int i=start;i<=len;i++){
				char t=c[i];
				c[i]= c[end];
				c[end]=t;
				end--;
			}
			
		return new String(c);
		
	}
	
	
	
	
	
	
	public static String Rotate(String s){
		char c[]= s.toCharArray();
		for(int i=0;i<c.length/2;i++){
			char t=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=t;
		}
	
		return new String(c);
	}
	
	


}
