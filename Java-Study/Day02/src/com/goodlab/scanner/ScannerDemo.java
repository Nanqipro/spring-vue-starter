package com.goodlab.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        printUserInfo();

    }

    public static void printUserInfo() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("你的姓名为"+name+"，年龄为"+age);

    }
}
