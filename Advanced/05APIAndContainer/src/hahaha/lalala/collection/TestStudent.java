package hahaha.lalala.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestStudent {

    @Test
    public void test01(){
        //新建集合对象
        Collection<Student> c = new ArrayList<>();
        //向集合内添加数据
        c.add(new Student("李白", 100));
        c.add(new Student("杜甫", 80));
        c.add(new Student("王安石", 90));
        c.add(new Student("李商隐", 81));

        for (Student student : c) {
            System.out.println(student);
        }


    }

    @Test
    public void test02(){
        //新建集合对象
        Collection<Student> c = new ArrayList<>();
        //向集合内添加数据
        c.add(new Student("李白", 100));
        c.add(new Student("杜甫", 80));
        c.add(new Student("王安石", 90));
        c.add(new Student("李商隐", 81));
        //获取迭代器
        Iterator<Student> iterator = c.iterator();
        //判断光标后是否有值
        while (iterator.hasNext()){
            //获取光标后的值
            Student student = iterator.next();
            if(student.score<=81){
                //删除元素
                iterator.remove();
            }
        }

        System.out.println(c);




    }
}
