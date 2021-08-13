package hahaha.lalala.review;

public class Test {

    public static void main(String[] args) {


        Animal a = new Cat();

        showEat(a);

        Animal d  = new Dog();

        showEat(d);

    }

    public static void showEat(Animal a){

        a.eat();

        Cat c = (Cat)a;


    }


}
