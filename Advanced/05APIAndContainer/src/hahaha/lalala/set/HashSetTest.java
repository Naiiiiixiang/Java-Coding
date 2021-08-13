package hahaha.lalala.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
HashSet
      底层采用hash表存储数据

        无序 不是按照顺序存储
        唯一 元素不能重复
 重写 hashCode()
        判断存到hsah表哪一个位置
     equals();
       当此位置有数据时 需要 进行属性对比 如果完全一样 则 不再存入

 */
public class HashSetTest {
    @Test
    public void test04() {
        Set<String> set = new HashSet();
        set.add("你好");
        set.add("世界");
        set.add("李白");
        set.add("王安石");
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }


    }
    @Test
    public void test03() {
        Set<String> set = new HashSet();
        set.add("你好");
        set.add("世界");
        set.add("李白");
        set.add("王安石");
        System.out.println(set);


        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){

            String next = iterator.next();

            System.out.println(next);
        }

    }

    @Test
    public void test02() {
        Set<Person> set = new HashSet<>();
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        set.add(new Person("李白", 20));
        System.out.println(set);


    }


    @Test
    public void test01() {
        Set<String> set = new HashSet();
        set.add("你好");
        set.add("世界");
        set.add("世界");
        set.add("李白");
        set.add("王安石");
        System.out.println(set);

    }
}
