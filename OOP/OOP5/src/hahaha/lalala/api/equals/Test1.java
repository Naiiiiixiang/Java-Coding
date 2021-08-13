package hahaha.lalala.api.equals;

public class Test1 {
    public static void main(String[] args) {

        Person p1 = new Person("李白", 20);
        Person p4 = new Person("李白", 20);

        Person p2 = null;
        Person p3 = p1;

        boolean equals = p1.equals(p4);
        System.out.println("equals = " + equals);

    /*    boolean equals = p1.equals(p3);
        System.out.println("equals = " + equals);*/

        /*boolean equals = p1.equals(p2);
        System.out.println(equals);*/

    }
}
