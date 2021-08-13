package hahaha.lalala.enum1;

public class Gender {

    final static Gender MAN = new Gender("男");
    final static Gender WOMAN = new Gender("女");

    // int num = 10;

    private String sex;

    private Gender() {
    }

    private Gender(String sex) {
        this.sex = sex;
    }
}
