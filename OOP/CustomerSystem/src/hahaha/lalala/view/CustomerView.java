package hahaha.lalala.view;

import hahaha.lalala.javabean.Customer;
import hahaha.lalala.service.CustomerService;
import hahaha.lalala.utils.CMUtility;

public class CustomerView {
    static CustomerService service = new CustomerService(4);

    public static void show() {
        l:
        while (true) {
            System.out.println("-----------------客户信息管理软件-----------------\n" +
                    "\n" +
                    "                 1 添 加 客 户\n" +
                    "                 2 修 改 客 户\n" +
                    "                 3 删 除 客 户\n" +
                    "                 4 客 户 列 表\n" +
                    "                 5 退       出\n" +
                    "\n" +
                    "                 请选择(1-5)：_\n");

            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    add();
                    break;
                case '2':
                    System.out.println("进入修 改");

                    update();
                    break;
                case '3':
                    System.out.println("进入删 除 ");
                    delete();
                    break;
                case '4':
                    System.out.println("进入客 户 列 表");
                    showAll();
                    break;
                case '5':
                    System.out.println("请问您是真的退出吗? Y 是真的  N 假的");
                    char choose = CMUtility.readConfirmSelection();
                    if (choose == 'Y') {
                        // break l;
                        System.out.println("我去意已决 ");
                        return;
                    }
                    break;
            }
        }
    }

    private static void update() {
        System.out.println("---------------------修改客户---------------------");
        System.out.println("请选择待修改客户编号(-1 退出)");
        int no = CMUtility.readInt();
        //判断编号是否存在
        boolean contain = service.isContain(no);
        if (contain) {
            //编号存在 进行修改
            //获取指定编号的对象
            Customer oldCustomer = service.getCustomerByNo(no);
            System.out.print("姓名("+oldCustomer.getName()+"):");
            String name = CMUtility.readString(20, oldCustomer.getName());
            System.out.print("性别("+oldCustomer.getSex()+"):");
            char sex = CMUtility.readChar(oldCustomer.getSex());
            System.out.print("年龄("+oldCustomer.getAge()+"):");
            int age = CMUtility.readInt(oldCustomer.getAge());
            System.out.print("电话("+oldCustomer.getPhone()+"):");
            String phone = CMUtility.readString(11, oldCustomer.getPhone());
            System.out.print("邮箱("+oldCustomer.getEmail()+"):");
            String email = CMUtility.readString(30, oldCustomer.getEmail());

            //将修改后的数据封装为一个新的对象
            Customer newCustomer = new Customer(name, sex, age, phone, email);


            service.updateCustomer(no,newCustomer);


        } else {
            System.out.println("指定编号 " + no + " 不存在 不能修改");
        }


        System.out.println("---------------------修改完成---------------------");
    }

    /**
     * 删除客户
     */
    private static void delete() {
        System.out.println("---------------------删除客户---------------------");
        System.out.print("请选择删除客户的编号(-1 退出)");
        int no = CMUtility.readInt();
        //当 输入-1时  退出 删除客户
        if (no == -1) {
            return;
        }
        //判断编号 是否在列表内
        boolean contain = service.isContain(no);

        if (contain) {

            System.out.println("确认删除吗？");
            char c = CMUtility.readConfirmSelection();
            if (c == 'Y') {
                service.delete(no);
            }
        } else {
            System.out.println("编号 " + no + "  不存在 不能删除");
        }
        System.out.println("---------------------删除完成---------------------");
    }

    /**
     * 展示所有的客户信息
     */
    private static void showAll() {

        System.out.println("---------------------------客户列表---------------------------\n");

        //调用业务层方法  获取所有有价值的信息
        Customer[] all = service.getAll();

        if (all.length == 0) {
            System.out.println("没有任何用户 请您去添加用户");
            return;
        }

        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱\n");

        for (int i = 0; i < all.length; i++) {
            System.out.println((i + 1) + "\t" + all[i].getName() + "\t" + all[i].getSex() + "\t" + all[i].getAge() + "\t" + all[i].getPhone() + "\t" + all[i].getEmail());

        }


    }

    /**
     * 添加客户操作
     */
    private static void add() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char sex = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱:");
        String email = CMUtility.readString(20);

        //创建对象完成
        Customer customer = new Customer(name, sex, age, phone, email);
        //调用业务层方法 添加客户对象
        //开始添加
        boolean b = service.addCustomer(customer);
        if (b) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        System.out.println("---------------------完成---------------------");
    }
}
