package hahaha.lalala.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class TestFile {
    @Test
    public void test04() throws IOException {
        File file = new File("D:/aa");
        //  file.createNewFile();
        //创建单级目录
        //  file.mkdir();
        //创建多级目录
        //file.mkdirs();
        //删除目录时 只能删除空的目录
        file.delete();
    }

    @Test
    public void test03() throws IOException {
        File file = new File("D:/f.txt");
        //判断此文件或者文件夹是否存在
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        //创建文件
        file.createNewFile();
        //删除文件 不经过回收站
        file.delete();
    }


    @Test
    public void test02() {
        //File中的常见方法
        File file = new File("D:\\a.txt");
        System.out.println(file);//D:\a.txt

        //获取文件的名字
        String name = file.getName();
        System.out.println("name = " + name);
        //最后修改时间
        long l = file.lastModified();
        Date date = new Date(l);
        String s = date.toLocaleString();// 2021-3-24 9:24:33
        System.out.println("l = " + l + " , " + date + " , " + s);
        //一步获取最后修改时间
        System.out.println(new Date(file.lastModified()).toLocaleString());
        //判断 当前对象是不是文件
        System.out.println("file.isFile() = " + file.isFile());
        //判断 当前对象是不是文件夹
        System.out.println("file.isDirectory() = " + file.isDirectory());
        //返回文件的长度  单位字节
        //不能获取文件夹长度
        long length = file.length();
        System.out.println("length = " + length);
        File file1 = new File("D:\\0224bigdata");
        System.out.println("file1.length() = " + file1.length());
    }


    @Test
    public void test01() {
        //创建FIle对象
        File file = new File("D:\\a.txt");

        File file1 = new File("D:/a.txt");//?

        File file2 = new File("D:" + File.separator + "a.txt");
    }


}
