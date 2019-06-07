package com.jxau.xw.demo04;


/*

如果一个成员变量使用了static关键字，那么这个对象不再属于对象自己，而是属于所在的类
多个对象共享同一份数据

 */
public class DemoStatic {
    public static void main(String[] args) {
        Student stu = new Student("郭靖",19);
        stu.room = "101教室";
        System.out.println("姓名:"+stu.getName()
                +"，学号："+stu.getId()+ "，年龄:"+stu.getAge()+"，教室是："+stu.room);
        Student stu2 = new Student("黄蓉",16);
        System.out.println("姓名:"+stu2.getName()
                +"，学号："+stu2.getId()+"，年龄:"+stu2.getAge()+"，教室是："+stu2.room);
    }
}
