package com.designPattern.template;

public class ReadTextFile extends OpenFile {

	@Override
	public void open(String f) {
		// TODO Auto-generated method stub
		System.out.println(" Open:"+f);
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		
		return "William";
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(" Close");

	}

}
