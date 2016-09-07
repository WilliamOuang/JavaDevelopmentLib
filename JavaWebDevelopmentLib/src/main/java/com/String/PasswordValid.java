package com.String;

public class PasswordValid {

	
	public int solution(String s){
		int result = -1;
		int start = 0;
		boolean capitalCharFlag = false;
		for(int i = 0; i < s.length();i++){
			char c = s.charAt(i);
			if( c >= 'a' && c <= 'z'){
				if(capitalCharFlag){
					result = Math.max(result, i - start + 1);
				}
			}else if( c >= 'A' && c <= 'Z' ){
				capitalCharFlag = true;
				result = Math.max(result, i - start + 1);
			}else{
				start = i + 1;
				capitalCharFlag = false;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		
		PasswordValid app = new PasswordValid();
		System.out.println(app.solution("Baa0Bb"));
		

		
	}

}
