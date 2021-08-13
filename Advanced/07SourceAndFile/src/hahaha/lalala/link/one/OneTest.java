package hahaha.lalala.link.one;
import org.junit.Test;

public class OneTest {
    @Test
    public void test04() {
        //创建单链表对象
        OneWay<String> oneWay = new OneWay<>();
        oneWay.add("李白");
        oneWay.add("杜甫");
        oneWay.add(null);
        oneWay.add("辛弃疾");
        oneWay.add("王安石");
        System.out.println(oneWay);
       // int indexOf = oneWay.indexOf("杜甫");
        int indexOf = oneWay.indexOf("666666");
        System.out.println("indexOf = " + indexOf);
    }


    @Test
    public void test03() {
        //创建单链表对象
        OneWay<String> oneWay = new OneWay<>();
        oneWay.add("李白");
        oneWay.add("杜甫");
        oneWay.add(null);
        oneWay.add("辛弃疾");
        oneWay.add("王安石");
        System.out.println(oneWay);
        //oneWay.delete(null);
        oneWay.delete("辛弃疾");
        System.out.println(oneWay);
    }
    @Test
    public void test02() {
        //创建单链表对象
        OneWay<String> oneWay = new OneWay<>();
        oneWay.add("李白");
        oneWay.add("杜甫");
        oneWay.add("辛弃疾");
        oneWay.add("王安石");
        System.out.println(oneWay);
        oneWay.delete("辛弃疾666");
        System.out.println(oneWay);


    }


    @Test
    public void test01(){


    //创建单链表对象
        OneWay<String> oneWay = new OneWay<>();
        System.out.println(oneWay);
        oneWay.add("李白");
        oneWay.add("杜甫");
        oneWay.add("辛弃疾");
        oneWay.add("王安石");
        System.out.println(oneWay);
        System.out.println("oneWay.size() = " + oneWay.size());
        //[李白, 杜甫,王安石]
        //OneWay{head=Node{data=李白, next=Node{data=杜甫, next=null}}, size=2}
    }
}
