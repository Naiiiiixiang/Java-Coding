package hahaha.lalala.generic.g2;

import java.util.ArrayList;
import java.util.Date;

/*
好处：
    1.比较时 不需要向下转型
    2.在使用集合时 可以添加指定类型的数据

 */
public class Test {

    @org.junit.Test
    public void test01(){
        ArrayList list = new ArrayList();
    }
}
class A<T>{
    String name;
    T score;
}
