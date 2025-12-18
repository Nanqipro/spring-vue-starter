package com.goodlab.singleinstance;
// 设计成单例设计模式  饿汉式单例
public class A {
    // 创建一个静态成员变量
    private static final A a = new A();


    // 私有化构造器
    private A() {}

    // 提供一个公开的静态方法，返回这个类的唯一对象
    public static A getInstance(){
        return a;
    }


}
