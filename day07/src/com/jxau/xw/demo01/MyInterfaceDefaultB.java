package com.jxau.xw.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodDefault() {

    }

    @Override
    public void methodAbs() {
        System.out.println("实现类B覆盖重写了接口的默认方法");

    }
}
