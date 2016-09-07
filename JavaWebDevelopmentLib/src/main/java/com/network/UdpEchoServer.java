package com.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoServer {
  static final int BUFFERSIZE = 256;

  public static void main(String[] args) {
    DatagramSocket sock;
    DatagramPacket pack = new DatagramPacket(new byte[BUFFERSIZE],
        BUFFERSIZE);
   byte[] receiveByte = new byte[1024];
    try {
      sock = new DatagramSocket(7777);
    } catch (SocketException e) {
      System.out.println(e);
      return;
    }
    // echo back everything
    while (true) {
      try {
        sock.receive(pack);
     String   receiveStr = new String();
        System.out.println(receiveStr);
        int i=pack.getLength();
        if (i > 0) {
            // 指定接收到数据的长度,可使接收数据正常显示,开始时很容易忽略这一点

            receiveStr = new String(receiveByte, 0, pack.getLength());
            System.out.println(receiveStr);
            i = 0;// 循环接收

        }
        
        sock.send(pack);
      } catch (IOException ioe) {
        System.out.println(ioe);
      }
    }
  }
}
