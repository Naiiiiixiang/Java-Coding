package hahaha.lalala.interfa.inexer1;

public interface LiveAble {
    //抽象方法没有方法体
    public abstract void eat();
    void breathe();
    //睡觉方法
    default void sleep(){
        System.out.println("静止不动");
    }
    //静态方法
    static void drink(){
        System.out.println("喝水");
    }

}
