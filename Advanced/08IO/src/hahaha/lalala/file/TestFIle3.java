package hahaha.lalala.file;

import org.junit.Test;

import java.io.File;

public class TestFIle3 {
    @Test
    public void test01(){
        File file = new File("D:\\资料整理\\作业\\day11_homework面向对象");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
    @Test
    public void test02() {
        File file = new File("D:\\资料整理\\作业\\day11_homework面向对象");
        File[] files = file.listFiles();
        for (File f : files) {
            //判断文件是否为文件夹
            if(f.isDirectory()){//是文件夹
                System.out.println("<DIR>\t\t"+f.getName() );
            }else{
                System.out.println(f.length()+"\t\t"+f.getName());
            }
          //  System.out.println(f);
        }
    }
}
