package hahaha.lalala.generic.g7;
/*
声明一个数组  类中的 T 不知道什么类型
？: 占位作用
   不知道放什么类型
   代表任意类型
   Object 只能代表Object类型
 */
public class Test {

    @org.junit.Test
    public void test03() {
        Person<Double> p1 = new Person<>();
        Person<String> p2 = new Person<>();
        Person<Object> p3 = new Person<>();
        Person<?>[] ps = new Person[3];

        ps[0]=p1;
        ps[1]=p2;
        ps[2]=p3;
    }
    @org.junit.Test
    public void test02() {
        Person<Double> p1 = new Person<>();
        Person<String> p2 = new Person<>();
        Person<Object> p3 = new Person<>();
        //只能放泛型是Object类型的数据
        Person<Object>[] ps = new Person[3];
        ps[0] = p3;
    }
    @org.junit.Test
    public void test01() {
        Person<Double> p1 = new Person<>();
        Person<String> p2 = new Person<>();
        Person<Object> p3 = new Person<>();

    }
}


