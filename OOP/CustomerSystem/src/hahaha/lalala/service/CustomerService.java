package hahaha.lalala.service;

import hahaha.lalala.javabean.Customer;

import java.util.Arrays;

public class CustomerService {
    //定义数组 存储客户信息
    private Customer[] cus;
    //定义变量 记录数组内有效数据的个数
    private int count;//0

    public CustomerService(int length) {
        cus = new Customer[length];
    }

    /**
     * 判断编号是否存在
     * @param no
     * @return
     */
    public boolean isContain(int no) {
       /* if(no >=1 && no <=count){
            return true;
        }
        return false;*/
        //   return no >= 1 && no <= count ? true : false;
        return no >= 1 && no <= count;
    }

    /**
     * 删除指定编号的客户
     * @param no
     */

    public void delete(int no){
        //获取删除元素的下标
        int deleteIndex = no-1;
        for(int i = deleteIndex;i<cus.length - 1;i++){
            cus[i] = cus[i+1];
        }
        //将最后一个有价值的元素 设置为默认值
        cus[--count] = null;
    }


    /**
     * 将客户信息添加到数组内
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {

        //校验数组是否已满
        if (count >= cus.length) {
            System.out.println("数组已满 不能添加");
            //添加失败
            return false;
        }

      /*  //可以添加
        cus[count] = customer;
        //改变数量
        count++;*/
        cus[count++] = customer;
        System.out.println(Arrays.toString(cus));
        //添加成功
        return true;
    }

    /**
     * 获取所有有价值的信息
     *
     * @return
     */
    public Customer[] getAll() {
        //1.创建新数组  长度是count
        Customer[] newCus = new Customer[count];
        //2.遍历旧数组 给新数组赋值

        for (int i = 0; i < count; i++) {

            newCus[i] = cus[i];
        }
        //3.返回新数组
        return newCus;
    }
    /**
     * 获取指定编号的客户信息
     * @param no
     * @return
     */
    public Customer getCustomerByNo(int no) {
        //编号 -1  即是 下标
        return cus[no-1];
    }

    /**
     * 修改指定编号的用户
     * @param no  编号
     * @param newCustomer 新的用户
     */
    public void updateCustomer(int no, Customer newCustomer) {
        cus[no-1] = newCustomer;
    }
}
