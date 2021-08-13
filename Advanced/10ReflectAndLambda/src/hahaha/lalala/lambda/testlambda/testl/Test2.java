package hahaha.lalala.lambda.testlambda.testl;

import org.junit.Test;

/*


()->{}
{}: 只有一行代码 可以省略

(): 只有一个参数 可以省略

(): 参数类型可以省略
 */
interface A{
    void show(String s);
}
public class Test2 {
    @Test
    public void test03(){
        A a = b-> System.out.println(b);
        a.show("王安石");
    }
    @Test
    public void test02(){
        //()->{};
        A a = (s)-> System.out.println(s);
        a.show("杜甫");

    }

    @Test
    public void test01(){
        A a = new A() {
            @Override
            public void show(String s) {
                System.out.println(s);
            }
        };
        a.show("李白");
    }

}
