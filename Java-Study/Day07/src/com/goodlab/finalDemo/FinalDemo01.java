package com.goodlab.finalDemo;

public class FinalDemo01 {
    // final 修饰静态成员变量 这个变量今后被称为常量，可以记住一个固定值，并且程序中不能修改了，通常这个值作为系统的配置信息
    public static final int MAX_SIZE = 100; // 常量的名称 一般用大写字母，多个单词用下划线连接

    // final修饰实例变量一般没有意义
    public final int age = 18;
    public static void main(String[] args) {
        // 3，final修饰变量 变量有且仅能被赋值一次
        // 成员变量  1 静态成员变量  2 实例成员变量
        // 局部变量
        final int a = 10;
//        a = 1;

        final  int[] arr = {1,2,3};
//        arr = new int[]{1,2,3,4}; //第二次赋值报错
        arr[0] = 1;


    }
    public static void  buy(final int a){
//        a = 1;
        System.out.println(a);
    }


    // 1. final修饰类 类不能被继承

    // 2. final修饰方法 方法不能被重写
    

}
