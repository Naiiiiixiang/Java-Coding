package hahaha.lalala.fengzhu;

public class TestCat {

    public static void main(String[] args) {
        Cat c2 = new Cat();
     /*     c2.name = "小花";
       c2.age = 2000;
        c2.show();
       */

        c2.setName("小花");

        String name = c2.getName();
        System.out.println("name = " + name);

        c2.setAge(20000);
        int age = c2.getAge();
        System.out.println("age = " + age);
        System.out.println("-----------------------------");

        Cat cat = new Cat("小白", 3000);
        cat.show();
    }
}
