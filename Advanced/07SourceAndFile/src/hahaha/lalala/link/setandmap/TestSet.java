package hahaha.lalala.link.setandmap;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {

    @Test
    public void test01(){
        //HashSet 底层是HashMap
        HashSet  s = new HashSet<>();
        s.add("lll");
        s.add("222");

    //LinkedHashSet底层是  LinkedHashMap
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(89);

    //底层是  TreeMap
        TreeSet ts = new TreeSet();
        ts.add(90);
    }
}
