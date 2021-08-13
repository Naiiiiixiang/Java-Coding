package hahaha.lalala.construct;
/*
使用this 区分成员变量与局部变量
 */
public class TestCat {
    public static void main(String[] args) {

        Cat cat = new Cat("花花", 3, "花色");
        cat.showInfo();


        new Cat();
    }
}
