package hahaha.lalala.api.getclass;
/*
获取对象的运行时类型
      getClass();
 */
public class Test {

    public static void main(String[] args) {
        Person p = new Man();
        Class aClass = p.getClass();
        System.out.println("aClass = " + aClass);

        int[] arr = {};

        Class a2 = arr.getClass();

        System.out.println("a2 = " + a2);

        String [] ss = {};

        System.out.println("ss.getClass() = " + ss.getClass());


    }
}
