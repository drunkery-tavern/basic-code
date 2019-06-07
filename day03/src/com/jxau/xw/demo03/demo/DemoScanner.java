package com.jxau.xw.demo03.demo;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入的数字是：" + num);
        String str = scanner.next();
        System.out.println("输入的字符串是：" + str);
    }
}
