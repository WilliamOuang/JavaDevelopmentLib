package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Accept extends Thread {
	ServerSocket socket ;
	public Accept() throws IOException{
		socket= new ServerSocket(9000);
	}
	public void run(){
		while (true) {
			try {
				Socket s= socket.accept();
				
				DataInputStream inputStream=new DataInputStream(s.getInputStream());
				System.out.println(inputStream.readUTF());
				
				DataOutputStream outputStream= new DataOutputStream(s.getOutputStream());
				outputStream.writeUTF("Message from Server");
				
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Accept accept= new Accept();
		accept.start();
	}

}
