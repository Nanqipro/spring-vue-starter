package com.goodlab.abstract1;

public class Test {

    // 抽象类的核心特点：有得必有失 （得到了抽象方法的能力，失去了创建对象的能力）
    // 抽象类不能创建对象 ***
    // 抽象类的使命就是被子类继承
    public static void main(String[] args) {
        A a = new B();
        a.show();
        a.setAge(19);
        System.out.println(a.getAge());


    }
}
