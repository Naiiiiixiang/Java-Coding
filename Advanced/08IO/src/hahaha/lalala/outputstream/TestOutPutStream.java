package hahaha.lalala.outputstream;

import org.junit.Test;

import java.io.*;

/*
字节输出流

    1.创建对象
        当磁盘不存在此文件时  会自动创建
    2.写出数据
        当次写入的数据 会清空之前的数据后 再写入
 */
public class TestOutPutStream {
    @Test
    public void test05() throws IOException {
        //1.创建输出流对象
        OutputStream os = new FileOutputStream("C:\\aa\\a.txt");
        //2.写出数据
        String s = "你真好看\n";
        //将字符串转为 字节数组
        byte[] bytes = s.getBytes();
        os.write(bytes);
        String s1 = "是的 我知道";
        os.write(s1.getBytes());
        //3.关闭资源
        os.close();
    }


    @Test
    public void test04() throws IOException {
        //1.创建输出流对象
        OutputStream os = new FileOutputStream("D:/b.txt", true);
        //2.写出数据
        byte[] bs = {97, 98, 99, 100};// a b c d
        //  os.write(字节数组, 开始下标, 写出的个数);
        os.write(bs, 0, 3);//abc
        //3.关闭资源
        os.close();
    }


    @Test
    public void test01() throws FileNotFoundException {
        //1.创建字节输出流对象
        File file = new File("D:/a.txt");
        OutputStream os = new FileOutputStream(file);

        //2.创建字节输出流对象
        OutputStream os1 = new FileOutputStream("D:/a.txt");
    //3.创建字节输出流对象 在原有基础上追加
        OutputStream os2 = new FileOutputStream("D:/b.txt", true);
    }

    @Test
    public void test02() throws IOException {
        //1.创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        //2.写出数据
        fos.write(97);//写出的是该数字对应的字符
        //3.关闭资源
        System.out.println("写出完毕");
        fos.close();

    }

    @Test
    public void test03() throws IOException {
        //1.创建流对象
        OutputStream os = new FileOutputStream("D:/b.txt");
        //2.写出数据
        byte[] bs = {69, 70, 71};
        os.write(bs);
        os.write(98);//a
        //3.关闭资源
        os.close();
    }
}
