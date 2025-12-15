package com.goodlab.staticfield;

public class Test {
    public static void main(String[] args) {

        // 1.类名.静态变量（推荐）
        student s1 = new student();
        student s2 = new student();
        student.name = "liu";
        System.out.println(student.name);
        // 2.对象名.静态变量（不推荐）
        s1.name = "张三";
        System.out.println(s1.name);
        System.out.println(student.name);
        // 3.对象名.实例变量
        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);
        System.out.println(s2.age);


    }
}
