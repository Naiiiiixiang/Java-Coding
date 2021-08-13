package hahaha.lalala.api.equals;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }



    /*  @Override
    public boolean equals(Object obj) {//Object obj = p4;
        //1.当 obj为null时
        if (obj == null) {
            return false;
        }
        //2.当两个对象的地址相同时
        if (this == obj) {
            return true;
        }
        //3.比较属性是否相同
        // obj 是 Object类型  需要 向下转型才能使用子类自己的属性
        if(obj instanceof Person){
            Person p = (Person)obj;
            if(this.name.equals(p.name) && this.age == p.age){
                return true;
            }
        }
        return false;
    }*/
}
