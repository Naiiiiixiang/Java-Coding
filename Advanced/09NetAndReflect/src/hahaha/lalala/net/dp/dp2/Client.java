package hahaha.lalala.net.dp.dp2;

import java.io.IOException;
import java.net.*;

/*
客户端：




 */
public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println("客户端.............................");
         //1.创建客户端对象
        DatagramSocket dsClient = new DatagramSocket();
        //2.准备发送数据的数据包

        String s = "该吃饭了 哈哈";
        byte[] bytes = s.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length , InetAddress.getLocalHost(),9999);
        //3.发送数据
        dsClient.send(dp);

        //4.准备数据包接收数据
        byte bs[] = new byte[1024];
        DatagramPacket data = new DatagramPacket(bs, bs.length);
        //5.展示服务端反馈的数据
        dsClient.receive(data);

        String s1 = new String(data.getData(), 0, data.getLength());

        System.out.println("s1 = " + s1);

        //6.关闭资源
        dsClient.close();
    }
}
