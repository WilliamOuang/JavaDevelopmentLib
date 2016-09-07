package com.javaBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        System.out.println(System.getProperty("user.dir"));  

		write();
		read();
	}
	
	public static void read() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream read= new ObjectInputStream(new FileInputStream("/Users/william/test/test.txt"));
		Person person=(Person) read.readObject();
		System.out.println(person.getName());
	}

	public static void write() throws FileNotFoundException, IOException{
		// Go home
		ObjectOutputStream write= new ObjectOutputStream( new FileOutputStream("/Users/william/test/test.txt"));
		write.writeObject(new Person("william", "1"));
	}

}
