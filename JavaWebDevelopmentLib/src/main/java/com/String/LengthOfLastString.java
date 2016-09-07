package com.String;

public class LengthOfLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hello World";
		System.out.println(getLastLengthofString(string));
		System.out.println(lengthOfLastWord(string));

		
	}
	
	public static int getLastLengthofString(String s){
		if(s==null|| s.length()==0){
			return 0;
		}
		String arr[] =s.trim().split(" ");
		return arr[arr.length-1].length();
				
		
	}

	
	public static int lengthOfLastWord(String s) { 
	    if(s==null || s.length() == 0)
	        return 0;
	 
	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	                return result;
	        }
	    }
	 
	    return result;
	}
}
