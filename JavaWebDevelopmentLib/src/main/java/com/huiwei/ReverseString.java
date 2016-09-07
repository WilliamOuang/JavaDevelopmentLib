package com.huiwei;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("ABCDEFG"));
		System.out.println(reverse("I Love Java"));


	}
	
	public static void swap(char[] arr, int begin, int end) {  
        while(begin < end) {  
            char temp = arr[begin];  
            arr[begin] = arr[end];  
            arr[end] = temp;  
            begin++;  
            end--;  
        }  
    } 
	public static String reverse(String str) {  
	        char[] arr = str.toCharArray();  
	        swap(arr, 0, arr.length - 1);  
	        int begin = 0;  
	        for (int i = 1; i < arr.length; i++) {  
	            if (arr[i] == ' ') {  
	                swap(arr, begin, i - 1);  
	                begin = i + 1;  
	            }  
	        }  
	        return new String(arr);  
	} 

}
