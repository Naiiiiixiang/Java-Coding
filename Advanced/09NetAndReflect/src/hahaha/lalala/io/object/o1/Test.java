package hahaha.lalala.io.object.o1;

import java.io.*;

/*
对象流：对 对象进行读写
    序列化： 将程序中的对象 存储到磁盘上 或者进行网络传输
    反序列化：将磁盘中/或者网络中的对象 读取到程序内


ObjectOutputStream 对象输出流

ObjectInputStream  对象输入流

注意：
    1.java.io.NotSerializableException: com.atguigu.io.object.o1.Person
    写出数据时  class Person implements Serializable
    2.在读入数据时 需要 序列化对象的类
    3. 序列化的版本号必须一致的
        private static final long serialVersionUID = 1L;

     4.如何防止某些属性 被序列化
         属性被 transient 修饰
         属性被 static 修饰
 */
public class Test {
    @org.junit.Test
    public void test03(){
        new Person();
    }
    @org.junit.Test
    public void write() throws IOException {
        //1.创建对象
        Person p1 = new Person("李白", 20, 9999.9);
        //2.创建输出流对象
        OutputStream os = new FileOutputStream("D:/object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        //3.写出对象
        oos.writeObject(p1);
        //4.关闭资源
        oos.close();
    }


    @org.junit.Test
    public void read() throws IOException, ClassNotFoundException {
        //1.创建对象输入流
        InputStream is = new FileInputStream("D:/object.txt");
        ObjectInputStream ois = new ObjectInputStream(is);

        //2.读入数据
        Object o = ois.readObject();

        System.out.println(o);

        //3.关闭资源
        ois.close();



    }


}
