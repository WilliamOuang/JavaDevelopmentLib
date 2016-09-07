package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket= new Socket("127.0.0.1", 9000);
		OutputStream outToServer = socket.getOutputStream();
		
		//  DataOutputStream out = new DataOutputStream(System.in);

		  //DataOutputStream out = new DataOutputStream(outToServer);
		  //out.writeUTF("William");
		  
		  InputStream input= socket.getInputStream();
	      DataInputStream in = new DataInputStream(input);
	      System.out.println(in.readUTF());
		 // in.close();
		 // out.flush();
		 // out.close();
		  socket.close();
	}

}
