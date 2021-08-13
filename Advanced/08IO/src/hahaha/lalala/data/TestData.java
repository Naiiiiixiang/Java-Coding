package hahaha.lalala.data;

import org.junit.Test;

import java.io.*;

/*
数据流：
    可以保持基本类型数据的特点
    以二进制的形式 存储在磁盘上
    只有字节流 没有字符流
    处理流

 */
public class TestData {


    @Test
    public void test01() throws IOException {
        //1.新建数据输出流对象
        OutputStream os = new FileOutputStream("D:/fos.txt");
        DataOutputStream dos = new DataOutputStream(os);
        //2.写出数据
        dos.writeInt(97);
        dos.writeBoolean(true);
        dos.writeUTF("好饿啊");
        //3.关闭资源
        dos.close();
    }

    @Test
    public void test02() throws IOException {
        //1.新建数据输入流对象
        InputStream is = new FileInputStream("D:/fos.txt");
        DataInputStream dis = new DataInputStream(is);
        //2.开始进行读取
        int i = dis.readInt();
        boolean b = dis.readBoolean();
        String s = dis.readUTF();
        System.out.println(i+"  --> "+b+" -- >  "+s);
        //3.关闭资源
        dis.close();
    }
}
