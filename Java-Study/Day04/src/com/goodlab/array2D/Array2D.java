package com.goodlab.array2D;

public class Array2D {
    public static void main(String[] args) {
        staticInit();

    }
    public static void staticInit() {
        // 静态初始化二维数组
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // 动态初始化二维数组
        int[][] arr01 = new int[3][3];
    }
}
