package com.zhangyihang;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddress1 {
    static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("10.41.204.187");
        System.out.println(byName);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

    }
}
