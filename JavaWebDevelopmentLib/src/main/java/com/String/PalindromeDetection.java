package com.String;

public class PalindromeDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(palindrome("pop1e"));
//		System.out.println(palindrome("pop"));
//
//		System.out.println(palindrome("Ah,Satan sees Natasha"));
		
//		if('h'>'a' && 'h'<='z'){
//			System.out.println("TTTTTTTTTTT");
//		}
		
	}

	public static boolean palindrome(String s){
		boolean r = false;
		if(s==null || s.length()==0){
			return r;
		}
		s=s.toLowerCase();
		char c[] = s.toCharArray();
		int i = 0;
		int j = c.length-1;
		while( i < j){
			if(c[i]>='a' && c[i]<='z'){
				
			}else{
				i++;
				continue;
			}
			if(c[j]>='a' && c[j]<='z'){

				
			}else{
				j--;
				continue;
			}
			if( c[i] != c[j] ){
				return false;
			}else{
				i++;
				j--;
			}
		} 
		return true;
	}
}
