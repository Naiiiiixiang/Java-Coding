package hahaha.lalala.net.socket.s4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static int count = 0;
    public static void main(String[] args) throws IOException {
        System.out.println("-----------------Server------------------");

        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //要处理n个客户端请求
        while (true){
            //2.接收来连接的客户端socket
            Socket socket = serverSocket.accept();
            //3.创建线程 处理该客户端socket
            System.out.println(socket.getInetAddress().getHostName()+"来连接的数量"+ ++count);
            SocketThread thread = new SocketThread(socket);
            thread.start();
        }
    }
}
