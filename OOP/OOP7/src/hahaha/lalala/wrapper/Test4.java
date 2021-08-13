package hahaha.lalala.wrapper;

/*
缓冲区：
   [-128 ,127]
  if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);

byte
short
int
long  [-128,127]

double
flaot 没有缓冲区
Character 0-127
Boolean  true false
 */
public class Test4 {

    public static void main(String[] args) {
        Double.valueOf(3.13);
        Character.valueOf('2');
        Boolean.valueOf("true");

        Integer i1 = Integer.valueOf(12);
        Integer i2 = Integer.valueOf(12);

        System.out.println(i1 == i2);// true

        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);// true

        Integer i5 = 300;
        Integer i6 = 300;
        System.out.println(i5 == i6);// false
        Integer i7 = 12;
        Integer i8 = new Integer(12);
        System.out.println(i7 == i8);
    }
}
