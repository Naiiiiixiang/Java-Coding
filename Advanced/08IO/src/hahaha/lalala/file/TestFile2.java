package hahaha.lalala.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestFile2 {

    @Test
    public void test01() throws IOException {
        File file = new File("D:\\资料整理\\作业\\day09_homework\\day09_课后练习.md");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());


    }

    @Test
    public void test02() throws IOException {
        File file = new File("HelloWorld.txt");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
    }

    @Test
    public void test03() throws IOException {
        File file = new File("../../HelloWorld.txt");
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        //规范路径
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
    }

    @Test
    public void test04() throws IOException {
        File file = new File("HelloWorld.txt");
        //创建在当前的模块下
        file.createNewFile();
    }
}
