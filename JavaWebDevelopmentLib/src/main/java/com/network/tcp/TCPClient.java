package com.network.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket socket= new Socket("127.0.0.1", 8000);
		OutputStream outputStream= socket.getOutputStream();
		DataOutputStream dataOutputStream= new DataOutputStream(outputStream);
		dataOutputStream.writeUTF("William Message");
		dataOutputStream.close();
		socket.close();
	}

}
