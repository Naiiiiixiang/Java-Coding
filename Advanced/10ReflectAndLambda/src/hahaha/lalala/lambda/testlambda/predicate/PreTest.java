package hahaha.lalala.lambda.testlambda.predicate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PreTest {


    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("白居易");
        System.out.println("删除前" + list);
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean with = s.endsWith("白");
                if (with) {
                    return true;
                }
                return false;
            }
        });
        System.out.println("删除后" + list);

    }

    @Test
    public void test02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("白居易");
        System.out.println("删除前" + list);
      /*  list.removeIf((s)->{
            if(s.endsWith("白")){
                return true;
            }
            return false;
        });*/
        //list.removeIf((s)->s.endsWith("白")?true:false);
        list.removeIf(s -> s.endsWith("白"));
        System.out.println("删除后" + list);
    }
}
