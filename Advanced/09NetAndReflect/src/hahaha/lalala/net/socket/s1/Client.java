package hahaha.lalala.net.socket.s1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------客户端-----------------");
        //1.创建客户端对象 指明服务器的地址
        Socket client = new Socket(InetAddress.getLocalHost(),8888);
        //2.写出数据
        //2.1通过输出流写出数据
        //获取输出流
        OutputStream outputStream = client.getOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        ps.println("你好吗？");
        //3.关闭资源
        ps.close();
        client.close();
    }
}
