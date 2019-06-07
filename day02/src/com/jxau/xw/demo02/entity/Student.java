package com.jxau.xw.demo02.entity;

public class Student {

    //成员变量
    private String name;
    private int age;


    //成员方法



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭饭！");
    }

    public void sleep(){
        System.out.println("睡觉觉！");
    }

    public void study(){
        System.out.println("学习！");
    }


}
