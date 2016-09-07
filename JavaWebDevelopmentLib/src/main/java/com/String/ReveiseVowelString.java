package com.String;

public class ReveiseVowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("Aa"));
	}
	
	public static String reverseVowels(String s) {
        int j=0;
        char c[]=s.toCharArray();
        int k=c.length-1;
        //for(int k=0;k<c.length;k++){
        
        while(j<k){
            while(true&&j<k){
               if(isVowel(c[j])){
                   break;
               }else{
                   j++;
               }
            }
            
            while(true&&j<k){
                if(isVowel(c[k])){
                    break;
                }else{
                    k--;
                }
            }
            char t=c[k];
            c[k]=c[j];
            c[j]=t;
            j++;
            k--;
            
        }
        return new String(c);
            
    }
    
	static boolean isVowel(char c){
        if(c=='a'|| c=='e'||c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }else{
            return false;
        }
    }

}



