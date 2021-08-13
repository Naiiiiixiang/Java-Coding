package hahaha.lalala.exer1.e2;

public class Test {
    public static void main(String[] args) {


        //创建四个窗口
        Window w1 = new Window("窗口一");
        Window w2 = new Window("窗口二");
        Window w3 = new Window("窗口三");
        Window w4 = new Window("窗口四");

        // 启动线程
        w1.start();
        w2.start();
        w3.start();
        w4.start();


    }
}