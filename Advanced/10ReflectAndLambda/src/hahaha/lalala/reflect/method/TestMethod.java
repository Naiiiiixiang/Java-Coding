package hahaha.lalala.reflect.method;

import org.junit.Test;

import java.lang.reflect.Method;
/*
  静态方法 不需要传入对象  直接调用即可

  如果方法有返回值  那么 使用变量 接收 调用的结果
  如果方法为非public 方法  需要使用
    //设置私有方法可见
   method.setAccessible(true);
 */
public class TestMethod {

    @Test
    public void test05() throws Exception {
        //1.获取运行时类型
        Class<Person> aClass = Person.class;

        //2.获取指定方法

        Method method = aClass.getDeclaredMethod("add", double.class, int.class);

        //3.进行调用
        Object invoke = method.invoke(null, 3.14, 2);

        System.out.println(invoke);


    }



    @Test
    public void test04() throws Exception {
        //1.创建运行时类型
        Class<Person> aClass = Person.class;
        //2.创建对象
        Person person = aClass.newInstance();

        //3.找到指定方法
        Method method = aClass.getDeclaredMethod("show");

        //设置私有方法可见
        method.setAccessible(true);

        //4.执行方法  没有参数是null
        method.invoke(person, null);

    }


    @Test
    public void test03() throws Exception {
        /*Person person = new Person();
        person.show2("李白");*/
       //1.获取运行时类型
        Class<?> aClass = Class.forName("hahaha.lalala.reflect.method.Person");

        //创建对象  方法调用时需要
        Object o = aClass.newInstance();
        //获取指定的方法
        Method method = aClass.getMethod("show2", String.class);
        //执行方法
        method.invoke(o, "杜甫");

    }

    @Test
    public void test01(){

        //1.创建运行时类型
        Person person = new Person();
        Class aClass = person.getClass();
        //2.获取所有方法 不仅获取 本类中的公共方法 也可以获取父类中的公共方法
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {

            System.out.println(m);
        }

    }

    @Test
    public void test02(){
        Class<Person> aClass = Person.class;
        //获取本类中所有的方法
        Method[] methods = aClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }


}
