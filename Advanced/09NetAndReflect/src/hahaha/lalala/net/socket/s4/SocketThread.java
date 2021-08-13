package hahaha.lalala.net.socket.s4;

import java.io.*;
import java.net.Socket;

/*
专门处理来连接的请求
接收客户端数据 反转后返回

 */
public class SocketThread extends Thread {

    Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        PrintStream ps = null;
        BufferedReader br = null;
        try {
            //1.创建输入流 接收数据
            InputStream inputStream = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(inputStream));

            String s = br.readLine();
            String s1 = new StringBuilder(s).reverse().toString();
            System.out.println(socket.getInetAddress() + " 发来的数据时---> " + s + " 反转后是：" + s1);

            //2.创建输出流写出数据
            ps = new PrintStream(socket.getOutputStream());
            ps.println(s1);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(ps!=null){
                ps.close();
            }
        }
    }
}
