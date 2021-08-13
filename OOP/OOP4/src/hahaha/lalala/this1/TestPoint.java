package hahaha.lalala.this1;
//静态方法内不能使用this
public class TestPoint {
    public static void main(String[] args) {

        //创建点坐标
        Point p1 = new Point(10, 20);

        Point p2 = new Point(30, 40);

        //调用方法 计算距离
        double distance = Point.getDistance(p1, p2);

        System.out.println("distance = " + distance);

        System.out.println("----------------------------------------");
        Point p3 = new Point(10, 20);
        Point p4 = new Point(30, 40);

        double distance1 = p3.getDistance(p4);
        System.out.println("distance1 = " + distance1);


    }
}
