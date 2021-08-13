package hahaha.lalala.exer.e1;


/**
 * 1 2 3 4 5 6 7 8 .....
 * <p>
 * 1 2 A 3 4 B 5 6 C 7 8 D 9 10 E 11 12 F 13 14 G
 */
public class Print {

    //记录位置
    private int index = 1;

    /**
     * 用于输出  字母
     *
     * @param c
     */
    public synchronized void printChar(char c) {
        //对位置进行校验
        //如果不是3的倍数  字母线程 进行等待
        if (index % 3 != 0) {
            try {
                this.wait();//普通同步方法的同步监视器对象是this
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //输出字母
        System.out.print(c + "\t");

        //位置更改
        index++;
        //唤醒数字线程  开始执行
        this.notify();

    }

    /**
     * 用于打印 数字
     *
     * @param num
     */
    public synchronized void printNum(int num) {
        //在输出数字之前要对位置进行校验  如果是3的倍数 等待

        if (index % 3 == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //输出数字
        System.out.print(num + "\t");

        //改变位置
        index++;
        //唤醒字母线程开始执行
        this.notify();

    }
}
