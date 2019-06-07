package com.jxau.xw.demo01;

import java.util.ArrayList;
import java.util.Collection;

/**
        Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，
        这些方法可用于操作所有的单列集合。方法如下:

        public boolean add(E e)：  把给定的对象添加到当前集合中 。
        public void clear():清空集合中所有的元素。
        public boolean remove(E e): 把给定的对象在当前集合中删除。
        public boolean isEmpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray(): 把集合中的元素，存储到数组中。

 */
public class DemoCollection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法  []

        /*
        public boolean add(E e)：  把给定的对象添加到当前集合中 。
        返回值是一个boolean值，一般都返回true，所以可以不用接收

         */
        boolean b1 = coll.add("张三");
        System.out.println("添加操作是否成功："+ b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("赵六");
        coll.add("钱七");
        System.out.println(coll);
    }
}
