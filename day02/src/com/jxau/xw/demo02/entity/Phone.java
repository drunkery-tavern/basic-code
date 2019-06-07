package com.jxau.xw.demo02.entity;

/*
定义一个手机类，用来模拟“手机”事物。
属性：品牌，价格，颜色
行为：打电话，发短信


对应到类当中
成员变量（属性）：
    String brand;//品牌
    double price;//价格
    String color;//颜色

成员方法（行为）：
    call();//打电话
    sendMsg();//群发短信

 */
public class Phone {
    private String brand;//品牌
    private double price;//价格
    private String color;//颜色

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void call(String who){
        System.out.println("给" + who +"打电话");

    }

    public void sendMsg(){
        System.out.println("群发短信");
    }
}
