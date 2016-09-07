package com.huiwei;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/william/test");
		File[] files=f.listFiles();
		for(File of:files){
			System.out.println(of);
		}
	
	}

}
