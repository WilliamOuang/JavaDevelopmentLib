package com.network.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket= new ServerSocket(8000);
		
		Socket socket=serverSocket.accept();
		
		InputStream inputStream= socket.getInputStream();
		
		DataInputStream dataInputStream= new DataInputStream(inputStream);
		
		System.out.println("Recever Data="+dataInputStream.readUTF());
		
		socket.close();
	}

}
