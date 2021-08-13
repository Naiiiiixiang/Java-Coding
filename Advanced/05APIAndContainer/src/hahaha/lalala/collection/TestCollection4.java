package hahaha.lalala.collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection4 {
/*
ConcurrentModificationException: 并发修改异常

 final void checkForComodification() {
         if (modCount != expectedModCount)
               throw new ConcurrentModificationException();
     }
modCount：记录的是对集合修改的次数
                添加  删除
在集合普通遍历时 不能对 元素进行删除

使用迭代器可以对集合元素进行删除
 */
    @Test
    public void test01(){

        ArrayList<Integer> list = new ArrayList<>();
        //添加6次 modCount 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

      //  list.remove(6);

        //int expectedModCount = modCount; 6

    /*    for (Integer ele : list) {
            if(ele%2==0){
                //执行删除操作 会导致  modCount +1;
                list.remove(ele);
            }
        }*/


        Iterator<Integer> iterator = list.iterator();


        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next%2==0){
                iterator.remove();
            }
        }

        System.out.println(list);


    }
}
