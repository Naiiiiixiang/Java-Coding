package hahaha.lalala.reflect.base;

/*
反射：在程序的运行过程中 获取 对象的所有信息

获取运行时类型

4种

 */
public class Test {

    @org.junit.Test
    public void test01() {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Class aClass = p1.getClass();

        System.out.println("aClass = " + aClass);//aClass = class com.atguigu.reflect.base.Person
        Class aClass1 = Person.class;
        System.out.println(aClass == aClass1);

    }

    @org.junit.Test
    public void test02() {

        Class aClass = Person.class;

        System.out.println("aClass = " + aClass);//class com.atguigu.reflect.base.Person


    }
    @org.junit.Test
    public void test03() throws ClassNotFoundException {
        Class aClass = Class.forName("hahaha.lalala.reflect.base.Person");
        System.out.println("aClass = " + aClass);
    }


    @org.junit.Test
    public void test04() throws ClassNotFoundException {
        Class<Person> aClass = Person.class;


        ClassLoader loader = aClass.getClassLoader();

        Class aClass1 = loader.loadClass("hahaha.lalala.reflect.base.Person");
        System.out.println("aClass1 = " + aClass1);
    }

}



