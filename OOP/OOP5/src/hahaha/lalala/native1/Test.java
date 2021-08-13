package hahaha.lalala.native1;
/*
native: 修饰方法  本地方法
        public native int hashCode();
注意：
    0.java不是万能的有些功能无法实现  需要借助于 C/C++ 语言实现
    1.native方法没有方法体
    2.本地方法也是可以重写的
    3. 本地方法执行时 在 本地方法栈中开辟内存
 */
public class Test {

    public static void main(String[] args) {
        Object obj;
        int[] arr = {};
        int i = arr.hashCode();
        System.out.println("i = " + i);//1163157884


        Person p1 = new Person();

        int i1 = p1.hashCode();
        System.out.println("i1 = " + i1);
    }
}
class Person{
    @Override
    public int hashCode() {
        return 10;
    }
}