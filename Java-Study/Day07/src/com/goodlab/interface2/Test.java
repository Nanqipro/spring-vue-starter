package com.goodlab.interface2;

public class Test {
    public static void main(String[] args) {

        // 接口弥补了类的单继承不足 可以让类拥有更多角色，类的功能更强大
        people p = new student();
        Driver d = new student();
        boyfriend b = new student();
        // 接口可以实现面向接口编程，更利于解耦合

    }
}


interface Driver{
    void drive();
}

interface boyfriend{
    void buy();
}

class people{}

class student extends people implements Driver,boyfriend{
    @Override
    public void drive() {

    }

    @Override
    public void buy() {

    }
}
class teacher extends people implements Driver{
    @Override
    public void drive() {

    }
}