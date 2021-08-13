package hahaha.lalala.inexer1;

public class Test {

    public static void main(String[] args) {


        Circle c1 = new Circle();
        c1.radius = 20;

        c1.setName("圆");

        String info = c1.getInfo();

        System.out.println("info = " + info);

        System.out.println("---------------------------");

        Rectange rectange = new Rectange(10,5);



        String info1 = rectange.getInfo();

        System.out.println("info1 = " + info1);
        System.out.println("---------------------------");


        Rectange r1 = new Rectange("矩形", 20, 10);

        String info2 = r1.getInfo();

        System.out.println("info2 = " + info2);


    }
}
