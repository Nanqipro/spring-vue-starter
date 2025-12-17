package com.goodlab.extendsDemo;

public class People {
    private String name;
    private int age;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public People() {
    }

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
}
