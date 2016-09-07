package com.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DatagramSocket socket= new DatagramSocket(9990);
		byte[] bs= new byte[1024];
		DatagramPacket packet= new DatagramPacket(bs, bs.length);
		socket.receive(packet);
		String string=new String(bs, 0, packet.getLength());
		System.out.println(string);
		socket.close();
		
	}

}
