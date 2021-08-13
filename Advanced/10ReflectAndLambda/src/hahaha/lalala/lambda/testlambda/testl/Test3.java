package hahaha.lalala.lambda.testlambda.testl;

import org.junit.Test;

interface C{
    boolean cc(int a);
}
public class Test3 {

    @Test
    public void test02(){
        C c = (a)->{
            if(a%2==0){
                return true;
            }
            return false;
        };
        System.out.println("c.cc(19) = " + c.cc(10));
    }


    @Test
    public void test01(){


        C c = new C() {
            @Override
            public boolean cc(int a) {
                return false;
            }
        };

        boolean cc = c.cc(20);
        System.out.println("cc = " + cc);

    }


}
