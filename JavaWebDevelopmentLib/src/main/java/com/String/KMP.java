package com.String;

import java.util.Arrays;

public class KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub = "abab";
        String str = "abcdedaaaafhi";
        int[] next = next(sub);
        System.out.println(Arrays.toString(next));
        pattern(str,sub,next);
	}

	

    public static void pattern(String str,String sub,int[] next) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = sub.toCharArray();
        int i = 0,j = 0;  //i控制ch1,j控制ch2;
        for(;i<ch1.length; ) {
            if(ch1[i]==ch2[j]) {//匹配就自动递增，往后匹配。
                if(j==ch2.length-1) {
                    System.out.println(i-ch2.length+1);
                    break;
                }
                j++;
                i++;
            }
            else if(j==0) {
                 i++;
            }
            else {
                j = next[j-1]+1;
            }
        }
    }
	public static int[] next(String sub) {
        int[] a = new int[sub.length()];
       char[] c = sub.toCharArray();
        int length=sub.length();
        int i,j;
        a[0] = -1;
        i = 0;
       for(j=1;j<length;j++) {
           i = a[j - 1];
           while(i>=0&&c[j]!=c[i+1]) {
               i = a[i];    
           }
          if(c[j]==c[i+1]) {
              a[j] = i+1;
          }
          else {
              a[j] = -1;
          }
       }
       return a;
   }
}
