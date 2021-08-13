package hahaha.lalala.link.one;

import java.util.Arrays;

/*
实现单链表
 */
public class OneWay<E> {

    //头节点
    private Node<E> head;
    //记录集合内元素的数量
    private int size;


    /**
     * 查找指定元素出现的下标
     * @param e
     * @return
     */
    public int indexOf(E  e){

        Node node = head;
        if(e==null){
            //遍历 链表
            for(int i = 0;i<size;i++){
                if(e==node.data){
                    return i;
                }
                //切换节点
                node = node.next;
            }
        }else{
            //遍历 链表
            for(int i = 0;i<size;i++){
                if(e.equals(node.data)){
                    return i;
                }
                //切换节点
                node = node.next;
            }
        }
        return -1;
    }

    /**
     * 删除节点的方法
     *
     * @param e 元素数据
     */
    public void delete(E e) {
        //判断链表是否为空  可以使用头结点 也可以使用 size
        if (head == null) {
            System.out.println("链表为空 不能删除");
            return;
        }
        //如果删除的元素是null值 ==
        if (e == null) {
            if (e == head.data) {
                //头结点下一个节点 变为头节点
                head = head.next;
                //数量-1
                size--;
            } else {
                //删除的不是头节点
                Node node = head;
                //定义变量 记录 删除节点的前一个节点
                Node<E> preNode = null;
                //如果数据与 要删除的数据不一样
                while (node.data != e){
                    //记录删除节点的前一个节点
                    preNode = node;
                    //切换节点
                    node = node.next;
                    //当找到最后一个元素也没有时  终止循环
                    if (node == null) {
                        break;
                    }
                }
                //node 为null 说明 删除的元素 不在 链表内
                if (node != null) {
                    //循环结束  找到了删除的节点
                    preNode.next = node.next;
                    size--;
                }
            }


        } else {
            //如果删除的元素不是null值 equals


            //不为空开始删除
            //删除的是头节点
            if (e.equals(head.data)) {
                //头结点下一个节点 变为头节点
                head = head.next;
                //数量-1
                size--;
            } else {
                //删除的不是头节点
                Node node = head;
                //定义变量 记录 删除节点的前一个节点
                Node<E> preNode = null;
                //如果数据与 要删除的数据不一样
                while (!e.equals(node.data)) {
                    //记录删除节点的前一个节点
                    preNode = node;
                    //切换节点
                    node = node.next;
                    //当找到最后一个元素也没有时  终止循环
                    if (node == null) {
                        break;
                    }
                }
                //node 为null 说明 删除的元素 不在 链表内
                if (node != null) {
                    //循环结束  找到了删除的节点
                    preNode.next = node.next;
                    size--;
                }
            }

        }
    }



   /* public void delete(E e){
        //判断链表是否为空  可以使用头结点 也可以使用 size
        if(head==null){
            System.out.println("链表为空 不能删除");
            return;
        }
        //不为空开始删除
        //删除的是头节点
        if(e.equals(head.data)){
            //头结点下一个节点 变为头节点
            head = head.next;
            //数量-1
            size--;
        }else{
            //删除的不是头节点
            Node node = head;
            //定义变量 记录 删除节点的前一个节点
            Node<E> preNode = null;
            //如果数据与 要删除的数据不一样
            while (!node.data.equals(e)){
                //记录删除节点的前一个节点
                preNode = node;
                //切换节点
                node = node.next;
                //当找到最后一个元素也没有时  终止循环
                if(node==null){
                    break;
                }
            }
            //node 为null 说明 删除的元素 不在 链表内
            if(node!=null){
                //循环结束  找到了删除的节点
                preNode.next = node.next;
                size--;
            }

        }
    }*/


    /**
     * 添加数据
     *
     * @param e 添加的元素
     */
    public void add(E e) {
        //创建新的节点
        Node<E> newNode = new Node<>(e, null);
        //判断 是否有头结点
        //没有  新的节点 就是头节点
        if (head == null) {
            // 新的节点 就是头节点
            head = newNode;
        } else {
            //有 将此节点添加到 最后
            Node node = head;
            //查找最后一个节点
            while (node.next != null) {
                node = node.next;
            }
            //将新节点的地址 给最后一个节点的next属性
            node.next = newNode;
        }
        //添加完元素  元素数量+1
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        //0.创建数组
        Object[] objs = new Object[size];

        //只要链表内所有的数据
        //1.获取链表内所有的数据
        Node node = head;
        for (int i = 0; i < objs.length; i++) {
            //2.将数据添加到数组内
            objs[i] = node.data;
            //切换为下一个节点
            node = node.next;
        }
        //3.调用数组的Arrays.toString();
        return Arrays.toString(objs);
    }

    class Node<E> {
        E data;//节点中存储的数据
        Node<E> next;//下一个节点的位置

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
