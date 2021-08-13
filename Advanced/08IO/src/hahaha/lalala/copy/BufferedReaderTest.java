package hahaha.lalala.copy;

import org.junit.Test;

import java.io.*;
import java.util.logging.Level;

public class BufferedReaderTest {

    @Test
    public void test02() {
        //1.创建字符缓冲流对象


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:/bw1.txt"));
             BufferedReader br = new BufferedReader(new FileReader("D:\\0224bigdata\\day20io\\代码\\c.txt"));
        ) {
            //2.读取一行数据
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //3.写出一行数据
                bw.write(line);
                //写出一行后 换行
                bw.newLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() {
        //1.创建字符缓冲流对象


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:/bw1.txt"));
             BufferedReader br = new BufferedReader(new FileReader("D:\\0224bigdata\\day20io\\代码\\c.txt"));
        ) {
            //2.读取一行数据
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                //3.写出一行数据
                bw.write(line);
                //写出一行后 换行
                bw.newLine();
                //再读一次
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
