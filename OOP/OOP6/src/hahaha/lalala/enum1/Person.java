package hahaha.lalala.enum1;

public class Person {

    public static Person p = new Person();
    public static int num = 20;


    public Person(String name, Gender gender, Gender gender1) {
        this.name = name;
        this.gender = gender;
        this.gender1 = gender1;
    }
    public Person() {
        System.out.println("99999");
    }

    String name = "李白";
   // String sex = "男的666";
    Gender gender =Gender.MAN;
    Gender gender1 =Gender.WOMAN;

}
