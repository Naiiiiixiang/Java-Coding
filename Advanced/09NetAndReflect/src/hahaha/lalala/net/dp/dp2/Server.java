package hahaha.lalala.net.dp.dp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

    public static void main(String[] args) throws Exception {

        System.out.println("服务端.............................");
        //1.创建服务端对象
        DatagramSocket dsServer = new DatagramSocket(9999);
        //2.准备接收数据的数据包

        byte[] bs = new byte[1024];
        DatagramPacket re = new DatagramPacket(bs,bs.length);
        //3.接收数据
        dsServer.receive(re);
        //3.1 展示 客户端发来的数据
        System.out.println("客户端发来的：--->    "+new String(bs,0,re.getLength()));
        //4.准备给客户端的数据
        String s  ="晚  上 吃 面......";

        byte[] bytes = s.getBytes();
        //5. 将数据封装到数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, re.getAddress(), re.getPort());

        //6.发送数据给客户端

        dsServer.send(datagramPacket);

        //7.关闭资源

        dsServer.close();




    }
}
