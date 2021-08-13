package hahaha.lalala.method.m4;

public class Circle {

    static int r;

    String name;



    public void introduce(){
        System.out.println("名字是："+name+",半径是："+r);
    }

    public static double getArea(){
         double area =  Math.PI*r*r;
       // System.out.println("名字是："+ name+"面积是："+area);
         return area;
    }
}
