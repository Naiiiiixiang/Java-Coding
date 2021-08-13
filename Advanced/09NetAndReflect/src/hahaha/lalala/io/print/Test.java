package hahaha.lalala.io.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
    public final static PrintStream err = null;
    public final static PrintStream out = null;
    通过native 方法 改变流向

    private static native void setOut0(PrintStream out);
    private static native void setErr0(PrintStream err);
 */
public class Test {

    @org.junit.Test
    public void test02() throws FileNotFoundException {
        PrintStream p = new PrintStream("D:/p.txt");
        //改变流向
        System.setErr(p);
        System.err.println(9999);
        p.close();
    }
    @org.junit.Test
    public void test01() throws FileNotFoundException {
        PrintStream ps =new PrintStream("D:/ps.txt");
        ps.println(97);
        ps.println('C');
        //改变流的方向
        System.setOut(ps);
        System.out.println(666);
        ps.close();
    }
}
