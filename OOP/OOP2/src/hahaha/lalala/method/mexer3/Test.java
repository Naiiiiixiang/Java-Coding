package hahaha.lalala.method.mexer3;
/*
什么时候使用静态与非静态？
什么时候使用有返回值方法 没有返回值方法？

    1.需求导向
    2.没有需求 可以自己定义

    3.工具类方法都是静态的

    4.如果方法执行结果  在方法调用处需要使用
      带返回值的方法

 */

public class Test {
    public static void main(String[] args) {


        Circle c1 = new Circle();
        c1.radius = 100;

        Circle c2 = new Circle();
        c2.radius =50;
       // Circle circle = GraphicTools.compareCircle(c1, c2);
        Circle circle =  GraphicTools.compareCircle(c1, c2);
        System.out.println(circle.radius);



    }
}
