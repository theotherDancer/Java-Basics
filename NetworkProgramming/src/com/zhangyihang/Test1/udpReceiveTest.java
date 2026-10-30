package com.zhangyihang.Test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpReceiveTest {
    static void main(String[] args) throws IOException {
        //接收

        //1.创建Datagramsocket对象（快递公司
        //注意：接收的时候必须绑定端口，并且接收的端口和发送时候设置的目标端口必须保持一致
        DatagramSocket ds=new DatagramSocket(10086);/*因为send的时候port是10086*/

        //2.接收数据包
        //创建一个数组用来接收数据：
        byte[] bytes = new byte[1020];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);
       while(true) {
           ds.receive(dp);

           //3.解析数据包+打印
           byte[] data = dp.getData();
           int length1 = dp.getLength();
           System.out.println("接收到的数据是" + new String(data, 0, length1));
           int length = dp.getLength();
           System.out.println("数据长度为" + length);
           InetAddress address = dp.getAddress();
           System.out.println("发送地址是" + address);
           int port = dp.getPort();
           System.out.println("发送端口是" + port);
       }

    }
}
