package com.goodlab.abstract1;
// 抽象类
public  abstract class A {
    private int age;
    public void show(){}

    public A(int age) {
        this.age = age;
    }

    public A() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 抽象方法 必须要有abstract 修饰，没有方法体，只有方法声明
    public abstract void eat();

}
