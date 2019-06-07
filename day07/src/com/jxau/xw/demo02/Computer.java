package com.jxau.xw.demo02;

public class Computer {

    //开机功能、
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    //关机功能
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    //使用USB设备的功能，使用接口作为方法的参数
    public void usbDevice(USB usb){

        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();
        }

        usb.close();
    }



}
