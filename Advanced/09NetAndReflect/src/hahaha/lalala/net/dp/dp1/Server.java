package hahaha.lalala.net.dp.dp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/*

udp:

  非面向连接的
  不安全的

  DatagramSocket
  DatagramPacket


 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端");
        //创建服务端对象
        DatagramSocket dsServer = new DatagramSocket(6666);
        byte[] bs = new byte[20];
        System.out.println("前：  "+Arrays.toString(bs));
        //接收数据
        DatagramPacket datagramPacket =new DatagramPacket(bs,bs.length) ;
        dsServer.receive(datagramPacket);

        System.out.println("后：  "+Arrays.toString(bs));
            //客户端地址
        System.out.println("datagramPacket.getAddress() = " + datagramPacket.getAddress());
        // 数组内有效数据的个数
        System.out.println("datagramPacket.getLength() = " + datagramPacket.getLength());
        // 61272  62130 客户端的端口
        System.out.println("datagramPacket.getPort() = " + datagramPacket.getPort());
        //获取客户端发来的数据
        byte[] data = datagramPacket.getData();
        System.out.println("datagramPacket.getData() = " + Arrays.toString(data));
        dsServer.close();
    }
}
