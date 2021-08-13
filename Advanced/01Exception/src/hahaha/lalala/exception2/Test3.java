package hahaha.lalala.exception2;

/**
 * final finalize finally?
 * <p>
 * try{}catch(){}finally
 * finally: 最终的最后的
 * <p>
 * 1.无论如何都要执行的代码  放到finally语句块内
 * io 关流
 * <p>
 * 2. 如果非要不执行 finally
 * 使用 System.exit(数字);
 * 0:代表正常退出jvm
 * 非0:代表非正常退出jvm
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            int s = 10 / 0;
            System.out.println(arr[1]);
            return;
        } catch (ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        } catch (ArithmeticException a) {
            a.printStackTrace();
            System.exit(10);
            return;
        } finally {
            System.out.println("Game Over");
        }
    }
}
