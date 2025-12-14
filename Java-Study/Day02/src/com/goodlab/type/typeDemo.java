package com.goodlab.type;

public class typeDemo {
    public static void main(String[] args) {
        // 认识自动类型转换和强制类型转换
        test1();
        test2();
        test3(10,10.0,'a');

    }

    public static void test1(){
        // 测试自动类型转换
        int a = 10;
        double b = a;
        System.out.println(b);
    }
    public static void test2(){
        // 测试强制类型转换 强制类型转换可能会出现数据溢出现象
        double a = 10.0;
        int b = (int)a;
        System.out.println(b);
        // 浮点型转换成整数会直接去掉小数部分

    }

    // 表达式的自动类型转换

    // 表达式中的最终数据类型由表达式中的最高类型决定
    public static double test3(int a, double b, char c){
        return a+b+c;
    }
    // 在表达式中，byte \short \char 是直接转换成int 类型参与运算的
    public static int test3(byte a, short b, char c){
        return a+b+c;
    }
}
