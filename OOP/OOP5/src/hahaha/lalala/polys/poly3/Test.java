package hahaha.lalala.polys.poly3;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Cat cat = new Cat();
        showEat(dog);
        showEat(cat);
    }
    public static void showEat(Animal a){//Animal a = dog;Animal a = cat;
        a.eat();
    }
}
