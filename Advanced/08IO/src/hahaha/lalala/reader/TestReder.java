package hahaha.lalala.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/*

字符输入流
一次读取一个字符
    当没有数据时会返回-1
   注意：
      如果编码不一致 会中文乱码
 一次读取一个字符数组
     当没有数据时会返回-1
     当没有数据时会返回有价值信息的个数
 */
public class TestReder {
    //一次读取一个字符数组
    @Test
    public void test02() throws IOException {
        //1.创建字符输入流对象
        Reader r = new FileReader("D:/r.txt");
        //2.创建字符数组
        char[] cs = new char[3];
        //3.开始读取数据
        int len = r.read(cs);
        //4.展示数据
        System.out.println(Arrays.toString(cs)+"===第一次读取=="+len);//[6, A, 你]===第一次读取==3
        //第二次
        len = r.read(cs);
        System.out.println(Arrays.toString(cs)+"===第二次读取=="+len);//[好, 世, 界]===第二次读取==3
        //第三次
        len = r.read(cs);
        System.out.println(Arrays.toString(cs)+"===第三次读取=="+len);//[啊, 世, 界]===第二次读取==1
        //第三次
        len = r.read(cs);
        System.out.println(Arrays.toString(cs)+"===第四次读取=="+len);//[啊, 世, 界]===第二次读取==1

        //5.关闭资源
        r.close();

    }

    @Test
    public void test01() throws IOException {
        //1.创建字符输入流对象
        Reader r = new FileReader("D:/r.txt");
        //2.读取数据
        int read = r.read();
        //3.数据展示
        System.out.println(read+"-->"+ (char)read);

        //第二次读
        read = r.read();
        System.out.println(read+"-->"+ (char)read);

        //第三次读
        read = r.read();
        System.out.println(read+"-->"+ (char)read);


        //第四次读
        read = r.read();
        System.out.println(read+"-->"+ (char)read);
        //第五次读
        read = r.read();
        System.out.println(read+"-->"+  read);

        //4.关闭资源

        r.close();


    }
}
