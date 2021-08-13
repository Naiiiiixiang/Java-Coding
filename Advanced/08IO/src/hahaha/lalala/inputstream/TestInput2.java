package hahaha.lalala.inputstream;

import org.junit.Test;

import javax.swing.table.TableStringConverter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/*
解决方案：读取汉字乱码
        1.使用读取字节数组的方式
        2.使用字符流
        完成文件复制操作
 */
public class TestInput2 {
    @Test
    public void test01() throws IOException {
        //1.新建字节输入流对象
        InputStream is = new FileInputStream("D:/a.txt");

        //2.读取数据
        int read = is.read();//一次读取一个字节的数据 汉字 会占多个字节
        //3.展示数据
        System.out.println(read+"-->"+(char)read);
        //4.关闭资源
        is.close();
    }
}
