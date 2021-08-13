package hahaha.lalala.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


class A implements Iterable {

    @Override
    public Iterator iterator() {
        return null;
    }
}

public class TestCollection3 {
    @Test
    public void test03() {
        A a = new A();
    }
/*
Iterable:实现此接口可以使用增强for循环
集合使用增强for 实际上调用的是 迭代器进行遍历
 */
    @Test
    public void test02() {

        Collection<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(20);
        c.add(3);
        c.add(5);
        c.add(8);
        for (Integer ele : c) {

            System.out.println(ele);
        }


    }

    @Test
    public void test01() {
        //创建集合对象
        Collection<Person> c = new ArrayList();
        c.add(new Person("王安石", 20));//Person
        c.add(new Person("安琪拉", 20));
        c.add(new Person("嬴政", 20));
        //迭代器 快速遍历集合
        Iterator<Person> iterator = c.iterator();

        //判断是否还有下一个元素
        while (iterator.hasNext()) {
            //获取元素 并 将 光标 向后移动
            Person person = iterator.next();
            // person.showName();
            System.out.println(person);
        }
    }
}
