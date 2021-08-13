package hahaha.lalala.interfa.inexer1;

public class Test {
    public static void main(String[] args) {


        LiveAble animal = new Animal();

        animal.eat();
        animal.breathe();
        animal.sleep();

        System.out.println("--------------------");
        LiveAble plant = new Plant();
        plant.eat();
        plant.breathe();
        plant.sleep();

        LiveAble.drink();
    }
}
