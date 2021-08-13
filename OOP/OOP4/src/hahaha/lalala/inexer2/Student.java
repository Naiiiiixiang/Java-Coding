package hahaha.lalala.inexer2;

public class Student extends Person {

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getInfo() {

        return super.getInfo() + "分数是：" + score;

    }
}
