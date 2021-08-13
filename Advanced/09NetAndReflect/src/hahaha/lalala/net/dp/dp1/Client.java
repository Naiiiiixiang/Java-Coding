package hahaha.lalala.net.dp.dp1;

import java.io.IOException;
import java.net.*;
/*

客户端发送数据时 没有指定端口 会随机分配一个
               如果指定 使用 指定的端口
 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("客户端");
        //1.创建客户端对象
        DatagramSocket dsClient = new DatagramSocket(9999);
        //2.发送数据
        //创建数据包
        String s = "abcde";

        byte[] bytes = s.getBytes();
        //发送数据 数据包中要有目的地的地址
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

        dsClient.send(dp);

        dsClient.close();



    }
}
