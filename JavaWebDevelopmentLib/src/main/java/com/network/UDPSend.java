package com.network;

import java.io.*;
import java.net.*;

public class UDPSend {
  public static void main(String args[]) {
    try {
      String host = "127.0.0.1";
      int port = 7777;

      byte[] message = "Java Source and Support".getBytes();

      // Get the internet address of the specified host
      InetAddress address = InetAddress.getByName(host);

      // Initialize a datagram packet with data and address
      DatagramPacket packet = new DatagramPacket(message, message.length,
          address, port);

      // Create a datagram socket, send the packet through it, close it.
      DatagramSocket dsocket = new DatagramSocket();
      dsocket.send(packet);
      dsocket.close();
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}

