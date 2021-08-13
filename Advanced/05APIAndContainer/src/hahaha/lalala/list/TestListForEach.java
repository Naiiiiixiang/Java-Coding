package hahaha.lalala.list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListForEach {
    ArrayList<String> list = new ArrayList<>();

    @Before
    public void before() {

        list.add("李白");
        list.add("杜甫");
        list.add("王安石");
        list.add("李商隐");
    }
    @Test
    public void test05() {
        //后面会讲
        list.forEach(System.out::println);
    }
    @Test
    public void test04() {
        /*
        使用listiterator遍历
        想要实现 从后向前遍历  需要先 从前向后遍历
         */
        //获取迭代器对象
        ListIterator<String> listIterator = list.listIterator();

        //判断光标之后有没有数据
        while (listIterator.hasNext()) {
            //获取当前元素的前一个下标
            int previousIndex = listIterator.previousIndex();
            String next = listIterator.next();
            //获取当前元素的后一个下标
            int nextIndex = listIterator.nextIndex();
            System.out.println(previousIndex + "---> " + next + "   <------" + nextIndex);
        }
        System.out.println("--------------------------------------------");
        //判断光标之前有没有数据
        while (listIterator.hasPrevious()) {

            //获取光标之前的数据
            String previous = listIterator.previous();

            System.out.println("previous = " + previous);
        }


    }

    @Test
    public void test03() {
        /*
        普通for循环
         */
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println("s = " + s);
        }
    }


    @Test
    public void test02() {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            String ele = iterator.next();
            System.out.println("迭代器--》" + ele);
        }

    }

    @Test
    public void test01() {
        for (String s : list) {

            System.out.println("增强for遍历：" + s);
        }


    }
}
