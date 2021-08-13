package hahaha.lalala.system;

import org.junit.Test;

import java.util.Arrays;
import java.util.Properties;

public class SystemTest {
    @Test
    public void test01() {
        //强制退出jvm
        //System.exit(1);
        //获取当前时间 距离1970.1.1的毫秒数
        long l = System.currentTimeMillis();
        System.out.println(l);//1616119131651
        //获取java中的配置信息 系统属性
        Properties properties = System.getProperties();
        properties.list(System.out);
       /*
       java.vm.version=25.172-b11
         key =  value
        */
        //获取单个配置信息
        String value = System.getProperty("java.specification.version");
        System.out.println("value = " + value);

    }

    @Test
    public void test02() {


        int[] arr = {10, 20, 30, 40};

        int[] newArr = new int[6];
        /**
         src       数据源
         srcPos    数组源开始的下标
         dest      目标数组
         destPos   目标数组开始下标
         length    复制的数量
         System.arraycopy(src,srcPos,dest,destPos,length);
         */
        //完成复制
        System.arraycopy(arr, 0, newArr, 0, 4);
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void test03() {
        String[] arr = {"李白", "杜甫", "王安石", "李商隐"};

        String[] ss = new String[6];// 从  下标为1的位置开始粘贴  只要李白杜甫
//        System.arraycopy(arr, 0, ss, 0, arr.length);
        System.arraycopy(arr, 0, ss, 1, 2);
        System.out.println(Arrays.toString(ss));
    }
}
