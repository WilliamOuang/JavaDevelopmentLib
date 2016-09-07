package com.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swapWords("I Love you "));
		System.out.println(swapWords2("I Love you"));
	}
	public static String swapWords2(String str) {  
        char[] arr = str.toCharArray(); 
        int begin=0;
        int end=arr.length-1;
        while(begin < end) {  
            char temp = arr[begin];  
            arr[begin] = arr[end];  
            arr[end] = temp;  
            begin++;  
            end--;  
        }
        System.out.println("--"+new String(arr));
        int begin1 = 0;  
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] == ' ') {  
                swap(arr, begin1, i - 1);  
                begin1 = i + 1;  
            }  
        } 
        return new String(arr);
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
      
    public static String swapWords(String str) {  
        char[] arr = str.toCharArray();  
        swap(arr, 0, arr.length - 1);  
        int begin = 0;  
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] == ' ') {  
                swap(arr, begin, i - 1);  
                begin = i + 1;  
            }  
        }  
//        swap(arr, begin, arr.length - 1);  
        return new String(arr);  
    } 
}
