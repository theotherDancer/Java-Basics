package com.zhangyihang;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class udpSendDemo1 {
    static void main(String[] args) throws IOException {
        //1.创建Datagramsocket对象：用来绑定端口(理解为快递公司)
        //空参：会随机取可用的端口
        //有参：使用指定的端口>>注意这里的端口是目标端口
        DatagramSocket ds=new DatagramSocket();

        //2.打包数据
        String str="技术宅拯救世界！！！";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        InetAddress byName = InetAddress.getByName("10.41.204.187");
        int port = 10086;
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,byName,port);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();

    }


}
