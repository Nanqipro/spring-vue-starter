package com.goodlab.extendsOverride;

public class Test {
    // 认识方法的重写
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

    }
}

class Animal{
    public void eat(){
        System.out.println("吃");
    }
}
class Dog extends Animal{
    // 方法重写： 方法名称，形参列表必须一样，这个方法就是方法重写
    // 重写的规范： 声明不变，重新实现



    @Override //方法重写的校验注解：要求方法名称和形参列表必须与被重写的方法一致，否则报错
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
