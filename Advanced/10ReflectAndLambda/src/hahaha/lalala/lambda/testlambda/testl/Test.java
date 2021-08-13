package hahaha.lalala.lambda.testlambda.testl;

public class Test {


    @org.junit.Test
    public void test01() {
        C1 c1 = new C1();
        show(10, 20, c1);
    }

    @org.junit.Test
    public void test02() {
        Calc calc = new Calc() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b + "\t <--------");
            }
        };
        show(10, 20, calc);
    }

    /*
    ()->{}
    (): 子类重写接口内方法的参数
    ->:lambda的表示
    {}:重写方法的方法体

     */
    @org.junit.Test
    public void test03() {
        Calc c = (int a1, int b1) -> {
            System.out.println(a1 + b1 + " ----");
        };
        show(100, 20, c);
    }

    @org.junit.Test
    public void test04() {
        Calc calc = (int a, int b) -> {
            System.out.println(a + b);
        };
        show(200, 300, calc);
    }

    @org.junit.Test
    public void test05() {
        //形参类型可以省略
        Calc calc = (a, b) -> {
            System.out.println(a + b);
        };
        show(300, 300, calc);
    }
    @org.junit.Test
    public void test06() {
        //如果方法体中只有一行代码  那么 可以省略{}
        Calc calc = (a, b) -> System.out.println(a + b);
        show(300, 400, calc);
    }

    public static void show(int n1, int n2, Calc c) {//Calc c = c1
        c.add(n1, n2);
    }
}

class C1 implements Calc {
    @Override
    public void add(int a, int b) {
        System.out.println("---->" + (a + b));

    }
}