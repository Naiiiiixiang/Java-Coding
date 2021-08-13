package hahaha.lalala.final1;

/*
final：
    修饰类: 不能被继承  是太监类
       final class  Person
    修饰方法：此方法不能被重写
         public final void eat(){}
    修饰变量:
         final修饰的变量 是常量
    修饰对象：地址值不能改变
 */
public class Test {
    public static void main(String[] args) {
        final int num = 20;
        //num = 30;
        System.out.println(num);

        final Person p1 = new Person("李白", 20);

        p1.name = "杜甫";

        System.out.println(p1.name + " , " + p1.age);

      //  p1 = new Person("王安石", 66);


    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void eat() {
        System.out.println("吃饭.......");
    }
}

class Student extends Person {
  /*  @Override
    public void eat() {
        System.out.println("学生吃饭");
    }*/
}
