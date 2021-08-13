package hahaha.lalala.polys.poly5;

public class Animal {
    String name = "动物";
    public void eat(){
        System.out.println("Animal eat()");
    }
}
class  Cat extends Animal{
    String name = "Cat";
    @Override
    public void eat() {
        System.out.println("Cat eat()");
    }
}
