package com.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class WriteServer {

  public static void main(String args[]) throws Exception {
    int serverPort = 9998;

    int buffer_size = 1024;

    byte buffer[] = new byte[buffer_size];
    byte buffer1[] = new byte[buffer_size];

    DatagramSocket ds = new DatagramSocket(serverPort);

      int pos = 0;
      while (true) {
        int c = System.in.read();
        switch (c) {
        case -1:
          System.out.println("Server Quits.");
          return;
        case '\r':
          break;
        case '\n':
          ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), 9999));
          pos = 0;
          break;
        default:
          buffer[pos++] = (byte) c;
        }
      }

  }
}

