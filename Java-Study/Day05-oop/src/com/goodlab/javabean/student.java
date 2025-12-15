package com.goodlab.javabean;

public class student {
    // 私有化成员变量
    private String name;
    private int age;
    private double score;
    private double chinese;
    private double math;
    //  提供公开的getter setter 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    // 默认含有无参构造器
    public student() {}

    // 可以提供一个有参构造器（可选）


    public student(String name, int age, double score, double chinese, double math) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.chinese = chinese;
        this.math = math;
    }
}
