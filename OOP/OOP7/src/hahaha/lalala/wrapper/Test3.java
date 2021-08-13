package hahaha.lalala.wrapper;

/*
基本数据类型 与 字符串之间的转换

1.将字符串--->基本数据类型       NumberFormatException  必须是纯数字
    byte  Byte.parseByte("12")
    short  Short.parseShort("23")
    int  Integer.parseInt("123")  必须是纯数字
    long Long.parseLong("12");
    float Float.parseFloat("12.34f"); f可以放 也可以不放  不能放 其他内容  NumberFormatException
    double Double.parseDouble("12.34");
    char 使用字符串.charAt(下标)： 下标从0开始
        char c = "你好世界".charAt(3); //界
    boolean Boolean.parseBoolean("false"); 字符串只要是非true 就是false

2.将基本数据类型--->字符串
  1.可以使用 字符串拼接的方法 20+"";
  2.  String.valueOf(int);
      String.valueOf(long);
      String.valueOf(double);
      String.valueOf(float);
      String.valueOf(char);
 */
public class Test3 {

    public static void main(String[] args) {

        //stringToNum();

        numToString();


    }

    /**
     * 基本类型数据---》字符串
     */
    private static void numToString() {
        //1.直接使用字符串拼接
        int num = 20;
        String s = 20+"";

        //2.可以调用字符串内的方法

        String s1 = String.valueOf(20);
        System.out.println("s1 = " + s1);

        String s2 = String.valueOf(true);
        System.out.println("s2 = " + s2);


    }

    /**
     * 字符串--》基本类型数据
     */
    public static void stringToNum() {
        char c = "你好世界".charAt(3);
        System.out.println("c = " + c);

        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);

        byte b = Byte.parseByte("12");
        System.out.println("b = " + b);
        short i1 = Short.parseShort("23");
        System.out.println("i1 = " + i1);


        float v = Float.parseFloat("12.34f");


        System.out.println("v = " + v);


        boolean aTrue = Boolean.parseBoolean("false");
        System.out.println("aTrue = " + aTrue);
    }
}
