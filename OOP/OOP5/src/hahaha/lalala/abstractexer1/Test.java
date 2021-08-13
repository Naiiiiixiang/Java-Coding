package hahaha.lalala.abstractexer1;
/*
定义一个几何图形父类Graphic。
所有几何图形都应该具备一个计算面积的方法。但是不同的几何图形计算面积的方式完全不同。
 */
public class Test {
    public static void main(String[] args) {

        Graphic g1 = new Circle(10);
        g1.getArea();


        Graphic juXing = new JuXing(10, 5);

        juXing.getArea();


    }
}
