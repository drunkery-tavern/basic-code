package com.jxau.xw.demo03.demo;


/*

Random r = new Random();小括号留空
使用：
获取一个随机的int数字（范围是int所有范围，有正负两种） int num = r.nextInt();
获取一个随机的int数字(参数代表了范围，左闭右开区间)  int num = r.nextInt(100)
代表0~99的int数字
 */


import java.util.Random;

public class DemoRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println("生成的随机数是："+num);

        for (int i = 0; i < 100; i++) {
            int num1 = random.nextInt(100);
            System.out.println(num1);

        }
    }
}
