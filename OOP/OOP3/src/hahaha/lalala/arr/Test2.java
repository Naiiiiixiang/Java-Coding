package hahaha.lalala.arr;

public class Test2 {

    public static void main(String[] args) {
        //创建圆类型数组
        Circle cs[] = new Circle[3];
        //第一个元素
        cs[0] = new Circle();
        cs[0].r = 20;
        //第二个元素
        Circle c1 = new Circle();
        c1.r = 30;
        cs[1] = c1;
       //第三个元素
        cs[2] = new Circle();
        for (Circle c : cs) {
            c.introduce();
        }

    }
}
class Circle {
    int r;
    public void introduce() {
        System.out.println("圆的半径是：" + r);
    }
}
