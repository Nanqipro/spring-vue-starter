package com.goodlab.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        // 算术运算符示例
        int a = 10, b = 3;
        System.out.println("算术运算符:");
        System.out.println("加法: " + (a + b));        // 13
        System.out.println("减法: " + (a - b));        // 7
        System.out.println("乘法: " + (a * b));        // 30
        System.out.println("除法: " + (a / b));        // 3
        System.out.println("取模: " + (a % b));        // 1
        System.out.println("自增: " + (++a));          // 11
        System.out.println("自减: " + (--b));          // 2

        // 关系运算符示例
        System.out.println("\n关系运算符:");
        System.out.println("等于: " + (5 == 5));       // true
        System.out.println("不等于: " + (5 != 3));     // true
        System.out.println("大于: " + (10 > 5));       // true
        System.out.println("小于: " + (3 < 8));        // true

        // 逻辑运算符示例
        boolean x = true, y = false;
        System.out.println("\n逻辑运算符:");
        System.out.println("逻辑与: " + (x && y));     // false
        System.out.println("逻辑或: " + (x || y));     // true
        System.out.println("逻辑非: " + (!x));         // false

        // 位运算符示例
        int m = 5, n = 3;  // 5=101, 3=011
        System.out.println("\n位运算符:");
        System.out.println("按位与: " + (m & n));      // 1 (001)
        System.out.println("按位或: " + (m | n));      // 7 (111)
        System.out.println("左移: " + (4 << 1));       // 8

        // 赋值运算符示例
        int c = 5;
        System.out.println("\n赋值运算符:");
        c += 3;  // c = c + 3
        System.out.println("加后赋值: " + c);          // 8

        // 三元运算符示例
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\n三元运算符:");
        System.out.println("最大值: " + max);          // 20

        // instanceof 示例
        String str = "Hello";
        boolean isString = str instanceof String;
        System.out.println("\n其他运算符:");
        System.out.println("instanceof: " + isString); // true


    }
}
