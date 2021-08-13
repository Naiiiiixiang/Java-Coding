package hahaha.lalala.reflect.other;

import org.junit.Test;

public class MyAnnTest {

    @Test
    public void test01(){
        //1.获取运行时类型
        Class<Student> aClass = Student.class;

        //2.获取注解
        MyAnn annotation = aClass.getAnnotation(MyAnn.class);

        String value = annotation.value();
        System.out.println(value);


    }
}
