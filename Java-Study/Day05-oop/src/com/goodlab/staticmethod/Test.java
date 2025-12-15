package com.goodlab.staticmethod;

public class Test   {
    public static void main(String[] args) {
        // 1.类名.静态方法名(推荐)

        student.printhello();

        // 2.对象名.静态方法名(不推荐)

        student s1 = new student() ;
        s1.printhello();

        // 3.对象名.实例方法
        s1.setScore(80);
        s1.printpass();
        // 什么时候用静态方法，什么时候用实例方法:如果这个方法只是为了做一个功能且不需要直接访问对象数据，这个方法直接定义成静态方法
        // 如果这个方法是对象的行为，需要访问对象数据，这个方法定义成实例方法


        String code  = Util.getverifycode(100);
        System.out.println(code);
    }

}
