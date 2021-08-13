package hahaha.lalala.generic.g5;

import java.util.ArrayList;
import java.util.Date;

/*
泛型擦除：
    1.如果泛型类 接口 没有采用 泛型 自动应用最高类型 Object
    2.如果局部变量有泛型约束  那么 只存在于编译时  不会写入class文件
    但是：
        如果为成员变量 或者方法的形参 会存在
 */
public class Test {

    ArrayList<Integer> l1 = new ArrayList<>();

    public static void show(ArrayList<String> list){




    }

    @org.junit.Test
    public void test02(){

        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        list.add("杜甫");


    }


    @org.junit.Test
    public void test01(){

        ArrayList l = new ArrayList();

        l.add(new Date());
        l.add("11");
        l.add(666);
    }

}
