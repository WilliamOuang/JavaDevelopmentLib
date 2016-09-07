package com.String;

import com.mum.combinationSum.Solution;

public class RotateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="I am a student.";
		char c[]= string.toCharArray();
		System.out.println(new String(c));
		solution(c);
		System.out.println(new String(c));

		

	}
	
	public static void solution(char[]s){
        int start = 0;
        for(int i=0;i<s.length;i++){
            //每次交换只交换空格之间的单词，这样就能保持空格的位置不动了
            if(s[i]==' '){
            	reverse(s,start,i-1);
            	start = i+1;
            }
            else if(i==s.length-1){
            	reverse(s,start,i);
            }
        }
        reverse(s,0,s.length-1);
    }

	 private static void reverse(char[]s, int start, int end){
	        while(start <= end)
	        {
	            char temp;
	            temp = s[end];
	            s[end] = s[start];
	            s[start] = temp;
	            start++;
	            end--;
	        }

	    }
	
}
