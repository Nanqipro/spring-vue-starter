package com.goodlab.polymorphsm1;

public class Animal {
    String name = "动物";
    public void run(){
        System.out.println("动物会叫～～～");
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
    }
}
