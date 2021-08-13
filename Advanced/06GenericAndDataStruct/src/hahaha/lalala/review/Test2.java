package hahaha.lalala.review;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {


    @Test
    public void test01(){
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "李白");
        map.put(2, "杜甫");
        map.put(1, "王安石");

        System.out.println(map);

    }

    @Test
    public void test02(){
    /*
    key  无序
           如果key  是自定义类型  必须 重写 hashCode() equals();
         唯一
     */
        HashMap<Person,Integer> map = new HashMap<>();
        map.put(new Person("李白", 20), 100);
        map.put(new Person("李白", 20), 200);

        int size = map.size();
        System.out.println("size = " + size);
    }
}
