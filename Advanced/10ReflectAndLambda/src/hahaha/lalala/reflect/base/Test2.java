package hahaha.lalala.reflect.base;

import org.junit.Test;

import java.lang.reflect.Modifier;

public class Test2 {

  @Test
  public void test04() throws ClassNotFoundException {

    Class<Test2> aClass = Test2.class;

    //获取权限修饰符
    int modifiers = aClass.getModifiers();
    System.out.println(modifiers);//1
    System.out.println("Modifier.toString(modifiers) = " + Modifier.toString(modifiers));
  }

  @Test
  public void test03() throws ClassNotFoundException {

    Class<Student> aClass = Student.class;
    Package aPackage = aClass.getPackage();
    System.out.println("aPackage = " + aPackage);
  }
    @Test
    public void test01() {
        //1.获取运行时类型
        Class<Student> aClass = Student.class;
        //获取 父类
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }



    @Test
    public void test02() throws ClassNotFoundException {


        Class aClass = Class.forName("hahaha.lalala.reflect.base.Student");
        //获取实现的接口
        Class[] interfaces = aClass.getInterfaces();

        for (Class a : interfaces) {
            System.out.println(a);
        }
    }


}


interface A {
}

interface B {
}
