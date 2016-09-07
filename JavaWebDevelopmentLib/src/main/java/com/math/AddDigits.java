package com.math;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(getInt(389));
			System.out.println(addDigits(389));

			
	}
	
	 public static int addDigits(int num) {
	        while (num > 9) {
	            num = getInt(num);
	        }
	        return num;
	    }

	static int getInt(int num) {
        int result = 0;
        while (num >= 10) {
            result += num % 10;
            //System.out.println(result);
            num /= 10;
            //System.out.println(result);

        }
        result += num;// Key point
        return result;
    }
}
