package com.goodlab.array1D;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
//        staticInit();
//        dynamicInit();
        dynamicInput();

    }
    // 静态初始化创建数组
    public static void staticInit() {

//        阿里规约：
//
//        【强制】 类型与中括号紧挨相连来表示数组。
//
//        正例： 定义整形数组 int[] arrayDemo;
//
//        反例： 在 main 参数中，使用 String args[]来定义

        int[] arr01 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + " ");
        }
        // 随机获取一个索引值
        int index = (int)(Math.random() * arr01.length);
        System.out.println(arr01[index]);
    }

    // 动态初始化创建数组
    public static void dynamicInit() {
        int[] arr01 = new int[5];
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + " ");
        }
        System.out.println();
    }
    // 动态输入8名学生的成绩，然后保存在数组中
    public static void dynamicInput() {
        Scanner sc = new Scanner(System.in);
        Double[] array = new Double[8];
        for(int i = 0 ;i< array.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            array[i] = sc.nextDouble();
        }
        for(int i = 0 ;i< array.length;i++){
            System.out.println("第"+(i+1)+"个学生的成绩是"+array[i]);
        }
    }
}
