package com.String;

import com.sun.media.sound.AlawCodec;

public class CommonStringVer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(longestCommonSubstring("ABCD","CBCE"));
		// System.out.println(longestCommonSubstring("www.lintcode.com code","www.ninechapter.com code"));
		// System.out.println(conString("www.lintcode.com code","www.ninechapter.com code"));
		System.out.println(longestCommonSubstring("ABCD","CBCE"));


	}
	
	public static int conString(String str1,String str2){
		char st1[]=str1.toCharArray();
		char st2[]= str2.toCharArray();
		boolean[] c=new boolean[256];
		StringBuffer buffer= new StringBuffer();
		for(int j=0;j<st2.length;j++){
			c[(int)st2[j]]=true;
			
		}
		int count=0;
		for(int i=0;i<st1.length;i++){
			if(!c[(int)str1.charAt(i)]){
				count++;
			}
		}

		return count;
		
		
		
	}
	
	public static int longestCommonSubstring(String A, String B) {
		
		
		
		
		
		 int maxLen = 0;
	        int m = A.length(), n = B.length();
	        System.out.println(m);
	        System.out.println(n);
	        int[][] record = new int[m+1][n+1];
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if(A.charAt(i) == B.charAt(j)){
	                    record[i+1][j+1] = record[i][j]+1;
	                }
	                maxLen = Math.max(maxLen, record[i+1][j+1]);
	            }
	        }
	        return maxLen;
//        // write your code here
//		if(A==null || A.length()==0 || B == null || B.length() == 0){
//			return 0;
//		}
//		//A=removeString(A);
//		//B=removeString(B);
//		boolean c[] = new boolean[256];
//		for(char ch:A.toCharArray()){
//			c[(int)ch]=true;
//		}
//		int count=0;
//		for(char ch1:B.toCharArray()){
//			if(c[(int)ch1]){
//				count++;
//			}
//		}
//		return count;
    }
	public static String removeString(String A){
		boolean c[] = new boolean[256];
		StringBuffer buffer=new StringBuffer();
		for(char c1:A.toCharArray()){
			if(!c[(int)c1]){
				buffer.append(c1);
				c[(int)c1]=true;
			}
		}
		return buffer.toString();
	}
	
}
