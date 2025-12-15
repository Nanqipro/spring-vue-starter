package com.goodlab.constructor;

public class student {
    String name;
    int age;
    // 无参构造器 构造器是一种特殊方法，不能写返回值类型，名称必须是类名，构造器在创建对象时调用
    public student(){
        System.out.println("无参构造器调用了");
    }
    // 有参构造器
    public student(String name,int age,double score){
        System.out.println("有参构造器调用了"+name+age+score);

    }
    // 构造器也可以重载
    public student(String name,int age){
        this.name = name;
        this.age = age;

    }
}
