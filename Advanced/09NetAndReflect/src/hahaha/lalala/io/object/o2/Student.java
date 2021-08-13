package hahaha.lalala.io.object.o2;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    private static final long serialVersionUID = 1L;
    transient String name;
    static int age;
    double salary;

    @Override//写出属性
    public void writeExternal(ObjectOutput out) throws IOException {
        //写出每一个属性
     //   out.writeUTF(name);
        out.writeInt(age);
        out.writeDouble(salary);
    }

    @Override //读入属性
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //按照写出的顺序进行读入  赋值给对应的属性
       // name = in.readUTF();
        age = in.readInt();
        salary = in.readDouble();
    }

    public Student() {
    }

    public Student(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
