package hahaha.lalala.polys.poly;

/*
多态：一个对象的多种形态

出入江湖：
  看山是山 看水是水
  int a = 10;
  String name = "李白";
  Student s  = new Student();

看山不是山 看水不是水
    Animal a = new Dog();
    Programmer pro = new China();
模拟各个国家的程序员吃饭

开闭原则：
    开：对功能的拓展是开放的
    闭：对源码的修改是关闭的
 */
public class Test {

    public static void main(String[] args) {
        China ch = new China();
        showEat(ch);
      /*  Japan japan = new Japan();
        showEat(japan);
        USA u = new USA();
        showEat(u);

        Russia r = new Russia();

        showEat(r);*/

    }

    public static void showEat(Programmer pro){//Programmer pro = ch;
        pro.eat();
    }

    /*public static void showEat(Russia a) {
        a.eat();
    }
    public static void showEat(USA a) {
        a.eat();
    }
    public static void showEat(Japan ja) {
        ja.eat();
    }

    public static void showEat(China ch) {
        ch.eat();
    }*/
}
