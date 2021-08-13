package hahaha.lalala.net.socket.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------服务端-----------------");
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.接收来连接的客户端socket
        System.out.println("111111111111");
        Socket socket = serverSocket.accept();
        System.out.println("222222222222");
        //3.输入流读取数据
        InputStream inputStream = socket.getInputStream();
        //将字节流--》字符流
        InputStreamReader isr = new InputStreamReader(inputStream);
        //字符流--->缓冲字符流
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        System.out.println("客户端发来的数据是："+s);
        //4.关闭资源


        br.close();
        serverSocket.close();

    }
}
