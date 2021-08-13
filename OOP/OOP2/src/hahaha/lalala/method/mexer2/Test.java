package hahaha.lalala.method.mexer2;

public class Test {

    public static void main(String[] args) {

        JuXing j1 = new JuXing();
        j1.length = 10;
        j1.width = 5;

      String result =   j1.getInfo();

        System.out.println(result);

        JuXing j2 = new JuXing();

        j2.length=30;
        j2.width = 10;

        System.out.println(j2.getInfo());

    }
}
