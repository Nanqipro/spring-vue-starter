package com.goodlab.object;

public class student {
    // 学生类
    String name;
    int age;
    double score;
    // 封装思想
    public void show(){
        System.out.println("姓名：" + name + "，年龄：" + age );
    }
    public void printscore(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
    }
}
