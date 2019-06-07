package com.jxau.xw.demo03.demo;

import java.util.ArrayList;

public class DemoListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("贾乃亮");
        list.add("李小璐");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
