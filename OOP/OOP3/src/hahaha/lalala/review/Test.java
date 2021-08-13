package hahaha.lalala.review;

/*
新建一个坐标类 Point 两个属性  x y
新建一个测试类  创建一个 坐标对象 并给属性赋值

新建一个方法  将坐标对象作为参数传递  在方法内 交换连个坐标的值

输出  方法调用前 中 后  x y的值
 */
public class Test {

    public static void main(String[] args) {
        //创建坐标对象
        Point p1 = new Point();

        p1.x = 10;
        p1.y = 20;
        System.out.println("方法调用前：（x=" + p1.x + ",y=" + p1.y + "）");// 10   20
        swap(p1);
        System.out.println("方法调用后：（x=" + p1.x + ",y=" + p1.y + "）");//10 20  ; 20 10
    }

    public static void swap(Point p1) {
        int temp = p1.x;

        p1 = new Point();

        p1.x = p1.y;
        p1.y = temp;
        System.out.println("方法调用后：（x=" + p1.x + ",y=" + p1.y + "）");//20 10
    }
}
