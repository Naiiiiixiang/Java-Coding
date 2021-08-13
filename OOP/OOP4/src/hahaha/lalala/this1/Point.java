package hahaha.lalala.this1;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double getDistance(Point p1) {
        System.out.println(this);
        double tempValue = (p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y);

        double distance = Math.sqrt(tempValue);


        return distance;
    }

    //获取两点间的距离
    public static double getDistance(Point p1, Point p2) {
        //获取平方和
        double tempValue = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
        //开平方
        double distance = Math.sqrt(tempValue);

        return distance;
    }

}
