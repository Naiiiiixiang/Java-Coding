package hahaha.lalala.inheri4;

public class Animal {
    String name;
    int age;
    public void show(){
        System.out.println("名字是："+name+"，年龄是："+age);
    }
     void add(int a,int b){
    }

    public Animal add(Animal a){
        return null;
    }

    static void cc(){}

}

class Cat extends Animal{

    static void cc(){}

    String color;
    public Animal add(Animal a){
        return null;
    }
    //访问权限可以比父类大
     public   void add(int a,int b){
  }








    //override 重写  overload
    public void show(){
        System.out.println("名字是："+name+"，年龄是："+age+"，颜色是："+color);
    }

}