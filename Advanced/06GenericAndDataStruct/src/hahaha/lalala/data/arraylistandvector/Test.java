package hahaha.lalala.data.arraylistandvector;

import java.util.ArrayList;
import java.util.Vector;

public class Test {
/*
同：
   1. ArrayList Vector 有共同的父亲
    AbstractList
   2.使用Object[] 存储数据

不同：
    1.新建 new  ArrayList(); 新建一个空的 Object类型的数组 进行数据存储
      new Vector(); 新建一个长度为10 的Object类型的数组

    2. Vector 是线程安全的  效率低
       ArrayList 线程不安全的 效率高
    3.查看扩容规则
        ArrayList 第一次添加时 会开辟一个长度为10的数组
         int newCapacity = oldCapacity + (oldCapacity >> 1);
         每次扩大到原来的1.5倍
       Vector 如果 capacityIncrement  是 <=0  那么会扩容到原来的2倍
       oldCapacity + oldCapacity；
              如果 capacityIncrement  是 >0  那么会扩容到原来
              oldCapacity +capacityIncrement；
       int newCapacity = oldCapacity + ((capacityIncrement > 0) ?capacityIncrement : oldCapacity);
 */
    @org.junit.Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
    }
    @org.junit.Test
    public void test02(){
        Vector<String> vector = new Vector<>();
        Vector<Object> objects = new Vector<>(10, 20);
        vector.add("杜甫");
    }
}
