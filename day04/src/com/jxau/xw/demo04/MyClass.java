package com.jxau.xw.demo04;


public class MyClass {

    int num;
    static int numStatic;

    public void method(){
        System.out.println("这是一个普通的成员方法。");
        System.out.println(num);//成员方法可以访问成员变量
        System.out.println(numStatic);//成员方法可访问静态变量
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        System.out.println(numStatic);//静态方法可以访问静态变量
//        System.out.println(num);//静态方法不能直接访问非静态【重点】

    }
}
