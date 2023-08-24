package com.day25.UDP;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {
    public static void main(String[] args) throws UnknownHostException {
        //获取inetaddress的对象--用地址
        InetAddress address=InetAddress.getByName("10.6.40.91");
        System.out.println(address);
        //用主机名
        /*InetAddress address1=InetAddress.getByName("LAPTOP-1ILURJKU");
        System.out.println(address1);*/

        String hostName = address.getHostName();
        System.out.println(hostName);
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);


    }
}
