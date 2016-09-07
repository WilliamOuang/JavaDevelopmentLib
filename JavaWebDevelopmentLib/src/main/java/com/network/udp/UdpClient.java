package com.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket socket = new DatagramSocket();
		byte[] bs= "Java Source and Support".getBytes();

		DatagramPacket packet = new DatagramPacket(bs, bs.length, InetAddress.getByName("127.0.0.1"), 9990);
		socket.send(packet);
		socket.close();
	}

}
