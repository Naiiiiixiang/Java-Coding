package hahaha.lalala.enum3;

public enum Gender implements Run{
    MAN{
        @Override
        public void run() {
            System.out.println("男生大步流星走");
        }
    },WOMAN{
        @Override
        public void run() {
            System.out.println("婀娜多姿走");
        }
    };

  /*  @Override
    public void run() {
        System.out.println("跑");
    }*/
}

interface Run{

    void run();
}
