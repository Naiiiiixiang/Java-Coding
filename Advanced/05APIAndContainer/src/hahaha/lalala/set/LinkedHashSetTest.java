package hahaha.lalala.set;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedHashSet
   有序  按照添加顺序存储
   唯一 数据不重复
   存储自定义类型数据 需要重写 hashCode（）
                              equals();
 */
public class LinkedHashSetTest {
    @Test
    public void test03() {
        Set<Person> set = new LinkedHashSet<>();
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        System.out.println(set);


    }


    @Test
    public void test01(){
        Set<String> set = new LinkedHashSet<>();
        set.add("你好");
        set.add("世界");
        set.add("李白");
        set.add("李白");
        set.add("王安石");
        System.out.println(set);
    }

    @Test
    public void test02(){
        String s = "AAAAAAAAABBBBBBBBBBCCCCCCCDDDDD";
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));
        Set<String> set = new LinkedHashSet<>();
        for (String s1 : split) {
            set.add(s1);
        }
        System.out.println(set);
    }

}
