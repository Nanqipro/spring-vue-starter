package com.goodlab.constructor;

public class Test {
    // 类的构造器
    // 构造器的特点，创建对象时，类会自动调用构造器
    public static void main(String[] args) {
        student s1 = new student();

        student s2 = new student("张三",18,100);

        // 有参构造器的作用 创建对象时，可以立即为该对象的成员变量赋值
        student s3 = new student("delei",22);
        System.out.println(s3.name);
        System.out.println(s3.age);

        /*
        注意：
        类默认有一个无参构造器，
        当类中定义了有参构造器之后，类就没有默认的无参构造器了，此时必须写一个无参构造器
         */

    }

}
