package com.jxau.xw.demo03.demo;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度可以随意改变
对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号：[]
 */
public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，需要用到add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list);
    }

}
