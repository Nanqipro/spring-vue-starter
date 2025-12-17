package com.goodlab.extendsDemo;

public class Test {
    public static void main(String[] args) {
        // 子类可以继承父类的非私有成员
        // 子类对象其实是由子类和父类多张设计图共同创建出来的对象，所以子类对象是完整的
        teacher t = new teacher();
        consultant c = new consultant();

        t.setName("张三");
        t.setAge(18);
        t.setSkill("java");
        t.setTeacherID(1001);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
        System.out.println(t.getTeacherID());
    }


}
