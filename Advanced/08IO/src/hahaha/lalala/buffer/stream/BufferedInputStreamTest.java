package hahaha.lalala.buffer.stream;

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
 */
public class BufferedInputStreamTest {
    @Test
    public void test02() throws IOException {
        //1.创建字节缓冲输入流对象
        InputStream is = new FileInputStream("D:/c.txt");
       // BufferedInputStream bis = new BufferedInputStream(is);
        BufferedInputStream bis = new BufferedInputStream(is,81920);
        bis.read();
        bis.close();
    }


    @Test
    public void test01() throws IOException {
        //1.创建字节缓冲输出流对象
        OutputStream os = new FileOutputStream("D:/os.txt");
       // 创建字节缓冲输出流对象
     //   BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedOutputStream bos = new BufferedOutputStream(os,81920);
        bos.write(97);
        bos.flush();
        bos.close();
    }


}
