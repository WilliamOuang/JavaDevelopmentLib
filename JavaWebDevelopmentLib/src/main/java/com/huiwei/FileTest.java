package com.huiwei;
import java.io.*;

public class FileTest{

	
	public static void main(String[]args) throws IOException

	{
	StringBuffer fileContent = new StringBuffer();
	File f = new File("/Users/william/test/yy.txt");
	
	OutputStreamWriter write= new OutputStreamWriter(new FileOutputStream(f),"UTF-8");
	write.write("William");
	write.close();
	
	InputStreamReader read = new InputStreamReader(
			new FileInputStream(f), "UTF-8");
	BufferedReader reader = new BufferedReader(read);
	String line;
	try {
                            //循环，每次读一行
		while ((line = reader.readLine()) != null) {
			fileContent.append(line+"\n");
		}
		reader.close();
		read.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(fileContent);
	
	byte[]b = new byte[1024];

	int point = 0;
//
//	while((point= f.read(b))!= -1)
//
//	{
//
//	for(int i=0;i<point;i++)
//
//	{
//
//	System.out.print(b[i]);
//
//	}
//
//	}

}}