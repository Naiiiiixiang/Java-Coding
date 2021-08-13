package hahaha.lalala.io.propertiestest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class A {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        //添加配置信息
        p.setProperty("ch", "china");
        p.setProperty("ja", "japan");
        p.setProperty("中", "中国");
        System.out.println(p);
        //将配置信息进行持久化操作
        p.store(new FileOutputStream("s111.properties"), "test");
    }
}
