package com.algorithm;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(11));
	}
	
	public static String countAndSay(int n) {
		  String res = "1";
		    while(--n > 0){
		        char same = res.charAt(0);
		        int count = 0;
		        StringBuilder sb = new StringBuilder();
		        for(int i = 0; i < res.length(); i++){
		            if(res.charAt(i) == same){
		                count++;
		            }else{
		                sb.append(count);
		                sb.append(same);
		                same = res.charAt(i);
		                count = 1;
		            }
		        }
		        sb.append(count);
		        sb.append(same);
		        res = sb.toString();
		    }
		    
		    return res;
	}

}
