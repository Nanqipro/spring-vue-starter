package com.goodlab.thisDemo;

public class Test {
    public static void main(String[] args) {
        student s1 = new student();
        s1.print();
        student s2 = new student();
        s2.print();
        student s3 = new student();
        s3.print();
        s3.name = "张三";
        s3.printhobby("football");


    }

}
