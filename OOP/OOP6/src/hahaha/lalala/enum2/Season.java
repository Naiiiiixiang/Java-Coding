package hahaha.lalala.enum2;

/*
每一个季节有一个描述信息
 */
public class Season {
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "烈日炎炎");
    public static final Season AUTUMN = new Season("秋天", "硕果累累");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");
    String seasoName;
    String desc;

    private Season(String seasoName, String desc) {
        this.seasoName = seasoName;
        this.desc = desc;
    }
    private Season(){}
    @Override
    public String toString() {
        return "Season{" +
                "seasoName='" + seasoName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
