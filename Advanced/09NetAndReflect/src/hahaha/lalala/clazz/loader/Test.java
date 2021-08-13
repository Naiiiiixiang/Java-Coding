package hahaha.lalala.clazz.loader;
/*
类的加载器：
 java中通过不同的类的加载器 加载类
    根加载器： 加载核心类库  String  Integer
             rt.jar  null
              BootstrapClassLoader
    扩展类加载器
           jre\lib\ext
             ExtClassLoader
    应用程序加载器
          自定义类
          AppClassLoader
    自定义类的加载器***


当有加载类的任务时  如何分配任务？
    双亲委托模式

    有加载任务 会先看一下 AppClassLoader 有么有加载过  如果加载过 直接返回 结果 如果没有加载过  将任务给扩展类加载器    如果加载过 直接返回 结果 如果没有加载过

    将任务 再给引导类加载器  如果不该 引导类加载器 加载 将任务 回传 给 扩展类加载器  该此加载器 加载  就进行加载  否则 进行回传  。


    1. 防止重复加载
    2. 防止恶意修改 系统类
 */

public class Test {


    @org.junit.Test
    public void test01(){

        //获取根加载器

        String a = "ss";

        System.out.println("a.getClass().getClassLoader() = " + a.getClass().getClassLoader());


    }


    @org.junit.Test
    public void test02() throws ClassNotFoundException {


        Class<?> aClass = Class.forName("com.sun.nio.zipfs.ZipCoder");
//sun.misc.Launcher$ExtClassLoader@a09ee92
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println("aClass.getClassLoader() = " + classLoader);
        System.out.println("classLoader.getParent() = " + classLoader.getParent());

    }

    @org.junit.Test
    public void test03() throws ClassNotFoundException {

        A a = new A();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader classLoader = a.getClass().getClassLoader();
        System.out.println("a.getClass().getClassLoader() = " + classLoader);

        System.out.println("classLoader.getParent() = " + classLoader.getParent());


    }
}
class A{

}