package hahaha.lalala.net.socket.s3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端对象
        Socket socket = new Socket("127.0.0.1", 9999);

        //2.创建输出流写出数据
        PrintStream ps = new PrintStream(socket.getOutputStream());

        //3.创建输入流你读入服务端反馈的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建Scanner 对象
        Scanner in = new Scanner(System.in);

        //4.反复读写

        while (true) {
            System.out.println("请问 你要给服务端发什么呢？");
            String s = in.next();
            if(s.equalsIgnoreCase("stop")){
                break;
            }
            ps.println(s);
            String s1 = br.readLine();
            System.out.println("服务端反馈的信息是：\t" + s1);
            if (2 > 3) {
                break;
            }
        }
        //5.关流
        br.close();
        ps.close();


    }
}
