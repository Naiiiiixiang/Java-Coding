package hahaha.lalala.link.jdk8;

import org.junit.Test;

import java.util.HashMap;
/*
底层顺序表初始大小
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
底层顺序表最大容量
static final int MAXIMUM_CAPACITY = 1 << 30;
默认加载因子
static final float DEFAULT_LOAD_FACTOR = 0.75f;
树化阈值
static final int TREEIFY_THRESHOLD = 8;
反树化阈值
static final int UNTREEIFY_THRESHOLD = 6;
最小树化容量
static final int MIN_TREEIFY_CAPACITY = 64;
底层顺序表类型
 transient Node<K,V>[] table;
 static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
  }
   static class Entry<K,V> implements Map.Entry<K,V> {
        final K key;
        V value;
        Entry<K,V> next;
        int hash;

        Entry(int h, K k, V v, Entry<K,V> n) {
        value = v;
        next = n;
        key = k;
        hash = h;
        }





集合内键值对数量
transient int size;
阈值
int threshold;
加载因子
final float loadFactor;
当调用无参构造器时
    只是将 默认的加载因子 赋值给 成员变量
    没有给底层的顺序表开辟空间

第一次进行数据添加
        1.开辟一个长度为16 的 Node[]
        2.当指定位置没有数据 直接填入
        3.向指定位置添加数据 hash一样 key 不一样
            会 在原有节点后进行追加
            八下
        4.向指定位置添加数据 hash一样 key 一样
            新的value会替换旧的value 并将旧的value 返回
        5.向指定位置添加数据 hash一样 key 不一样
            当指定位置的节点数量>=8
            并且 底层数组的长度 >=64
            才会进行树化
        6.当key 为null时  将数据添加到 下标为0的位置

 */
public class TestMap {

    @Test
    public void test03() {
        //1.创建HashMap对象
        HashMap<String, String> map = new HashMap<>();
        map.put("ch", "china");
        map.put("cc", "CCTV");
        String s = map.put("ch", "chinese");
        System.out.println("s = " + s);
        System.out.println(map);

        map.put(null, "china");


    }
    @Test
    public void test01(){
        //1.创建HashMap对象
        HashMap<String,String> map = new HashMap<>();

        HashMap<String,String> map1 = new HashMap<>(11);
    }
    static final int MAXIMUM_CAPACITY = 1 << 30;
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    @Test
    public void test02(){

        int i = tableSizeFor(7);
        System.out.println("i = " + i);
    }


}
