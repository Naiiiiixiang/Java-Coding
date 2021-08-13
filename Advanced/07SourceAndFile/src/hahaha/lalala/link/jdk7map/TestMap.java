package hahaha.lalala.link.jdk7map;

import org.junit.Test;

import java.util.HashMap;
/*
第一次创建对象时  内部的成员变量
static final int DEFAULT_INITIAL_CAPACITY = 16;//默认的初始容量
最大容量
static final int MAXIMUM_CAPACITY = 1 << 30;
默认的加载因子
static final float DEFAULT_LOAD_FACTOR = 0.75f;
底层哈西表内顺序表的类型
Entry<K,V>[] table;
Map集合内键值对的数量
transient int size;
capacity * load factor
容量 * 加载因子
阈值 开关
int threshold; 12
加载因子
final float loadFactor;

调用完无参构造
     会将阈值赋值为 12
     loadFactor 0.75F
     table = new Entry<>[16];

要求：底层的顺序表 必须是 2的次幂

数据添加：
    1.key 为null时
         首次添加 会将键值对 添加到 顺序表内下标为0的位置
         重复添加 会将 新的value 替换旧的value 并将旧的value 返回
    2.key 不为null
       2.1 指定位置第一次添加
            直接添加到指定位置

       2.2多次添加到指定位置 key 不重复
         七上：
               后追加的数据 会后来居上  直接添加到 顺序表的指定位置  之前存在的数据 要 变为 新添加数据的后一个元素
      2.3 多次添加到指定位置 key重复
 注意：
    扩容
        1.键值对的数量 >= 阈值
        2.即将添加位置 不能是null
        两个条件必须都满足
        扩容到原来的2倍
         if ((size >= threshold) && (null != table[bucketIndex])) {
            resize(2 * table.length);
            hash = (null != key) ? hash(key) : 0;
            bucketIndex = indexFor(hash, table.length);
        }
 */
public class TestMap {
    @Test
    public void test02(){
        HashMap<String,String> map = new HashMap<>();
        //数据添加
        map.put("ch", "china");
        map.put("cc", "CCTV");
        String c = map.put("ch", "chinese");
        System.out.println("c = " + c);
        System.out.println(map);


    }
    @Test
    public void test01(){
    //1.新建对象后
       // HashMap<String,String> map = new HashMap<>();
       // HashMap<String,String> map = new HashMap<>();
    //2.数据如何添加
        HashMap<String,String> map = new HashMap<>();
        map.put(null, "李白");
        String oldValue = map.put(null, "杜甫");

        System.out.println(oldValue);

        System.out.println(map);


    }
}
