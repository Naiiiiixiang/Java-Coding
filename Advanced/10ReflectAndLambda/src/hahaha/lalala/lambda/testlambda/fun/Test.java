package hahaha.lalala.lambda.testlambda.fun;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Test {


    @org.junit.Test
    public void test02() {
        Map<String, String> map = new HashMap<>();
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");

        System.out.println(map);
        //如果以字母a 结尾  value 变为 李白  否则 不变
     /*   map.replaceAll((key,value)->{
            if(value.endsWith("a")){
                return "李白";
            }
            return value;
        });*/
        map.replaceAll((k, v) -> v.endsWith("a") ? "李白" : v);
        System.out.println(map);
    }


    @org.junit.Test
    public void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("ch", "china");
        map.put("ja", "japan");
        map.put("ru", "russia");

        System.out.println(map);
        //如果以字母a 结尾  value 变为 李白  否则 不变
        map.replaceAll(new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                System.out.println(s + "--->" + s2);
                if (s2.endsWith("a")) {
                    return "李白";
                }
                return s2;
            }
        });
        System.out.println(map);
    }
}
