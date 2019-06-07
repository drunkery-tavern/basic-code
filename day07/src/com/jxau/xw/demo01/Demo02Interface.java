package com.jxau.xw.demo01;


public class Demo02Interface {

    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的是右侧实现类

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();//这是新添加的默认方法

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();//实现类B覆盖重写了接口的默认方法

        MyInterfaceDefault.print();

    }
}
