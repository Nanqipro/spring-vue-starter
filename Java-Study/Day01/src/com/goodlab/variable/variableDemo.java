package com.goodlab.variable;

public class variableDemo {
    public static void main(String[] args) {
        // 八种数据类型的掌握
        test1();

    }
    public static void test1(){

        //八种数据类型都写出来
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'a';
        boolean bool = true;
        System.out.println("八种数据类型"+ b + s + i + l + f + d + c + bool);

    }
}
