package hahaha.lalala.net.base;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    @Test
    public void test01() throws UnknownHostException {
        //获取本机的ip地址和主机名
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);//sixfly/10.10.1.83
        //获取一个通信实体的 ip地址 和 主机名
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress);//www.baidu.com/180.101.49.12
    }
}
