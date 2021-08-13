package hahaha.lalala.inputstreamreadtest;

import java.io.*;
import java.util.Scanner;

/*
转换流：
    将字节流 ---> 字符流
    InputStreamReader: 字节输入流----> 字符输入流

    OutputStreamWriter： 字节输出流---> 字符输出流


 */
public class Test {

    @org.junit.Test
    public void test04() throws IOException {
    //创建字节流
        FileInputStream inputStream = new FileInputStream("D:/a.txt");
        //转换为字符流  指定编码
        InputStreamReader reader = new InputStreamReader(inputStream, "gbk");//中
        int read = reader.read();
        System.out.println((char)read);
        reader.close();
    }


    @org.junit.Test
    public void test03() throws IOException {

        Reader reader = new FileReader("D:/a.txt");

        int read = reader.read();
     //编码不一致 乱码
        System.out.println((char)read);//�

        reader.close();
    }

    @org.junit.Test
    public void test02() throws IOException {
        //System.in 是字节输入流  将字节流包装转换为 字符流
        InputStreamReader isr = new InputStreamReader(System.in);
        //将字符流进行包装 变为缓冲字符输入流
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请您输入一句话");
        //读取键盘输入的数据
        String s = br.readLine();
        System.out.println("----> "+s);

    }

    @org.junit.Test
    public void test01(){

        Scanner in = new Scanner(System.in);
        System.out.println("请您输入一个数字");
        int i = in.nextInt();
        System.out.println("i = " + i);

    }
}
