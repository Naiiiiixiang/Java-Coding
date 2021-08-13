package hahaha.lalala.inheri5;

public class Animal {

    String name;
    int age;
    char sex;

    public Animal(){}

    public Animal(String name,int age,char sex){
        this.age = age;
        this.name =name;
        this.sex = sex;
    }

    public String show(){
        return "名字是："+name+"，年龄是："+age+"，性别是："+sex;
    }
}

class Cat extends Animal{
    String color;
    public Cat(String color){
        this.color = color;
    }
    public Cat(String name,int age,char sex,String color){
        super(name,age,sex);
      this.color = color;
       /*   this.age = age;
        this.name =name
        this.sex = sex;;*/
    }
    public String show(){
        return super.show()+"，颜色是："+color;
    }
}

