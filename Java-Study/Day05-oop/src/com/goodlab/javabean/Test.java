package com.goodlab.javabean;

public class Test {
    // javaBean 也叫 实体类
    // 作用：创建对象，封装数据
    public static void main(String[] args) {
        student s1 = new student();
        s1.setAge(18);
        s1.setName("小王");
        s1.setScore(100);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getScore());

        student s2 = new student("小王",18,100,100,100);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getScore());

        // 实体类在开发中的应用场景
        // 分层封装的思想
        studentOperator so = new studentOperator(s2);
        so.print();



    }
}
