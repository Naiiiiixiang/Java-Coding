package hahaha.lalala.interfa.interface3;

public class E extends D implements A {
    @Override
    public void aa() {

    }

    @Override
    public void eat() {
        System.out.println("E eat()");
    }

    public static void main(String[] args) {
        D d = new D();
        d.eat();
        d.a();
    }
}
