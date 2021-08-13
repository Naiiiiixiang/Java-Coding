package hahaha.lalala.inputstream;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/*
字节输入流
    1.创建对象

    2.读取数据
        2.1一次读取一个字节的数据  read();
           当没有数据时返回-1

        2.2 一次读取一个字节数组  read(byte[])
          读取数据时 会把读到的数据 添加到数组内
          当没有数据时返回-1
          有数据时返回的是 读到的有价值数据的个数
 */
public class TestInput {

    @Test
    public void test07() throws IOException {
        //1.创建字节输入流对象
        InputStream is = new FileInputStream("D:/input.txt");
        //2.创建数组
        byte[] bs = new byte[10];
        //3.开始读取
        //定义变量 记录 有价值信息个数
        int len;
        while ((len=is.read(bs))!=-1){
            //4.展示数据
            String s = new String(bs, 0, len);
            System.out.println("s = " + s);
        }
        //5.关闭资源
        is.close();
    }



    @Test
    public void test06() throws IOException {
        //1.创建字节输入流对象
        InputStream is = new FileInputStream("D:/input.txt");
        //2.创建数组
        byte[] bs = new byte[10];
        //3.开始读取
        int len = is.read(bs);
        while (len!=-1){
            //4.展示数据
            String s = new String(bs, 0, len);
            System.out.println("s = " + s);
            //再继续读
            len = is.read(bs);
        }
        //5.关闭资源
        is.close();
    }



    @Test
    public void test05() throws IOException {
        //1.创建字节输入流对象
        InputStream is = new FileInputStream("D:/input.txt");
        //2.读取数据
        byte[] bs = new byte[3];
        int len = is.read(bs);
        //3. 展示数据
        System.out.println(Arrays.toString(bs)+"--1-->"+len);//[97, 98, 99]-->3
        //将字节数组转为字符串
        String s = new String(bs, 0, len);
        System.out.println("s = " + s);
        //第二次读
        len = is.read(bs);
        System.out.println(Arrays.toString(bs)+"--2-->"+len);//[100, 101, 102]-->3
        s = new String(bs, 0, len);
        System.out.println("s = " + s);
        //第三次读
        len = is.read(bs);
        System.out.println(Arrays.toString(bs)+"--3-->"+len);//[103, 101, 102]-->1
        s = new String(bs, 0, len);
        System.out.println("s = " + s);

        //第四次读
        len = is.read(bs);
        System.out.println(Arrays.toString(bs)+"--4-->"+len);//[103, 101, 102]--4-->-1

        //4.关闭资源
        is.close();


    }


    @Test
    public void test04() throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("D:\\input.txt");
        //2.读取数据
        int read = 0;//第一次读
        while ((read = fis.read()) != -1) {
            //3.数据展示
            System.out.println(read + "-->" + (char) read);
        }
        //4.关闭资源
        fis.close();
    }
    @Test
    public void test03() throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("D:\\input.txt");
        //2.读取数据

        int read = fis.read();//第一次读

        while (read != -1) {
            //3.数据展示
            System.out.println(read + "-->" + (char) read);
            //4.在读一次
            read = fis.read();
        }
        //4.关闭资源
        fis.close();
    }


    @Test
    public void test01() throws FileNotFoundException {
        //创建对象
        File file = new File("D:\\input.txt");
        InputStream is = new FileInputStream(file);
        InputStream is1 = new FileInputStream("D:\\input.txt");
    }

    @Test
    public void test02() throws IOException {
        //1.创建对象
        InputStream is = new FileInputStream("D:/input.txt");
        //2.读取数据
        int read = is.read();
        //3.展示数据
        System.out.println("1read = " + read + " , " + (char) read);
        //第二次读
        read = is.read();
        System.out.println("2read = " + read + " , " + (char) read);
        //第三次读
        read = is.read();
        System.out.println("3read = " + read + " , " + (char) read);

        //第四次读
        read = is.read();
        System.out.println("4read = " + read + " , " + (char) read);

        //第五次读
        read = is.read();
        System.out.println("5read = " + read);

        //4.关闭资源
        is.close();

    }


}
