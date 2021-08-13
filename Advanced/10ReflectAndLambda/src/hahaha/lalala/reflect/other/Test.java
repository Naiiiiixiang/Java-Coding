package hahaha.lalala.reflect.other;

public class Test {

    @org.junit.Test
    public void test01(){
        //获取运行时类型
        Class<A> aClass = A.class;
        //获取内部类
        Class<?>[] classes = aClass.getDeclaredClasses();
        for (Class<?> a : classes) {

            System.out.println(a);
        }
    }

    @org.junit.Test
    public void test02(){

       // Class<A.B> bClass = A.B.class;
        Class<A> aClass = A.class;
        //获取外部类信息  没有外部类时返回null
        Class<?> declaringClass = aClass.getDeclaringClass();
        System.out.println(declaringClass);//null
    }
}

class A{

    class B{
    }
    class C{
        class D{

        }
    }

}
