package com.goodlab.array1D;

public class ArrayTest {
    public static void main(String[] args) {
        String[] poker = start();
        System.out.println("\n");
        shuffle( poker);

    }
    public static String[] start(){
        String[] poker = new String[54];
        int index = 0;
        //创建扑克中的四种花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //创建扑克中的13张牌
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String color : colors) {
            for (String number : numbers) {
                poker[index++] = color + number;
            }
        }
        poker[index++] = "🃏";
        poker[index] = "🃏";
        // 打印牌
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
        return poker;
    }
    // 洗牌
    public static void shuffle(String[] poker){
        for (int i = 0; i < poker.length; i++) {
            int index = (int)(Math.random() * poker.length);
            String temp = poker[i];
            poker[i] = poker[index];
            poker[index] = temp;
        }
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
    }


}

