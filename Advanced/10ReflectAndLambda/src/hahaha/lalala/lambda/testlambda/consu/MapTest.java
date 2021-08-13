package hahaha.lalala.lambda.testlambda.consu;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest {

    Map<String,String> map = new HashMap<>();
    @Before
    public void test01(){
        Map<String,String> map = new HashMap<>();
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");
    }

    @Test
    public void test04(){
   /*     map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+"  --- >" + s2);
            }
        });*/

/*   map.forEach((key,value)->{
       System.out.println(key+"--->"+value);
   });*/
        map.forEach((key,value)->System.out.println(key+"--->"+value));

    }



    @Test
    public void test02(){
    //同行获取所有的key
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"--->"+ value);
        }
    }

    @Test
    public void test03(){
        //获取所有的键值对对象
        Set<Map.Entry<String, String>> set = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        while (iterator.hasNext()){

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getKey()+"---->" + entry.getValue());
        }


    }
}
