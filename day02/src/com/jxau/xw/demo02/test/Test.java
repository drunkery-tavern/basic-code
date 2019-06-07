package com.jxau.xw.demo02.test;

import com.jxau.xw.demo02.entity.Phone;
import com.jxau.xw.demo02.entity.Student;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("赵丽颖");
        stu.setAge(18);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println("============");

        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("============");

        Phone phone = new Phone("华为",3599.0,"蓝色");
        phone.setBrand("苹果");
        phone.setColor("黑色");
        phone.setPrice(8848.0);
        System.out.println(phone.getBrand());
        System.out.println(phone.getColor());
        System.out.println(phone.getPrice());
        System.out.println("===========");

        phone.call("haha");
        phone.sendMsg();

        System.out.println("=============");

        Phone phone2 = phone;
        phone2.setBrand("三星");
        phone2.setColor("白色");
        phone2.setPrice(5999.0);
        System.out.println(phone2.getBrand());
        System.out.println(phone2.getColor());
        System.out.println(phone2.getPrice());
        System.out.println("=============");

        phone2.call("hehe");
        phone2.sendMsg();
    }
}
