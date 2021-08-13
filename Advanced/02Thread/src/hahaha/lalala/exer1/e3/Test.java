package hahaha.lalala.exer1.e3;

public class Test {
    public static void main(String[] args) {


        TicketRunnable ticketRunnable = new TicketRunnable();

        Thread t1 = new Thread(ticketRunnable, "窗口一");
        Thread t2 = new Thread(ticketRunnable, "窗口二");
        Thread t3 = new Thread(ticketRunnable, "窗口三");
        Thread t4 = new Thread(ticketRunnable, "窗口四");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
