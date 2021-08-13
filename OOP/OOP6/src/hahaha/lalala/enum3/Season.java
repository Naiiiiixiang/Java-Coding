package hahaha.lalala.enum3;

public enum Season  {
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "白雪皑皑");
    String seasoName;
    String desc;

    Season(String seasoName, String desc) {
        this.seasoName = seasoName;
        this.desc = desc;
    }
    Season(){}
/*    @Override
    public String toString() {
        return "Season{" +
                "seasoName='" + seasoName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }*/
}
