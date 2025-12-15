package com.goodlab.thisDemo;

public class student {
    String name;
    int age;
    public void print(){
        // this 是一个变量，用于拿到当前对象
        // 哪个对象调用该方法，this 就拿到这个对象
        System.out.println(this);
        System.out.println(this.name);
    }
    public void printhobby(String name){
        System.out.println(this.name + "love"+ name);
    }


}
