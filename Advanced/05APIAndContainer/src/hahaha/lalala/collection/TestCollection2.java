package hahaha.lalala.collection;

import org.junit.Test;

import java.util.*;

/*
泛型： 规定输入数据的类型
 */
public class TestCollection2 {

    @Test
    public void test05() {

    }

    @Test
    public void test04() {
        int[] arr = {10, 20, 30};
        int[] arr1 = {10, 20, 30};
        List<int[]> ints = Arrays.asList(arr, arr1);

        //返回一个不可变的集合
        List<Integer> asList = Arrays.asList(10, 20, 30, 50);
        asList.add(10);//java.lang.UnsupportedOperationException
        System.out.println(asList);
    }

    @Test
    public void test03() {
        //创建集合对象
        Collection<Person> c = new ArrayList();
        c.add(new Person("王安石", 20));//Person
        c.add(new Person("安琪拉", 20));
        c.add(new Person("嬴政", 20));
        for (Person ele : c) {
            ele.showName();
        }

        Object[] objects = c.toArray();

        //创建指定类型的数组
        Person[] people = c.toArray(new Person[]{});

        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));

    }


    @Test
    public void test02() {
        Collection<String> c = new ArrayList();
        c.add("李白");

    }

    @Test
    public void test01() {
        //创建集合对象
        Collection c = new ArrayList();
        c.add("李白");//String
        c.add("杜甫");
        c.add(new Person("王安石", 20));//Person
        c.add(new Person("安琪拉", 20));
        c.add(new Person("嬴政", 20));
        c.add(new Date());//Date();
        System.out.println("c.size() = " + c.size());
        System.out.println(c);
        /*
        for(集合元素类型 变量名：集合的名字){

        }
         */
        for (Object ele : c) {
            System.out.println(ele);
            // ele.showName();
            if (ele instanceof Person) {
                Person p1 = (Person) ele;
                p1.showName();
            }
        }

    }
}
