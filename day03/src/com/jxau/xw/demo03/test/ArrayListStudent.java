package com.jxau.xw.demo03.test;

import java.util.ArrayList;

/*
自定义4个学生对象，添加到集合，并遍历



 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",21);
        Student three = new Student("黄药师",22);
        Student four = new Student("段智兴",23);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("姓名:" + student.getName()+"，年龄:"+ student.getAge());
        }

        }

    }


