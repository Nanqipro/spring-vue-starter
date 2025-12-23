package com.goodlab.code;

public class Test02 {
    private int a;
    private int[] arr = new int[4]; // 实例变量
    // 实例代码块，无static 修饰，属于对象，每次创建对象时都会优先执行一次
    // 基本作用，初始化对象的实例资源
    // 实例代码块
     {
         System.out.println("实例代码块");
         a = 10;
         arr[0] = 10;
         arr[1] = 20;
         arr[2] = 30;
         arr[3] = 40;

     }
     public static void main(String[] args) {
         Test02 t1 = new Test02();
         Test02 t2 = new Test02();
         System.out.println(t1.a);
         System.out.println(t1.arr[0]);
         System.out.println(t1.arr[1]);
         System.out.println(t1.arr[2]);
         System.out.println(t1.arr[3]);
         System.out.println("--------------");
         System.out.println(t2.a);
         System.out.println(t2.arr[0]);
         System.out.println(t2.arr[1]);
         System.out.println(t2.arr[2]);
         System.out.println(t2.arr[3]);
         System.out.println("--------------");

     }
}
