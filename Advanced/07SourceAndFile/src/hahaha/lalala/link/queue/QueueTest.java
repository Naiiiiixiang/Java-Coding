package hahaha.lalala.link.queue;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;

/*
队列：
   FIFO
   排队结账
    队头删除
    队尾添加
 */
public class QueueTest {
    @Test
    public void test01() {
        //模拟队列操作
        Queue<String> queue = new LinkedList<>();
        queue.add("李白");
        queue.add("杜甫");
        queue.add("王安石");
        System.out.println(queue);
        queue.add("李商隐");

        //获取队头元素
        String peek = queue.peek();
        System.out.println(peek);
        //删除 队头元素 没有元素时会报错
      /*  queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();*/
      // 删除 队头元素  没有元素时不会报错
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);


    }
}
