package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server= new ServerSocket(9000);
		Socket server1 = server.accept();
		DataInputStream inputStream=new DataInputStream(server1.getInputStream());
		System.out.println(inputStream.readUTF());
		
		DataOutputStream outputStream= new DataOutputStream(server1.getOutputStream());
		outputStream.writeUTF("Message from Server");
		
		server1.close();


	}

	

}
