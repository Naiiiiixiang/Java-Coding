package hahaha.lalala.api.finalize;
/*
final与其有什么区别?
finalize(): 当垃圾回收器回收该对象之前 会调用的方法
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Person();
        }
        //通知垃圾回收器来回收
        System.gc();
        Thread.sleep(5000);
    }
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("被垃圾回收器回收了");
    }
}