package hahaha.lalala.construct;

public class TestEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee("001", "李白", 25000, '的');
        String info = e1.getInfo();
        System.out.println("info = " + info);


    }
}
