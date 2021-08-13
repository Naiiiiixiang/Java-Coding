package hahaha.lalala.api.tostring;
/*
com.atguigu.api.tostring.Person@4554617c

全类名：包名 + 类名
@：
4554617c： 当前对象的hash码 转换为 16进制的值
 */
public class Test {

    public static void main(String[] args) {


        Person p1 = new Person();
    //com.atguigu.api.tostring.Person@4554617c
        System.out.println(p1);

        String s = p1.toString();
   //com.atguigu.api.tostring.Person@4554617c
        System.out.println("s = " + s);


        Person p2 = new Person("李白", 20);

        System.out.println(p2);

    }
}
