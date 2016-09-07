package com.mum.recursion;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(multity(4));
		//count(5);
		//System.out.println(dtob(4));
		//System.out.println(fab(3));
		char charArr[] ="abc".toCharArray();
		permute(charArr, 0, charArr.length-1);
	}

	public static void permute(char[] list, int low, int high) {  
        int i;  
        if (low == high) {  
            String cout = "";  
            for (i = 0; i <= high; i++) {  
                cout += list[i];  
            }  
            System.out.println(cout);  
        } else {  
            for (i = low; i <= high; i++) {  
                char temp = list[low];  
                list[low] = list[i];  
                list[i] = temp;  
                permute(list, low + 1, high);  
                temp = list[low];  
                list[low] = list[i];  
                list[i] = temp;  
            }  
        }  
    }
	
	public static int multity(int number){
		if(number==0|| number==1){
			return number;
		}else{
			return number*multity(number-1);
		}
		
	}
	
	  static void count(int n)               //递归方法   
	    {   
	        if (n<5)    
	            count(n+1);    
	        System.out.print("     "+n);   
	    }    
	  public static String dtob(int n) {
			if (n == 0 || n == 1) {
				return Integer.toString(n);
			} else {
				return dtob(n / 2) + Integer.toString(n % 2);
			}
		}
	  
	   static int fab(int index) {  
	        if (index == 1 || index == 2) {  
	            return 1;  
	        } else {  
	            return fab(index - 1) + fab(index - 2);  
	        }  
	    }
}
