package hahaha.lalala.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
单元测试 ：
步骤：
1.在 module下 新建 一个文件夹 名字叫lib
2.将jar复制到 lib内
3. 选中 jar 右键  add as  library
@Before
    在执行单元测试前肯定会执行的方法
@Test
单元测试方法
@After
    在执行单元测试后肯定会执行的方法

 */
public class JunitTest {

    @Before
    public void test00(){
        System.out.println("before执行了");
    }
    @After
    public void testa(){
        System.out.println("After执行了");
    }

    @Test
    public void test01(){
        System.out.println("0001");
    }

    @Test
    public void test02(){

        System.out.println("0002");
    }
    @Test
    public void test03(){
        System.out.println("003");
        
    }
    
    @Test
    public void test04(){
        
    }

}
