package com.designPattern.template;

public class TestTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="www.txt";
		OpenFile openFile= new ReadTextFile();
		openFile.setFilename(filename);
		openFile.getContent();
	}

}
