package hahaha.lalala.generic.g6;

public class Test {

    @org.junit.Test
    public void test01() {
        Student[] ss = {new Student("李白", 20), new Student("杜甫", 30), new Student("李大白", 10), new Student("李小白", 9)};
        for (Student s : ss) {
            System.out.println(s);
        }
        ArraysTools.sort(ss);
        System.out.println("-----------------------------");
        for (Student s : ss) {
            System.out.println(s);
        }

    }
    @org.junit.Test
    public void test02() {

        B[] bs = new B[3];
        ArraysTools.sort(bs);
    }
}

class B implements Comparable<B>{

    @Override
    public int compareTo(B o) {
        return 0;
    }
}


