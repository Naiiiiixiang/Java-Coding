package hahaha.lalala.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet:
        有序： 按照排序顺序
                  自然顺序(从小到大)
        唯一： 数据不重复

 两种排序方式：
    一.让排序的类型 实现 Comparable接口
    二。创建TreeSet(排序规则);
 */
public class TreeSetTest {

    @Test
    public void test04() {


        Set<Person> set = new TreeSet(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        //  Set<Person> set = new TreeSet<>();
        set.add(new Person("李白", 20));
        set.add(new Person("杜甫", 21));
        set.add(new Person("王安石", 2));
        set.add(new Person("李商隐", 1));

        System.out.println(set);


    }

    @Test
    public void test03() {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("李白", 20));
        set.add(new Student("杜甫", 21));
        set.add(new Student("嬴政", 19));
        set.add(new Student("安琪拉", 3));
        //只保留一个安琪拉 因为 年龄一样
        set.add(new Student("安琪拉111", 3));
        System.out.println(set);
    }


    @Test
    public void test01() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(-1);
        set.add(6);
        System.out.println(set);
    }

    @Test
    public void test02() {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("a");
        set.add("C");
        set.add("b");
        System.out.println(set);
    }
}
