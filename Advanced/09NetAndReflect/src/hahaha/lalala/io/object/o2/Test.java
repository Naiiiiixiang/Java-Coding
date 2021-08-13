package hahaha.lalala.io.object.o2;
import java.io.*;
/*
 使用：class Student implements Externalizable
    1.必须提供 无参构造
    2.必须提供序列化的版本号
    3.writeExternal
      readExternal 在进行序列化或者反序列化时 jdk内部会自动调用 不需要程序员手动调用
    4. 可以通过 手动控制 某个属性 不被 写出 和读入
 */
public class Test {


    @org.junit.Test
    public void write() throws IOException {
        //1.创建对象
        Student s1 = new Student("李白", 20, 8888.8);
        //2创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/oos.txt"));
        //3写出数据
        oos.writeObject(s1);
        //4关闭资源
        oos.close();

    }


    @org.junit.Test
    public void read() throws IOException, ClassNotFoundException {

        //1.创建 对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/oos.txt"));
        //2.读入数据

        Object o = ois.readObject();


        System.out.println(o);


        //3.关闭资源
        ois.close();



    }
}
