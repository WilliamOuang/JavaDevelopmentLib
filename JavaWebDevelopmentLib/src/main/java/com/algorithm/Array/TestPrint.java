package com.algorithm.Array;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceBlank("hello world".toCharArray(),12);
	}
	
	  /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public static int replaceBlank(char[] string, int length) {
        // Write your code here
    	   if(string == null || length <= 0) return 0;
           int spaceCount = 0;
           for(char c : string){
               if(c == ' ') spaceCount+=2;
           }
           int lastIdx = length + spaceCount - 1;
           for(int i = length - 1; i >= 0; i--){
               if(string[i] == ' '){
                   string[lastIdx--] = '0';
                   string[lastIdx--] = '2';
                   string[lastIdx--] = '%';
               }else{
                   string[lastIdx--] = string[i];
               }
           }
           return length + spaceCount;
          
    }
	public  static void print(int n,int []nu){
		
		for(int i=1; i<=n; i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("#");
			}
			System.out.println("");
		}
		
	}
}
