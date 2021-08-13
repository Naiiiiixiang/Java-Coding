package hahaha.lalala.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/*
Collection 是单列集合的根父接口
    -- Set
    -- List
测试 Collection 接口内的方法
 */
public class TestCollection {
    @Test
    public void test06() {
        Collection c = new ArrayList();
        c.add(new Person("李白", 20));
        System.out.println(c);
    }

    @Test
    public void test05() {
        //创建集合对象
        Collection c = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        c.add("李白");
        c.add("杜甫");
        //将集合转为数组
        Object[] array = c.toArray();
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test04() {
        //创建集合对象
        Collection c = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        c.add("李白");
        c.add("杜甫");

        Collection c1 = new ArrayList();
    /*    c1.add("李白");
        c1.add("杜甫");*/
        c1.add("王安石");
        //求交集  无论是否存在交集 都会返回true
        boolean b = c1.retainAll(c);
        System.out.println(b+"--->"+c1);
    }

    @Test
    public void test03() {
        //创建集合对象
        Collection c = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        c.add("1");
        System.out.println("c.isEmpty() = " + c.isEmpty());
        c.add("李白");
        c.add("杜甫");
        System.out.println(c);
      //  c.clear();
        //集合中不存在元素 就是空
        System.out.println("c.isEmpty() = " + c.isEmpty());
        //删除指定元素
        c.remove("李白");
        System.out.println(c);

    }


    @Test
    public void test02(){
        //创建集合对象
        Collection c = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        c.add("1");
        c.add("李白");
        c.add("杜甫");
        Collection c2 = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        c2.add("李白");
        c2.add("1");
        c2.add("杜甫");
        //清空集合
      //  c.clear();
        //判断集合内是否存在指定元素
        boolean contains = c.contains("李白11");
        System.out.println("contains = " + contains);
        System.out.println(c);
        //集合元素每一个位置都要与要比较元素的位置相同
        boolean equals = c.equals(c2);
        System.out.println("equals = " + equals);

    }

    @Test
    public void test01(){
        //创建集合对象
        Collection c = new ArrayList();// 爷爷的引用指向了孙子的实例  多态
        //添加数据
        c.add(10);//自动装箱
        c.add("李白");
        c.add(new Date());
        System.out.println(c);
        //获取集合中元素的数量
        int size = c.size();
        System.out.println("size = " + size);

        //创建集合对象2
        Collection c1 = new ArrayList();
        c1.add("杜甫");
        c1.add("王安石");
        //添加集合
        c1.addAll(c);//将每一个元素单独拿出来 放到本集合内
       // c1.add(c);//将所有的元素作为一个对象添加
        System.out.println("c1.size() = " + c1.size());//3
        System.out.println(c1);//[杜甫, 王安石, 10, 李白, Sat Mar 20 11:16:05 CST 2021]
        //判断此集合是否包含指定集合
        boolean b = c1.containsAll(c);
        System.out.println("b = " + b);
    }
}
