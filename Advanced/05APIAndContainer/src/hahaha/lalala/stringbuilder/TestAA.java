package hahaha.lalala.stringbuilder;
import org.junit.Test;
public class TestAA {
    @Test
    public void test01() {
        //字符串
        //test();//String 用时【 44685 】ms
        // test1();//StringBuffer 用时【 40 】ms
        test2();//StringBuilder 用时【 17 】ms
    }
    private void test2() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 10_0000; i++) {
            s.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder 用时【 "+(end-start)+" 】ms");
    }

    private void test1() {
        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < 10_0000; i++) {
            s.append(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("StringBuffer 用时【 "+(end-start)+" 】ms");
    }

    private void test() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10_0000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String 用时【 "+(end-start)+" 】ms");
    }
}
