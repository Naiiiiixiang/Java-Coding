package hahaha.lalala.reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {
    @Test
    public void test03() throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        /*Person person = new Person();
        person.salary = 2222;*/

        //1.获取运行时类型
        Class<Person> aClass = Person.class;

        //2.获取指定的属性
        Field salary = aClass.getDeclaredField("salary");

        salary.setAccessible(true);
        //2.1创建对象
        Person person = aClass.newInstance();
        System.out.println(person);
        //3.给属性赋值
        salary.set(person,999.99);

        System.out.println(person);

    }



    @Test
    public void test02() {
        //1.获取运行时类型
        Class<Person> aClass = Person.class;
        //获取本类中所有的属性
        Field[] d = aClass.getDeclaredFields();

        for (Field field : d) {
            System.out.println(field);
        }
    }
    @Test
    public void test01(){
        //1.获取运行时类型
        Class<Person> aClass = Person.class;
        /*
        可以获取 本类以及父类的公共属性
         */
        Field[] fields = aClass.getFields();

        for (Field field : fields) {

            System.out.println(field);
        }


    }

}
