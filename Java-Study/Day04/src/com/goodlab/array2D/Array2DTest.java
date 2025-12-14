package com.goodlab.array2D;

public class Array2DTest {
    public static void main(String[] args) {
        // 数字华容道和随机化
        start(4);

    }
    public static void start(int n){
        int[][] array = new int[n][n];
        int numb = 1;
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j] = numb++;

            }
        }
        print(array);
        System.out.println("\n===============1===============");
        shuffle(array);
        System.out.println("\n===============2===============");
        print(array);
    }
    // 随机打乱
    public static void shuffle(int[][] array){

        for(int i = 0;i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                int index1 = (int)(Math.random()*array.length);
                int index2 = (int)(Math.random()*array[0].length);
                swap(array,i,j,index1,index2);
            }
        }
        print(array);
    }

    public static void print(int[][] array){
        for(int i = 0;i< array.length;i++){
            System.out.println();
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + "\t");

            }

        }
    }
    public static void swap(int[][] array, int a, int b,int c, int d){

        int temp = array[a][b];
        array[a][b] = array[c][d];
        array[c][d] = temp;
    }



}
