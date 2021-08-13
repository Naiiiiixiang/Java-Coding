package hahaha.lalala.lambda.function;

import org.junit.Test;

import java.util.function.Supplier;

/*
构造器引用
 */
public class ConstruReference {


    @Test
    public void test01() {

       /* Supplier<Person> s = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };*/
        //Supplier<Person> s = ()->new Person();
        Supplier<Person> s = Person::new;
        System.out.println("s.get() = " + s.get());
    }
    @Test
    public void test02() {
        Person p = new Person();
      /*  Supplier<String> s = new Supplier<String>() {
            @Override
            public String get() {
                return p.getName();//"Person"
            }
        };*/
        // Supplier<String> s = ()->p.getName();
        Supplier<String> s = p::getName;
        System.out.println("s.get() = " + s.get());
    }
}
class Person {
    String name = "Person";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
