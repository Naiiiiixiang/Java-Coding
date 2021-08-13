package hahaha.lalala.writer;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
字符输出流
  1.写出数据时 要先把数据写到缓存区
    调用flush()
    关流

 */
public class WriterTest {
    @Test
    public void test03() throws IOException {
        //1.创建流对象
        Writer w2 = new FileWriter("D:/w2.txt",true);
        //2.写出数据

        w2.write("\n");
        char[] cs = {'E','F','C','D'};
        /*
         w2.write(数组,开始写出的下标,写出的数量);
         */
        w2.write(cs,0,2);
        w2.write("你好世界");
        //3.关闭资源
        w2.close();



    }

    @Test
    public void test02() throws IOException {
        //1.创建字符输出流对象
        Writer w = new FileWriter("D:/w1.txt");
        //2.写出数据
        String s = "吃了没有";
        /*
         w.write(字符串, 开始写出的下标, 写出的数量);
         */
        w.write(s, 0, 2);
        //3.关闭资源

        w.close();
    }



    @Test
    public void test01() throws IOException {
        //1.创建流对象
        Writer writer = new FileWriter("D:/w.txt");
        //2.写出数据
        writer.write(97);// a
        //写出字符串
        writer.write("热不热？");
        char[] c = {'A','B','C'};
        //写出char[]
        writer.write(c);
        // writer.flush();



        //3.关闭资源
        writer.close();

    }
}
