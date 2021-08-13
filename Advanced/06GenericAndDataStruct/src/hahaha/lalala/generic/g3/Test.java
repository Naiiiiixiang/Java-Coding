package hahaha.lalala.generic.g3;

import java.util.*;

/*
泛型可以放的位置

泛型类
     ArrayList<E>
     HashSet<E>
     HashMap<K,V>
泛型接口
    interface Map<K,V>
    interface Comparable<T>
    interface Comparator<T>
    interface List<E>
    Collection<E> extends Iterable<E>

泛型方法
    在方法执行时 才能确定类型的方法

  public static <T> boolean addAll(){}
 public static <T> void add(T t){
  }

注意：
    T  Type
    K  Key
    V  Value
    E  Element
   见名之意 使用其他字母也可以
 */
class A<O>{
    O t;
}
public class Test {
    public static void show(double d1,int a1){
    }
    public static <T> void add(T t){
    }
    @org.junit.Test
    public void test03(){
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();

        Integer integer = a1.get(1);
        Collections.addAll(a1);
        Collections.addAll(a2);
    }
    @org.junit.Test
    public void test02(){

        Comparable<String> comparable;

        Comparator<String> c;

        List l;

        Collection c1;

        Set s;
    }

    @org.junit.Test
    public void test01(){
        //泛型类
        ArrayList<Integer> list;

        HashSet<Double> set;

        HashMap<Integer,String >map;


    }

}
