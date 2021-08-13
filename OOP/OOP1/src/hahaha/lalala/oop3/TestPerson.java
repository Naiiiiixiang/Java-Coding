package hahaha.lalala.oop3;

public class TestPerson {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        //对象给属性赋值
    /*    p1.sex = "男";
        p1.age = 20;*/
        //输出属性值
        System.out.println("名字是：" + p1.name + ",年龄是：" + p1.age + ",性别是：" + p1.sex);
        System.out.println("--------------------------------------");
        Person p2 = new Person();
        p2.name = "杜甫";
        p2.age = 18;
        p2.sex = "男";
        System.out.println("名字是：" + p2.name + ",年龄是：" + p2.age + ",性别是：" + p2.sex);
        System.out.println("--------------------------------------");

        new Person();
        System.out.println(new Person().name);
    }
}
