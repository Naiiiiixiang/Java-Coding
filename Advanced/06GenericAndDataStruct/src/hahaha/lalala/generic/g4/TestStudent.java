package hahaha.lalala.generic.g4;

import org.junit.Test;

public class TestStudent {

    @Test
    public void test01() {
        Student<String> s1 = new Student<>("李白", "优秀");
        System.out.println(s1);

        //再次回忆 包装类型问题
        Student<Double> s2 = new Student<>("杜甫", 100.0);
        Student<Character> s3 = new Student<>("王安石", 'A');


    }
}
