package hahaha.lalala.exception4;

/**
 * 自定义异常:
 * 两步
 * 1.继承一个异常类 型
 * 如果定义运行时异常  则 继承运行时异常
 * 如果定义检查异常  则 继承检查异常
 * 2.定义构造器
 * public AgeException(String s) {
 * super(s);
 * }
 */

public class Test {

    @org.junit.Test
    public void test02() throws AgeException {
        Person p1 = new Person("李三", 200, "黑的");
        System.out.println(p1);
    }

    @org.junit.Test
    public void test01() {
        Person person = new Person();
        try {
            person.setSex("男de");
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
        }


        try {
            person.setAge(200);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println(person);

    }
}
