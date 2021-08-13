package hahaha.lalala.innerclass4;
/*
匿名内部类：
    没有名字的内部类
什么作用：
    节约代码

如何创建匿名内部类：
    new 类(){}
    new 接口(){}
    1.创建了一个没有名字的匿名子类
    2.创建了该匿名子类对象

注意：
    1.匿名内部类 就是没有名字的局部内部类
    2.匿名内部类能使用外部类什么资源 要看所在的方法是否静态
        静态方法 只能使用静态资源
        非静态方法 能使用所有资源
    3.匿名内部类使用了所在方法的局部变量 则此变量 会被final修饰
    4.匿名内部类也会生成独立的字节码文件
      命名方式 外部类名$序号
      Test2$1.class
      Test2$2.class
      Test2$3.class
 */
public class Test {
    public static void  main(String[] args) {
        //1.创建RabbitRunnable 对象
       /* RabbitRunnable r = new RabbitRunnable();
        Thread t1 = new Thread(r);

        t1.start();*/

     /*   Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("兔子跑了......");
            }
        });
        thread.start();*/

     new Thread(()-> System.out.println("兔子跑了")).start();


    }
}

class RabbitRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("兔子跑了......");
    }
}
