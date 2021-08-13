package hahaha.lalala.copy;

import org.junit.Test;

import java.io.*;

/*
try(
    只能放 实现 AutoCloseable 接口的孩子
  ){}catch(){}
trywith resources
 */
class A implements AutoCloseable{
    @Override
    public void close() throws Exception {

    }
}
public class ReaderCopy {
    @Test
    public void test02() {
        //1. 创建流对象
        try (Reader r = new FileReader("D:/c.txt");
             Writer w = new FileWriter("D:/d1.txt");

        ) {
            //2.创建字符数组
            char[] cs = new char[100];

            int len;
            //3.读入数据
            while ((len = r.read(cs)) != -1) {
                //4.写出数据
                w.write(cs, 0, len);
            }
            System.out.println("写出完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() {
        //1.创建两个流对象
        try (
                Reader r = new FileReader("D:\\c.txt");
                Writer w = new FileWriter("D:/d.txt");
        ) {
            //2.读取数据
            int len = r.read();
            while (len != -1) {
                //3.写出数据
                w.write(len);
                //再次读取
                len = r.read();
            }
            System.out.println("写出完毕");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
