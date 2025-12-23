package com.goodlab.lambda;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃吃吃");
            }
        };
        a.eat();

//        Animal a1 = () -> {
//            System.out.println("吃吃吃");
//        };
// Lambda并不是可以简化全部的匿名内部类，只能简化函数式接口的匿名内部类
        System.out.println("===========");
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("开始游泳1");

            }
        };
        s.swim();
        System.out.println("===========");
        Swim s1 = () -> {
            System.out.println("开始游泳2");
        };
        s1.swim();


    }
}

abstract class Animal {
    public abstract void eat();
}


// 函数式接口：只有一个抽象方法的接口
@FunctionalInterface //声明函数式接口的注解
interface Swim {
    public abstract void swim();
}