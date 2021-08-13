package hahaha.lalala.map;

import org.junit.Test;

import java.util.*;

public class HashMapTest {
/*
HashMap
    key 无序  唯一
        key 重复时 后面的value 会替换掉之前的value
    value
 */
    @Test
    public void test01(){
        //创建map对象
        HashMap<String,String> map = new HashMap<>();
        //添加数据
        map.put("ch", "chinese");
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");
        System.out.println(map);
        //根据key获取指定的value
        String ru = map.get("ru");
        System.out.println("ru = " + ru);
        //清空集合
        map.clear();
        System.out.println("map.size() = " + map.size());
    }

    @Test
    public void test02() {
        //创建map对象
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");
        System.out.println(map);
        //通过key 删除键值对
        map.remove("ru");
        System.out.println(map);

        //获取所有的key
        Set<String> keys = map.keySet();
        System.out.println("keys = " + keys);
        //获取所有的value
        Collection<String> values = map.values();
        System.out.println("values = " + values);
    }

    @Test
    public void test03() {
        //创建map对象
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");

        //获取所有的key
        Set<String> keySet = map.keySet();
        //通过key获取value
        for (String s : keySet) {
            String value = map.get(s);
            System.out.println(s+" ----> "+value);
        }
    }

    @Test
    public void test04() {
        //创建map对象
        Map<String, String> map = new HashMap<>();
        //添加数据
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");
        //获取所有的键值对
        Set<Map.Entry<String, String>> set = map.entrySet();
        //获取迭代器对象
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()){
            //获取的是一个个键值对
            Map.Entry<String, String> entry = iterator.next();
            //获取key
            String key = entry.getKey();
            //获取value
            String value = entry.getValue();
            System.out.println(key+" ---> "+value);
        }
    }
}
