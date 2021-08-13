package hahaha.lalala.construct;

public class Person {

    String name;
    int age;
    char sex;
    double height;
    //有参构造器
    Person(String n,int a,char s, double d){
        name = n;
        age = a;
        sex = s;
        height = d;
    }
    Person(String n){
        name = n;
    }
    //无参构造
    Person(){}

    public void introduce() {
        System.out.println("名字是：" + name + "，年龄是：" + age + "，性别是：" + sex + "，身高是：" + height);
    }
}
