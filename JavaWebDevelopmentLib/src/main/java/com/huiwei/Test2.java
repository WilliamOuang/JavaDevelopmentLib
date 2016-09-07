package com.huiwei;

public class Test2 {
	
	 static boolean foo(char c) {
	       System.out.print(c);
	       return true;
	    }
	    public static void main(String[] argv) {
	       int i = 0;
	       //for(65;88&&(i<2);67)
	       for (foo('A'); foo('B') && (i < 2); foo('C')) {
	           i++;
	           foo('D');
	       }
	    }

}
