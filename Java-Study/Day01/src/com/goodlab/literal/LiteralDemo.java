package com.goodlab.literal;

public class LiteralDemo {
    /**
     * 测试字面量 掌握常见的字面量
     */
    public static void main(String[] args){
        test1();

    }
    public static void test1(){
        // 字符串字面量
        String name = "goodlab";
        System.out.println(name);
        // 字符字面量
        char c = 'a';
        System.out.println(c);
        // 整数字面量
        int i = 10;
        System.out.println(i);
        // 浮点数字面量
        double d = 10.1;
        System.out.println(d);
        // 布尔字面量
        boolean b = true;
        System.out.println(b);

        // 掌握一些特殊的字符: \n \t \r \b \f \' \\
        System.out.println("hello\nworld"); // \n 换行
        System.out.println("hello\tworld"); // \t 制表符
        System.out.println("hello\rworld"); // \r 回车
        System.out.println("hello\bworld"); // \b 退格
        System.out.println("hello\fworld"); // \f 换页
    }
}
