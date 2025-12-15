package com.goodlab.staticfield;

public class student {
    static String name; // 静态成员变量,属于类，只加载一份，所有对象共享
    int age;  // 实例成员变量,属于对象，每个对象有自己一份
}
