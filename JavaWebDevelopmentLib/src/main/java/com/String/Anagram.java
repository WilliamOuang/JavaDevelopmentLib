package com.String;

import java.util.HashMap;

import com.sun.accessibility.internal.resources.accessibility;

public class Anagram {

	private static final int NULL = 0;

	public static void main(String[] args) {
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		int [] aa=null;
		
		
        int c1[]=new int[256]; 
        String c2[]=new String[256]; 

//        System.out.println(c1[3]);
//        System.out.println(c2[3]);

		// TODO Auto-generated method stub
//		System.out.println(isAnagram("aacc","acca"));
//		System.out.println(isUnicodeAnagram("aacc","ccca"));
		
		System.out.println(isAnagram("hello","hello"));
		//System.out.println(isUnicodeAnagram("happy newye ar","na hwrye yppea"));
//"".equals("");
//System.out.println((int)" ".charAt(0));

	}
	
	
	 public static boolean anagram(String s, String t) {
	        // write your code here

	        return true;
	        
	    }
	
	public static boolean isUnicodeAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> check = new HashMap<>();
        for (char c1 : s.toCharArray()) {
            if (!check.containsKey(c1)){
                check.put(c1, 1);
            } else {
                check.put(c1, check.get(c1) + 1);
            }
        }
        for (char c2 : t.toCharArray()) {
            if (check.get(c2) == null)
                return false;
            else {
                check.put(c2, check.get(c2) - 1);
                if (check.get(c2) == 0) 
                    check.remove(c2);
            }       
        }
        if (check.isEmpty())
            return true;
        else 
            return false;
    }
	
	  public static boolean isAnagram(String s, String t) {
		  if("".equals(s)&&"".equals(t)){
			  return true;
		  }
		  if(s.length()!=t.length()){
			  return false;
		  }
		  
		  
	        int c1[]=new int[256]; 
	        int c2[]=new int[256]; 
	        for(int i=0;i<s.length();i++){
	            c1[(int)s.charAt(i)]=c1[(int)s.charAt(i)]+1;
	        }
	        for(int j=0;j<t.length();j++){
	            c2[(int)t.charAt(j)]=c2[(int)t.charAt(j)]+1;
	        }
	        
	        for(int k=0;k<c1.length;k++){
	        	if(c1[k]!=c2[k]){
	        		return false;
	        	}
	        	
	        }
	        return true;
	    }
}
