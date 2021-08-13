package hahaha.lalala.abstrctexer2;

public class Test {
    public static void main(String[] args) {
        //多态向上转型
        Person p = new Man();
        p.eat();
        p.walk();
        Man m=(Man)p;
        m.smoke();

    }
}
