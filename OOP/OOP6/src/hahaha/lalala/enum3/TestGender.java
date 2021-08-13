package hahaha.lalala.enum3;

public class TestGender {
    public static void main(String[] args) {

        Gender man = Gender.MAN;
        man.run();
        Gender woman = Gender.WOMAN;
        woman.run();
        switch (man){
            case MAN:
                System.out.println("男人");
                break;
            case WOMAN:
                System.out.println("女生");
                break;
        }
    }
}
