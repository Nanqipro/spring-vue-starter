package com.goodlab.StringDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建字符串的方式
        // 1. 推荐方式：直接创建字符串对象
        String S0 = "hello world";
        System.out.println(S0);
        System.out.println(S0.length());
        // 2. 通过构造器初始化对象
        String S1 = new String();
        System.out.println(S1);
        String S2 = new String("hello world");
        System.out.println(S2);
        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String S3 = new String(chars);
        System.out.println(S3);

        byte[] bytes = {104, 101, 108, 108, 111, 33, 119, 111, 114, 108, 100};
        String S4 = new String(bytes);
        System.out.println(S4);

        System.out.println("======================");
        // 只有""给出的字符串对象放在字符串常量池，相同内容只放一个
        String t1 = "hello world";
        String t2 = "hello world";
        System.out.println(t1 == t2);
        String t3 = new String("hello world");
        String t4 = new String("hello world");
        System.out.println(t3 == t4);
        System.out.println("======================");
        // 验证两个字符串的内容是否相同的方法
        String OKLoginName = "admin";
        System.out.println("请输入你的用户名");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();
        // 字符串内容的比较不要用 == ，因为 == 默认比较的是字符串的地址
        if(OKLoginName.equals(loginName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }


    }
}
