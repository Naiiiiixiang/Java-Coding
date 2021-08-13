package hahaha.lalala.inputstreamreadtest;

import org.junit.Test;

import java.io.*;

public class Test1 {

    @Test
    public void test01() {
        System.out.println("你好");

    }

    @Test
    public void test02() throws IOException {

        //将字节输出流 ---》 字符输出流
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        //  字符输出流--> 缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(streamWriter);
        //写出数据
        bw.write("世界 你好吗？");
        bw.close();
    }

    @Test
    public void test03() throws IOException {
        //指定写出文件的编码方式
        //字节输出流
        OutputStream os = new FileOutputStream("D:/os.txt");
        //把字节输出流---> 字符输出流
        OutputStreamWriter writer = new OutputStreamWriter(os, "utf-8");
        //写出数据

        writer.write("你好");

        writer.close();

    }

}
