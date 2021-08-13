package hahaha.lalala.copy;

import org.junit.Test;
import java.io.*;
/*
使用字节缓冲输入输出流完成文件复制
 */
public class BufferedStreamCopy {
    @Test
    public void test01() {
        long start = System.currentTimeMillis();
        try (
                //1.创建流对象
                InputStream is = new FileInputStream("D:\\software\\Ra2_Yuri(2in1).7z");
                BufferedInputStream bis = new BufferedInputStream(is,819200);
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\aa\\a.7z"),819200);
        ) {
            //2.数据的读入与写出
            byte[] bs = new byte[102400];
            int len;
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制完毕："+(end-start)+" ms");//复制完毕：4631 ms
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
