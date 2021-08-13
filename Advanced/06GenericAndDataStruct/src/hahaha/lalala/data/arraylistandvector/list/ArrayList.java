package hahaha.lalala.data.arraylistandvector.list;

import java.util.Arrays;
import java.util.Iterator;

/*
自定义动态数组

 */
public class ArrayList<E> implements List<E> {
    // 用于存储数据的数组
    private Object[] elementData;
    //记录数组内有效数据的个数
    private int size;//0

    public ArrayList() {
        this(10);
    }

    public ArrayList(int captity) {
        elementData = new Object[captity];
    }

    @Override
    public void add(E e) {
        //添加数据之前 检查容量是否满足
        if (size >= elementData.length) {
            //如果容量不足 扩容
            //将旧数组复制到新数组内
            Object[] copy = Arrays.copyOf(elementData, elementData.length * 2);
            //将新的数组 赋值给旧数组的引用
            elementData = copy;
        }
        //如果容量满足 继续添加
        elementData[size] = e;
        //数量+1
        size++;
    }

    @Override
    public String toString() {
        //将有价值的元素 放到一个新数组
        Object[] objects = Arrays.copyOf(elementData, size);
        //将有价值信息 使用toSring 变为字符串
        return Arrays.toString(objects);
       /* //新建StringBuilder对象
        StringBuilder sbl = new StringBuilder("[");
        //只是展示有价值的信息
        for (int i = 0; i < size; i++) {
            //判断是否为最后一个元素
            if (i == size - 1) {//是
                sbl.append(elementData[i]);
            } else {//不是
                sbl.append(elementData[i]).append(",");
            }
        }
        sbl.append("]");
        //[李白, 杜甫, 王安石]
        return sbl.toString();*/
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isContain(E e) {
        int i = indexOf(e);
        /*if(i==-1){
            return false;
        }
        return true;*/
        //  return i==-1?false:true;
        return i != -1;
    }

    /**
     * 查找指定元素第一次出现的下标
     *
     * @param e
     * @return
     */
    @Override
    public int indexOf(E e) {
        //判断要查找的元素是否为null
        if (e == null) {
            for (int i = 0; i < size; i++) {
                //比较null值 使用==
                if (e == elementData[i]) {
                    return i;
                }
            }
        } else {
            //遍历数组  让数组内的每一个元素 与 要查找元素进行对比
            for (int i = 0; i < size; i++) {
                //调用方法时  一定将有确切值的对象 作为方法的调用者
                if (e.equals(elementData[i])) {
                    return i;
                }
            }
        }
        //如果不存在 返回-1
        return -1;
    }

    @Override
    public void delete(E e) {

        //查找指定元素的下标
        int index = indexOf(e);
        delete(index);

    }

    @Override
    public void delete(int index) {
        //校验下标是否在 范围内
        checkIndex(index);
/*
    数组长度为10
     0      1     2
    李白  杜甫  王安石  null null
                  size 3  index = 2
     数组长度为10
      0  1   2   3  4
      A  B   C   D  E  size 5
                       删除 C index = 2
                       移动的数量   2
           System.arraycopy(e,index+1,e,index,size-index-1);

      数组长度为10
      0  1   2   3  4
      A  B   C   D  E  size 5
                       删除 B index = 1
                       移动的数量   3
           System.arraycopy(e,index+1,e,index,size-index-1);

 */
        //非尾部删除 进行元素的位置移动
        if (size - index - 1 > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        }
        //尾部删除
        elementData[--size] = null;

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("下标[ " + index + " ]有问题 不在范围内");

        }


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public void set(int index, E e) {
        checkIndex(index);
        elementData[index]=e;
    }
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr<E> implements Iterator<E> {
        //定义光标
        int cursor;
        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public E next() {
            return (E) elementData[cursor++];
        }
    }
}
