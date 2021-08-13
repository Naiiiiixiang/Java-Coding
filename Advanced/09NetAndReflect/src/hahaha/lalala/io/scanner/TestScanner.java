package hahaha.lalala.io.scanner;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

    @Test
    public void test01(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("请您输入一个数字");

        int i = scanner.nextInt();

        System.out.println("i = " + i);

        scanner.close();

    }

    @Test
    public void test02() throws FileNotFoundException {

        //创建Scaneer 对象
        Scanner scanner = new Scanner(new File("D:\\0224bigdata\\0224javaproject\\day21NetAndReflect\\src\\com\\atguigu\\io\\object\\o1\\Person.java"));

            //scanner.hasNextLine() 判断文件内是否有数据
        while (scanner.hasNextLine()){

            //有数据读取一行
            String s = scanner.nextLine();
            System.out.println(s);
        }
        scanner.close();
    }
}
