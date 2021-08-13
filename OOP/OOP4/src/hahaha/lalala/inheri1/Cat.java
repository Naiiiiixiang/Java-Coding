package hahaha.lalala.inheri1;

public class Cat {
    String name;
    int age;

    public Cat(){}
    public Cat(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println("名字是："+name+",年龄是："+age);
    }
}
