package com.goodlab.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static int a;
    // 静态代码块，有static修饰，属于类，与类一起优先加载，自动执行一次
    // 可以完成对类的静态资源的初始化
    public static String[] cards = new String[54];

    static {
        System.out.println("静态代码块");
        a = 10;
        cards[0] = "大王";
        cards[1] = "小王";
        for (int i = 2; i < 15; i++) {
            cards[i] = i + "梅花";
        }

    }
    public static void main(String[] args) {
        System.out.println("main方法");
        System.out.println(a);
        System.out.println(Arrays.toString(cards));

    }

}
