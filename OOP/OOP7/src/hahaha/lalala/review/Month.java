package hahaha.lalala.review;

public enum Month {
    JANUARY(1,"1月份是一年的开始"),
    FEBRUARY(2,"2月份是一年的开始"),
    MARCH(3,"3月份是一年的开始"),
    APRIL(4,"4月份是一年的开始"),
    MAY(5,"5月份是一年的开始"),
    JUNE(6,"6月份是一年的开始"),
    JULY(7,"7月份是一年的开始"),
    AUGUST(8,"8月份是一年的开始"),
    SEPTEMBER(9,"9月份是一年的开始"),
    OCTOBER(10,"10月份是一年的开始"),
    NOVEMBER(11,"11月份是一年的开始"),
    DECEMBER(12,"12月份是一年的开始");
    private int value;
    private String desc;

    public static Month getByValue(int value){//2
        //1.获取所有的枚举对象
        Month[] months = Month.values();
        //2.遍历数组
        for (Month month : months) {
            //3.让每一个枚举对象的value属性 与value值进行对比
            if(month.value==value){
                //4.找到指定月份后 直接返回
                return month;
            }
        }
        return null;
    }

    Month(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return value+ " -> "+ desc;
    }
}
