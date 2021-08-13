package hahaha.lalala.interfa.inexer1;

public class Plant implements LiveAble{

    @Override
    public void eat() {
        System.out.println("吸收营养");
    }

    @Override
    public void breathe() {
        System.out.println("吸入二氧化碳 呼出氧气");
    }
}
