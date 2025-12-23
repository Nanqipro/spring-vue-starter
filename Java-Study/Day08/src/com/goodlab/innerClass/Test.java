package com.goodlab.innerClass;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类实际上是有名字，外部类名$编号.class
        // 匿名内部类本质上是一个子类，同时会立即构建一个子类对象
        Animal a = new Animal(){
            @Override
            public void eat() {
                System.out.println("狗吃🪨");
            }
        };
        a.eat();
    }
}
