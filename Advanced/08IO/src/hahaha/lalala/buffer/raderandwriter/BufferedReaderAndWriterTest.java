package hahaha.lalala.buffer.raderandwriter;

import org.junit.Test;

import java.io.*;

/*
 处理流：直接作用到流上
     -- 缓冲流：
缓冲流：
    -- 字节缓冲流
        -- 字节缓冲输入流
            BufferedInputStream
                 底层有一个长度是 8192 的 byte[]
                  缓冲区大小可以自定义
        -- 字节缓冲输出流
            BufferedOutputStream
               底层有一个长度是 8192 的 byte[]
               缓冲区大小可以自定义
    -- 字符缓冲流
        -- 字符缓冲输出流
            BufferedWriter  char cb[];  8192  支持自定义 缓冲区大小
               bw.newLine(); 写出换行
        -- 字符缓冲输入流
            BufferedReader  char cb[];  8192  支持自定义 缓冲区大小
            br.readLine(); 一次读取一行数据
                           当没有数据时返回null

 */
public class BufferedReaderAndWriterTest {

    @Test
    public void test02() throws IOException {
        //1.新建字符缓冲输入流对象
        Reader reader = new FileReader("D:/bw.txt");
        BufferedReader br = new BufferedReader(reader);
        //2.读入数据
        String s = br.readLine();
        //3.展示数据
        System.out.println(s);
        //第二次读取
        s = br.readLine();
        System.out.println(s);
        //第三次读取
        s = br.readLine();
        System.out.println(s);
        //第四次读取
        s = br.readLine();
        System.out.println(s);

        //第五次读取
        s = br.readLine();
        System.out.println(s);

        //4.关流
        br.close();
    }


    @Test
    public void test01() throws IOException {
        Writer w = new FileWriter("D:/bw.txt");
       // BufferedWriter bw = new BufferedWriter(w);
        BufferedWriter bw = new BufferedWriter(w,81920);
        bw.write(97);
        bw.write("你好世界");
        //支持写出换行
        bw.newLine();
        bw.write("吃饭了");
        bw.close();
    }
}
