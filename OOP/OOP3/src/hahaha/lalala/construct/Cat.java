package hahaha.lalala.construct;

public class Cat {

    String name;
    int age;
    String color;

    Cat(){}

    Cat(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void showInfo(){
        System.out.println("名字是"+name+",年龄是:"+age+",颜色是："+color);
    }


}
