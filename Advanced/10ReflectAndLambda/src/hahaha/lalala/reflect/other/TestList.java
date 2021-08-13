package hahaha.lalala.reflect.other;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
/*
使用反射突破泛型限制
 */
public class TestList {

    @Test
    public void test01() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<String> list = new ArrayList<>();
        list.add("李白");
        System.out.println(list);

        //获取运行时类型
        Class listClass = list.getClass();

        //获取指定的add()
        Method method = listClass.getDeclaredMethod("add", Object.class);

        //执行方法
        method.invoke(list, new Date());

        System.out.println(list);

    }
}
