package hahaha.lalala.reflect.base;

import org.junit.Test;

import java.util.Scanner;

public class Test3 {

    static {
        System.out.println("test3");
    }

    @Test
    public void test01(){

        Student student = new Student();

        Person person = new Person();
    }
    @Test
    public void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner in = new Scanner(System.in);
        System.out.println("请问 您要创建什么对象啊？");
        String c = in.next();
        Class aClass = Class.forName(c);
        //通过运行时类创建对象
        Object o = aClass.newInstance();
        System.out.println(o);
    }
}
