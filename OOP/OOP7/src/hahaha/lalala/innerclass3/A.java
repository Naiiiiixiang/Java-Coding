package hahaha.lalala.innerclass3;

public class A {
    public static void main(String[] args) {
        // C c = b;
        C c = show();
        c.cc();
    }

    public static C show(){
        int a = 20;
        class B implements C{
            @Override
            public void cc() {
                System.out.println("a : " +a);
            }
        }
        //创建局部内部类对象
        B b = new B();
        return b;
    }
}
interface C{
    void cc();
}