package hahaha.lalala.net.socket.s3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("==================Server===================");
        //1.创建服务端对象
        ServerSocket serverSocket = new ServerSocket(9999);

        //1.1获取对应的客户端对象
        Socket socket = serverSocket.accept();

        //2.创建输入流  读入数据
        InputStream inputStream = socket.getInputStream();// 你好吗？
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));

        //3.创建输出流  写出数据
        PrintStream ps = new PrintStream(socket.getOutputStream());

        //4.读入与写出
        while (true){
            String s = bf.readLine();

            StringBuilder builder = new StringBuilder(s);
            //字符串反转
            String  reverse = builder.reverse().toString();
            System.out.println("客户端发来的数据是：  "+s+" , 反转后的值是： "+ reverse);
            ps.println(reverse);

            if(2>3){
                break;
            }
        }

        ps.close();
        bf.close();
        serverSocket.close();


    }
}
