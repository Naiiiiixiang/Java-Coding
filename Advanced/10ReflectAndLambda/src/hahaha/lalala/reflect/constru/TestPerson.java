package hahaha.lalala.reflect.constru;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
注意：
    1.如果是非公有的构造器
      必须采用 getDeclaredConstructor();
    2.设置属性可见    constructor.setAccessible(true);
 */
public class TestPerson {
    @Test
    public void test05() throws Exception{
        //1.创建运行时类型
        Class<Person> aClass = Person.class;
        //2.获取指定的构造器
        Constructor<Person> constructor = aClass.getDeclaredConstructor(String.class);
        //3.给构造器赋值
        constructor.setAccessible(true);
        Person person = constructor.newInstance("杜甫");
        //4.展示数据
        System.out.println(person);
    }

    @Test
    public void test04() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.获取运行时类
        Class<Person> aClass = Person.class;

        //2.获取指定参数的构造器
        Constructor<Person> constructor = aClass.getConstructor(String.class, int.class);
        //3.完成成员变量赋值
        Person person = constructor.newInstance("李白", 20);
        System.out.println(person);
        System.out.println("----------------------------");
       // new Person("李白", 20);
    }



    @Test
    public void test03() throws IllegalAccessException, InstantiationException {
        //1.获取运行时类
        Class<Person> aClass = Person.class;
        //2.调用了本类中的无参构造器
        Person person = aClass.newInstance();
        System.out.println(person);
    }



    @Test
    public void test02() {
        //1.获取运行时类
        Class<Person> aClass = Person.class;
        //获取本类中所有的构造器
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
    }

    @Test
    public void test01(){
        //1.获取运行时类
        Class<Person> aClass = Person.class;
        //获取当前类中所有[ public ]的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
    }
}
