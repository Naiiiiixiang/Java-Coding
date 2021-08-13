public class TestPerson {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name="李白";
        p1.age=18;
        p1.sex='男';
        int a = p1.age;
        System.out.println("年龄是："+a);

        p1.study();

    }
}
