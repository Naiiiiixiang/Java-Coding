package hahaha.lalala.oop3;

/*
普通成员变量：
    位置：类中方法外
    内存中的分数： 创建一次对象就会给成员变量分配一块空间
    销毁时间： 当没有引用指向堆中的内存时  由垃圾回收器 GC

 类  Cat
          毛色
          性别
          昵称
 */

public class Test2 {
    public static void main(String[] args) {
        new Person();
        String n = new Person().name;
        System.out.println("n = " + n);
    }
}
