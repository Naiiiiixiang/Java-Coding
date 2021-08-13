package hahaha.lalala.interfa.interface3;

public interface A {
    void aa();
    default void study(){
        System.out.println("A  晚上一起学习java");
    }
    public default void a(){
        System.out.println("接口A中的默认方法");
    }
}
interface B{
    void bb();
    default void study(){
        System.out.println(" B 晚上一起学习java");
    }
}

class D{
    public void a(){
        System.out.println("D类中的a方法");
    }

    public void eat(){

        System.out.println(" d this is eat()");
    }
}