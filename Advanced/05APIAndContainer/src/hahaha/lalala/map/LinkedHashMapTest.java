package hahaha.lalala.map;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*

LinkedHashMap：
        key  有序  添加顺序
             唯一   不能重复

        value
 */
public class LinkedHashMapTest {

    @Test
    public void test01(){
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1, "李白");
        map.put(2, "李白");
        map.put(3, "杜甫");
        map.put(3, "杜甫666");
        map.put(4, "王安石");
        System.out.println(map);


        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" ----> "+value);
        }




    }


}
