package com.mum.replaceBlank;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char str[] = "Mr John".toCharArray();
		
		System.out.println(replaceBlank(str, 8));
		
		
		
	}
	public static int replaceBlank1(char string[], int length) {
		
		return 0;
	}
	public static int replaceBlank(char string[], int length) {
        if(0==length) return 0;
        int num = 0;
        for(int i=0;i<length-1;i++){
            if(string[i] == ' ') num++;
        }
        
        int newLen = length + num*2;
        string[newLen] = 0;
        int j = 1;
        for(int i=length-1;i>=0;i--){
            if(string[i] != ' '){
                string[newLen - j] = string[i];
                j++;
            }
            else{
                string[newLen - j] = '0';
                j++;
                string[newLen - j] = '2';
                j++;
                string[newLen - j] = '%';
                j++; 
            }
        }
        return newLen;
    }
}
