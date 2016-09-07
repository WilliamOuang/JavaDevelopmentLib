package com.designPattern.template;

public abstract class OpenFile {

	String filename;	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void getContent(){
		open(filename);
		System.out.println(read());
		close();
	}
	public abstract void open(String f);
	public abstract String read();
	public abstract void close();
	
		
}
