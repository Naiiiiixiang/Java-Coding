package hahaha.lalala.exception4;

public class Person {

    String name;
    int age;
    String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) throws AgeException {
        this.name = name;
        //   this.age = age;
        this.setAge(age);
        this.setSex(sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {

        if (age >= 1 && age <= 150) {
            this.age = age;
        } else {
            throw new AgeException(age + " 不符合要求");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            throw new SexException(sex + " 不符合要求");
        }


    }
}
