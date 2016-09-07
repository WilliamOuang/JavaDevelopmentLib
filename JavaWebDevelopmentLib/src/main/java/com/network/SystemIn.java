package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemIn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());

		
		int a=0;
	       System.out.println("请输入a：");
	       a=System.in.read();
	       System.out.println("a="+a);
	   
	}

}
