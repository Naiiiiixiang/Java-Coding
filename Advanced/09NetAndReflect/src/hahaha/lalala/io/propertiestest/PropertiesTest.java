package hahaha.lalala.io.propertiestest;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test01(){
        //获取所有的jdk内的配置信息
        Properties properties = System.getProperties();
        //展示所有配置内容
        properties.list(System.out);
    }


    @Test
    public void test02() throws IOException {
        /*
        Properties 继承 Hashtable
           存储键值对信息
         */
        Properties p = new Properties();
        //添加配置信息
        p.setProperty("ch", "china");
        p.setProperty("ja", "japan");
        p.setProperty("中", "中国");
        System.out.println(p);
        //将配置信息进行持久化操作
        p.store(new FileOutputStream("s.properties"), "test");
       // p.store(new FileWriter("h.properties"), "test");
    }


    @Test
    public void test03() throws IOException {
        //读入数据
        //1.新建 Properties对象
        Properties pro = new Properties();
        //加载配置文件的数据
        pro.load(new FileInputStream("s.properties"));
        System.out.println(pro);
        //获取指定key 的值
        String ja = pro.getProperty("ja");
        System.out.println("ja = " + ja);

    }
    @Test
    public void test04() throws IOException {
        //读入数据
        //1.新建 Properties对象
        Properties pro = new Properties();
        //加载 src 下 配置文件的数据   程序所在的类.class.getClassLoader().getResourceAsStream("s.properties")
        pro.load(PropertiesTest.class.getClassLoader().getResourceAsStream("s.properties"));
        System.out.println(pro);
        //获取指定key 的值
        String ja = pro.getProperty("ja");
        System.out.println("ja = " + ja);
    }
}
