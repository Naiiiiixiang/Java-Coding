package hahaha.lalala.copy;

import org.junit.Test;

import java.io.*;

public class InputStreamCopy {
    @Test
    public void test02() {
        //1.创建流对象
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream("C:\\图片\\步兵驴.jpg");
            os = new FileOutputStream("D:/b.jpg");
            //2.读取数据
            byte[] bs = new byte[1024];
            int len;
            //读入数据
            while ((len=is.read(bs))!=-1){
                //3.写出数据
                os.write(bs, 0, len);
            }
            System.out.println("写出完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭资源
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Test
    public void test01() {
        InputStream is = null;
        OutputStream os = null;
        try {
            //1.创建两个流对象
          /*  int [] arr = new int[4];
            System.out.println(arr[6]);*/
            is = new FileInputStream("C:\\图片\\步兵驴.jpg");
            os = new FileOutputStream("D:/a.jpg");
            //2.读入数据
            int len;
            while ((len = is.read()) != -1) {
                //3.写出数据
                os.write(len);
                //4.再次读入
            }
            System.out.println("复制完毕");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
