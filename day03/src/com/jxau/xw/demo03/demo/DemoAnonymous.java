package com.jxau.xw.demo03.demo;

import java.util.Scanner;


public class DemoAnonymous {
    public static void main(String[] args) {
//        //普通使用方式
//        Scanner scanner = new Scanner(System.in);
//        int num  = scanner.nextInt();
//
//        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

//        //使用一般写法传入参数
//        Scanner scanner = new Scanner(System.in);
//        methodParam(scanner);

        //使用匿名对象传参
        methodParam(new Scanner(System.in));
    }

    private static void methodParam(Scanner scanner) {
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);

    }

}
