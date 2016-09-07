package com.String;

public class CommonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conString("abc","cd"));
	}
	
	public static String conString(String str1,String str2){
		char st1[]=str1.toCharArray();
		char st2[]= str2.toCharArray();
		boolean[] c=new boolean[256];
		StringBuffer buffer= new StringBuffer();
		for(int j=0;j<st2.length;j++){
			c[(int)st2[j]]=true;
			
		}
		
		for(int i=0;i<st1.length;i++){
			if(!c[(int)str1.charAt(i)]){
				buffer.append(st1[i]);
			}
		}

		return buffer.toString();
		
		
		
	}

}
