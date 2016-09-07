package com.String;

public class BruteForceStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello ccc world! ccc";
		String p="ccc";
		char string[]= str.toCharArray();
		char pattern[]= p.toCharArray();
		
		System.out.println(SubString(string,pattern));
		System.out.println(str.indexOf(p));

		
	}

	static int SubString(char[] text,char[] pattern){
	    int m = text.length;
	    int n = pattern.length;
	    // 蛮力匹配
	    for(int i = 0;i < m - n;++i){
	        int j = 0;
	        while(j < n && text[i+j]==pattern[j]){
	            ++j;
	        }//while
	        // match
	        if(j == n){
	            return i;
	        }//if
	    }//for
	    return -1;
	}

}
