package com.String;

public class RotateString {
	public static void main(String[] args) {
		/*
		三步反转法
		对于这个问题，换一个角度思考一下。

		将一个字符串分成 X 和 Y 两个部分，在每部分字符串上定义反转操作，如 X^T，即把 X 的所有字符反转（如，X="abc"，那么 X^T="cba"），那么就得到下面的结论：(X^TY^T)^T=YX，显然就解决了字符串的反转问题。

		例如，字符串 abcdef ，若要让 def 翻转到 abc 的前头，只要按照下述 3 个步骤操作即可：

		首先将原字符串分为两个部分，即 X:abc，Y:def；
		将 X 反转，X->X^T，即得：abc->cba；将 Y 反转，Y->Y^T，即得：def->fed。
		反转上述步骤得到的结果字符串 X^TY^T，即反转字符串 cbafed 的两部分（cba 和 fed）给予反转，cbafed 得到 defabc，形式化表示为 (X^TY^T)^T=YX，这就实现了整个反转。
		
		https://segmentfault.com/a/1190000002694646
		*/
		
		String string="abcdef";
		char c[]= string.toCharArray();
		System.out.println(new String(c));
		solution(c, 2);
		System.out.println(new String(c));

	}
	
	public static void solution(char[]s , int k){
        reverse(s,0,k-1);
		System.out.println("11="+new String(s));
        reverse(s,k,s.length-1);
		System.out.println("22="+new String(s));
        reverse(s,0,s.length-1);
		System.out.println("33="+new String(s));

    }
    private static void reverse(char[]s, int start, int end){
        while(start <= end)
        {
            char temp;
            temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }

    }

}
