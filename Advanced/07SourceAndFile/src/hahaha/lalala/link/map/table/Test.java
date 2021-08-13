package hahaha.lalala.link.map.table;

import java.util.HashMap;
import java.util.Hashtable;

/*
底层采用Hash表
不同
    1.HashMap 1.8 第一次创建对象的时候  没有给底层的顺序表开辟空间
     Hashtable   第一次创建对象的时候 给底层的顺序表开辟空间  长度为11  Entry<?,?>[]
    2.HashMap key value都可以是null
      Hashtable  key value都不可以是null
    3.Hashtable 线程安全的  效率低
      HashMap 线程不安全  效率高
    4.Hashtable jdk1.0
      HashMap jdk 1.2
同：
    1.底层都是采用哈西表存储数据
    2.都实现了Map接口
 */
public class Test {

    @org.junit.Test
    public void test01() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "李白");
        map.put("杜甫", null);
        map.put(null, null);
        System.out.println(map);
    }

    @org.junit.Test
    public void test02() {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("ch", "china");
        hashtable.put("ch",null);
     //   hashtable.put(null, "china");


        System.out.println("hashtable = " + hashtable);


    }
}
