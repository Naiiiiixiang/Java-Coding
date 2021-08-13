package hahaha.lalala.cmd;

//使用dos 窗口时  在 java命令 后 写入值  值与值之间使用 空格 连接
public class Test {
    //jvm
    public static void main(String[] c) {
     /*   System.out.println("c.length = " + c.length);
        for (String s : c) {
            System.out.println(s);
        }
        1  2
        */

        if (c[0].equals("1")) {
            System.out.println("正常执行逻辑");
        } else {
            System.out.println("报警程序启动");
            System.out.println("自毁程序启动");
        }
    }



}
