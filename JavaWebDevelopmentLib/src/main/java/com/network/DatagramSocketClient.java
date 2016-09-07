package com.network;



import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class DatagramSocketClient {
  public static void main(String args[]) throws Exception {
    int clientPort = 9999;

    int buffer_size = 1024;
String string="Back";
    byte buffer[] = new byte[buffer_size];
    DatagramSocket ds = new DatagramSocket(clientPort);
    while (true) {
      DatagramPacket p = new DatagramPacket(buffer, buffer.length);
      
      ds.receive(p);
      //ds.send(new DatagramPacket(string.getBytes(),string.getBytes().length, InetAddress.getLocalHost(), 9998));
      System.out.println("Get Data="+new String(p.getData(), 0, p.getLength()));
    }
  }
}

