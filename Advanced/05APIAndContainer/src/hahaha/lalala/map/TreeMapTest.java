package hahaha.lalala.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*

key
       有序：
          自然顺序
       唯一
            不能重复
value

Map:
  key:简单类型 Integer  String
  value:比较复杂

   key 如果使用自定义类型：
   HashMap<Person,String> map = new HashMap<>();
   LinkedHashMap<Person,String> map = new LinkedHashMap<>();
   重写 hashCode() equals();
   TreeMap<Person,String> ;

 */
public class TreeMapTest {

    @Test
    public void test01() {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "李白");
        map.put(10, "杜甫");
        map.put(9, "李白白");
        map.put(101, "李白666");
        System.out.println(map);


        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

        while (iterator.hasNext()){

            Map.Entry<Integer, String> entry = iterator.next();

            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

    }
}
