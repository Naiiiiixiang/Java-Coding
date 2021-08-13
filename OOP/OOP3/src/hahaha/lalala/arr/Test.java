package hahaha.lalala.arr;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.name= "李白";
        p.age  = 13;
        Person p1 = new Person();
        p1.name = "杜甫";
        p1.age=20;
        p1.introduce();

        Person [] ps = {p,p1,new Person()};
        System.out.println("ps = " + ps);
        for (Person person : ps) {
            person.introduce();
        }
    }
}
class Person{
    String name;
    int age;
    public void introduce(){
        System.out.println("名字是："+name+",年龄是："+age);
    }
}
