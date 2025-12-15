package com.goodlab.capsulation;

public class Test {
    public static void main(String[] args) {
        student s = new student();
        s.name = "张三";
        s.setAge(18);
        s.setScore(100);
        s.getAge();
        s.getScore();
    }
}
